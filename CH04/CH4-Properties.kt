package tlb.properties

class Company(_name:String) {
  val name:String = _name
}

class Person(val name:String)

class Employee {
  var name: String = ""
    get() {
      Log("Getting lastname")
      return field
    }
    set(value) {
      Log("Setting value of lastname")
      field = value
    }
}

fun Log(msg:String) {
  println(msg)
}

fun main(args: Array<String>) {
  var person = Person("John Smith")
  println(person.name)


  var emp = Employee()
  emp.name = "John Doe"
  println(emp.name)

  var company = Company("ACME")
  println(company.name)
}