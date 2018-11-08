fun main(args: Array<String>) {

  var e1 = Employee("John Doe")
  var e2 = Employee("Jane Doe")

  //var e3: Employee = e1.plus(e2)
  var e3 = e1 + e2

  println(e3.name)
}

class Employee(var name: String) {

   infix operator  fun plus(emp: Employee) : Employee {
    this.name += "\n${emp.name}"
    return this
  }
}

//fun main(args: Array<String>) {
//  val e = Employee("John Doe")
//  e work 7
//}
//
//class Employee(val name: String) {
//  infix fun work(hours: Int) = println("$name is working for $hours hours")
//}
