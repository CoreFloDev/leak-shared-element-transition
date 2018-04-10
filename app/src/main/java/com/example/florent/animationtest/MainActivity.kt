package com.example.florent.animationtest

import android.app.ActivityOptions
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        go_next.setOnClickListener {
            startActivity(Intent(this, SecondActivity::class.java), ActivityOptions.makeSceneTransitionAnimation(this).toBundle())
        }
    }
}
