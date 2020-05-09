package com.project.mygopek.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.project.mygopek.R
import com.project.mygopek.fragment.FirstFragment
import com.project.mygopek.fragment.LastFragment
import com.project.mygopek.fragment.SeccondFragment
import kotlinx.android.synthetic.main.activity_main.*

@Suppress("DEPRECATION")
class ViewPagerAdapter(fm: FragmentManager):FragmentPagerAdapter(fm){

    private val pages=listOf(
    FirstFragment(),
    SeccondFragment(),
      LastFragment()
 )
    override fun getItem(position: Int): Fragment {
    return pages[position]
 }

    override fun getCount(): Int {
    return pages.size
 }

}



