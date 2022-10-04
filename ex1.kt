package com.example.kotlinbasics.assignments
fun main(){


    for (number in 1..100) {
        println(number)
        if (number == 70)
            println("S OVER 70!!!" )
   }



    var num = 35
    while (num>=9){
        when(num){
            30->{
                println("It’s Hot")
            }
            20->{
                println("It’s Comfy")
            }
            15->{
                println("IT'S COLD!!!")
            }
            else -> {
                println(num)
            }
        }


        num--

    }


}
