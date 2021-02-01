package com.thitari.themovie.di

import android.app.Application
import com.thitari.themovie.ui.TheMovieApplication
import com.thitari.themovie.di.modules.AppModule
import com.thitari.themovie.di.modules.activity.ActivityModule
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AndroidInjectionModule::class,
        ActivityModule::class,
        AppModule::class
    ]
)
interface AppComponent : AndroidInjector<TheMovieApplication> {
    @Component.Factory
    interface Factory {

        fun create(
            @BindsInstance application: Application
        ): AppComponent
    }
}
