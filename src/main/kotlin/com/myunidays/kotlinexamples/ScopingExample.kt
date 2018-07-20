package com.myunidays.kotlinexamples

fun main(args: Array<String>) {

    val resultLet: Unit = "hello".let {
        println(it)
    }

    val resultLet2: Int = listOf(1, 2, 3).let {
        it[0] + it[1]
    }

    val resultLet3: Int = listOf(1, 2, 3).let { list ->
        list[0] + list[1]
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
