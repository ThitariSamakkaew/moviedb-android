package com.thitari.themovie.ui.screen.main.fragment.main.list.upcoming

import com.thitari.themovie.data.model.Movie
import com.thitari.themovie.data.model.Page
import com.thitari.themovie.data.usecase.UpcomingMovieListUseCase
import com.thitari.themovie.ui.screen.main.fragment.main.list.BaseMovieListViewModel
import com.thitari.themovie.ui.screen.main.fragment.main.list.MovieUiModel
import javax.inject.Inject

abstract class UpcomingMovieListViewModel : BaseMovieListViewModel()

class UpcomingMovieListViewModelImpl @Inject constructor(private val upComingMovieListUseCase: UpcomingMovieListUseCase) :
    UpcomingMovieListViewModel() {

    override suspend fun loadPageMovies(): List<Movie> {
        return upComingMovieListUseCase.invoke(Unit)
    }
}
