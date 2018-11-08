

fun main(args: Array<String>) {
  manyParams(1,2,3,4,5)
  manyParams("From", "Gallifrey", "to", "Trenzalore")
  manyParams("The quick brown fox".split(" "))
  manyParams(*args)
  manyParams(*listOf("Hello there".split(" ")).toTypedArray())
  manyParams(*"Hello there".split(" ").toTypedArray())
  manyParams(*"Hello there".split(" ").toTypedArray())

}

fun<T> manyParams(vararg va : T) {
  for (i in va) {
    println(i)
  }
}