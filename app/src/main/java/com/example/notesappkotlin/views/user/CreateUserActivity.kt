package com.example.notesappkotlin.views.user

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import com.example.notesappkotlin.R
import com.example.notesappkotlin.business_logic.UserRegistration

class CreateUserActivity : AppCompatActivity() {
    lateinit var name: EditText
    var user = UserRegistration()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_user)

        backArrow()
        registerUserClick()
    }

    private fun backArrow() {
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    private fun registerUserClick()
    {
        var regiserButton = findViewById<Button>(R.id.registerUserBtn)

        regiserButton.setOnClickListener {
            name = findViewById<EditText>(R.id.editTextPersonName)
            user.validateEmptyBoxes(name)
        }
    }
}