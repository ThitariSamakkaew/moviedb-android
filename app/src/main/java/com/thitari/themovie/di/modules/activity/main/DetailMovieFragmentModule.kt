package com.thitari.themovie.di.modules.activity.main

import androidx.lifecycle.ViewModel
import com.thitari.themovie.di.scope.FragmentScope
import com.thitari.themovie.di.scope.ViewModelKey
import com.thitari.themovie.ui.screen.main.fragment.main.detail.DetailMovieViewModel
import com.thitari.themovie.ui.screen.main.fragment.main.detail.DetailMovieViewModelImpl
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
interface DetailMovieFragmentModule {

    @Binds
    @IntoMap
    @FragmentScope
    @ViewModelKey(DetailMovieViewModel::class)
    fun detailMovieViewModel(detailMovieViewModel: DetailMovieViewModelImpl): ViewModel
}
