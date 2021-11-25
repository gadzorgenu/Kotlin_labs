package lab_1

var funds : Double = 100.0
val pswd = "password"

fun main() {
    var input : String
    var cmd : List<String>

    while (true) {
        print("Command: ")
        input = readLine()!!
        cmd = input.split(" ")
        when (cmd[0]) {
            // Each command goes here...
            "balance" -> balance()
            "deposit" -> deposit(checkAmount(cmd[1]))
            "withdraw" -> withdraw(checkAmount(cmd[1]))
            else -> println("Invalid command")
        }
    }
}

fun balance() :Unit {
    println(funds)
}

fun deposit(amount:Double) {
    if (amount.equals(.0)) return;
    funds += amount
//          balance()
    println("Balance: $funds")
}

fun withdraw(amount: Double): Unit{
    if (amount.equals(.0)) return;
    var passwd:String
    print("Enter a password: ")
    passwd = readLine()!!
    if(passwd == pswd){
        funds -= amount
        println("Balance: $funds")
    }
}

fun checkAmount(amount:String?):Double
{
    if(amount.isNullOrEmpty()){
        println("Enter an amount ")
        return 0.0
    }
    var numeric = amount.matches("-?\\d+(\\.\\d+)?".toRegex())
    if(!numeric)
        println("Enter an amount")
    return 0.0

    return amount.toDouble()

}


