package com.thitari.themovie.ui.screen.main.fragment.main.detail

import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.navArgs
import coil.load
import com.thitari.themovie.R
import com.thitari.themovie.extension.visibleOrGone
import com.thitari.themovie.ui.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_movie_detail.*

class DetailMovieFragment : BaseFragment<DetailMovieViewModel>() {

    private val args: DetailMovieFragmentArgs by navArgs()

    override val layoutRes: Int
        get() = R.layout.fragment_movie_detail

    override fun provideViewModel(): DetailMovieViewModel =
        ViewModelProvider(this, viewModelFactory).get(DetailMovieViewModel::class.java)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        observeViewModel()
        viewModel.fetchMovieDetails(args.movieId)

    }

    private fun observeViewModel() {
        with(viewModel) {
            isLoading.observe(viewLifecycleOwner) { isLoading ->
                bindLoading(isLoading)
            }
            error.observe(viewLifecycleOwner) { error ->
                displayError(error)
            }
            detailMovie.observe(viewLifecycleOwner) { detailMovie ->
                bindMovieDetail(detailMovie)
            }
        }
    }

    private fun bindLoading(isLoading: Boolean) {
        pbFragmentMovieDetail.visibleOrGone(isLoading)
    }

    private fun bindMovieDetail(uiModel: MovieDetailUiModel) {
        with(uiModel) {
            tvFragmentDetailTitle.text = originalTitle
            tvFragmentDetailBudgetValue.text = budget
            ivFragmentDetailPopularityValue.text = popularity.toString()
            tvFragmentDetailLanguageValue.text = originalLanguage
            tvFragmentMovieDetailAdultValue.text = adult.toString()
            tvFragmentDetailReleaseDateValue.text = releaseDate
            tvFragmentDetailOverViewValue.text = overview
            ivFragmentDetail.load(posterPath)

        }
    }
}
