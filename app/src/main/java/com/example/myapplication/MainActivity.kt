package com.example.myapplication

import android.app.Activity
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.example.myapplication.databinding.ActivityFuncBinding
import com.example.myapplication.view.Primeira
import com.example.myapplication.view.EntradaFunc
import com.google.android.material.snackbar.Snackbar
import com.google.firebase.Firebase

class MainActivity : Activity() {

    private lateinit var binding: ActivityFuncBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFuncBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btEntrar.setOnClickListener {

            val cadastro = binding.editCadastro.text.toString()
            val senha = binding.editSenha.text.toString()

            when {
                cadastro.isEmpty() -> {
                    mensagem(it, "Coloque o seu cadastro!")

                }

                senha.isEmpty() -> {
                    mensagem(it, "Preencha a Senha!")
                }

                senha.length <= 6 -> {
                    mensagem(it, "A senha precisa ter pelo menos 7 caracteres! ")
                }

                else -> {
                    navegarPraEntradaFunc(cadastro)

                }
            }
        }
    }

    private fun mensagem(view: View, mensagem: String) {
        val snackbar = Snackbar.make(view, mensagem, Snackbar.LENGTH_SHORT)
        snackbar.setBackgroundTint(Color.parseColor("#FF0000"))
        snackbar.setTextColor(Color.parseColor("#FFFFFF"))
        snackbar.show()

    }

    private fun navegarPraEntradaFunc(cadastro: String) {
        val intent = Intent(this, EntradaFunc::class.java)
        intent.putExtra("cadastro", cadastro)
        startActivity(intent)
    }

}
