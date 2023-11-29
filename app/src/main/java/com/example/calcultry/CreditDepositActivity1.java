package com.example.calcultry;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class CreditDepositActivity1 extends AppCompatActivity {

    private EditText inputCapital, inputPercent, inputPeriod;
    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credit_deposit1);

        inputCapital = findViewById(R.id.input_capital);
        inputPercent = findViewById(R.id.input_percent);
        inputPeriod = findViewById(R.id.input_period);
        resultTextView = findViewById(R.id.result_text);

        Button calculateButton = findViewById(R.id.calculate_button);

        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculateResult();
            }
        });

        Button previous = findViewById(R.id.previous);

        previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                previous();
            }
        });
    }
    private void calculateResult() {

        double P = Double.parseDouble(inputCapital.getText().toString());
        double i = Double.parseDouble(inputPercent.getText().toString());
        double n = Double.parseDouble(inputPeriod.getText().toString());

        double result = P*(1+n*(i/100));
        resultTextView.setText("Результат: " + result);
    }

    private void previous() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

}