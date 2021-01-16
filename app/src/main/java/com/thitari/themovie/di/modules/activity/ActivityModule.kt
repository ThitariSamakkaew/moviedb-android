package com.thitari.themovie.di.modules.activity

import com.thitari.themovie.ui.screen.main.MainActivity
import com.thitari.themovie.di.modules.SerViceModule
import com.thitari.themovie.di.modules.activity.main.MainActivityFragmentModule
import com.thitari.themovie.di.modules.activity.main.MainActivityModule
import com.thitari.themovie.di.scope.ActivityScope
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
interface ActivityModule {

    @ActivityScope
    @ContributesAndroidInjector(
        modules = [
            MainActivityModule::class,
            MainActivityFragmentModule::class,
            SerViceModule::class
        ]
    )
    fun mainActivity(): MainActivity
}
