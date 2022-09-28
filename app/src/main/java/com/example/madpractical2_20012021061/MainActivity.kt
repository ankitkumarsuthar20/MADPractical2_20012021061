package com.example.madpractical2_20012021061

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    private val TAG="MainActivity"
    private lateinit var  mycl:ConstraintLayout
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mycl=findViewById(R.id.mycl)
        Log.i(TAG, "onCreate: on create  method is called")
        Toast.makeText(this,"onCreate: on create  method is called",Toast.LENGTH_LONG).show()
        Snackbar.make(mycl,"onCreate: on create  method is called",Snackbar.LENGTH_LONG).show()
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "onStart: on Start  method is called")
        Toast.makeText(this,"onStart: on Start method is called",Toast.LENGTH_LONG).show()
        Snackbar.make(mycl,"onStart: on Start method is called",Snackbar.LENGTH_LONG).show()
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG, "onResume: on Resume method is called")
        Toast.makeText(this,"onResume: on Resume  method is called",Toast.LENGTH_LONG).show()
        Snackbar.make(mycl,"onResume: on Resume  method is called",Snackbar.LENGTH_LONG).show()
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG, "onPause: on Pause  method is called")
        Toast.makeText(this,"onPause: on Pause method is called",Toast.LENGTH_LONG).show()
        Snackbar.make(mycl,"onPause: on Pause method is called",Snackbar.LENGTH_LONG).show()
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG, "onStop: on Stop method is called")
        Toast.makeText(this,"onStop: on Stop method is called",Toast.LENGTH_LONG).show()
        Snackbar.make(mycl,"onStop: on Stop method is called",Snackbar.LENGTH_LONG).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "onDestroy: on Destroy method is called")
        Toast.makeText(this,"onDestroy: on Pause method is called",Toast.LENGTH_LONG).show()
        Snackbar.make(mycl,"onDestroy: on Destroy method is called",Snackbar.LENGTH_LONG).show()
    }
}