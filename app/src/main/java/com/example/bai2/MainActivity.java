package com.example.bai2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText et_c = findViewById(R.id.et_c);
        EditText et_f = findViewById(R.id.et_f);

        Button btn_c = findViewById(R.id.btn_c);
        Button btn_f = findViewById(R.id.btn_f);
        Button btn_clear = findViewById(R.id.btn_clear);

        btn_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float f = Float.parseFloat(et_f.getText().toString());
                float c = (f-32)/1.8f;
                et_c.setText(Float.toString(c));
            }
        });
        btn_f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float c = Float.parseFloat(et_c.getText().toString());
                float f = c*1.8f+32;
                et_f.setText(Float.toString(f));
            }
        });
        btn_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et_c.setText("");
                et_f.setText("");
            }
        });
    }
}