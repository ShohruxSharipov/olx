package com.example.olx.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.olx.Categories.Categories
import com.example.olx.R

class Adapter2(var list:MutableList<Categories>) : RecyclerView.Adapter<Adapter2.Holder>() {

    open class Holder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var image = itemView.findViewById<ImageView>(R.id.picture)
        var desc = itemView.findViewById<TextView>(R.id.describtion)
        var name = itemView.findViewById<TextView>(R.id.describtion)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        TODO("Not yet implemented")
    }


}