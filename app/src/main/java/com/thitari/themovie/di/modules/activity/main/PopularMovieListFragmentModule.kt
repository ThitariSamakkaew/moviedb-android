package com.thitari.themovie.di.modules.activity.main

import androidx.lifecycle.ViewModel
import com.thitari.themovie.di.scope.FragmentScope
import com.thitari.themovie.di.scope.ViewModelKey
import com.thitari.themovie.ui.screen.main.fragment.main.list.popular.PopularMovieListViewModel
import com.thitari.themovie.ui.screen.main.fragment.main.list.popular.PopularMovieListViewModelImpl
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
interface PopularMovieListFragmentModule {

    @ExperimentalStdlibApi
    @Binds
    @IntoMap
    @FragmentScope
    @ViewModelKey(PopularMovieListViewModel::class)
    fun popularMovieListViewModel(personalInfoViewModel: PopularMovieListViewModelImpl): ViewModel
}
