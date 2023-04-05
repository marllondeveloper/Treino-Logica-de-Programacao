package com.example.treinodelogicadeprogramao
//21) Faça um algoritmo que leia um determinado ano e mostre se ele é ou não
//BISSEXTO.

fun main(){
    println("diga um determinado ano")
    val ano = readln().toInt()

    if (ano % 4 == 0 && ano % 100 == 0 && ano % 400 == 0 || ano % 4 == 0 ){
        println("Este ano é BISSEXTO")
    }
    if (ano % 4 == 0 && ano % 100 != 0 && ano % 400 == 0){
        println("Este ano NÃO é BISSEXTO")
    }
    if (ano % 4 == 0 && ano % 100 == 0 && ano % 400 != 0)
        println("Este ano NÃO é BISSEXTO")
    if (ano % 4 != 0 && ano % 100 == 0 && ano % 400 == 0)
        println("Este ano NÃO é BISSEXTO")
    if (ano % 4 != 0 && ano % 100 != 0 && ano % 400 != 0)
        println("Este ano NÃO é BISSEXTO")
}