package view

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.Fragment
import com.example.trabalho31.R
import com.example.trabalho31.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        replaceFragment(Inicio())

        binding.bottomNavigationView.setOnItemSelectedListener {


            when(it.itemId){
                R.id.inicio -> replaceFragment(Inicio())
                R.id.visita -> replaceFragment(Visita())
                R.id.funcionario -> replaceFragment(Funcionario())
                R.id.configuracoes -> replaceFragment(Configuracoes())

                else -> {



                }
        }

            true
        }




    }

    private fun replaceFragment(fragment: Fragment){

        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.main,fragment)
        fragmentTransaction.commit()
    }

}