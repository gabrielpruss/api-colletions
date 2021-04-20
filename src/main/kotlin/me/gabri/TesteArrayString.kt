package me.gabri

fun main(){
    val names = Array(3){""}
    names[0] = "Maria"
    names[1] = "João"
    names[2] = "José"
    
    for(nome in names)
        println(nome)

    val names2 = arrayOf("Maria", "Zaza", "Pedro")
    names2.sort()
    names2.forEach { println(it) }
}