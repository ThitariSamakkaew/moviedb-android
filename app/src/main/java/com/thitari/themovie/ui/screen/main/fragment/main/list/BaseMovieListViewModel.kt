package com.thitari.themovie.ui.screen.main.fragment.main.list

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.asLiveData
import com.thitari.themovie.data.model.Movie
import com.thitari.themovie.ui.base.BaseViewModel
import kotlinx.coroutines.flow.*
import kotlin.coroutines.EmptyCoroutineContext

abstract class BaseMovieListViewModel : BaseViewModel() {

    protected val _movieUiModels = MutableLiveData<List<MovieUiModel>>()

    protected val _isLoading = MutableLiveData<Boolean>()

    protected val _error = MutableLiveData<Throwable>()

    val movieUiModels: LiveData<List<MovieUiModel>>
        get() = flow { emit(loadPageMovies()) }
            .onStart { _isLoading.postValue(true) }
            .map { movies -> movies.toMovieUiModels() } // movies -> to MovieUiModels
            .catch { error -> _error.postValue(error) }
            .onCompletion { _isLoading.postValue(false) }
            .asLiveData(EmptyCoroutineContext)

    val isLoading: LiveData<Boolean>
        get() = _isLoading

    val error: LiveData<Throwable>
        get() = _error


    private fun List<Movie>.toMovieUiModels() = this.map { movie ->
        with(movie) {
            MovieUiModel(
                id = id,
                imageUrl = imageUrl,
                title = title,
                rating = rating,
                releaseDate = releaseDate
            )
        }
    }

    protected abstract suspend fun loadPageMovies(): List<Movie>

}
