package tlb.lambda3

fun main(args: Array<String>) {
  //display("World")
  executor { println("Hello $it") }
  executor("Earth", {println("Hola $it")})
  executor("Earth") { println("Hello $it")}
  doer({ x,y -> println(x + y) })
}

fun display(msg:String) {
  println("Hello $msg")
}

fun executor(arg: String = "Mondo", display:(msg:String) -> Unit) {
  //display("World")
  display(arg)
}

fun doer(sum:(x:Int,y:Int) -> Unit) {
  sum(1,2)
}

