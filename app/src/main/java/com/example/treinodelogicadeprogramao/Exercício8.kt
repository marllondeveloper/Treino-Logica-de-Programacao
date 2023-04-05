package com.example.treinodelogicadeprogramao
//8) Desenvolva um programa que leia uma distância em metros e mostre os valores
//relativos em outras medidas.
//Ex:
//Digite uma distância em metros: 185.72
//A distância de 185.72m corresponde a:
//0.18572Km
//1.8572Hm
//18.572Dam
//1857.2dm
//18572.0cm
//185720.0mm

fun main(){

    println("Digite uma distancia em metros")
    val distance = readln().toFloat()
    val km = distance / 1000
    val hm = distance / 100
    val dm = distance / 10
    val cm = distance * 100
    val mm = distance * 1000

    println("A distancia de $distance m corresponte a \n$km Km, \n$hm Hm, \n$dm Dm, \n$cm Cm, \n$mm Mm ")



}