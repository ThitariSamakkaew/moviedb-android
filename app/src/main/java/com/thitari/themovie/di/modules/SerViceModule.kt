package com.thitari.themovie.di.modules

import com.thitari.themovie.api.providers.RetrofitProvider
import com.thitari.themovie.api.service.MovieService
import com.thitari.themovie.di.scope.ActivityScope
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient

@Module
class SerViceModule {

    @Provides
    @ActivityScope
    fun movieService(okHttpClient: OkHttpClient): MovieService {
        return RetrofitProvider.provideRetrofit(okHttpClient)
            .create(MovieService::class.java)
    }
}
