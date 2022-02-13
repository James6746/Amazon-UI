package com.example.amazonui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView

class FavoriteAdapter(private val items: ArrayList<Essential>) :
    RecyclerView.Adapter<FavoriteAdapter.VH>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH =
        VH(LayoutInflater.from(parent.context).inflate(R.layout.item_feed_essential, parent, false))

    override fun onBindViewHolder(holder: VH, position: Int) {
        holder.apply {
            iv_image.setImageResource(items[position].image)
            tv_title.text = items[position].title
        }
    }

    override fun getItemCount(): Int = items.size

    inner class VH(view: View) : RecyclerView.ViewHolder(view) {
        val iv_image: ImageView = view.findViewById(R.id.iv_image)
        val tv_title: TextView = view.findViewById(R.id.tv_title)
    }
}