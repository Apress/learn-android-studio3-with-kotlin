package net.workingdev.ch12launchanotheractivity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*
import java.util.logging.Logger

class SecondActivity : AppCompatActivity() {

  val Log = Logger.getLogger(SecondActivity::class.java.name)

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_second)

    Log.info("onCreate")

    button2.setOnClickListener {
      finish()
    }
  }

  override fun onStart() {
    super.onStart()
    Log.info("onStart")
  }

  override fun onStop() {
    super.onStop()
    Log.info("onStop")
  }
}
