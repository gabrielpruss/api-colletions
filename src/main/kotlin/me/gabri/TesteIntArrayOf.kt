package me.gabri

fun main(){
    val values = intArrayOf(91, 7, 55, 10, 2)

    values.forEach {
        print("$it ")
    }
    println(" ")
    values.sort()
    values.forEach {
        print("$it ")
    }

}