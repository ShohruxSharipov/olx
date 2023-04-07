package com.example.olx.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.olx.Categories.Categories
import com.example.olx.Categories.Item
import com.example.olx.R
import com.example.olx.databinding.FragmentHomeBinding
import com.example.olx.databinding.FragmentPurchaseBinding
import com.example.olx.databinding.ProductsBinding

class Adapter2(var list:MutableList<Item>,var onClick: OnClick) : RecyclerView.Adapter<Adapter2.Holder>(){

    open class Holder(binding: ProductsBinding) : RecyclerView.ViewHolder(binding.root) {
        var image = itemView.findViewById<ImageView>(R.id.picture)
        var desc = itemView.findViewById<TextView>(R.id.describtion)
        var price = itemView.findViewById<TextView>(R.id.price)
        var cards = binding.card
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        return Holder(ProductsBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.desc.text = list[position].Descr
        holder.image.setImageResource(list[position].rasm)
        holder.price.text = list[position].Price
        holder.cards.setOnClickListener {
            onClick.setOnClick(list[position],position)
        }
    }

    interface OnClick{
        fun setOnClick(item: Item,position: Int)
    }


}
