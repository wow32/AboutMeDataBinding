package com.example.aboutme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //user click done button
        findViewById<Button>(R.id.done_button).setOnClickListener{

            val editText = findViewById<EditText>(R.id.nickname_edit)
            val nicknameTextView = findViewById<TextView>(R.id.nickname_text)
            var userClickButton = findViewById<Button>(R.id.done_button)

            //show nickname
            nicknameTextView.text = editText.text
            nicknameTextView.visibility = View.VISIBLE

            //hide input and button
            editText.visibility = View.GONE
            userClickButton.visibility = View.GONE

            //hide keyboard?
        }

        //user click input box after done button?
        findViewById<TextView>(R.id.nickname_text).setOnClickListener{
            val ediText = findViewById<EditText>(R.id.nickname_edit)
            val doneButton = findViewById<Button>(R.id.done_button)
            val inputBox = findViewById<TextView>(R.id.nickname_text)

            ediText.visibility = View.VISIBLE
            doneButton.visibility = View.VISIBLE
            inputBox.visibility = View.GONE

            ediText.requestFocus()
        }
    }


}