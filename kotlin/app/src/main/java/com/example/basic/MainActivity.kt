package com.example.basic

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        Log.d("Main activity","onCreate")
        val btnGo = findViewById<Button>(R.id.btn_go_to_B)

        btnGo.setOnClickListener {
            val intent = Intent(this, Activity2::class.java)
            Log.d("Activity A","button click")
            startActivity(intent)
        }
    }
    override fun onStart(){
        super.onStart()
        Log.d("Main activity","onStart")
    }
    override fun onResume()
    {
        super.onResume()
        Log.d("Main activity","onResume")
    }
    override fun onPause(){
        super.onPause()
        Log.d("Main activity", "onPause")
    }
    override fun onStop()
    {
        super.onStop()
        Log.d("Main activity", "onStop")
    }
    override fun onDestroy(){
        super.onDestroy()
        Log.d("Main activity","onDestroy")
    }
}