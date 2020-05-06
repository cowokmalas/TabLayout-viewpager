package com.project.mygopek.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.project.mygopek.Money
import com.project.mygopek.R
import com.project.mygopek.fragment.FirstFragment

class GridAdapter (private val gridview:ArrayList<Money>):RecyclerView.Adapter<GridAdapter.GridViewHolder>(){
    class GridViewHolder (itemView: View):RecyclerView.ViewHolder(itemView){
        val imgPhoto:ImageView=itemView.findViewById(R.id.img_item_photo)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GridViewHolder {
        val view:View=LayoutInflater.from(parent.context).inflate(R.layout.item_gridview,parent,false)
        return GridViewHolder(view)
    }

    override fun getItemCount(): Int {
        return gridview.size
    }

    override fun onBindViewHolder(holder: GridViewHolder, position: Int) {
        Glide.with(holder.itemView.context)
            .load(gridview[position].photo)
            .apply(RequestOptions().override(350,550))
            .into(holder.imgPhoto)
    }


}