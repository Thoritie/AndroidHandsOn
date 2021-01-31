package com.example.androidhandson.kotlin

fun main() {
    var name = "Thor"
    println("Hello $name :)")


    val x = 3
    when(x) {
        1 -> print('t')
        else -> print('v')
    }

    test("bbb", 2)
}

fun test(a: Any,  b:Int ): Unit {
    println("$a is a $b")
}


