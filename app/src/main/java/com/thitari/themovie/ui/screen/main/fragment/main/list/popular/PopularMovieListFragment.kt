package com.thitari.themovie.ui.screen.main.fragment.main.list.popular

import androidx.lifecycle.ViewModelProvider
import com.thitari.themovie.ui.screen.main.fragment.main.list.BaseMovieListFragment
import com.thitari.themovie.ui.screen.main.fragment.main.list.BaseMovieListViewModel

class PopularMovieListFragment : BaseMovieListFragment() {

    override fun provideViewModel(): BaseMovieListViewModel =
        ViewModelProvider(this, viewModelFactory).get(PopularMovieListViewModel::class.java)
}
