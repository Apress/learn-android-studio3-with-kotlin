package net.workingdev.ch15getgithubinfo


import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.squareup.okhttp.OkHttpClient
import com.squareup.okhttp.Request
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.activityUiThread
import org.jetbrains.anko.doAsync
import org.json.JSONObject


class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    button.setOnClickListener {
      doAsync {
        val mgithubinfo = fetchGitHubInfo(txtsearchuser.text.toString())
        val jsonreader = JSONObject(mgithubinfo)
        activityUiThread {
          txtusername.text = jsonreader.getString("name")
        }
      }
    }
  }

  private fun fetchGitHubInfo(login_id: String): String {

    val url = "https://api.github.com/users/$login_id"
    val client = OkHttpClient()
    val request = Request.Builder().url(url).build()
    val response = client.newCall(request).execute()
    val bodystr =  response.body().string() // this can be consumed only once

    return bodystr
  }

  override fun onResume() {
    super.onResume()

    txtsearchuser.setText("")
    txtsearchuser.setHint("Enter GitHub username")
  }
}


