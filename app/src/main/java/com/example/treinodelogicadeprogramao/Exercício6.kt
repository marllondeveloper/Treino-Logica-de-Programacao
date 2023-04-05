package com.example.treinodelogicadeprogramao
//6) Faça um programa que leia um número inteiro e mostre o seu antecessor e seu
//sucessor.
//Ex:
//Digite um número: 9
//O antecessor de 9 é 8
//O sucessor de 9 é 10

fun main(){

    println("Digite um numero")
    val resposta = readln().toInt()
    val antecessor = resposta - 1
    val sucessor = resposta + 1

    println("O antecessor de $resposta é $antecessor")
    println("O sucessor de $resposta é $sucessor")
}