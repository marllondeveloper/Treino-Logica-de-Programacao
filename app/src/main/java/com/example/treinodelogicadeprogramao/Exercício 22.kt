package com.example.treinodelogicadeprogramao
//22) Escreva um programa que leia o ano de nascimento de um rapaz e mostre a sua
//situação em relação ao alistamento militar.
// - Se estiver antes dos 18 anos, mostre em quantos anos faltam para o
//alistamento.
// - Se já tiver depois dos 18 anos, mostre quantos anos já se passaram do
//alistamento.

fun main (){
    println("Em que ano você nasceu?")
    val ano = readln().toInt()
    val anoMenosIdade = 2023 - ano
    val soma = (anoMenosIdade - 18)

    if (anoMenosIdade < 18){
        println("faltam $soma anos para fazer o seu  seu alistamento!")
    }else{
        println("Você está $soma anos atrasado no seu alistamento!")
    }

}

