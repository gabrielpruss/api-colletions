package me.gabri

fun main(){
  //val pair: Pair<String, Double> = Pair("Joao", 1000.0)

  val map1 = mapOf("Jair" to 6000.0)
  map1.forEach{ (k, v) -> println ("Chave: $k - Valor: $v")}

  val map2 = mapOf(
    "Pedro" to 2000.0,
     "Maria" to 5500.0
  )
  map2.forEach{ (k, v) -> println ("Chave: $k - Valor: $v")}
}