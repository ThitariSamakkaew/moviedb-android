package com.thitari.themovie.ui.screen.main.fragment.main.list.popular

import com.thitari.themovie.ui.screen.main.fragment.main.list.BaseMovieListViewModel
import kotlinx.coroutines.ExperimentalCoroutinesApi
import javax.inject.Inject

abstract class PopularMovieListViewModel : BaseMovieListViewModel()


@ExperimentalCoroutinesApi
class PopularMovieListViewModelImpl @Inject constructor() : PopularMovieListViewModel()
