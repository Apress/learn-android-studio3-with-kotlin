package net.workingdev.ch14fragmentsbooksdynamic


import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.book_titles.*

class BookTitle : Fragment(), View.OnClickListener {

  override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
    val v = inflater.inflate(R.layout.book_titles, container, false)
    return v
  }

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    rlas3.setOnClickListener(this)
    rlas3kotlin.setOnClickListener(this)
    rminandroid.setOnClickListener(this)
  }

  override fun onClick(v: View?) {
    var index:Int = 0
    println(v?.id)
    when(v?.id) {
      R.id.rlas3 -> {
        index = 0
      }
      R.id.rlas3kotlin -> {
        index = 1
      }
      R.id.rminandroid -> {
        index = 2
      }
    }

    val activity = getActivity()
    if (activity is Coordinator) {
      activity.onBookChanged(index)
    }
  }
}