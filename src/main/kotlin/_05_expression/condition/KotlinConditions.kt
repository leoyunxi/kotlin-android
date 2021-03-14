package _05_expression.condition

import java.lang.Exception
import java.lang.NumberFormatException

fun main() {
    var a = 2
    var c: Int
    if (a == 3) {
        c = 4
    } else {
        c = 5
    }
    c = if (a == 3) 4 else 5

    c = when (a) {
        0 -> 5
        1 -> 100
        else -> 20
    }

    var x: Any = Any()
    c = when {
        x is String -> x.length
        x == 1 -> 100
        else -> 20
    }

    /*
    读取用户input变量作为when的条件变量
     */
    c = when(val input = readLine()){
        null -> 0
        else -> input.length
    }

    val b = 0

    try {
        c = a / b
    }catch (e: Exception){
        e.printStackTrace()
        c = 0
    }

    /*
    try/catch 赋值
     */
    c = try {
        a / b
    } catch (e: ArithmeticException){
        2
    } catch (e: Exception) {
        e.printStackTrace()
        0
    }
}