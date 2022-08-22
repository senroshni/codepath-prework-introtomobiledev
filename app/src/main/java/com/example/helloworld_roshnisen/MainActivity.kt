package com.example.helloworld_roshnisen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

//This is the Kotlin file where I will learn how to handle user interaction
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //The user can tap a button to change the text colour of the label

        findViewById<Button>(R.id.button).setOnClickListener {
            Log.i("Roshni Sen", "Tapped on button")

            findViewById<TextView>(R.id.textView).setTextColor(getResources().getColor(R.color.white))
        }



    }
}