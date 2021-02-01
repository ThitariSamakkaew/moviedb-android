package com.thitari.themovie.ui.screen.main.fragment.main.list


import android.os.Bundle
import android.view.View
import com.thitari.themovie.MainNavigator
import com.thitari.themovie.R
import com.thitari.themovie.ui.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_list_movie.*
import javax.inject.Inject

abstract class BaseMovieListFragment : BaseFragment<BaseMovieListViewModel>() {

    @Inject
    lateinit var navigator: MainNavigator

    override val layoutRes: Int
        get() = R.layout.fragment_list_movie

    private val movieListAdapter = MovieListAdapter { uiModel ->
        navigator.navigateToMovieDetail(uiModel.id)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        rvFragmentListMovie.adapter = movieListAdapter
        observeViewModel()
    }

    private fun bindMovieUiModel(uiModels: List<MovieUiModel>) {
        movieListAdapter.movieUiModels = uiModels
    }

    private fun observeViewModel() {
        with(viewModel) {
            movieUiModels.observe(viewLifecycleOwner) { MovieUiModel ->
                bindMovieUiModel(MovieUiModel)
            }
            isLoading.observe(viewLifecycleOwner) { isLoading -> bindLoading(isLoading) }
            error.observe(viewLifecycleOwner) { error -> displayError(error) }
        }
    }

    private fun bindLoading(isLoading: Boolean) {

    }
}
