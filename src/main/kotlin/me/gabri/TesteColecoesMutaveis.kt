package me.gabri

fun main(){
  val joao = Funcionario("João", 1000.0, "CLT")
  val pedro = Funcionario("Pedro", 5700.0, "PJ")
  val maria = Funcionario("Maria", 3200.0, "CLT")

  println(" ***** LIST *****")
  val funcionarios = mutableListOf(joao, maria)
  funcionarios.forEach{ println ("$it")}

  println("------------------")
  funcionarios.add(pedro)
  funcionarios.forEach{ println ("$it")}

  println("------------------")
  funcionarios.remove(joao)
  funcionarios.forEach{ println ("$it")}

  println("\n***** SET *****")
  val funcionariosSet = mutableSetOf(joao)
  funcionariosSet.forEach{ println("$it")}
  funcionariosSet.add(pedro)
  funcionariosSet.add(maria)
  println("-----------------")
  funcionariosSet.forEach{ println("$it")}
  funcionariosSet.remove(pedro)
  println("-----------------")
  funcionariosSet.forEach{ println("$it")}
}