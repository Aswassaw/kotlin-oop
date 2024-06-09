package app

import data.Product

fun main() {
    val product1 = Product(name = "Samsung Z76352", category = "Phone", price = 3500000)

    var (satu, dua, tiga) = product1;
    println(satu)
    println(dua)
    println(tiga)
}