package com.dipesh.labworktwo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class QuestionThree : AppCompatActivity() {
    private lateinit var etUserName:EditText
    private lateinit var etPassword:EditText
    private lateinit var btnLogin:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question_three)

        etUserName=findViewById(R.id.etUserName)
        etPassword=findViewById(R.id.etPassword)
        btnLogin=findViewById(R.id.btnLogin)


        btnLogin.setOnClickListener {
            val userName=etUserName.text.toString()
            val password=etPassword.text.toString()

            if(userName=="admin" && password=="admin"){
                Toast.makeText(this,"You are logged in",Toast.LENGTH_LONG).show()
            }
            else{
                Toast.makeText(this,"You are not logged in",Toast.LENGTH_LONG).show()
            }

        }
    }
}