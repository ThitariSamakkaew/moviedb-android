package com.thitari.themovie.di.modules.activity.main

import androidx.lifecycle.ViewModel
import com.thitari.themovie.di.scope.FragmentScope
import com.thitari.themovie.di.scope.ViewModelKey
import com.thitari.themovie.ui.screen.main.fragment.main.list.top.TopMovieListViewModel
import com.thitari.themovie.ui.screen.main.fragment.main.list.top.TopMovieListViewModelImpl
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
interface TopMovieListFragmentModule {

    @ExperimentalStdlibApi
    @Binds
    @IntoMap
    @FragmentScope
    @ViewModelKey(TopMovieListViewModel::class)
    fun topMovieListViewModel(personalInfoViewModel: TopMovieListViewModelImpl): ViewModel
}
