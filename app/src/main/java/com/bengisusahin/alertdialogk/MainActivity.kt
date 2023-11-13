package com.bengisusahin.alertdialogk

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

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
        val alert = AlertDialog.Builder(this@MainActivity)
        alert.setTitle("Save")
        alert.setMessage("Are you sure?")
        alert.setPositiveButton("Yes", object : DialogInterface.OnClickListener {
            override fun onClick(dialog: DialogInterface?, which: Int) {
                Toast.makeText(this@MainActivity, "Saved!", Toast.LENGTH_LONG).show()
            }

        })
        alert.setNegativeButton("No"){dialog, which ->
            Toast.makeText(this@MainActivity, "Not Saved!", Toast.LENGTH_LONG).show()
        }
        alert.show()
    }
}