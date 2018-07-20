package com.myunidays.kotlinexamples

fun main(args: Array<String>) {

    val resultLet: Unit = "hello".let {
        println(it)
    }

    val resultRun: Unit = "hello".run {
        println(this)
    }

    val resultApply: String = "hello".apply {
        println(this)
    }

    val resultAlso: String = "hello".also {
        println(it)
    }
}
