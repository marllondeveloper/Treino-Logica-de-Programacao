package com.example.treinodelogicadeprogramao
//18) Faça um programa que leia o ano de nascimento de uma pessoa, calcule a idade
//dela e depois mostre se ela pode ou não votar.

fun main(){
    println("Qual seu ano de nascimento?")
    val nascimento = readln().toInt()
    val idade = 2023 - nascimento

    if (idade < 16){

        println("Você tem menos de 16 anos, não pode votar!")
    }else{
        println("Você é maior de 16 anos, pode votar!")
    }


}