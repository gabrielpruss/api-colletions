package me.gabri

fun main(){
  val salarios = doubleArrayOf(1000.0, 2250.0, 4000.0, 3760.0, 3680.0, 1750.0)

  for(salario in salarios){
    print("$salario ")
  }
  println(" ")
  salarios.sort()
  salarios.forEach { print("$it ") }
  println(" ")

  println("Maior salario: ${salarios.max()}")
  println("Menor salario: ${salarios.min()}")
  println("Media salario: ${salarios.average().toBigDecimal()}")

  val salariosMaiorQue2k5 = salarios.filter {it > 2500}
  println(" ")
  salariosMaiorQue2k5.forEach{ print("$it ")}

}