package com.example.ted.ch11_event_anonymous_class

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.Snackbar
import android.test.ViewAsserts
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)


//   The following code is a verbose way of setting up
//   an anonymous inner object
//
//    button.setOnClickListener(object: View.OnClickListener {
//      override fun onClick(v: View?) {
//        println("Hello click")
//      }
//    })

//  Using lambdas to setup event listeners is much cleaner

    button.setOnClickListener {
      Toast.makeText(this, "Hello World", Toast.LENGTH_LONG).show()
      println("Hello")
    }


//    button.setOnLongClickListener(object: View.OnLongClickListener {
//      override fun onLongClick(v: View?): Boolean {
//        Snackbar.make(root_layout, "long click", Snackbar.LENGTH_LONG).show()
//        return true
//      }
//    })

    button.setOnLongClickListener {
      Snackbar.make(root_layout, "Long click", Snackbar.LENGTH_INDEFINITE).show()
       true
    }
  }
}
