package com.example.dell.wearsample.adapter

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.example.dell.wearsample.R

/**
 * Created by ${DERYA_YANAL} on 13.06.2018.
 */
class NewsViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

    val imgTitle by lazy { itemView.findViewById<ImageView>(R.id.adapter_item_imgTitle) }
    val tvTitle by lazy { itemView.findViewById<TextView>(R.id.adapter_item_tvTitle) }
    val tvContent by lazy { itemView.findViewById<TextView>(R.id.adapter_item_tvContent) }

}