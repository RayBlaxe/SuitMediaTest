package com.project.tesmobile

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.project.tesmobile.databinding.SecondScreenBinding

class SecondScreen: AppCompatActivity() {
    private lateinit var binding : SecondScreenBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = SecondScreenBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        if (intent.hasExtra("namanya")){
            val namaDepan: String = this.intent.getStringExtra("namaDepan").toString()
            val namaBelakang: String = this.intent.getStringExtra("namaBelakang").toString()
            setDetil(namaDepan,namaBelakang)
        }
    }
    fun setDetil (namaDepan: String,
                  namaBelakang: String,

    ){

        binding.selectUn.text="Selected: "+ namaDepan +" "+ namaBelakang



    }
}