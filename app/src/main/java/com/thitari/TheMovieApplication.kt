package com.thitari

import com.thitari.themovie.di.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DaggerApplication

class TheMovieApplication : DaggerApplication() {

    override fun applicationInjector(): AndroidInjector<TheMovieApplication> {
        return DaggerAppComponent.factory().create(this@TheMovieApplication)
    }

}
