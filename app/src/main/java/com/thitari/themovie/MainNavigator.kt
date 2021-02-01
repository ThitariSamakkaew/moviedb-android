package com.thitari.themovie

import androidx.navigation.NavController
import androidx.navigation.findNavController
import com.thitari.themovie.ui.base.BaseNavigator
import com.thitari.themovie.ui.screen.main.MainActivity
import com.thitari.themovie.ui.screen.main.fragment.MainFragmentDirections
import javax.inject.Inject

interface MainNavigation {

    fun navigateToMovieDetail(movieId: Int)
}

class MainNavigator @Inject constructor(activity: MainActivity) : BaseNavigator(activity),
    MainNavigation {

    override fun findNavController(): NavController {
        return activity.findNavController(R.id.fcvMainFragmentContainer)
    }

    override fun navigateToMovieDetail(movieId: Int) {
        when (graphId) {
            R.id.main_nav_graph -> {
                when (currentDestinationId) {
                    R.id.mainFragment -> {
                        navigate(
                            MainFragmentDirections.actionMainFragmentToFragmentMovieDetail(
                                movieId
                            )
                        )
                    }
                }
            }
        }
    }
}
