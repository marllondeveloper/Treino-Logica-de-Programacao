package com.example.treinodelogicadeprogramao

import java.text.DecimalFormat

//12) Crie um programa que leia o preço de um produto, calcule e mostre o seu
//PREÇO PROMOCIONAL, com 5% de desconto.

fun main(){
    println("Qual o valor da caixa de sabão em pó?")
    val caixa = readln().toFloat()

    val calculo = caixa * 0.05
    val result = caixa - calculo

    val formato = DecimalFormat("##")  //DEIXA O VALOR
    val valorFormatado = formato.format(result)

    println("Com 5% de desconto este valor cai para: $valorFormatado")
}