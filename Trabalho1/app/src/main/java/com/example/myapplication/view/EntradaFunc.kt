package com.example.myapplication.view

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import com.example.myapplication.R
import com.example.myapplication.adapter.ObrasAdapter
import com.example.myapplication.databinding.ActivityEntradaFuncBinding
import com.example.myapplication.model.Obras

class EntradaFunc : AppCompatActivity() {

    private lateinit var binding: ActivityEntradaFuncBinding
    private lateinit var obrasAdapter: ObrasAdapter
    private val listaObras: MutableList<Obras> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEntradaFuncBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportActionBar?.hide()
        val cadastro = intent.extras?.getString("cadastro")

        binding.txtNomeCadastro.text = "Bem-vindo(a), $cadastro"
        val recyclerViewObras = binding.recyclerViewsObras
        recyclerViewObras.layoutManager = GridLayoutManager(this,2)
        obrasAdapter = ObrasAdapter(this,listaObras)
        recyclerViewObras.setHasFixedSize(true)
        recyclerViewObras.adapter = obrasAdapter
        getServicos()

        binding.btObras.setOnClickListener {
            val intent = Intent(this,Agendamento::class.java)
            intent.putExtra("cadastro",cadastro)
            startActivity(intent)

        }

        }

        private fun getServicos(){

            val obra1 = Obras(R.drawable.img1, "Amor e viver")
            listaObras.add(obra1)

            val obra2 = Obras(R.drawable.pint2, "Dias de Paz")
            listaObras.add(obra2)

            val obra3 = Obras(R.drawable.pint3, "Melanina do Prazer")
            listaObras.add(obra3)

            val obra4 = Obras(R.drawable.pint4, "Ruas Escuras")
            listaObras.add(obra4)
        }
    }