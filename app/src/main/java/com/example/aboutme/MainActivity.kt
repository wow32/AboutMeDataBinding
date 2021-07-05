package com.example.aboutme

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.databinding.DataBindingUtil
import com.example.aboutme.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val name: MyName = MyName("Richie Lee")

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //bind to activity_main first
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        //set name value to myName
        binding.myName = name

        binding.doneButton.setOnClickListener {

            binding.apply {
                myName?.nickname = nicknameEdit.text.toString()

                //refresh UI on change
                invalidateAll()

                nicknameEdit.visibility = View.GONE
                doneButton.visibility = View.GONE
                nicknameText.visibility = View.VISIBLE
            }
        }

        binding.nicknameText.setOnClickListener {

            binding.apply {
                binding.nicknameEdit.visibility = View.VISIBLE
                binding.doneButton.visibility = View.VISIBLE
                binding.nicknameText.visibility = View.GONE
                binding.nicknameEdit.requestFocus()
            }
        }
    }


}