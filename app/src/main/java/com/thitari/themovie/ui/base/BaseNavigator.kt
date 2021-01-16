package com.thitari.themovie.ui.base

import androidx.annotation.IdRes
import androidx.navigation.NavController
import androidx.navigation.NavDirections

abstract class BaseNavigator(protected val activity: BaseActivity<*>) {

    protected val navController by lazy { findNavController() }

    protected val graphId: Int
        get() = navController.graph.id

    protected val currentDestinationId: Int?
        get() = navController.currentDestination?.id

    protected fun navigate(directions: NavDirections) {
        navController.navigate(directions)
    }

    protected fun navigate(@IdRes idRes: Int) {
        navController.navigate(idRes)
    }

    abstract fun findNavController(): NavController

}
