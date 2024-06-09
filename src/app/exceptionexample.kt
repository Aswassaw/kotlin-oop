package app

import data.ValidationException

fun validateAndSayHello(name: String) {
    if (name.isBlank()) {
        throw ValidationException("Name is blank")
    } else {
        println("Hello $name")
    }
}

fun main() {
    try {
        validateAndSayHello("Andry")
        validateAndSayHello("")
    } catch (error: ValidationException) {
        println("Lah error: ${error.message}")
    } catch (error: NullPointerException) {
        println("Null bro: ${error.message}")
    } finally {
        println("End Bang")
    }
}