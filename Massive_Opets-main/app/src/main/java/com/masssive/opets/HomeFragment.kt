package com.masssive.opets

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.masssive.opets.adapter.ListDiskonAdapter
import com.masssive.opets.model.diskon

class HomeFragment : Fragment() {

    private lateinit var rvDiskon: RecyclerView
    private val list = ArrayList<diskon>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        // Initialize RecyclerView here
        rvDiskon = view.findViewById(R.id.rv_dis)
        rvDiskon.setHasFixedSize(true)

        // Populate the list and show RecyclerView
        list.addAll(getListDiskon())
        showRecyclerList()

        return view
    }

    private fun showRecyclerList() {
        // Use context instead of 'this' in LinearLayoutManager
        rvDiskon.layoutManager = LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)
        val listDiskonAdapter = ListDiskonAdapter(list)
        rvDiskon.adapter = listDiskonAdapter
    }

    private fun getListDiskon(): ArrayList<diskon> {
        val dataPhotoD = resources.obtainTypedArray(R.array.Dis_foto)
        val dataNameD = resources.getStringArray(R.array.dataD_name)
        val listDiskon = ArrayList<diskon>()

        for (i in dataNameD.indices) {
            val diskon = diskon(dataPhotoD.getResourceId(i, -1), dataNameD[i])
            listDiskon.add(diskon)
        }

        // Release the resources when done
        dataPhotoD.recycle()

        return listDiskon
    }
}
