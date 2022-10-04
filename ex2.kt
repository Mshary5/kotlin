package com.example.kotlinbasics.assignments

fun main(){

//    Write a program that adds five Numbers (Double) to an array and then calculates the average of those numbers.
//    Note: Please use a for (in) loop in this exercise.





    val n = arrayListOf(10.5,12.5,12.5,11.5,18.5 )
    var sum = 0.0
    for (nn in n) {
        sum += nn
    }

val avrg = sum / n.size - 1
println("the average $avrg ")

    }













































}