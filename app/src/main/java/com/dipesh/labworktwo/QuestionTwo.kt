package com.dipesh.labworktwo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import android.widget.TextView

class QuestionTwo : AppCompatActivity() {
    private lateinit var rdoMale:RadioButton
    private lateinit var rdoFemale:RadioButton
    private lateinit var tvText:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question_two)

        tvText=findViewById(R.id.tvText)
        rdoFemale=findViewById(R.id.rdoFemale)
        rdoMale=findViewById(R.id.rdoMale)

        rdoMale.setOnClickListener {
            tvText.text=rdoMale.text
        }

        rdoFemale.setOnClickListener {
            tvText.text=rdoFemale.text
        }

    }
}