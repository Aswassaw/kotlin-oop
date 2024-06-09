package app

import data.Car

fun main() {
    val toyota = Car(pBrand = "Toyota", pName = "Avanza")

    println(toyota.brand)
    println(toyota.year)
}