package com.dsosnovskiy.template.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dsosnovskiy.template.R
import com.dsosnovskiy.template.ui.base.BaseActivity

class MainActivity : BaseActivity<MainViewModel>() {

    override val layout: Int = R.layout.activity_main

    override val viewModel: MainViewModel
        get() = TODO("Not yet implemented")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}