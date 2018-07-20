package com.myunidays.kotlinexamples

fun main(args: Array<String>) {
    listOf("Hello", "World", "How", "are", "you?")
            .filter { "?" in it }
            .forEach {
                println(it)
            }
}
