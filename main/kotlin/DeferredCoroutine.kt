//import kotlin.coroutines.coroutineContext
//
//class DeferredCoroutine {
//    suspend fun main() = coroutineContext{
//       val result = (1..10).map{i : Int -> async { addFive(i)}}
//       var  total = 0
//        for(r in result) total += r.await()
//        println(total)
//    }
//
//
//    suspend fun addFive(n:Int) : Int {
//        delay(5000)
//        return n + 5
//    }
//}