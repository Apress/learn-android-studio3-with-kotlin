package net.workingdev.ch14fragmentsbooksdynamic

import android.support.v7.app.AppCompatActivity
import android.os.Bundle


class MainActivity : AppCompatActivity(), Coordinator {

  lateinit var fragBookDescription: BookDescription
  lateinit var fragBookTitle: BookTitle

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    fragBookTitle = BookTitle()
    fragBookDescription = BookDescription()
    val fragTransaction = supportFragmentManager.beginTransaction()
    fragTransaction.add(R.id.fragtop, fragBookTitle)
    fragTransaction.add(R.id.fragbottom, fragBookDescription)
    fragTransaction.commit()

  }

  override fun onBookChanged(index:Int) {
    fragBookDescription.changeDescription(index)
  }
}

