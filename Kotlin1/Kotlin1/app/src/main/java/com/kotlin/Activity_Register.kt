package com.kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class Activity_Register : AppCompatActivity() , View.OnClickListener {

    private lateinit var etUsername:EditText
    private lateinit var etPassword:EditText
    private lateinit var etConfirmPassword:EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        etUsername = findViewById(R.id.setuname)
        etPassword = findViewById(R.id.setpassword)
        etConfirmPassword = findViewById(R.id.confirm_password)

        val btnRegister : Button = findViewById(R.id.btn_Register)
        btnRegister.setOnClickListener(this)

    }

    override fun onClick(v: View ) {
        when(v.id){
            R.id.btn_Register->{

                val bundle = Bundle()
                bundle.putString("username",etUsername.text.toString())
                bundle.putString("password",etPassword.text.toString())

                val intent = Intent(this@Activity_Register, activity_Login ::class.java)
                intent.putExtras(bundle)
                startActivity(intent)
            }
        }
    }

}