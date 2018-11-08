package tlb.collections

fun main(args: Array<String>) {

  // LISTS

  val fruits = mutableListOf<String>("Apple")
  fruits.add("Orange")
  fruits.add(1, "Banana")
  fruits.add("Guava")

  println(fruits)

  // fruits.remove("Guava")
  // fruits.removeAt(2)

  println(fruits.first() == "Strawberries")
  println(fruits.last() == "Banana")

  println(fruits)

  // SETS

  val nums = mutableSetOf("one", "two")
  nums.add("two")
  nums.add("two")
  nums.add("three")

  println(nums)

  val numbers = (1..1000).toMutableSet()
  numbers.add(6)
  numbers.removeIf { i -> i % 2 == 0 }

  println(numbers)

  // MAPS

  val dict = hashMapOf("foo" to 1)
  dict["bar"] = 2

  val snapshot: MutableMap<String, Int> = dict
  snapshot["baz"] = 3

  println(snapshot)
  println(dict)
  println(snapshot["bar"]) // prints 2

  // COLLECTIONS TRAVERSAL
  println("traversal --------------------- ")
  // for and while loops
  val iter = fruits.iterator()
  while (iter.hasNext()) {
    println(iter.next())
  }

  for (i in fruits) {
    println(i)
  }

  // Using extension functions and lambdas
  fruits.forEach { println(it) }
  nums.forEach { println(it) }
  // for maps
  dict.forEach { println(it) }
  dict.forEach { t, u -> println("$t | $u") }

}