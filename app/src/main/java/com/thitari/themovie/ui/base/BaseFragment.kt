package com.thitari.themovie.ui.base

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.thitari.themovie.data.error.toReadableMessage
import com.thitari.themovie.ui.common.Toaster
import dagger.android.support.DaggerFragment
import javax.inject.Inject

abstract class BaseFragment<VM : BaseViewModel> : DaggerFragment() {

    @Inject
    lateinit var viewModelFactory: FragmentViewModelFactory

    @Inject
    lateinit var toaster: Toaster

    protected val viewModel: VM by lazy { provideViewModel() }

    protected abstract val layoutRes: Int

    abstract fun provideViewModel(): VM

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(layoutRes, container, false)
    }

    protected open fun displayError(error: Throwable) {
        Log.e(this.javaClass.simpleName, "", error)
        val message = error.toReadableMessage(requireContext())
           toaster.display(message)
    }
}
