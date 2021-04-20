package me.gabri
import kotlin.math.round

import kotlin.math.roundToInt

fun main(){
  val salarios = DoubleArray(3)
  salarios[0] = 1000.0
  salarios[1] = 3000.0
  salarios[2] = 500.0

  salarios.forEach { print("$it ") }

  println(" ")
  salarios.forEachIndexed { index, salario->
    salarios[index] *= 1.1
  }
  salarios.forEach { print("$it ") }

  val salarios2 = doubleArrayOf(2600.0, 1250.0, 5560.0)
  salarios2.sort()
  println(" ")
  salarios2.forEach { print("$it ") }
}