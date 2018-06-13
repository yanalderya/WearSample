package com.example.dell.wearsample

import android.media.session.MediaController
import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.support.wearable.activity.WearableActivity
import android.view.Menu
import android.widget.TextView
import com.example.dell.wearsample.adapter.NewsListRV
import com.example.dell.wearsample.model.NewsInfo
import kotlinx.android.synthetic.main.adapter_item.*

class DashboardActivity : WearableActivity() {

    private val list by lazy { findViewById<RecyclerView>(R.id.activity_dashboard_recycler_view) }
    private val content by lazy { findViewById<TextView>(R.id.adapter_item_tvContent) }
    lateinit var allNewsInfo:ArrayList<NewsInfo>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        // Enables Always-on
        setAmbientEnabled()

        getData()

        val myAdapter=NewsListRV(this,allNewsInfo)

        list.layoutManager=LinearLayoutManager(this)

        list.adapter=myAdapter




    }

    private fun getData() {

        allNewsInfo= ArrayList<NewsInfo>(12)

        val haberBaslik=resources.getStringArray(R.array.title)
        val haberIcerik =resources.getStringArray(R.array.content)
        val haberFoto=arrayOf(R.drawable.koc_buyuk1,R.drawable.boga_buyuk2,
                R.drawable.ikizler_buyuk3,R.drawable.yengec_buyuk4,R.drawable.aslan_buyuk5,R.drawable.basak_buyuk6,R.drawable.terazi_buyuk7,R.drawable.akrep_buyuk8,R.drawable.yay_buyuk9,
                R.drawable.oglak_buyuk10,R.drawable.kova_buyuk11,R.drawable.balik_buyuk12)

        for (i in 0..11){
            val arrayList=NewsInfo(haberFoto[i],haberBaslik[i],haberIcerik[i])
            allNewsInfo.add(arrayList)
        }

    }
}
