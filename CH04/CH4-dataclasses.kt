package tgh.dataclasses

import java.util.*

data class Employee(val name:String)

class Person(val name:String) {
  override fun equals(obj:Any?):Boolean {
    var retval = false
    if(obj is Person) {
      retval  = name == obj.name
    }
    return retval
  }
}

fun main(args: Array<String>) {

  val e1 = Employee("John Doe")
  val e2 = Employee("John Doe")

  println(e1)
  println(e1 == e2)
}