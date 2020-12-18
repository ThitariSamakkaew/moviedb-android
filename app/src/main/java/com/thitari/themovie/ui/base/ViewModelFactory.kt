package com.thitari.themovie.ui.base

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.thitari.themovie.di.scope.ActivityScope
import com.thitari.themovie.di.scope.FragmentScope
import javax.inject.Inject
import javax.inject.Provider

open class ViewModelFactory(
    private val viewModels: Map<Class<out ViewModel>, @JvmSuppressWildcards Provider<ViewModel>>
) : ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        var viewModel: Provider<out ViewModel>? = viewModels[modelClass]
        if (viewModel == null) {
            for (entry in viewModels.entries) {
                if (modelClass.isAssignableFrom(entry.key)) {
                    viewModel = entry.value
                    break
                }
            }
        }
        requireNotNull(viewModel) { "unknown model class $modelClass" }
        @Suppress("UNCHECKED_CAST")
        return viewModel.get() as T
    }
}

@ActivityScope
class ActivityViewModelFactory @Inject constructor(
    viewModels: Map<Class<out ViewModel>, @JvmSuppressWildcards Provider<ViewModel>>
) : ViewModelFactory(viewModels)

@FragmentScope
class FragmentViewModelFactory @Inject constructor(
    viewModels: Map<Class<out ViewModel>, @JvmSuppressWildcards Provider<ViewModel>>
) : ViewModelFactory(viewModels)
