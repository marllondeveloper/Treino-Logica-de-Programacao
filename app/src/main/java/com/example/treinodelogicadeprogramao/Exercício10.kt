package com.example.treinodelogicadeprogramao
//10) Faça um algoritmo que leia a largura e altura de uma parede, calcule e
//mostre a área a ser pintada e a quantidade de tinta necessária para o serviço,
//sabendo que cada litro de tinta pinta uma área de 2metros quadrados.

fun main(){
    println("Qual a altura da parede?")
    val altura = readln().toInt()

    println("Qual a largura da parede?")
    val largura = readln().toInt()

    val area = altura * largura
    val tinta = area / 2

    println("$area m, é a área a ser pintada e você vai precisar de $tinta L de tinta para efetuar a pintura!")

}