package com.project.tesmobile

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RelativeLayout
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

import com.project.tesmobile.databinding.LayoutListBinding

class KMRecyclerAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private var items: List<ListObjKM> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DosenViewHolder {
        val binding = LayoutListBinding.inflate(
            LayoutInflater.from(parent.context),
            parent, false
        )
        return DosenViewHolder(binding)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is DosenViewHolder -> {
                holder.bind(items.get(position))
                holder.klik.setOnClickListener {
                    holder.kalau_diklik(items.get(position))
                }
            }
        }
    }

    fun submitList(listDosen: List<ListObjKM>) {
        items = listDosen
    }

    override fun getItemCount(): Int {
        return items.size
    }

    class DosenViewHolder constructor(val binding: LayoutListBinding) :
        RecyclerView.ViewHolder(binding.root) {
        val foto: ImageView = binding.foto
        val nama_depan: TextView = binding.namaDepan
        val nama_belakang: TextView = binding.namaBelakang
        val klik: RelativeLayout = binding.rlKlik

        fun bind(listObjKM: ListObjKM) {
            nama_depan.setText(listObjKM.namaDepan)
            nama_belakang.setText(listObjKM.namaBelakang)

            val requestOp = RequestOptions()
                .placeholder(R.drawable.ic_launcher_background)
                .error(R.drawable.ic_launcher_background)
            Glide.with(itemView.context)
                .applyDefaultRequestOptions(requestOp)
                .load(listObjKM.gambar)
                .into(foto)
        }

        fun kalau_diklik(get: ListObjKM) {
            Toast.makeText(
                itemView.context, "Kamu memilih: ${get.namaDepan} ${get.namaBelakang}",
                Toast.LENGTH_SHORT
            )
                .show()
            val intent = Intent(itemView.context, SecondScreen::class.java)
            intent.putExtra("Firstname", get.namaDepan)
            intent.putExtra("Lastname", get.namaBelakang)
            intent.putExtra("email", get.email)
            intent.putExtra("foto", get.gambar)
            itemView.context.startActivity(intent)
        }
    }
}