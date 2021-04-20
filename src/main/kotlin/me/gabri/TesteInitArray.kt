package me.gabri

fun main(){
  val values = IntArray(5)

    values[0] = 63
    values[1] = 12
    values[2] = 77
    values[3] = 92
    values[4] = 52

    for(valor in values){
       println(valor)
    }

    values.forEach{
        println(it)
    }

    for (index in values.indices){
        println(values[index])
    }

    values.sort()
    for (valor in values){
        println(valor)
    }

}