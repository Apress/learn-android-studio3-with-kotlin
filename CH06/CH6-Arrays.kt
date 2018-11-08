package tlb.array
import java.util.*

fun main(args: Array<String>) {

  // Kotlin doesn't have array literals
  // like Java, so the following won't work
  // var foo = {1,2,3,4,5}

  // the following code creates an empty array
  var arr = emptyArray<String>()
  // can't do this, you'll get ArrayIndexOutOfBoundsException
  // arr[0] = "Apple"
  arr += "1"
  arr += "2"
  arr += "3"
  arr += "4"
  arr += "5"

  println(arr)
  println(Arrays.toString(arr))

  val arr2 = arrayOfNulls<String>(2)
  arr2.set(0, "Apple")
  arr2.set(1, "Banana")
  arr2[1] = "Orange"
  // The next one will run into an IndexException again
  //arr2.set(2, "Oranges")
  println(Arrays.toString(arr2))
  println(arr2.get(1))

  val arr3 = Array<String>(5, {it.toString()})
  // The next one will encounter an error, bec the array is fixed in size
  // arr3.set(3, "4")
  println(Arrays.toString(arr3))


  val arr4 = arrayOf("Apple", "Banana", "Oranges")
  println(Arrays.toString(arr4))

//  var arr = arrayOf("Apple", "Banana", "Oranges")
//
//  println(arr) // garbled
//  println(Arrays.toString(arr)) // you have to do this
//
//  println(arr.get(0))
//
//  arr.set(0, "Mango")
//  println(arr.get(0))

  val arr5 = arrayOf(1, "2", 3)
  println(Arrays.toString(arr5))

  // Specia types
  val z = intArrayOf(1,2,3)
  val y = longArrayOf(1,2,3)
  val x = byteArrayOf(1,2,3)
  val w = shortArrayOf(1,2,3)
  println(Arrays.toString(z))
  println(Arrays.toString(y))
  println(Arrays.toString(x))
  println(Arrays.toString(w))

  // Print

  // Duplicates
  // Kotlin arrays doesn't care about duplicates
  var arr6 = arrayOf("Apple", "Banana")
  arr6 += "Banana"
  println(Arrays.toString(arr6))

  // Traversal
  for (i in z) {
    println("$i zee")
  }

  y.forEach { i -> println("$i why") }

  x.forEachIndexed { index, element ->
    println("$index : $element")
  }


}
