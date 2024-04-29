package com.softhr.laxusapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    lateinit var user_email_input : EditText
    lateinit var user_password_input : EditText
    lateinit var login_btn : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        user_email_input=   findViewById(R.id.user_email_input)
        user_password_input=    findViewById(R.id.user_password_input)
        login_btn=  findViewById(R.id.login_btn)

        login_btn.setOnClickListener{
            val user_email=user_email_input.text.toString()
            val user_password=user_password_input.text.toString()
            Log.i("Test CCCA","username:$user_email  pass:$user_password")}


    }
}