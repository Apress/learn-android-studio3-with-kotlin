package tlb.closure


fun main(args: Array<String>) {
  //executor(listOf(1,2,3,4,5))
  println(listOf(1,2,3,4,5))
  println(listOf(1..100).flatten())
  executor(listOf(1..1000).flatten())
}

fun executor(numbers:List<Int>) {
  var sum = 0
//  numbers.forEach {
//    if ( it % 2 == 0 ) {
//      sum += it
//    }
//  }

  numbers.filter { it % 2 == 0}.forEach { sum += it }
  println("Sum of all even numbers = $sum")
}

