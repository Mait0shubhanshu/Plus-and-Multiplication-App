package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

//import android.annotation;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView text;
    EditText n1, n2;
    Button button;

    TextView text2;

    EditText mul1, mul2;

    Button button2;
    //@SuppressLint("MissingInflatedId")
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, "Good Morning!", Toast.LENGTH_SHORT).show();
        text = findViewById(R.id.text);
        text2 = findViewById(R.id.text2);
        n1 = findViewById(R.id.n1);
        n2 = findViewById(R.id.n2);

        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int sum = Integer.parseInt(n1.getText().toString()) + Integer.parseInt(n2.getText().toString());
                //To Convert String Into corresponding Integer
                //Ex - 34 string to 34 integer
                //Ex - 54 string to 54 integer

                text.setText("The Sum Number " + sum);
            }
        });
        mul1 = findViewById(R.id.mul1);
        mul2 = findViewById(R.id.mul2);
        button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int mul = Integer.parseInt(mul1.getText().toString()) * Integer.parseInt(mul2.getText().toString());
                //To Convert String Into corresponding Integer
                //Ex - 34 string to 34 integer
                //Ex - 54 string to 54 integer

                text2.setText("The Multiplication " + mul);
            }
        });
    }
}