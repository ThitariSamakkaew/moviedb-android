package com.thitari.themovie.ui.screen.main.fragment.main.list.upcoming

import com.thitari.themovie.ui.screen.main.fragment.main.list.BaseMovieListViewModel
import javax.inject.Inject

abstract class UpcomingMovieListViewModel : BaseMovieListViewModel()

class UpcomingMovieListViewModelImpl @Inject constructor(): UpcomingMovieListViewModel()
