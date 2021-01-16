package com.thitari.themovie.ui.screen.main.fragment.main.list.upcoming

import androidx.lifecycle.ViewModelProvider
import com.thitari.themovie.ui.screen.main.fragment.main.list.BaseMovieListFragment
import com.thitari.themovie.ui.screen.main.fragment.main.list.BaseMovieListViewModel

class UpcomingMovieListFragment : BaseMovieListFragment() {

    override fun provideViewModel() =
        ViewModelProvider(this, viewModelFactory).get(UpcomingMovieListViewModel::class.java)
}
