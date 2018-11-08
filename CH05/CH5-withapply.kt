package tlb.withapply
import java.util.Date

data class Event(val title:String) {
  var date = Date()
  var time = ""
  var attendees = mutableListOf<String>()

  fun create() {
    print(this)
  }
}

fun main(args: Array<String>) {

  val mtg = Event("Management meeting")

  mtg.date = Date(2018,1,1)
  mtg.time = "0900H"
  mtg.attendees.add("Ted")

  mtg.create()

  with(mtg) {
    date = Date()
    time = "0800H"
    attendees.add("Ted")

  }

  mtg.apply {
    date = Date()
    time = "0700H"
    attendees.add("Ted")
  }.create()
}
