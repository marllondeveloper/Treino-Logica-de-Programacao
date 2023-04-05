package com.example.treinodelogicadeprogramao
//20) Desenvolva um programa que leia um número inteiro e mostre se ele é PAR ou
//ÍMPAR.

fun main(){

    println("Diga um numero")
    val numero = readln().toInt()

    if (numero % 2 == 0){
        println("Este numero é par")
    }else{
        println("Este numero é ímpar")
    }
}