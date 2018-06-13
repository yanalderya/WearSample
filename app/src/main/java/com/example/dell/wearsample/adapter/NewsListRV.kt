package com.example.dell.wearsample.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.dell.wearsample.R
import com.example.dell.wearsample.model.NewsInfo

/**
 * Created by ${DERYA_YANAL} on 13.06.2018.
 */
class NewsListRV(context:Context,val allNewsInfo:ArrayList<NewsInfo>) :RecyclerView.Adapter<NewsViewHolder>(){

    var allList:ArrayList<NewsInfo>
    var context: Context

    init {
        allList=allNewsInfo
        this.context=context

    }
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): NewsViewHolder {

        val inflater=LayoutInflater.from(p0.context).inflate(R.layout.adapter_item,p0,false)
        return NewsViewHolder(inflater)

    }

    override fun getItemCount(): Int {
       return allList.size
    }

    override fun onBindViewHolder(holder: NewsViewHolder, p1: Int) {

        holder.imgTitle.setImageResource(allList.get(p1).haberFoto)
        holder.tvTitle.setText(allList.get(p1).haberBaslik)
        holder.tvContent.setText(allList.get(p1).haberIcerik)


    }



}