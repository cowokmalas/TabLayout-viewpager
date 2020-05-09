package com.project.mygopek.fragment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.project.mygopek.data.Money

import com.project.mygopek.R
import com.project.mygopek.adapter.GridAdapter
import com.project.mygopek.data.DataMoney
import kotlinx.android.synthetic.main.fragment_first.*

/**
 * A simple [Fragment] subclass.
 */
class FirstFragment : Fragment() {

    private lateinit var mAdapter: GridAdapter
    private var mList: ArrayList<Money> = ArrayList()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        setupData()
        setupAdapter()
    }

    private fun setupData() {
        mList.clear()
        mList.addAll(DataMoney.listData)
    }

    private fun setupAdapter() {
        mAdapter = GridAdapter(mList)
        mAdapter.notifyDataSetChanged()
        rv_grid.apply {
            adapter = mAdapter
            layoutManager = GridLayoutManager(context, 2)
            setHasFixedSize(true)
        }
    }

//        rvGrid = view.findViewById(R.id.rv_grid)
//        rvGrid.layoutManager = GridLayoutManager(activity, 2)
//        grid.addAll(listData) -> data akan bertambah 2x lipat hingga seterusnya seberapa banyak user mengklik menu tab tersebut
//        rvGrid.setHasFixedSize(true)
//        rvGrid.adapter = com.project.mygopek.adapter.GridAdapter(grid)

}
