package com.example.santanderdevweek.data.local

import com.example.santanderdevweek.data.Cartao
import com.example.santanderdevweek.data.Cliente
import com.example.santanderdevweek.data.Conta

class FakeData {
    fun getLocalData(): Conta {
        val cliente = Cliente("Marilise")
        val cartao = Cartao("222")
        return Conta(
            "020202-2",
            "0202-2",
            "1890,90",
            "4500,00",
            cliente,
            cartao
        )
    }
}