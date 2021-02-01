package com.thitari.themovie.ui.screen.main.fragment.main.detail

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.thitari.themovie.data.usecase.DetailListMovieUseCase
import com.thitari.themovie.ui.base.BaseViewModel
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import javax.inject.Inject

abstract class DetailMovieViewModel : BaseViewModel() {

    abstract val isLoading: LiveData<Boolean>

    abstract val error: LiveData<Throwable>

    abstract val detailMovie: LiveData<MovieDetailUiModel>

    abstract fun fetchMovieDetails(movieId: Int)

}

@ExperimentalCoroutinesApi
class DetailMovieViewModelImpl @Inject constructor(private val detailMovieUseCase: DetailListMovieUseCase) :
    DetailMovieViewModel() {

    private val _isLoading = MutableLiveData<Boolean>()
    private val _error = MutableLiveData<Throwable>()
    private val _detailMovie = MutableLiveData<MovieDetailUiModel>()

    override val isLoading: LiveData<Boolean>
        get() = _isLoading

    override val error: LiveData<Throwable>
        get() = _error

    override val detailMovie: LiveData<MovieDetailUiModel>
        get() = _detailMovie

    override fun fetchMovieDetails(movieId: Int) {
        viewModelScope.launch {
            flow { emit(detailMovieUseCase.invoke(movieId)) }
                .map { movieDetail -> movieDetail.toMovieDetailUiModel() }// movie detail to ui model
                .onStart { _isLoading.postValue(true) }
                .catch { error -> _error.postValue(error) }
                .onCompletion { _isLoading.postValue(false) }
                .collect { uiModel -> _detailMovie.postValue(uiModel) }
        }
    }
}
