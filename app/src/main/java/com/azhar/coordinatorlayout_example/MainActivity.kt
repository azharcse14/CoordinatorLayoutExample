package com.azhar.coordinatorlayout_example

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnLayoutBased.setOnClickListener {
            startActivity(Intent(this, LayoutBasedActivtiy::class.java))
        }

        btnScrollBased.setOnClickListener {
            startActivity(Intent(this, ScrollBasedActivtiy::class.java))
        }
    }
}