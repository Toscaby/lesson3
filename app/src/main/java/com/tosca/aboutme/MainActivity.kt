package com.tosca.aboutme

import android.content.Context
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.tosca.aboutme.databinding.ActivityMain2Binding

class MainActivity : AppCompatActivity() {
  private lateinit var binding: ActivityMain2Binding

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
//    setContentView(R.layout.activity_main2)

    binding = DataBindingUtil.setContentView(this, R.layout.activity_main2)
  }

  fun addNickname(view: View) {
//    val editText = findViewById<EditText>(R.id.nickname_edit)
//    val nicknameText = findViewById<TextView>(R.id.nickname_text)

    binding.apply {
      nicknameText.text = binding.nicknameEdit.text
      nicknameEdit.visibility = View.GONE
      view.visibility = View.GONE
      nicknameText.visibility = View.VISIBLE
      invalidateAll()
    }


    val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
    imm.hideSoftInputFromWindow(view.windowToken, 0)
  }
}
