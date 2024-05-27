package com.example.trabalho32

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import com.example.trabalho32.databinding.ActivityMainFuncBinding

class MainActivityFunc : AppCompatActivity() {

    private lateinit var binding: ActivityMainFuncBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainFuncBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bottomNavigationView2.setOnItemSelectedListener {

            when(it.itemId){

                R.id.gerenObras -> replaceFragment(GerenObras())
                R.id.gerenVisitas -> replaceFragment(GerenVisitas())
                R.id.configsFunc -> replaceFragment(ConfigsFunc())

                else -> {

                }
            }

            true



        }


    }

    private fun replaceFragment(fragment: Fragment){

        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frame_layout2,fragment)
        fragmentTransaction.commit()


    }
}
