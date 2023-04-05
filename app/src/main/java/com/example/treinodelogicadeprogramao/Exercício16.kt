package com.example.treinodelogicadeprogramao
//16) [DESAFIO] Escreva um programa para calcular a redução do tempo de vida de um
//fumante. Pergunte a quantidade de cigarros fumados por dias e quantos anos ele
//já fumou. Considere que um fumante perde 10 min de vida a cada cigarro. Calcule
//quantos dias de vida um fumante perderá e exiba o total em dias.

fun main(){
    println("Quantos cigarros você fuma por dia?")
    val qCigarrosNoDia = readln().toInt()

    val minPorDia = qCigarrosNoDia * 10

    println("Quantos anos ja fumou?")
    val qAnosFumados = readln().toInt()

    val totalMinutos = minPorDia * 365 * qAnosFumados
    val conversao = totalMinutos / 60 / 24

    println("$conversao")





}