package com.thitari.themovie.ui.common

import android.app.Activity
import android.widget.Toast
import androidx.annotation.StringRes
import javax.inject.Inject

class Toaster @Inject constructor(private val activity: Activity) {

    private var toast: Toast? = null

    fun display(message: String) {
        toast?.cancel()
        toast = Toast.makeText(activity, message, Toast.LENGTH_LONG).also { it.show() }
    }

    fun display(@StringRes messageRes: Int) {
        toast?.cancel()
        toast = Toast.makeText(activity, messageRes, Toast.LENGTH_LONG).also { it.show() }
    }
}
