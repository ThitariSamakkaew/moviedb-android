package com.thitari.themovie.ui.screen.main

import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.thitari.themovie.R
import com.thitari.themovie.ui.base.BaseActivity

class MainActivity : BaseActivity<MainViewModel>() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun provideViewModel(): MainViewModel =
        ViewModelProvider(this, viewModelFactory).get(MainViewModel::class.java)
}
