package com.example.myapplication.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.databinding.ObrasItemBinding
import com.example.myapplication.model.Obras

class ObrasAdapter(private val context: Context, private val listaObras: MutableList<Obras>):
    RecyclerView.Adapter<ObrasAdapter.ObrasViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ObrasViewHolder {
        val itemLista = ObrasItemBinding.inflate(LayoutInflater.from(context),parent,false)
        return ObrasViewHolder(itemLista)
    }

    override fun getItemCount() = listaObras.size

    override fun onBindViewHolder(holder: ObrasViewHolder, position: Int) {
        holder.imgObras.setImageResource(listaObras[position].img!!)
        holder.txtObras.text = listaObras[position].nome
    }

    inner class ObrasViewHolder(binding: ObrasItemBinding): RecyclerView.ViewHolder(binding.root){
        val imgObras = binding.imagObras
        val txtObras = binding.txtObras
    }
}