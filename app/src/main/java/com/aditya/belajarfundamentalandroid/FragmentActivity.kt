package com.aditya.belajarfundamentalandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View

class FragmentActivity : AppCompatActivity(), View.OnClickListener {

    private val mFragmentManager = supportFragmentManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fragment)

        val mHomeFragment = HomeFragment()
        val fragment = mFragmentManager.findFragmentByTag(HomeFragment::class.java.simpleName)
        if (fragment !is HomeFragment) {
            Log.d("MyFlexibleFragment", "Fragment Name: " + HomeFragment::class.java.simpleName)

            mFragmentManager
                    .beginTransaction()
                    .add(R.id.frame_container, mHomeFragment, HomeFragment::class.java.simpleName)
                    .commit()
        }
    }

    override fun onClick(v: View?) {
        TODO("Not yet implemented")
    }
}