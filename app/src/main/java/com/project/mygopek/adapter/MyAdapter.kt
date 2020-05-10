package com.project.mygopek.adapter

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.project.mygopek.fragment.FirstFragment
import com.project.mygopek.fragment.LastFragment
import com.project.mygopek.fragment.SeccondFragment

@Suppress("DEPRECATION")
class MyAdapter(fm: FragmentManager):FragmentPagerAdapter(fm){

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



