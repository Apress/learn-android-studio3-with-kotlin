package net.workingdev.ch19systembroadcast

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

import java.util.logging.Logger

class MainActivity : AppCompatActivity() {

  lateinit var intentfilter:IntentFilter
  lateinit var timereceiver:TimeReceiver
  var current_count = 0

  val Log = Logger.getLogger(javaClass.name)

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    timereceiver = TimeReceiver()
    intentfilter = IntentFilter(Intent.ACTION_TIME_TICK)
  }

  override fun onResume() {
    super.onResume()
    Log.info("App is resuming")
    registerReceiver(timereceiver,intentfilter)
  }

  override fun onPause() {
    super.onPause()
    Log.info("App is paused")
    try {
      unregisterReceiver(timereceiver)
    }
    catch(iae:IllegalArgumentException) {
      Log.warning(iae.toString())
    }
  }

  inner class TimeReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
      current_count += 1
      var message = "Counter:${current_count}"
      Log.info(message)
      Toast.makeText(this@MainActivity, message, Toast.LENGTH_LONG).show()
    }
  }
}
