package com.example.intentsample

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.intentsample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener{ onButtonTapped(it) }
    }

    fun onButtonTapped(view: View?) {
        //データをセット
        val Text = binding.editText.text.toString()
        val intent = Intent(this, SubActivity::class.java)
        intent.putExtra("TEXT", Text)
        startActivity(intent)
    }
}