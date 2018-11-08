package tgh.inheritance


open class Person(_name:String) {
  val name = _name

  open fun talk() {
    println("${this.javaClass.simpleName} talking")
  }
}

open class Employee(_name:String, _empid:String = "1001") : Person(_name) {
  val empid = _empid

   override fun talk() {
    super.talk()
    println("Employee overriding talk()")
  }

  override fun toString():String{
    return "name: $name | id: $empid"
  }
}

class Programmer(_name:String) : Employee(_name) {
  override fun talk() {
    super.talk()
    println("Programmer overriding talk()")
  }
}

fun main(args: Array<String>) {
//  var emp = Employee("John Doe")
//  println(emp.toString())
//  emp.talk()
  var prog = Programmer("Ted")
  prog.talk()
}