

interface A {
  fun foo() {
    println("A:foo")
  }
}

interface B {
  fun foo() {
    println("B:foo")
  }
}

class Child : A, B {
  override fun foo () {
    super<B>.foo()
    super<A>.foo()
    println("Child:foo")
  }
}

fun main(args: Array<String>) {
  var child: Child = Child()
  child.foo()
}