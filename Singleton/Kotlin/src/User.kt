object User{
    var name = "John"

    init {
        println("Singleton invoked")
    }

    fun printName() = println(name)
}