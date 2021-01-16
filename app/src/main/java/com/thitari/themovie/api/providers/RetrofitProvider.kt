package com.thitari.themovie.api.providers

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import com.thitari.themovie.BuildConfig
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitProvider {

    private val gson: Gson
        get() = GsonBuilder()
            .setLenient()
            .setDateFormat(PATTERN_YEAR_MONTH_DAY)
            .create()

    fun provideRetrofit(okHttpClient: OkHttpClient): Retrofit {
        return Retrofit.Builder()
            .baseUrl(BuildConfig.API_ENDPOINT)
            .client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create(gson))
            .addCallAdapterFactory(CoroutineCallAdapterFactory.invoke())
            .build()
    }
}

private const val PATTERN_YEAR_MONTH_DAY = "yyyy-MM-dd"
