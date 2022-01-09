package com.azhar.coordinatorlayout_example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_layout_based.*
import kotlinx.android.synthetic.main.activity_scroll_based.*
import kotlinx.android.synthetic.main.activity_scroll_based.fab

class LayoutBasedActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_layout_based)
        setSupportActionBar(findViewById(R.id.toolbar))

        fab.setOnClickListener { view ->
            Snackbar.make(view, getString(R.string.msg_clicked), Snackbar.LENGTH_LONG)
                .setAction("Action", null).show()
        }
    }

}