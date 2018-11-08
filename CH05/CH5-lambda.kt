package tlb.lambda

fun main(args: Array<String>) {
  executor({
    println("do this")
  })
}

fun executor(action:() -> Unit) {
  action()
}
