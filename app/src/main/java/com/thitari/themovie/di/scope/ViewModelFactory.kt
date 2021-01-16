package com.thitari.themovie.di.scope

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import dagger.MapKey
import javax.inject.Provider
import kotlin.reflect.KClass

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

@MustBeDocumented
@Target(
    AnnotationTarget.FUNCTION,
    AnnotationTarget.PROPERTY_GETTER,
    AnnotationTarget.PROPERTY_SETTER
)
@Retention(AnnotationRetention.RUNTIME)
@MapKey
annotation class ViewModelKey(val value: KClass<out ViewModel>)
