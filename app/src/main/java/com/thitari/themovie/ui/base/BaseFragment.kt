package com.thitari.themovie.ui.base

import androidx.lifecycle.AbstractSavedStateViewModelFactory
import androidx.lifecycle.ViewModelProvider
import dagger.android.support.DaggerFragment
import javax.inject.Inject

abstract class BaseFragment<VM : BaseViewModel> : DaggerFragment() {

    @Inject lateinit var viewModelFactory: FragmentViewModelFactory

    protected val viewModel: VM by lazy { provideViewModel() }

    protected abstract val layoutRes: Int

    abstract fun provideViewModel(): VM

}
