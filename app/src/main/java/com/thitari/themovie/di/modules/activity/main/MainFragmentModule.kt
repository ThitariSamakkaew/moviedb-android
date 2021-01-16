package com.thitari.themovie.di.modules.activity.main

import androidx.lifecycle.ViewModel
import com.thitari.themovie.di.scope.FragmentScope
import com.thitari.themovie.di.scope.ViewModelKey
import com.thitari.themovie.ui.screen.main.fragment.MainFragmentViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
interface MainFragmentModule {

    @Binds
    @IntoMap
    @FragmentScope
    @ViewModelKey(MainFragmentViewModel::class)
    fun mainFragmentViewModel(mainFragmentViewModel: MainFragmentViewModel): ViewModel
}
