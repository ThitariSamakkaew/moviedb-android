package com.thitari.themovie.ui.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import dagger.android.support.DaggerFragment
import javax.inject.Inject

abstract class BaseFragment<VM : BaseViewModel> : DaggerFragment() {

    @Inject lateinit var viewModelFactory: FragmentViewModelFactory

    protected val viewModel: VM by lazy { provideViewModel() }

    protected abstract val layoutRes: Int

    abstract fun provideViewModel(): VM

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(layoutRes,container,false)
    }
}
