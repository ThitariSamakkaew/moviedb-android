package com.thitari.themovie.ui.screen.main.fragment.main.list

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.thitari.themovie.ui.screen.main.fragment.main.list.popular.PopularMovieListFragment
import com.thitari.themovie.ui.screen.main.fragment.main.list.top.TopMovieListFragment
import com.thitari.themovie.ui.screen.main.fragment.main.list.upcoming.UpcomingMovieListFragment

class ViewPagerAdapter(fragment: Fragment) : FragmentStateAdapter(fragment) {

    val fragments = listOf(
        PopularMovieListFragment(),
        UpcomingMovieListFragment(),
        TopMovieListFragment()
    )

    override fun getItemCount(): Int {
        return fragments.size
    }

    override fun createFragment(position: Int): Fragment {
        return fragments[position]
    }


}
