package com.example.basic

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Activity2 : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second)

        Log.d("Activity2", "onCreate")

        val btnBack = findViewById<Button>(R.id.btn_back_A)

        btnBack.setOnClickListener {
            Log.d("Activity2", "button back click")
            finish()   // QUAY LẠI ACTIVITY A
        }
    }

    override fun onStart(){
        super.onStart()
        Log.d("Main activity 2","onStart")
    }
    override fun onResume()
    {
        super.onResume()
        Log.d("Main activity 2","onResume")
    }
    override fun onPause(){
        super.onPause()
        Log.d("Main activity 2", "onPause")
    }
    override fun onStop()
    {
        super.onStop()
        Log.d("Main activity 2", "onStop")
    }
    override fun onDestroy(){
        super.onDestroy()
        Log.d("Main activity 2","onDestroy")
    }
}