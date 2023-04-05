package com.example.treinodelogicadeprogramao
//3) Crie um programa que leia o nome e o salário de um funcionário, mostrando no
//final uma mensagem.
//Ex:
//Nome do Funcionário: Maria do Carmo
//Salário: 1850,45
//O funcionário Maria do Carmo tem um salário de R$1850,45 em Junho.

fun main(){
    println("Olá, qual é o seu nome?")
    val nome = readLine().toString()
    println("Olá $nome , qual é o valor do seu salário mensal?")
    val salario = readLine().toString()

    println("O funcionário $nome tem um salário de $salario em junho")
}