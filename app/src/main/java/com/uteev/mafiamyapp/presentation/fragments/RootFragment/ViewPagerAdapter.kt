package com.uteev.mafiamyapp.presentation.fragments.RootFragment

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.uteev.mafiamyapp.presentation.fragments.OtherFragments.ShowWeatherFragment

class ViewPagerAdapter(fragmentActivity : FragmentActivity) : FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int {
       return NUM_PAGES
    }

    override fun createFragment(position: Int): Fragment {
        return when(position) {
            0 -> ShowWeatherFragment()
            else -> ShowWeatherFragment()
        }
    }

    companion object {
        private const val NUM_PAGES = 2
    }
}