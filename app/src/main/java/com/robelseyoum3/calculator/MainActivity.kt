package com.robelseyoum3.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_save.setOnClickListener {
            tv_user_name.text = "Hello " + et_name.text.toString()
        }


        btn_add.setOnClickListener {
            //tv_result.text = et_number_one.text.toString().toInt() + et_number_two.text.toString().toInt()
        }

    }
}
