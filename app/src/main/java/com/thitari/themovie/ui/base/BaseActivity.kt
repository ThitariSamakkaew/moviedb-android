package com.thitari.themovie.ui.base

import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

abstract class BaseActivity<VM : BaseViewModel> : DaggerAppCompatActivity() {

@Inject lateinit var viewModelFactory: ActivityViewModelFactory

    protected val viewModel: VM by lazy { provideViewModel() }

    abstract fun provideViewModel(): VM
}

