package tgh.interfaces


interface Printable {
  fun print(doc:String) = println("Printer:Printing $doc")
}

interface Fax {
  fun call(number: String) = println("Calling $number")
  fun print(doc: String) = println("Fax:Printing $doc")
  fun answer() = println("answering")
}

class MultiFunction : Printable, Fax {

  override fun print(doc:String)  {
    super<Fax>.print(doc)
    super<Printable>.print(doc)
    println("Multifunction: printing")
  }
}


fun main(args: Array<String>) {
  val mfc = MultiFunction()
  mfc.print("The quick brown fox")
  mfc.call("12345")
}
