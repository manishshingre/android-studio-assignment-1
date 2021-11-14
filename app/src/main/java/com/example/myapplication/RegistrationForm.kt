package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_registration_form.*

class RegistrationForm : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration_form)

        val actionBar = supportActionBar
        actionBar!!.title = "Registration Form"
        actionBar.setDisplayHomeAsUpEnabled(true)

        login_btn.setOnClickListener {
            var status = if (username_et.text.toString().equals("manishshingre")
                && password_et.text.toString().equals("password")
            ) "Logged In succesfully" else "Login failed"
            Toast.makeText(this, status, Toast.LENGTH_SHORT).show()
        }

    }
}