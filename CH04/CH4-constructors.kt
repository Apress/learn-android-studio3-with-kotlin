package tgh.contructors


class Person constructor(_name: String) {
  var name:String = _name
}

class Employee  {
  var name:String = ""
  var empid:String = ""

  constructor(_name: String) : this(_name, "1001")
  constructor(_name:String, _id: String) {
    name = _name
    empid = _id
  }
}

class Emp (_name:String, _empid:String = "1001")  {
  val name = _name
  val empid = _empid
}

class Programmer {

}


class Company(var name:String) {

}

fun main(args: Array<String>) {
  var person = Person("John Doe")
  println(person.name)
  var employee = Emp("Jane Doe")
  println("Name ${employee.name} | ID ${employee.empid}")

  var company = Company("ACME Inc")
  println(company.name)
}