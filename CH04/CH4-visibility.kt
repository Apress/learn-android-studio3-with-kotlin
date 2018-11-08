package tlb.visibility

internal open class Foo {
  internal fun boo() = println("boo")
  internal fun doo() = println("doo")
}

internal fun Foo.bar() {
  boo()
  doo()
}

fun main(args: Array<String>) {
  var fu = Foo()
  fu.bar()

  var prog = Programmer()
  prog.talk()
}

abstract class Person {
  abstract fun talk()
}

open class Employee : Person() {
  override fun talk() {
    println("talk")
  }
}

class Programmer : Employee() {
  override fun talk() {
    println("Programmer talking")
  }
}

