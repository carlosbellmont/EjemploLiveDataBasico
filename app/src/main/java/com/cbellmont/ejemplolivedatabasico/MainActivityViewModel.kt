package com.cbellmont.ejemplolivedatabasico

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlin.random.Random

class MainActivityViewModel: ViewModel() {

    val numeroAleatorio: MutableLiveData<Int> by lazy { MutableLiveData<Int>() }

    fun cambiarNumero(){
        viewModelScope.launch {
            var i = 0
            do {
                delay(1000)
                numeroAleatorio.value = Random.nextInt()
                i++
            } while (i < 1000)
        }
    }
}