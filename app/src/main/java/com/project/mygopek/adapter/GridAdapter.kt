package com.project.mygopek.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.project.mygopek.data.Money
import com.project.mygopek.R
import com.project.mygopek.utils.loadImage
import kotlinx.android.synthetic.main.item_gridview.view.*

class GridAdapter(private val itemList: ArrayList<Money>) :
    RecyclerView.Adapter<GridAdapter.GridViewHolder>() {

    class GridViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(money: Money) {
            itemView.img_item_photo.loadImage(money.photo)
        }

        val imgPhoto: ImageView = itemView.findViewById(R.id.img_item_photo)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GridViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.item_gridview, parent, false)
        return GridViewHolder(view)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: GridViewHolder, position: Int) {
        holder.bind(itemList[position])
    }


}