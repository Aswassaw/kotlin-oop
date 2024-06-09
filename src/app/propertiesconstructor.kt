package app

import data.User

fun main() {
    val user1 = User(username = "Andry", password = "aswassaw")

    println(user1.username)
    println(user1.password)
}