package com.example.firstandroidapp

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.constraintlayout.widget.Group

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        var btn = findViewById<Button>(R.id.btnGetInfor)
        btn.setOnClickListener {
            var txtHeader = findViewById<TextView>(R.id.txtHeader)
            txtHeader.text="Basic Information";

            var groupInfor=findViewById<Group>(R.id.groupInfor)
            groupInfor.visibility= View.GONE
        }
    }
}
