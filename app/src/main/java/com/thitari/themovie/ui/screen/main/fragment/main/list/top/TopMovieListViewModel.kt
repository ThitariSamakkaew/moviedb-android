package com.thitari.themovie.ui.screen.main.fragment.main.list.top

import com.thitari.themovie.ui.screen.main.fragment.main.list.BaseMovieListViewModel
import kotlinx.coroutines.ExperimentalCoroutinesApi
import javax.inject.Inject

abstract class TopMovieListViewModel : BaseMovieListViewModel()

@ExperimentalCoroutinesApi
class TopMovieListViewModelImpl @Inject constructor(): TopMovieListViewModel()
