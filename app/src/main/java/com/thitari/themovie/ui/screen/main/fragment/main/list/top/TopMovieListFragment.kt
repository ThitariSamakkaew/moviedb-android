package com.thitari.themovie.ui.screen.main.fragment.main.list.top

import androidx.lifecycle.ViewModelProvider
import com.thitari.themovie.ui.screen.main.fragment.main.list.BaseMovieListFragment

class TopMovieListFragment : BaseMovieListFragment() {

    override fun provideViewModel() =
        ViewModelProvider(this, viewModelFactory).get(TopMovieListViewModel::class.java)
}
