package com.thitari.themovie.api.providers

import com.thitari.themovie.BuildConfig
import okhttp3.Authenticator
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import java.util.concurrent.TimeUnit

object OkHttpClientProvider {
    
    fun provideOkHttpClient(
        authenticator: Authenticator
    ): OkHttpClient {
        val logging = HttpLoggingInterceptor().apply {
            level = if (BuildConfig.DEBUG) {
                HttpLoggingInterceptor.Level.BODY
            } else {
                HttpLoggingInterceptor.Level.NONE
            }
        }
        return OkHttpClient.Builder()
            .connectTimeout(DEFAULT_TIMEOUT_IN_SEC, TimeUnit.SECONDS)
            .readTimeout(DEFAULT_TIMEOUT_IN_SEC, TimeUnit.SECONDS)
            .writeTimeout(DEFAULT_TIMEOUT_IN_SEC, TimeUnit.SECONDS)
            .retryOnConnectionFailure(true)
            .addInterceptor(logging)
            .authenticator(authenticator)
            .build()
    }
}

private const val DEFAULT_TIMEOUT_IN_SEC = 60L