package com.thitari.themovie

import androidx.navigation.NavController
import androidx.navigation.findNavController
import com.thitari.themovie.ui.base.BaseNavigator
import com.thitari.themovie.ui.screen.main.MainActivity
import javax.inject.Inject

interface MainNavigation

class MainNavigator @Inject constructor(activity: MainActivity) : BaseNavigator(activity), MainNavigation {

    override fun findNavController(): NavController {
        return activity.findNavController(R.id.fcvMainFragmentContainer)
    }
}
