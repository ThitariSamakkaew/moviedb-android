package com.thitari.themovie.di.modules.activity.main

import androidx.lifecycle.ViewModel
import com.thitari.themovie.di.scope.FragmentScope
import com.thitari.themovie.di.scope.ViewModelKey
import com.thitari.themovie.ui.screen.main.fragment.main.list.upcoming.UpcomingMovieListViewModel
import com.thitari.themovie.ui.screen.main.fragment.main.list.upcoming.UpcomingMovieListViewModelImpl
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
interface  UpcomingMovieListFragmentModule {

    @Binds
    @IntoMap
    @FragmentScope
    @ViewModelKey(UpcomingMovieListViewModel::class)
    fun upcomingMovieListViewModel(upComingMovieListViewModel: UpcomingMovieListViewModelImpl): ViewModel
}



