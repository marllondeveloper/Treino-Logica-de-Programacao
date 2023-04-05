package com.example.treinodelogicadeprogramao
//7) Crie um algoritmo que leia um número real e mostre na tela o seu dobro e a
//sua terça parte.
//Ex:
//Digite um número: 3.5
//O dobro de 3.5 é 7.0
//A terça parte de 3.5 é 1.16666

fun main(){
    println("Digite um numero")
    val numero = readln().toFloat()

    val multiplicacao = numero * 2
    val divisao = numero / 3

    println("O dobro de $numero é $multiplicacao")
    println("A terça parte de $numero é $divisao")
}