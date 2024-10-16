package com.example.firstandroidapp

import android.content.Context
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.constraintlayout.widget.Group

class MainActivityListView : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity_listview)

        var lvItems = listOf("Test 1","Test 2")
        var lv = findViewById<ListView>(R.id.lvMain)
        var adapter:ArrayAdapter<*>
        adapter = ArrayAdapter(this,R.layout.simple_list_item,lvItems)
        lv.adapter= adapter
    }
}
