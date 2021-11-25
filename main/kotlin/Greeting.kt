class Greeting(message:String, name: String) {

    constructor(name: String): this("Hello ","User"){
        println("Defaulting to Hello greeting....")
    }
    val someAttribute = message + ", $name"

    fun display(){
        println(someAttribute)
    }
}