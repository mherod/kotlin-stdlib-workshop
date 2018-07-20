package com.myunidays.kotlinexamples

fun main(args: Array<String>) {

    arrayOf("Hello", "World").fold("Start") { acc, s ->
        "$acc $s"
    }.let {
        println("Folded $it")
    }

    arrayOf("Hello", "World").reduce { acc, s ->
        "$acc $s"
    }.let {
        println("Reduced $it")
    }
}
