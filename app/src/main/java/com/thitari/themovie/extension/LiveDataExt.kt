package com.thitari.themovie.extension

import androidx.lifecycle.LiveData

suspend fun <T> LiveData<T>.requireValue(): T {
    val _value = value
    if (_value == null) {
        throw IllegalStateException("Value is null")
    } else {
        return _value
    }
}
