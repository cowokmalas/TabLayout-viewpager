package com.project.mygopek

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.project.mygopek.adapter.MyAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        vp_main.adapter=MyAdapter(supportFragmentManager)
        tab_layout.setupWithViewPager(vp_main)
        tab_layout.getTabAt(0)!!.setIcon(R.drawable.ic_home_white_24dp)
        tab_layout.getTabAt(1)!!.setIcon(R.drawable.ic_widgets_white_24dp)
        tab_layout.getTabAt(2)!!.setIcon(R.drawable.ic_list_white_24dp)



    }
}
