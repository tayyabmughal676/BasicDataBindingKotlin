package com.example.basicdatabindingkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.basicdatabindingkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var mBinding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//        mBinding = ActivityMainBinding.inflate(layoutInflater)
//        val view = mBinding.root
//        setContentView(view)

        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        mBinding.myVar = "Hello Data Binding"

        mBinding.user = User(
            "Tayyab",
            21,
            true,
            "https://picsum.photos/id/237/200/300"
        )

        mBinding.userButton.setOnClickListener {
            Toast.makeText(applicationContext, "Hello Main Code!", Toast.LENGTH_SHORT).show()
        }

    }
}