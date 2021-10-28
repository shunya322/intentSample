package com.example.intentsample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.intentsample.databinding.ActivitySubBinding

class SubActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySubBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySubBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //データ受取
        val getText = intent.getStringExtra("TEXT")

        binding.textView.setText(getText)
    }
}