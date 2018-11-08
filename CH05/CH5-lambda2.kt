package tlb.lambda2

/*
  Pass a lambda directly to a higher order
  function
*/

fun main(args: Array<String>) {
  executor({
     println("Hello $it")
  })
}

val doThis = { s:String -> println(s) }

fun executor(m:(arg:String) -> Unit) {
  m("World")
}

