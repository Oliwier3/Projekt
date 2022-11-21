package com.example.projekt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var i=1
        findViewById<Button>(R.id.dalej).setOnClickListener {
            i += 1
            if (i == 1)
                findViewById<ImageView>(R.id.obraz).setImageResource(R.drawable.sid1)
            if (i == 2)
                findViewById<ImageView>(R.id.obraz).setImageResource(R.drawable.sid2)
            if (i == 3)
                findViewById<ImageView>(R.id.obraz).setImageResource(R.drawable.sid3)
            if(i==4){
                i=1
                findViewById<ImageView>(R.id.obraz).setImageResource(R.drawable.sid1)
            }
        }
        findViewById<Button>(R.id.wstecz).setOnClickListener {
            i -= 1
            if (i == 1) {
                findViewById<ImageView>(R.id.obraz).setImageResource(R.drawable.sid1)
            }
            if (i == 2)
                findViewById<ImageView>(R.id.obraz).setImageResource(R.drawable.sid2)
            if (i == 3)
                findViewById<ImageView>(R.id.obraz).setImageResource(R.drawable.sid3)
            if(i==0){
                i=3
                findViewById<ImageView>(R.id.obraz).setImageResource(R.drawable.sid3)
            }
        }
    }
}