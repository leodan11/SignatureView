package com.github.leodan11.signatureview

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.github.leodan11.signatureview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.action.setOnClickListener {
            if (binding.value.isBitmapEmpty) {
                Toast.makeText(applicationContext, "Empty", Toast.LENGTH_LONG).show()
            }else {
                binding.view.setImageBitmap(binding.value.signatureBitmap)
            }
        }

    }
}