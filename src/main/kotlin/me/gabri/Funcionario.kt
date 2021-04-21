package me.gabri

data class Funcionario(
  val nome: String,
  val salario: Double,
  val tipoContrato: String
){
  override fun toString(): String =
    """
      Name:    $nome  Salário:   $salario   Cnt:  $tipoContrato   
    """.trimIndent()
}
