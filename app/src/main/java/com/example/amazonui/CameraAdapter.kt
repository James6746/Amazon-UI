package com.example.amazonui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class CameraAdapter(private val items: ArrayList<Camera>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return VH(LayoutInflater.from(parent.context).inflate(R.layout.item_camera, parent, false))
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is VH) {
            holder.iv_image.setImageResource(items[position].image)
            holder.tv_title.setText(items[position].name)
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    class VH(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var iv_image: ImageView
        var tv_title: TextView

        init {
            iv_image = itemView.findViewById(R.id.iv_camera)
            tv_title = itemView.findViewById(R.id.tv_name_camera)
        }
    }
}
