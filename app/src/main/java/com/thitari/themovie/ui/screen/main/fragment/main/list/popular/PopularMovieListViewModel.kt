package com.thitari.themovie.ui.screen.main.fragment.main.list.popular

import com.thitari.themovie.data.model.Movie
import com.thitari.themovie.data.usecase.PopularMovieListUseCase
import com.thitari.themovie.ui.screen.main.fragment.main.list.BaseMovieListViewModel
import kotlinx.coroutines.ExperimentalCoroutinesApi
import javax.inject.Inject

abstract class PopularMovieListViewModel : BaseMovieListViewModel()

@ExperimentalCoroutinesApi
class PopularMovieListViewModelImpl @Inject constructor(private val popularMovieListUseCase: PopularMovieListUseCase) :
    PopularMovieListViewModel() {

    override suspend fun loadPageMovies(): List<Movie> {
        return popularMovieListUseCase.invoke(Unit)
    }
}
