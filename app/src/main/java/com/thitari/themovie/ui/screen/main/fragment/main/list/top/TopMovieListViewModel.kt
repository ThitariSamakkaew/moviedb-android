package com.thitari.themovie.ui.screen.main.fragment.main.list.top

import com.thitari.themovie.data.model.Movie
import com.thitari.themovie.data.model.Page
import com.thitari.themovie.data.usecase.TopMovieListUseCase
import com.thitari.themovie.ui.screen.main.fragment.main.list.BaseMovieListViewModel
import kotlinx.coroutines.ExperimentalCoroutinesApi

import javax.inject.Inject

abstract class TopMovieListViewModel : BaseMovieListViewModel()

@ExperimentalCoroutinesApi
class TopMovieListViewModelImpl @Inject constructor(private val topMovieListUseCase: TopMovieListUseCase) :
    TopMovieListViewModel() {

    override suspend fun loadPageMovies(): List<Movie> {
        return topMovieListUseCase.invoke(Unit)
    }
}
