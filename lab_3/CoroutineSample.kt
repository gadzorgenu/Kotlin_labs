package lab_3

import kotlinx.coroutines.*
//import kotlin
//
suspend fun main() = coroutineScope {
    val job = launch { repeat(100){ delay(100); println("Hello")} }
    delay(350)
    job.cancel()
    println("All done")
}