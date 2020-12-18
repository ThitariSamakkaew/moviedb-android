package com.thitari.themovie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.thitari.themovie.ui.screen.main.fragment.listmovie.ListMovieAdapter
import com.thitari.themovie.ui.screen.main.fragment.listmovie.popular.PopularFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    private fun setUpTab(){
        val adapter = ListMovieAdapter(supportFragmentManager)
        adapter.addFragment(PopularFragment(),"Popular")
        viewPager.adapter = adapter
        tabs.setUpWithViewPager(viewPager)

    }
}
