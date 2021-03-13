package _04_class_interface.kotlin

open class SimpleClass(var x: Int, val y: String) : AbsClass(), SimpleInf {
    /*
    接口中的property也可可被override
     */
    override val simpleProperty: Int
        get() = 2

    val z: Long = simpleProperty * 2L

    override fun absMethod() {}
    override fun simpleMethod() {}
    fun y() {}

    fun zzz(string: String) {

    }

    /*
    不可再在基类中override
     */
    final override fun overridable() {

    }
}

class SimpleClass2(x: Int = 1, y: String = "fix") : SimpleClass(x, y)