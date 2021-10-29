package com.example.notesappkotlin.business_logic

import android.widget.EditText


class UserRegistration
{
    fun validateEmptyBoxes(name: EditText)
    {
        println(name.text.toString())
    }
}