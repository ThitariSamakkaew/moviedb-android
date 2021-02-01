package com.thitari.themovie.di.modules.activity.main

import com.thitari.themovie.ui.screen.main.fragment.MainFragment
import com.thitari.themovie.di.scope.FragmentScope
import com.thitari.themovie.ui.screen.main.fragment.main.detail.DetailMovieFragment
import com.thitari.themovie.ui.screen.main.fragment.main.list.popular.PopularMovieListFragment
import com.thitari.themovie.ui.screen.main.fragment.main.list.top.TopMovieListFragment
import com.thitari.themovie.ui.screen.main.fragment.main.list.upcoming.UpcomingMovieListFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
interface MainActivityFragmentModule {

    @FragmentScope
    @ContributesAndroidInjector(modules = [MainFragmentModule::class])
    fun mainFragment(): MainFragment

    @FragmentScope
    @ContributesAndroidInjector(modules = [TopMovieListFragmentModule::class])
    fun topMovieListFragment(): TopMovieListFragment

    @FragmentScope
    @ContributesAndroidInjector(modules = [UpcomingMovieListFragmentModule::class])
    fun upcomingMovieListFragment(): UpcomingMovieListFragment

    @FragmentScope
    @ContributesAndroidInjector(modules = [PopularMovieListFragmentModule::class])
    fun popularMovieListFragment(): PopularMovieListFragment

    @FragmentScope
    @ContributesAndroidInjector(modules = [DetailMovieFragmentModule::class])
    fun detailMovieFragment(): DetailMovieFragment
}
