package com.gitlab.musically.transit

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val FILENAME = "hello_file"
        val string = "hello world!"
        val fos = openFileOutput(FILENAME, android.content.Context.MODE_PRIVATE)
        fos.write(string.toByteArray())
        fos.close()
    }
}
