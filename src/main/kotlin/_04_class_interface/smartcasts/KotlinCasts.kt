package _04_class_interface.smartcasts

import _04_class_interface.smartcasts.kotlin.Kotliner
import _04_class_interface.smartcasts.kotlin.Person

var tag: String? = null

fun main() {

    /**
     * 全局变量不支持smart cast
     */
    if(tag != null){
        // Smart cast to 'String' is impossible, because 'tag' is a mutable property that could have been changed by this time
        println(tag!!.length)  // 即使判断不为空，仍然需要安全访问?.
    } else {
        println(-1)
    }

    /**
     * as？ 安全强转，失败时返回null
     */
    val kotliner: Kotliner = Person("benny", 20)
    if(kotliner is Person){
        println((kotliner as? Person)?.name)
    }

    /**
     * if空判断后 smart cast : String? -> String -> String?
     */
    var value: String? = null
    value = "benny"
    if(value != null){
        println(value.length)
    }

}

