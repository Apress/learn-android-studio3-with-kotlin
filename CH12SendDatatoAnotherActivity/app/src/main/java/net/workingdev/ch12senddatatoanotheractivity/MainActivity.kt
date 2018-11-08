package net.workingdev.ch12senddatatoanotheractivity

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    button.setOnClickListener {
      val m_data = editText.text.toString()
      val m_intent = Intent(this@MainActivity, SecondActivity::class.java)
      m_intent.putExtra("main_activity_data", m_data)
      startActivity(m_intent)
    }
  }
}
