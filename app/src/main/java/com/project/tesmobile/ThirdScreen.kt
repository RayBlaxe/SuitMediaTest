package com.project.tesmobile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.project.tesmobile.databinding.ThirdScreenBinding

class ThirdScreen : AppCompatActivity() {
    private lateinit var listAdapter: KMRecyclerAdapter
    private lateinit var binding: ThirdScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ThirdScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecyclerView()
        tambahDataSet()
    }
    private fun tambahDataSet(){
        val data = API.buatSetData()
        listAdapter.submitList(data)
    }
    private fun initRecyclerView(){
        binding.recyclerView.apply {
            layoutManager = LinearLayoutManager ( this@ThirdScreen)
            val spacingAtas = Spacing (4)
            addItemDecoration(spacingAtas)
            listAdapter = KMRecyclerAdapter()
            adapter = listAdapter
        }
    }
}