package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button buttonAdd, buttonSubtract, buttonDivide, buttonMultiply, buttonClean;
    private TextView operation, result;
    private EditText number1, number2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        buttonAdd = findViewById(R.id.buttonplus);
        buttonSubtract = findViewById(R.id.buttonminus);
        buttonDivide = findViewById(R.id.buttondivide);
        buttonMultiply = findViewById(R.id.buttonmult);
        buttonClean = findViewById(R.id.buttonclear);

        operation = findViewById(R.id.operation);
        result = findViewById(R.id.result);

        number1 = findViewById(R.id.number1);
        number2 = findViewById(R.id.number2);

        buttonAdd.setOnClickListener(this);
        buttonSubtract.setOnClickListener(this);
        buttonDivide.setOnClickListener(this);
        buttonMultiply.setOnClickListener(this);
        buttonClean.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        float num1 = 0;
        float num2 = 0;
        float res = 0;

        num1 = Float.parseFloat(number1.getText().toString());
        num2 = Float.parseFloat(number2.getText().toString());

        if (v.getId() == R.id.buttonplus) {
            res = num1 + num2;
            operation.setText("+");
            result.setText(String.valueOf(res));
        } else if (v.getId() == R.id.buttonminus) {
            res = num1 - num2;
            operation.setText("-");
            result.setText(String.valueOf(res));
        } else if (v.getId() == R.id.buttondivide) {
            res = num1 / num2;
            operation.setText("/");
            result.setText(String.valueOf(res));
        } else if (v.getId() == R.id.buttonmult) {
            res = num1 * num2;
            operation.setText("*");
            result.setText(String.valueOf(res));
        } else if (v.getId() == R.id.buttonclear) {
            number1.setText("");
            number2.setText("");
            operation.setText("");
            result.setText("");
        }
    }
}