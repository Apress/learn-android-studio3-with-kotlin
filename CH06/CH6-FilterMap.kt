package tlb.filtermap

fun main(args: Array<String>) {

  val ints = (1..100).toList()

  val evenInts = ints.filter { it % 2 == 0}
  println("Sum of even nos. <= 100 is ${evenInts.sum()}")

  val squaredInts = evenInts.map { it * it}
  println(squaredInts)
  println("Sum of squares of even nos <= 100 is ${squaredInts.sum()}")


//  if we were to use a for loop to extract the even
//  integers within 1..100, it would look like this

  val evenInts2 = mutableListOf<Int>()
  for (i in ints) {
    if (i % 2 == 0) {
      evenInts2.add(i)
    }
  }
  println(evenInts2)

//  if we were to use a for loop to transform the elements
//  of the evenInts and return a new list, it would look like
//  this

  val squaredInts2 = mutableListOf<Int>()
//  for (i in evenInts2) {
//    squaredInts2.add( i * i )
//  }
//  println(squaredInts2)

  evenInts2.forEach { squaredInts2.add(it * it) }
  println(squaredInts2)

}

