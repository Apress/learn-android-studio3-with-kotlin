package net.workingdev.ch12implicitintents

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
  }

  override fun onCreateOptionsMenu(menu: Menu?): Boolean {
    menu?.add("Web")
    menu?.add("Map")
    menu?.add("Phone number")
    return super.onCreateOptionsMenu(menu)
  }

  override fun onOptionsItemSelected(item: MenuItem?): Boolean {

    var m_uri: Uri
    var m_intent: Intent = Intent()

    when (item?.toString()) {
      "Web" -> {
        m_uri = Uri.parse("https://www.apress.com")
//        m_intent = Intent(Intent.ACTION_VIEW, m_uri)
        m_intent = Intent()
        m_intent.setData(m_uri)
        m_intent.setAction(Intent.ACTION_VIEW)
      }
      "Map" -> {
        m_uri = Uri.parse("geo:40.7113399,-74.0263469")

//        This would have worked as well
//        m_uri = Uri.parse("https://maps.google.com/maps?q=40.7113399,-74.0263469")
        m_intent = Intent(Intent.ACTION_VIEW, m_uri)

      }
      "Phone number" -> {
        m_uri = Uri.parse("tel:639285083333")
        m_intent = Intent(Intent.ACTION_DIAL, m_uri)
      }
    }
    startActivity(m_intent)
    return true
  }
}
