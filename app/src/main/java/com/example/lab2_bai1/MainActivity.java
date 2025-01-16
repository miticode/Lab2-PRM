package com.example.lab2_bai1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    EditText minInput;
    EditText maxInput;
    Button randomButton;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        minInput = findViewById(R.id.Min);
        maxInput = findViewById(R.id.Max);
        randomButton = findViewById(R.id.button);
        result = findViewById(R.id.result);
        randomButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int min = Integer.parseInt(minInput.getText().toString());
                int max = Integer.parseInt(maxInput.getText().toString());
                Random random = new Random();
                int randomResult = random.nextInt((max - min) + 1) + min;
                if (min > max) {
                    result.setText("Min phải nhỏ hơn hoặc bằng Max !!!");
                } else {
                    result.setText("Số ngẫu nhiên:" + randomResult + "");
                }
            }
        });
    }
}