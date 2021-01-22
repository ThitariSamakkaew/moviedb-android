package com.thitari.themovie.ui.screen.main.fragment

import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProvider
import com.google.android.material.tabs.TabLayoutMediator
import com.thitari.themovie.R
import com.thitari.themovie.ui.base.BaseFragment
import com.thitari.themovie.ui.screen.main.fragment.main.ViewPagerAdapter

import kotlinx.android.synthetic.main.fragment_main.*

class MainFragment : BaseFragment<MainFragmentViewModel>() {

    override val layoutRes: Int = R.layout.fragment_main

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val adapter = ViewPagerAdapter(this)
        viewPagerFragmentListMovie.adapter = adapter
        TabLayoutMediator(tblFragmentListMovie, viewPagerFragmentListMovie) { tab, position ->
            when (position) {
                0 -> tab.setText(R.string.popular)
                1 -> tab.setText(R.string.upcoming)
                2 -> tab.setText(R.string.top)
            }
        }.attach()
    }

    override fun provideViewModel(): MainFragmentViewModel =
        ViewModelProvider(this, viewModelFactory).get(MainFragmentViewModel::class.java)
}
