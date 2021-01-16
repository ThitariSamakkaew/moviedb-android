package com.thitari.themovie.di.modules.activity.main

import android.app.Activity
import androidx.lifecycle.ViewModel
import com.thitari.themovie.*
import com.thitari.themovie.data.repository.MovieRepository
import com.thitari.themovie.data.repository.MovieRepositoryImpl
import com.thitari.themovie.di.scope.ActivityScope
import com.thitari.themovie.di.scope.ViewModelKey
import com.thitari.themovie.ui.screen.main.MainActivity
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
interface MainActivityModule {

    @Binds
    @ActivityScope
    fun mainNavigation(navigator: MainNavigator): MainNavigation

    @Binds
    @ActivityScope
    fun activity(mainActivity: MainActivity): Activity

    @Binds
    @ActivityScope
    fun movieRepository(mainRepository: MovieRepositoryImpl): MovieRepository

    @Binds
    @IntoMap
    @ActivityScope
    @ViewModelKey(MainViewModel::class)
    fun mainViewModel(viewModel: MainViewModelImpl): ViewModel
}
