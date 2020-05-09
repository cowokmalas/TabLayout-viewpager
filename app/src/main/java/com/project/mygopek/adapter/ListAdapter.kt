package com.project.mygopek.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.project.mygopek.R
import com.project.mygopek.domain.Money

class ListAdapter (private val list:ArrayList<Money>):RecyclerView.Adapter<ListAdapter.ListViewHolder>() {

    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imgPhoto:ImageView=itemView.findViewById(R.id.img_item_photo)
        val tvName:TextView=itemView.findViewById(R.id.tv_name)
        val tvDetail:TextView=itemView.findViewById(R.id.tv_detail)


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
        val myMoney = list[position]
        Glide.with(holder.itemView.context)
            .load(myMoney.photo)
            .apply(RequestOptions().override(55, 55))
            .into(holder.imgPhoto)
        holder.tvName.text = myMoney.name
        holder.tvDetail.text = myMoney.detail

    }
}