package com.example.lab2_bai1;

import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Bai2 extends AppCompatActivity implements View.OnClickListener {
    EditText soThuNhat;
    EditText soThuHai;
    TextView result;
    Button cong, tru, nhan, chia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_bai2);
        soThuNhat = findViewById(R.id.soThuNhat);
        soThuHai = findViewById(R.id.soThuHai);
        findViewById(R.id.cong).setOnClickListener(this);
        findViewById(R.id.tru).setOnClickListener(this);
        findViewById(R.id.nhan).setOnClickListener(this);
        findViewById(R.id.chia).setOnClickListener(this);
        result = findViewById(R.id.result);


    }

    @Override
    public void onClick(View v) {
        float fistNum = Float.parseFloat(soThuNhat.getText().toString());
        float secondNum = Float.parseFloat(soThuHai.getText().toString());
        if (v.getId() == R.id.cong) {
            result.setText(fistNum+secondNum+"");
        } else if (v.getId() == R.id.tru) {
            result.setText(fistNum-secondNum+"");
        } else if (v.getId() == R.id.nhan) {
            result.setText(fistNum*secondNum+"");
        } else if (v.getId() == R.id.chia) {
            result.setText(fistNum/secondNum+"");
        }
    }
}