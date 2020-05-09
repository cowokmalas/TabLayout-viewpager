package com.project.mygopek.fragment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.project.mygopek.data.Money

import com.project.mygopek.R
import com.project.mygopek.adapter.ListAdapter
import com.project.mygopek.data.DataMoney
import kotlinx.android.synthetic.main.fragment_last.*

/**
 * A simple [Fragment] subclass.
 */
class LastFragment : Fragment() {

    private lateinit var mAdapter: ListAdapter

    private var mList: ArrayList<Money> = ArrayList()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        // only for inflate a view
        return inflater.inflate(R.layout.fragment_last, container, false)
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
        mAdapter = ListAdapter(mList)
        mAdapter.notifyDataSetChanged()
        rv_list.apply {
            adapter = mAdapter
            layoutManager = LinearLayoutManager(context)
            setHasFixedSize(true)
        }
    }
}
