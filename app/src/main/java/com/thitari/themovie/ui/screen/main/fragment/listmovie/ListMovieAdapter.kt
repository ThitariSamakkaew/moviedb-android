package com.thitari.themovie.ui.screen.main.fragment.listmovie

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentPagerAdapter

class ListMovieAdapter : FragmentPagerAdapter() {

    private val fragmentList = ArrayList<Fragment>()
    private val fragmentTitleList = ArrayList<String>()

    override fun getCount(): Int {
        return fragmentTitleList.size
    }

    override fun getItem(position: Int): Fragment {
        return fragmentList[position]
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return fragmentTitleList[position]
    }

    fun addFragment(fragment: Fragment,title: String){
        fragmentList.add(fragment)
        fragmentTitleList.add(title)
    }
}
