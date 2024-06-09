package app

import data.Product

fun main() {
    val product = Product(name = "Close Up 100 Gram", price = 7000, category = "Pasta Gigi")
    println(product.name)
    println(product.price)

    val product2 = product.copy(name = "Supermi")
    println(product2)
}