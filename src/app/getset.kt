package app

import data.Note
import data.NoteWithGS

fun main() {
    val note1 = NoteWithGS("HAHAHA")
//    println(note1.title)
//    note1.title = "";
//    println(note1.title)
    note1.initDesc("INI DESKRIPSI BRO")
    println(note1.description)
}