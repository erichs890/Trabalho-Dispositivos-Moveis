package com.example.trabalho30

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.FragmentManager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var b1 = findViewById<Button>(R.id.button)

        b1.setOnClickListener{


            var frag: FragmentManager = supportFragmentManager
            frag
                .beginTransaction()
                .replace(R.id.fragmentContainerView,Frag1::class.java,null).commit()
        }

    }
}