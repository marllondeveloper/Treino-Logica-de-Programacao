package com.example.treinodelogicadeprogramao

import java.text.NumberFormat
import java.util.*

//14) A locadora de carros precisa da sua ajuda para cobrar seus serviços. Escreva
//um programa que pergunte a quantidade de Km percorridos por um carro alugado e a
//quantidade de dias pelos quais ele foi alugado. Calcule o preço total a pagar,
//sabendo que o carro custa R$90 por dia e R$0,20 por Km rodado.

fun main(){
    println("Km percorridos")
    val km = readln().toFloat()

    println("Dias alugado")
    val dias = readln().toInt()

    val resultKm = 0.20 * km
    val resultDias = 90 * dias

    val totalApagar = resultDias + resultKm

    val formatoMoeda: NumberFormat = NumberFormat.getCurrencyInstance(Locale("pt", "BR"))
    val valorFormatado: String = formatoMoeda.format(totalApagar)

    println("O valor total a pagar é: $valorFormatado")
}