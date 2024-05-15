package com.example.myapplication

import android.app.Activity
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.example.myapplication.databinding.ActivityFuncBinding
import com.example.myapplication.databinding.ActivityPrimeiraBinding
import com.example.myapplication.view.Agendamento
import com.example.myapplication.view.Configuracoes
import com.example.myapplication.view.Primeira
import com.example.myapplication.view.EntradaFunc
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPrimeiraBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPrimeiraBinding.inflate(layoutInflater)
        setContentView(binding.root)
        replaceFragment(Home())

        binding.bottomNavigationView.setOnItemSelectedListener {

            when(it.itemId){
                R.id.inicio -> replaceFragment(Home())
                R.id.funcionario -> replaceFragment(Funcs())
                R.id.configuracao -> replaceFragment(Configs())
                R.id.visita -> replaceFragment(Marcar())

                else -> {

                }


            }

            true

        }
    }

    private fun replaceFragment(fragment: Fragment) {

        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.layoutframe,fragment)
        fragmentTransaction.commit()

    }
}
