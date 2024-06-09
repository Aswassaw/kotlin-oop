package app

import data.Person

fun main() {
    sayHello(Person())
//    sayHello(null)
}

fun sayHello(person: Person?) {
    println(person?.firstName ?: "Damn")
    println(person!!.firstName)
}