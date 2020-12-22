package com.example.linearlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button sum = findViewById(R.id.btnSum);
        sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView Numberone = findViewById(R.id.edtNumberOne);
                TextView Numbertwo = findViewById(R.id.edtNumberTwo);
                int s;
                s = Integer.parseInt(Numberone.getText().toString()) + Integer.parseInt(Numbertwo.getText().toString());
                TextView txtresult = findViewById(R.id.txtResult);
                txtresult.setText(s + "");
            }
        });
        Button subtract = findViewById(R.id.btnSubtract);
        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView Numberone = findViewById(R.id.edtNumberOne);
                TextView Numbertwo = findViewById(R.id.edtNumberTwo);
                int p;
                p = Integer.parseInt(Numberone.getText().toString()) - Integer.parseInt(Numbertwo.getText().toString());
                TextView txtresult = findViewById(R.id.txtResult);
                txtresult.setText(p + "");
            }
        });


        Button multiply = findViewById(R.id.btnMultiply);
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView Numberone = findViewById(R.id.edtNumberOne);
                TextView Numbertwo = findViewById(R.id.edtNumberTwo);
                int m;
                m = Integer.parseInt(Numberone.getText().toString()) * Integer.parseInt(Numbertwo.getText().toString());
                TextView txtresult = findViewById(R.id.txtResult);
                txtresult.setText(m + "");
            }
        });

        Button divided = findViewById(R.id.btnDivide);
        divided.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView Numberone = findViewById(R.id.edtNumberOne);
                TextView Numbertwo = findViewById(R.id.edtNumberTwo);
                int d;
                d = Integer.parseInt(Numberone.getText().toString()) / Integer.parseInt(Numbertwo.getText().toString());
                TextView txtresult = findViewById(R.id.txtResult);
                txtresult.setText(d + "");
            }
        });
    }
}