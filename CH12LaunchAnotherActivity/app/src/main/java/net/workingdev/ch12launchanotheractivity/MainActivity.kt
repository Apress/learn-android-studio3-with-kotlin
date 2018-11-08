package net.workingdev.ch12launchanotheractivity

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.logging.Logger

class MainActivity : AppCompatActivity() {

  val Log = Logger.getLogger(MainActivity::class.java.name)

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    Log.info("onCreate")

    button.setOnClickListener {
      val m_intent = Intent(this@MainActivity, SecondActivity::class.java)
      startActivity(m_intent)
    }
  }

  override fun onPause() {
    super.onPause()
    Log.info("onPause")
  }

  override fun onRestart() {
    super.onRestart()
    Log.info("onRestart")
  }

  override fun onResume() {
    super.onResume()
    Log.info("onResume")
  }
}
