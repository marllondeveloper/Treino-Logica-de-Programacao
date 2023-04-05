package com.example.treinodelogicadeprogramao
//11) Desenvolva uma lógica que leia os valores de A, B e C de uma equação do
//segundo grau e mostre o valor de Delta.

fun main(){
    println("Qual o valor de A")
    val a = readln().toInt()

    println("Qual o valor de B")
    val b = readln().toInt()

    println("Qual o valor de C")
    val c = readln().toInt()

    val delta = b*b - 4*a*c

    println("Delta é = a: $delta ")
}