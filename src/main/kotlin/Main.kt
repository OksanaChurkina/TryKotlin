import kotlinx.coroutines.*
import java.text.SimpleDateFormat
import java.util.*


fun main(args: Array<String>) {
    val userJava = UserJava("oks@mail.ru")
    println(userJava.email)

   val userKotlin = UserKotlin("test@mail.com")
    println(userKotlin.email)

    val st: String? //nullable
    st = getSt()
   val size = st!!.length // can be null
    println(size)


}
fun getSt(): String?{
    return null
}
fun function() : Int{
    return 1
}

fun function2(a: Long):Int{

    return a.toInt()
}

fun func3(){

}
