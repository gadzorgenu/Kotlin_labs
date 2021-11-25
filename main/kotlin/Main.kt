import kotlin.random.Random as RNG

fun main(args: Array<String>) {

    val x = 10
    val y = 20
    println(x + y)
    user("Georgina", "Georgina")

    println(sum())
    println(Sample(55))

//    println(getBrand("MAC"))

    val greeting = Greeting("Hello", "Georgina")
    greeting.display()

    //initializing a data class
//    val option = Option("GOOGle", 22.0)
//    val (ticker, strike) = option // destructuring

    //Initialising enum classes
    val b: Side = Side.BUY
//    val s: Side = Side.SELL

    if (b == Side.BUY)
        println("Ready to buy")

    println("racecar".isPalindrome())
    println("Georgina".isPalindrome())

    //Type erasure
    val arr = Array<String>(1, { "Hello" })
    println(arr is Array<*>)

    //Nullable Types
    val nullableArray = arrayOf<Int?>(1, null, 3)
    val intArray = nullableArray.filterNotNull()
    println(intArray[0] + intArray[1])

    //Elvis operator
    val person: Person? = Person("Gina")
    println(person?.name?.length)

    //Factorial example
    var factorial = 1
    var endNum = 32
    (1..endNum).forEach { factorial *= it }
    println("factorial using foreach: $factorial")

    var factorial2 = (1..endNum).fold(1){item, sum -> item * sum}
    println("factorial with fold $factorial2")

    val rng:RNG = RNG(55)
    val type = rng::class // passing a variable by reference... infered type:KClass<RNG>
    println("RG Type: "+ type.simpleName)
    println("Type type: "+type::class.simpleName)


    //Calling a java class
    var stud = Student("Gina",400)
    println(stud)

    var words = Words()
    println("FirstIsVowel: ${words.firstIsVowel("Georgina")}")
    println("Reversed: ${words.reverse("Georgina")}")

    var fibonacci = Fibonacci()
    var result = fibonacci.fib(5)
    println(result)

    //Lambda expressions
    val value = { i:Int -> i*2}
    println(value(3))



}

class Person(var name : String)

fun user(firstname:String, lastname:String) {
    println("Hello, $firstname $lastname, welcome to kotlin programming")
}

fun sum(a:Double = 5.0, b:Double = 10.0) : Double{
    return a*b
}

fun getDay(day:String){
    when(day){
        "Mon" -> "Monday"
        "Tues" -> "Tuesday"
        "Wed" -> "Wednesday"
        "Thurs" -> "Thursday"
        "Frid" -> "Friday"
        else -> "Unrecogised"
    }
}

enum class Brand {MAC, WINDOWS}

fun getBrand(brand: Brand){
    when(brand){
        Brand.MAC -> "Mac"
        Brand.WINDOWS -> "WINDOWS"
    }

    for (i in 1..10) println(i)

    //"steps" set the increment each time
     for (i in 1..100 step 3) println(i)

    for (i in 100 downTo 1 step 5) println(i)
}

fun Sample(money:Int){
    var cost: Map<String, Int> = mapOf("GOOGL" to 1, "AAPL" to 2)

    for (cost in cost )
//        println("Buying ${money/cost}")
        println("Buying ${money} ${cost}")
}

fun String.isPalindrome(): Boolean {
    if(this.length <= 1) return true
    else if (this[0] == this[this.length-1])
        return this.slice(1 until this.length-1).isPalindrome()
    else return  false
}
