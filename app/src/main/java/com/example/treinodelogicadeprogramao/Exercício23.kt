package com.example.treinodelogicadeprogramao

import java.lang.Exception
import java.text.NumberFormat
import java.util.*

//23) Numa promoção exclusiva para o Dia da Mulher, uma loja quer dar descontos
//para todos, mas especialmente para mulheres. Faça um programa que leia nome,
//sexo e o valor das compras do cliente e calcule o preço com desconto. Sabendo
//que:
// - Homens ganham 5% de desconto
// - Mulheres ganham 13% de desconto

fun main (){
    println("Qual é o seu nome?")
    val nome = readln()
    println("sexo M ou F ?")
    val sexo = readln()
    println("Valor das compras? (Utilize (.) ao envéz de (,))")
    val valor = readln().toFloat()

    if (sexo == "M"){
        val desconto = valor * 0.05
        val valorCdesconto = valor - desconto

        val formatoMoeda : NumberFormat = NumberFormat.getCurrencyInstance(Locale("pt", "BR"))
        val valorFormatado: String = formatoMoeda.format(valorCdesconto)

        println("Olá $nome, com 5% de desconto, suas compras ficaram em $valorFormatado ")
    }
    if (sexo == "F"){
        val desconto = valor * 0.13
        val valorCdesconto = valor - desconto

        val formatoMoeda : NumberFormat = NumberFormat.getCurrencyInstance(Locale("pt", "BR"))
        val valorFormatado: String = formatoMoeda.format(valorCdesconto)

        println("Olá $nome, PARABÉNS pelo dia das mulheres! Com 13% de desconto, suas compras ficaram em $valorFormatado, APROVEITE. ")
    }

}
