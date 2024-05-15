package com.example.trabalho32

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

        var button4 = findViewById<Button>(R.id.button4)
        var button5 = findViewById<Button>(R.id.button5)
        var button6 = findViewById<Button>(R.id.button6)

        button4.setOnClickListener {
            var fm: FragmentManager = supportFragmentManager
            fm.beginTransaction()
                .replace(R.id.fragmentContainerView, Frag1::class.java,null)
                .commit()
        }
        button5.setOnClickListener {
            var fm: FragmentManager = supportFragmentManager
            fm.beginTransaction()
                .replace(R.id.fragmentContainerView, Frag2::class.java,null)
                .commit()
        }


    }
}