package net.workingdev.ch12senddatatoanotheractivity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_second)
    intent.getB
    val m_data = intent.getStringExtra("main_activity_data")
    textView.setText(m_data)
  }
}
