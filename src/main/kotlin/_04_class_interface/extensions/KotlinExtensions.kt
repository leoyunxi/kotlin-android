package _04_class_interface.extensions

class PoorGuy {
    var pocket: Double = 0.0
}

/**
 * ext function
 */
fun PoorGuy.noMoney() {

}

/**
 * property = backing field + getter + setter
 * ext property = getter + setter
 */
var PoorGuy.moneyLeft: Double
    get() = pocket // poorGuy.moneyLeft = pocket
    set(value) {
        pocket = value  // poorGuy.moneyLeft(value)
    }

interface Guy {
    /**
     * Property in an interface cannot have a backing field
     */
    var moneyLeft: Double
        get() {
            return 0.0
        }
        set(value) {
            //field = value
        }

    fun noMoney() {
        println("no money called.")
    }
}

/**
 * 前后填充空格
 */
fun String.padding(count: Int, char: Char = ' '): String {
    val padding = (1..count).joinToString("") { char.toString() }
    return "${padding}${this}${padding}"
}

fun String.isEmail(): Boolean {
    return matches(Regex("(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])"))
}

/**
 * 重复打印
 */
fun String.times(count: Int): String {
    return (1..count).joinToString("") { this }
}

fun main() {

    "admin@bennyhuo.com".isEmail()


    println("Hello".padding(3))
    println("*".times(10))

    /**
     * 扩展方法的引用 -- 未绑定receiver
     */
    val stringTimes = String::times
    println(stringTimes.invoke("$", 5))

    /**
     * receiver bind function reference
     */
    val stringTimesBound = "*"::times
    println(stringTimesBound.invoke(5))
}