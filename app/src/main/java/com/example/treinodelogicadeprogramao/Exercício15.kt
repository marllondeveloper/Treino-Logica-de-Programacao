package com.example.treinodelogicadeprogramao

import java.text.NumberFormat
import java.util.*

//15) Crie um programa que leia o número de dias trabalhados em um mês e mostre o
//salário de um funcionário, sabendo que ele trabalha 8 horas por dia e ganha R$25
//por hora trabalhada

fun main(){
    println("Dias trabalhados no mês")
    val diasTrabalhados = readln().toInt()

    val valorDiaria = 25 * 8
    val salario = valorDiaria * diasTrabalhados

    val formatoMoeda: NumberFormat = NumberFormat.getCurrencyInstance(Locale("pt", "BR" ))
    val valorFormatado: String = formatoMoeda.format(salario)

    println("O funcionário recebe $valorFormatado por mês")
}
