package com.project.mygopek.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.project.mygopek.R
import com.project.mygopek.domain.Money
import org.w3c.dom.Text

class CardViewAdapter (private val listMoney:ArrayList<Money>): RecyclerView.Adapter<CardViewAdapter.CardViewHolder>(){
    inner class CardViewHolder(itemView: View):RecyclerView.ViewHolder(itemView) {
        val imgPhoto:ImageView=itemView.findViewById(R.id.img_photo_cardview)
        val tvName:TextView=itemView.findViewById(R.id.tv_name_cardview)
        val tvDetail:TextView=itemView.findViewById(R.id.tv_detail_cardview)
        val btnFavorite:Button=itemView.findViewById(R.id.btn_set_favorite)

    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CardViewAdapter.CardViewHolder {
        val view:View=LayoutInflater.from(parent.context).inflate(R.layout.fragment_seccond,parent,false)
        return CardViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listMoney.size
    }

    override fun onBindViewHolder(holder: CardViewAdapter.CardViewHolder, position: Int) {
        val money=listMoney[position]
        Glide.with(holder.itemView.context)
            .load(money.photo)
            .apply(RequestOptions().override(350,550))
            .into(holder.imgPhoto)
        holder.tvName.text=money.name
        holder.tvDetail.text=money.detail
        holder.btnFavorite.setOnClickListener{Toast.makeText((holder.itemView.context),"Favorite "+listMoney[holder.adapterPosition].name,Toast.LENGTH_SHORT).show()}
    }

}