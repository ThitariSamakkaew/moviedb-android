package com.thitari.themovie.ui.screen.main.fragment.main.list

import com.thitari.themovie.R
import com.thitari.themovie.ui.base.BaseFragment


abstract class BaseMovieListFragment : BaseFragment<BaseMovieListViewModel>() {

    override val layoutRes: Int
        get() = R.layout.fragment_list_movie

    private fun bindMovieUiModel(uiModel: List<MovieUiModel>) {
    }
}
