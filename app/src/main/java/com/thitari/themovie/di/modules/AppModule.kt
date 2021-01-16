package com.thitari.themovie.di.modules

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import android.preference.PreferenceManager
import com.thitari.themovie.api.providers.OkHttpClientProvider
import dagger.Binds
import dagger.Module
import dagger.Provides
import okhttp3.Authenticator
import okhttp3.OkHttpClient
import javax.inject.Singleton

@Module
abstract class AppModule {

    @Binds
    internal abstract fun applicationContext(application: Application): Context

    companion object {

        @Provides
        @Singleton
        fun okHttpClient(authenticator: Authenticator): OkHttpClient {
            return OkHttpClientProvider.provideOkHttpClient(authenticator)
        }
    }
}
