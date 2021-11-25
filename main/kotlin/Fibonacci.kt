class Fibonacci {
    private val memo: MutableMap<Int, Int> = mutableMapOf(0 to 1, 1 to 1)

    fun fib(n: Int) : Int = if (n < 0) 0 else when(n){
        in memo -> memo.getValue(n)
        else -> { memo.put(n, fib(n-1) + fib(n-2)); fib(n)} //recursion
    }
}