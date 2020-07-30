class OOP_People{
    var age = 0
    var name = ""

    fun walk(){
        println("Halo i'm method from Object People!")
    }
}

fun main(){
    var people = OOP_People()
    people.walk()
}