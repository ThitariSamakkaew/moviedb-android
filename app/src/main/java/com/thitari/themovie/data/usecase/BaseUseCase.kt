package com.thitari.themovie.data.usecase

import com.thitari.themovie.data.error.AppError

abstract class BaseUseCase<in Params, out Result>(
    private val defaultError: (Throwable) -> AppError
) where Result : Any {

    open suspend fun invoke(params: Params): Result {
        return try {
            run(params)
        } catch (error: Throwable) {
            throw composeError(error)
        }
    }

    abstract suspend fun run(params: Params): Result

    protected fun composeError(error: Throwable): Throwable = when (error) {
        is AppError -> error
        else -> defaultError(error)
    }
}
