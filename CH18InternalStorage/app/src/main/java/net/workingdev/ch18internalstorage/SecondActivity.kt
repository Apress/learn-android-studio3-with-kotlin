package net.workingdev.ch18internalstorage

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_second)

    btnmainactivity.setOnClickListener {
      startActivity(Intent(this, MainActivity::class.java))
    }
  }

  private fun loadData() {

    val filename = "ourfile.txt"

    Thread(Runnable {

      val input = openFileInput(filename)

      input.use {
        var buffer = StringBuilder()
        var bytes_read = input.read()
        while(bytes_read != -1) {
          buffer.append(bytes_read.toChar())
          bytes_read = input.read()
        }
        runOnUiThread(Runnable{
          txtoutput.setText(buffer.toString())
        })
      }
    }).start()
  }

  override fun onResume() {
    super.onResume()
    loadData()
  }
}
