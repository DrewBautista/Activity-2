package com.example.activity_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText text_answer,text_input1,text_input2;
    Button button_addition, button_subtraction, button_multiplication, button_clear, button_division;
    TextView text_output;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text_output = findViewById(R.id.txt_output);
        button_addition = findViewById(R.id.btn_addition);
        button_subtraction = findViewById(R.id.btn_subtraction);
        button_multiplication = findViewById(R.id.btn_multi);
        button_clear = findViewById(R.id.btn_clear);
        button_division = findViewById(R.id.btn_divi);
        text_input1 = findViewById(R.id.num_input1);
        text_input2 = findViewById(R.id.num_input2);
        button_addition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double first_value = Double.parseDouble(text_input1.getText().toString());
                double second_value = Double.parseDouble(text_input2.getText().toString());

                double result = first_value + second_value;

                text_output.setText(String.valueOf(result));
            }
        });

        button_subtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double first_value = Double.parseDouble(text_input1.getText().toString());
                double second_value = Double.parseDouble(text_input2.getText().toString());

                double result = first_value - second_value;

                text_output.setText(String.valueOf(result));
            }
        });
        button_division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double first_value = Double.parseDouble(text_input1.getText().toString());
                double second_value = Double.parseDouble(text_input2.getText().toString());

                double result = first_value / second_value;

                text_output.setText(String.valueOf(result));
            }
        });
        button_multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double first_value = Double.parseDouble(text_input1.getText().toString());
                double second_value = Double.parseDouble(text_input2.getText().toString());

                double result = first_value * second_value;

                text_output.setText(String.valueOf(result));
            }
        });
        button_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                text_output.setText(String.valueOf(0));
                text_input1.setText(String.valueOf(0));
                text_input2.setText(String.valueOf(0));

            }
        });



    }
}