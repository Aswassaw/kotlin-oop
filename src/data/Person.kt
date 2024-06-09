package data

class Person {
    var firstName: String = "Bagus"
    var middleName: String? = null
    var lastName: String = ""

    fun sayHello(name: String) {
        println("Hello $name, my name is $firstName")
    }

    fun overloading1(name: String) {
        println("Nama kamu $name, saya ${this.firstName}")
    }

    fun overloading1(age: Int) {
        println("Usia kamu $age")
    }
}