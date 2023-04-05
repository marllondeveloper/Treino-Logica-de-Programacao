package com.example.treinodelogicadeprogramao

import java.text.DecimalFormat
import kotlin.math.roundToInt

//9) Faça um algoritmo que leia quanto dinheiro uma pessoa tem na carteira (em R$)
//e mostre quantos dólares ela pode comprar. Considere US$1,00 = R$3,45.
fun main(){
    println("Olá, quanto de dinheiro você tem na carteira?")
    val valor = readln().toFloat()
    val cambio = valor / 3.45
    val formato = DecimalFormat("#.##")  //DEIXA O VALOR COM APENAS DUAS CASAS DECIMAIS
    val valorFormatado = formato.format(cambio)


    println("Você pode comprar $valorFormatado dólares com esse valor!")
}