package app

import data.Account
import data.User

fun main() {
//    let
    val user = User("aswassaw", "manusiaapi")
    val result = user.let {
        println(it.username)
        println(it.password)
        "Bambang"
    }
    val result2 = user.let {
        "${it.username} & ${it.password}"
    }
    println(result)
    println(result2)

    val result3 = user.run {
        "${this.username} HAHAHA"
    }
    println(result3)
}