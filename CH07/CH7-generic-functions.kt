

fun main(args: Array<String>) {
  var fruits = listOf("Apple", "Banana", "Orange")
  println(fruits.getIt(2))
}

fun <T> List<T>.getIt(index:Int): T {
  return this[index]
}

