package com.dipesh.labworktwo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var tvNumber:TextView
    private lateinit var btnIncrease:Button
    var count:Int=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvNumber=findViewById(R.id.tvNumber)
        btnIncrease=findViewById(R.id.btnIncrease)

        tvNumber.text=count.toString()

        btnIncrease.setOnClickListener {
            count++
            tvNumber.text=count.toString()

        }
    }
}