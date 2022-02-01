package org.geeksforgeeks.googlesearchfunctionality

import android.app.SearchManager
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mEditText = findViewById<EditText>(R.id.edit_text_1)
        val mButton = findViewById<Button>(R.id.button_1)

        mButton.setOnClickListener {
            val mSearchString = mEditText.text.toString()
            val mIntent = Intent(Intent.ACTION_WEB_SEARCH)
            mIntent.putExtra(SearchManager.QUERY, mSearchString)
            startActivity(mIntent)

        }
    }
}