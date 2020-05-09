package com.project.mygopek.utils

import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.project.mygopek.R

fun ImageView.loadImage(url: Any?) {
    val option = RequestOptions()
        .placeholder(R.drawable.ic_launcher_foreground)

    Glide.with(this.context)
        .setDefaultRequestOptions(option)
        .load(url)
        .into(this)
}