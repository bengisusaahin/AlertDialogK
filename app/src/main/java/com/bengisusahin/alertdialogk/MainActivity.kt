package com.bengisusahin.alertdialogk

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //1) Toast 2) AlertDialog 3) Snackbar

        //Context
        //Activity Context -> this
        //Application Context -> applicationContext

        Toast.makeText(this@MainActivity, "Welcome!", Toast.LENGTH_LONG).show()

        /*
        //lambda
        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener{
            println("button clicked")
        }

        //interface
        button.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                println("")
                this@MainActivity
            }

        })
        */

    }

    fun save(view : View){

    }
}