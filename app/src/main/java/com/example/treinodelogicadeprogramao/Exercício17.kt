package com.example.treinodelogicadeprogramao

import java.text.NumberFormat
import java.util.*

//17) Escreva um programa que pergunte a velocidade de um carro. Caso ultrapasse
//80Km/h, exiba uma mensagem dizendo que o usuário foi multado. Nesse caso, exiba
//o valor da multa, cobrando R$5 por cada Km acima da velocidade permitida.
fun main(){
    println("Qual a velocidade do carro?")
    val velocidade = readln().toInt()

    if (velocidade > 80){
        val kmAcima = velocidade - 80
        val multa = kmAcima * 5

        val formatoMoeda: NumberFormat = NumberFormat.getCurrencyInstance(Locale("pt", "BR"))
        val valorFormatado: String = formatoMoeda.format(multa)

        println("Você foi multado em $valorFormatado")
    }
}