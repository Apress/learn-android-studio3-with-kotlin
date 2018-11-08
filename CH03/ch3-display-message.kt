

fun main(args: Array<String>) {
  displayMessage("Hello", 3)
}

fun displayMessage(msg: String, count: Int) : Unit {
  var counter = 1
  while(counter++ <= count ) {
    println(msg)
  }
}

