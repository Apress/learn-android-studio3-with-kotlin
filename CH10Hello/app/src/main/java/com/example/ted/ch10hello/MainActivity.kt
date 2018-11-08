package com.example.ted.ch10hello

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

//  findViewById<TextView>(R.id.textHello).text = "Hello Ted"
    textHello.text = "1"
// setText() still works, but better use the getter and setter syntax
// textHello.setText("2")
  }

  fun addNumber(v: View) {
    val currVal = textHello.text.toString().toInt()
    val nextVal = currVal + 1
    textHello.text = nextVal.toString()
  }
}
