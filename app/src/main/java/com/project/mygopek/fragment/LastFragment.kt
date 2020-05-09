package com.project.mygopek.fragment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.project.mygopek.domain.DataMoney
import com.project.mygopek.domain.Money

import com.project.mygopek.R

/**
 * A simple [Fragment] subclass.
 */
class LastFragment : Fragment() {
    private lateinit var listview: RecyclerView
    private var list:ArrayList<Money> = ArrayList()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_last, container, false)

        listview=view.findViewById(R.id.rv_list)
        listview.layoutManager= LinearLayoutManager(activity)
        list.addAll(DataMoney.listData)
        listview.setHasFixedSize(true)
        listview.adapter=com.project.mygopek.adapter.ListAdapter(list)
        return view
    }


}
