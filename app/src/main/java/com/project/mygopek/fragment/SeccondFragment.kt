package com.project.mygopek.fragment


import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

import com.project.mygopek.R
import com.project.mygopek.adapter.CardViewAdapter
import com.project.mygopek.adapter.GridAdapter
import com.project.mygopek.domain.DataMoney
import com.project.mygopek.domain.DataMoney.listData
import com.project.mygopek.domain.Money

/**
 * A simple [Fragment] subclass.
 */
class SeccondFragment() : Fragment() {
    private lateinit var cardView:RecyclerView
    private val cardList:ArrayList<Money> = ArrayList()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val view= inflater.inflate(R.layout.fragment_seccond, container, false)
        cardView=view.findViewById(R.id.rv_cardview)
        cardView.layoutManager=LinearLayoutManager(activity)
        cardView.setHasFixedSize(true)
        cardList.addAll(listData)
       /* val cardViewAdapter= CardViewAdapter(cardList)
          cardView.adapter=cardViewAdapter
        */

        return view
    }


}


