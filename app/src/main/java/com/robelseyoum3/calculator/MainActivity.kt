package com.robelseyoum3.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_save.setOnClickListener {

            if(et_name.text.isEmpty()){
                tv_user_name.setText("Please insert the value ");
            } else{
            tv_user_name.text = "Hello " + et_name.text.toString()}
        }

        //Adding numbers
        btn_add.setOnClickListener {

            val numOne  = et_number_one.text.toString()
            val numTwo= et_number_two.text.toString()

            if(et_number_one.text.toString().isEmpty() && et_number_one.text.toString().isEmpty()){
                tv_result.text = "Please insert the value "

            }else {

                val a = numOne.toInt()
                val b = numTwo.toInt()
                val result = a + b


                tv_result.text = result.toString()

            }

        }

        //Adding
        btn_sub.setOnClickListener {

            val numOne  = et_number_one.text.toString()
            val numTwo= et_number_two.text.toString()

            if(et_number_one.text.toString().isEmpty() && et_number_one.text.toString().isEmpty()){
                tv_result.text = "Please insert the value "

            }else {
                val a = numOne.toInt()
                val b = numTwo.toInt()
                val result = a - b


                tv_result.text = result.toString()
            }



        }

        btn_mult.setOnClickListener {

            val numOne  = et_number_one.text.toString()
            val numTwo= et_number_two.text.toString()

            if(et_number_one.text.toString().isEmpty() && et_number_one.text.toString().isEmpty()){
                tv_result.text = "Please insert the value "

            }else {

                val a = numOne.toInt()
                val b = numTwo.toInt()
                val result = a * b


                tv_result.text = result.toString()

            }

        }

        btn_div.setOnClickListener {

            val numOne  = et_number_one.text.toString()
            val numTwo= et_number_two.text.toString()

            if(et_number_one.text.toString().isEmpty() && et_number_one.text.toString().isEmpty()){
                tv_result.text = "Please insert the value "

            }else {

                val a = numOne.toInt()
                val b = numTwo.toInt()


                if (b == 0) {
                    tv_result.text = "Please don't divide a number by zero"
                } else {
                    var result = a / b

                    tv_result.text = result.toString()
                }

            }


        }

    }
}
