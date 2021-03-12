package com.aditya.belajarfundamentalandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var btnFragmentActivity: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnFragmentActivity = findViewById(R.id.btn_to_fragment)
        btnFragmentActivity.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id) {
            R.id.btn_to_fragment -> {
                val intent = Intent(this@MainActivity, FragmentActivity::class.java)
                startActivity(intent)
            }
        }
    }
}