package com.example.firstandroidapp

import android.content.Context
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.constraintlayout.widget.Group
import com.example.firstandroidapp.ui.theme.FirstAndroidAppTheme

class MainActivityListView : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity_listview)
//        var lvItems = listOf{
//            Item("Item 1","Description 1")
//            Item("Item 2", "Description 2")
//        }
        var lvItems = listOf("Test 1","Test 2")
        var lv = findViewById<ListView>(R.id.lvMain)
        var adapter:ArrayAdapter<*>
        adapter = ArrayAdapter(this,R.layout.simple_list_item,lvItems)
        lv.adapter= adapter
    }
}
data class Item(val name: String, val description: String)
