package com.cbellmont.ejemplolivedatabasico

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.lifecycleScope
import com.cbellmont.ejemplolivedatabasico.databinding.ActivityMainBinding
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val model = ViewModelProvider(this).get(MainActivityViewModel::class.java)

        model.numeroAleatorio.value = 5


        model.numeroAleatorio.observe(this) {
            binding.tvMain.text = "${model.numeroAleatorio.value}"
        }


        model.cambiarNumero()

    }
}