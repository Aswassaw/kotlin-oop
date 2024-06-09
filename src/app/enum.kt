package app

import data.Gender

fun main() {
    val man = Gender.MALE
    val woman = Gender.FEMALE

    println(man.desc)
    println(woman.explainDescription())
}