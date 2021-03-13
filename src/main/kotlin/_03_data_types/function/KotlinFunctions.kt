package _03_data_types.function

fun main(vararg args: String) {
    println(args.contentToString())

    /*
    1. FunctionX<Receiver,P1,P2,Out> 函数引用，类似C语言的指针
        (Foo, String, Long)->Any
        Foo.(String, Long)->Any
        Function3<Foo, String, Long, Any>
     */
    val x: (Foo, String, Long) -> Any = Foo::bar
    val x0: Function3<Foo, String, Long, Any> = Foo::bar

    val y: (Foo, String, Long) -> Any = x
    val z: Function3<Foo, String, Long, Any> = x

    yy(x)

    /*
        2. 函数 & 方法引用
     */
    val f: () -> Unit = ::foo
    val g: (Int) -> String = ::foo
    val h: (Foo, String, Long) -> Any = Foo::bar

    /*
        3. vararg 变长参数
     */
    multiParameters(1, 2, 3, 4)

    /*
        4. 默认参数 & 具名参数
     */
    defaultParameter(y = "Hello")

    /*
        5. 返回值Triple或Pair，可进行解构
     */
    val (a, b, c) = multiReturnValues() //伪
    val r = a + b
    val r1 = a + c

}

fun yy(block: (Foo, String, Long) -> Any) {
    //block(Foo(), "Hello", 3L)
    //block.invoke(Foo(), "Hello", 3L)
}

class Foo {
    fun bar(p0: String, p1: Long): Any {
        TODO()
    }
}

fun foo() {}
fun foo(p0: Int): String {
    TODO()
}

fun defaultParameter(x: Int = 5, y: String, z: Long = 0L) {
    println("$x,$y,$z")
}

fun multiParameters(vararg ints: Int) {
    println(ints.contentToString())
}

fun multiReturnValues(): Triple<Int, Long, Double> {
    return Triple(1, 3L, 4.0)
}

