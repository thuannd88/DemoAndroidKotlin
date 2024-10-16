package com.example.firstandroidapp

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.provider.Settings
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.BaseAdapter
import android.widget.Button
import android.widget.ListView
import androidx.databinding.DataBindingUtil
import com.example.firstandroidapp.databinding.MainActivityListviewBinding
import com.example.firstandroidapp.databinding.ListitemBinding
import com.google.android.material.textfield.TextInputEditText

class MainActivityComplexListView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity_listview)
        var lvItems = listOf(
            Item("Item 1","Description 1"),
            Item("Item 2", "Description 2")
        )
        var lv = findViewById<ListView>(R.id.lvMain)
        var adapter = ItemAdapter(this, lvItems)
        lv.adapter= adapter
    }
}
data class Item(val name: String, val description: String)
class ItemAdapter(private val context: Context, private val items: List<Item>) : BaseAdapter() {
    override fun getCount(): Int = items.size

    override fun getItem(position: Int): Any = items[position]

    override fun getItemId(position: Int): Long = position.toLong()

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val binding: ListitemBinding
        val view: View

        if (convertView == null) {
            binding = DataBindingUtil.inflate(
                LayoutInflater.from(context),
                R.layout.listitem,
                parent,
                false
            )
            view = binding.root
            view.tag = binding
        } else {
            binding = convertView.tag as ListitemBinding
            view = convertView
        }

        binding.item = items[position]

        return view
    }
}