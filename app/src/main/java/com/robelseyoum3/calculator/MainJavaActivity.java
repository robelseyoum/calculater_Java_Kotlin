package com.robelseyoum3.calculator;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainJavaActivity extends AppCompatActivity {



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btnSave = findViewById(R.id.btn_save);
        final EditText etName = findViewById(R.id.et_name);
        final TextView tvName = findViewById(R.id.tv_user_name);


        final EditText etNumberOne = findViewById(R.id.et_number_one);
        final EditText etNumberTwo = findViewById(R.id.et_number_two);

        //Adding two numbers
        Button btnAdd = findViewById(R.id.btn_add);
        final TextView tvResult = findViewById(R.id.tv_result);

            btnSave.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    String name = etName.getText().toString();
                    if(etName.getText().toString().equals("")){
                        tvName.setText("Please insert the value ");
                    } else{
                    tvName.setText("Hello " + name);
                    }
                }
            });

            btnAdd.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    String numOne = etNumberOne.getText().toString();
                    String numTwo = etNumberTwo.getText().toString();

                    if(etNumberOne.getText().toString().isEmpty() && etNumberTwo.getText().toString().isEmpty()){
                        tvResult.setText("Please insert the value ");

                    }else{

                        int a = Integer.parseInt(numOne);
                        int b = Integer.parseInt(numTwo);

                        int result = a + b;
                        tvResult.setText(Integer.toString(result));

                    }


                }
            });

            //subtracting two numbers
            Button btnSub = findViewById(R.id.btn_sub);
            btnSub.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String numOne = etNumberOne.getText().toString();
                    String numTwo = etNumberTwo.getText().toString();

                    if(etNumberOne.getText().toString().isEmpty() && etNumberTwo.getText().toString().isEmpty()){
                        tvResult.setText("Please insert the value ");

                    }else {

                        int a = Integer.parseInt(numOne);
                        int b = Integer.parseInt(numTwo);

                        int result = a - b;
                        tvResult.setText(Integer.toString(result));
                    }

                }
            });

            //Multiplying two numbers
            Button btnMult = findViewById(R.id.btn_mult);
            btnMult.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    String numOne = etNumberOne.getText().toString();
                    String numTwo = etNumberTwo.getText().toString();

                    if(etNumberOne.getText().toString().isEmpty() && etNumberTwo.getText().toString().isEmpty()){
                        tvResult.setText("Please insert the value ");

                    }else {

                        int a = Integer.parseInt(numOne);
                        int b = Integer.parseInt(numTwo);

                        int result = a * b;
                        tvResult.setText(Integer.toString(result));
                    }

                }
            });

            //Division of two numbers
            Button btnDiv = findViewById(R.id.btn_div);
            btnDiv.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String numOne = etNumberOne.getText().toString();
                    String numTwo = etNumberTwo.getText().toString();
                    String divZero = "";

                    if(etNumberOne.getText().toString().isEmpty() && etNumberTwo.getText().toString().isEmpty()){
                        tvResult.setText("Please insert the value ");

                    }else {

                        int a = Integer.parseInt(numOne);
                        int b = Integer.parseInt(numTwo);

                        if (b == 0) {
                            divZero = "Please don't divide a number by zero";
                            tvResult.setText(divZero);
                        } else {
                            int result = a / b;
                            tvResult.setText(Integer.toString(result));

                        }
                    }
                }
            });
            

    }



}
