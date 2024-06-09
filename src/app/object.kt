package app

import data.Person

fun main() {
    val andry = Person()
    andry.firstName = "Andry"

    val bagas = Person()
    bagas.firstName = "Bagas"

    val adi = Person()
    adi.firstName = "Adi"

    println(andry.firstName)
    println(bagas.firstName)
    println(adi.firstName)
}