package app

import data.Laptop
import data.Person
import data.SmartPhone

fun printObject(any: Any) {
    val value = any as? Laptop;
    if (value != null) {
        println(value.name)
    }

    if (any is Laptop) {
        println(any.name)
    } else if (any is Person) {
        println(any.firstName)
    } else {
        println(any)
    }
}

fun main() {
    printObject("Eko")
    printObject(12)
    printObject(true)
    printObject(Laptop(name = "Asus"))
    printObject(Person())
}