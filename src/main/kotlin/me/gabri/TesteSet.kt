package me.gabri

fun main(){
  val joao = Funcionario("João", 1400.0, "CLT")
  val pedro = Funcionario("Pedro", 7700.0, "PJ")
  val maria = Funcionario("Maria", 2200.0, "CLT")

  val funcionarios1 = setOf(joao, pedro)
  val funcionarios2 = setOf(maria)

  val resultUnion = funcionarios1.union(funcionarios2)
  resultUnion.forEach {println("$it")}

  println("---------------")
  val funcionarios3 = setOf(joao, pedro, maria)
  val resultSubtracao = funcionarios3.subtract(funcionarios2)
  resultSubtracao.forEach{ println("$it")}

  println("---------------")
  val resultIntersect = funcionarios3.intersect(funcionarios2)
  resultIntersect.forEach{ println("$it")}
}