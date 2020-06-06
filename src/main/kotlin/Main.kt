import kotlinx.coroutines.*
import java.text.SimpleDateFormat
import java.util.*


fun main() = runBlocking {
    val deferred1 = async { computation1() }
    val deferred2 = async { computation2() }
    printCurrentTime("Awaiting computations...")
    val result = deferred1.await() + deferred2.await()
    printCurrentTime("The result is $result")
}

suspend fun computation1(): Int {
    delay(1000L) // simulated computation
    printCurrentTime("Computation1 finished")
    return 131
}

suspend fun computation2(): Int {
    delay(2000L)
    printCurrentTime("Computation2 finished")
    return 9
}

fun printCurrentTime(message: String) {
    val time = (SimpleDateFormat("hh:mm:ss")).format(Date())
    println("[$time] $message")
}