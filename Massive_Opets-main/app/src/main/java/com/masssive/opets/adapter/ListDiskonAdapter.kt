package com.masssive.opets.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.masssive.opets.R
import com.masssive.opets.model.diskon

class ListDiskonAdapter(private val listDiskon: ArrayList<diskon>) : RecyclerView.Adapter<ListDiskonAdapter.ListViewHHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHHolder {

        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.diskon_item, parent, false)
        return ListViewHHolder(view)
    }

    override fun getItemCount(): Int =listDiskon.size

    override fun onBindViewHolder(holder: ListViewHHolder, position: Int) {
        val (photo) = listDiskon[position]
        holder.imgPhoto.setImageResource(photo)

    }

    class ListViewHHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imgPhoto :ImageView = itemView.findViewById(R.id.img_dis)

    }
}