package app

import data.Person

fun main() {
    var person1 = Person()
    person1.sayHello("Andry")

    person1.overloading1("Andry")
    person1.overloading1(21)
}
