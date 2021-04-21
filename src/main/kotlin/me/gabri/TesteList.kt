package me.gabri

fun main(){
  val joao = Funcionario("João", 1000.0, "CLT")
  val pedro = Funcionario("Pedro", 5700.0, "PJ")
  val maria = Funcionario("Maria", 3200.0, "CLT")

  val funcionarios = listOf(joao, pedro, maria)

  //println(funcionarios.find{it.nome == "Maria"})

  funcionarios
    .sortedBy { it.salario }
    .forEach  { println("$it") }

  println("")
  funcionarios
    .groupBy { it.tipoContrato }
    .forEach{ println("$it") }
}
