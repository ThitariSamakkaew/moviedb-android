package com.thitari.themovie.ui

import com.thitari.themovie.di.DaggerAppComponent
import dagger.android.*

class TheMovieApplication : DaggerApplication(){

    override fun applicationInjector(): AndroidInjector<TheMovieApplication> {
        return DaggerAppComponent.factory().create(this@TheMovieApplication)
    }
}
