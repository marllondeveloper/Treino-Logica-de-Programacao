package com.example.treinodelogicadeprogramao
//4) Desenvolva um algoritmo que leia dois números inteiros e mostre o somatório
//entre eles.
//Ex:
//Digite um valor: 8
//Digite outro valor: 5
//A soma entre 8 e 5 é igual a 13.

fun main(){

    println("Digite um valor")
    val primeiroValor = readln().toInt()
    println("Digite outro valor")
    val segundoValor = readln().toInt()

    val resultado = primeiroValor + segundoValor

    println("A soma entre $primeiroValor e $segundoValor é igual a $resultado")
}