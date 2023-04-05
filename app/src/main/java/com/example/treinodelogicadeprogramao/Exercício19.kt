package com.example.treinodelogicadeprogramao
//19) Crie um algoritmo que leia o nome e as duas notas de um aluno, calcule a sua
//média e mostre na tela. No final, analise a média e mostre se o aluno teve ou
//não um bom aproveitamento (se ficou acima da média 7.0).
fun main(){

    println("Qual o seu nome?")
    val nome = readln()

    println("Nota em matemática")
    val notaM = readln().toInt()

    println("Nota em português")
    val notaP = readln().toInt()

    val soma = notaM + notaP
    val media = soma / 2

    if (media >= 7.0){
        println("Olá $nome, sua média é $media e está a cima de 7.0, Parabéns!")
    }else{
        println("Olá $nome, Sua média é $media e está a baixo de 7.0, estude mais um pouco!")
    }
}