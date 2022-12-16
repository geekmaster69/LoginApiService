package com.example.loginapirest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.loginapirest.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var mBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mBinding.root)

        mBinding.swType.setOnCheckedChangeListener { buttonView, isChecked ->
            buttonView.text = if (isChecked) "Login" else "Register"

            mBinding.btnLogin.text = buttonView.text
        }

        mBinding.btnLogin.setOnClickListener {
            login()
        }
    }

    private fun login() {
        updateUi(":)")
    }

    private fun updateUi(result: String) {
        mBinding.tvResult.visibility = View.VISIBLE
        mBinding.tvResult.text = result


    }
}