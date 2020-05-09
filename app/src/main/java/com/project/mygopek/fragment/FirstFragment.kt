package com.project.mygopek.fragment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.project.mygopek.domain.DataMoney.listData
import com.project.mygopek.domain.Money

import com.project.mygopek.R

/**
 * A simple [Fragment] subclass.
 */
class FirstFragment : Fragment() {
    private lateinit var rvGrid:RecyclerView
    private var grid:ArrayList<Money> = ArrayList()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_first, container, false)
       rvGrid=view.findViewById(R.id.rv_grid)
        rvGrid.layoutManager=GridLayoutManager(activity,2)
        grid.addAll(listData)
        rvGrid.setHasFixedSize(true)
        rvGrid.adapter=com.project.mygopek.adapter.GridAdapter(grid)
        return view
    }


}
