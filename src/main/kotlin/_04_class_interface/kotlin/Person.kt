package _04_class_interface.kotlin

class Person(age: Int, name: String) {
    var age: Int = age //property
        get() {
            return field
        }
        set(value) {
            println("setAge: $value")
            field = value
        }
    var name: String = name
        get() {
            return field// backing field
        }
}

fun main() {
    val ageRef = Person::age
    val person = Person(18, "Bennyhuo")
    val nameRef = person::name
    /*
    set()无receiver
     */
    ageRef.set(person, 20)
    /*
    set已绑定receiver
     */
    nameRef.set("Andyhuo")
}