package com.dillu.quran

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val readquran : CardView= findViewById(R.id.read_quran);
        readquran.setOnClickListener{
            val intent = Intent(this,SurahList::class.java)
            startActivity(intent)
        }
    }
}