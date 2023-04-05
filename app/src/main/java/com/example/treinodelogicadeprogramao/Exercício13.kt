package com.example.treinodelogicadeprogramao
//13) Faça um algoritmo que leia o salário de um funcionário, calcule e mostre o
//seu novo salário, com 15% de aumento.
fun main(){
    println("Salario do funcionário")
    val salario = readln().toFloat()

    val calculo = salario * 0.15
    val result = salario + calculo

    println("Este salario com 15% a mais seria: $result")
}