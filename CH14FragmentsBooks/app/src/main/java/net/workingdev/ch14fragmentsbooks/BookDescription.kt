package net.workingdev.ch14fragmentsbooks

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.book_description.*

class BookDescription : Fragment() {

  lateinit var arrbookdesc: Array<String>
  var bookindex = 0

  override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
    val v = inflater.inflate(R.layout.book_description, container, false)
    arrbookdesc = resources.getStringArray(R.array.bookdescriptions)

//    bookindex = savedInstanceState.getInt("bookindex")

    bookindex = if(savedInstanceState?.getInt("bookindex") == null) 0
    else { savedInstanceState.getInt("bookindex")}

//    if (savedInstanceState?.getString("bookindex") == null) {
//      bookindex = 0
//    }
//    else {
//      bookindex = savedInstanceState.getInt("bookindex")
//    }

    return v
  }

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    changeDescription(bookindex)  
  }

  override fun onSaveInstanceState(outState: Bundle) {
    outState.putInt("bookindex", bookindex)
  }

  fun changeDescription(index:Int) : Unit {
    bookindex = index
    println("BOOK INDEX = $bookindex")
    txtdescription?.setText(arrbookdesc[bookindex])
    println(arrbookdesc[bookindex])
  }
}