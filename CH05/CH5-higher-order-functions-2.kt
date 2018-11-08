package tlb.higherorder2


//fun main(args: Array<String>) {
//  executor(::doThis)
//}
//
//val foo:()-> Unit = {
//  for (i in 0..100) {
//    println("foo : $i")
//  }
//}
//
//fun boo() {
//  println("boo")
//}
//
//fun doWork(action: () -> Unit) {
//  println("Beginning")
//  action()
//  println("ending")
//}
//
//fun doThis() {
//  println ("action function")
//}
//
//
//fun executor(action:() -> Unit) {
//  action.invoke()
//}

fun main(args: Array<String>) {
  println(bar(::foo))
}

fun bar(fu:(arg:Int) -> Int) : Int {
  return fu(2)
}

fun foo(arg:Int): Int {
  return arg * arg
}