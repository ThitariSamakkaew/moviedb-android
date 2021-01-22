package com.thitari.themovie.data.error

import android.content.Context
import androidx.annotation.StringRes
import com.thitari.themovie.R

open class AppError(
    cause: Throwable?,
    open val readableMessage: String? = null,
    @StringRes open val readableMessageRes: Int? = null
) : Throwable(cause)

fun Throwable.toReadableMessage(context: Context): String {
    return when (this) {
        is AppError -> {
            readableMessage ?: context.getString(readableMessageRes ?: R.string.error_default)
        }
        else -> context.getString(R.string.error_default)
    }
}
