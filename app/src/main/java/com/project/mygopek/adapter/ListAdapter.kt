package com.project.mygopek.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.project.mygopek.data.Money
import com.project.mygopek.R
import com.project.mygopek.utils.loadImage
import kotlinx.android.synthetic.main.item_listview.view.*

class ListAdapter(private val list: ArrayList<Money>) :
    RecyclerView.Adapter<ListAdapter.ListViewHolder>() {

    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bind(money: Money) {
            itemView.tv_name.text = money.name
            itemView.tv_detail.text = money.detail
            itemView.img_item_photo.loadImage(money.photo)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListAdapter.ListViewHolder {
        val view: View =
            LayoutInflater.from(parent.context).inflate(R.layout.item_listview, parent, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ListAdapter.ListViewHolder, position: Int) {
        holder.bind(list[position])
    }
}