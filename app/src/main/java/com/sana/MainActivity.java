package com.sana;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.sana.way1.MainActivity1;
import com.sana.way2.MainActivity2;
import com.sana.way3.MainActivity3;

public class MainActivity extends AppCompatActivity {
    Button btn1,btn2,btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = findViewById(R.id.btn1); btn2 = findViewById(R.id.btn2); btn3 = findViewById(R.id.btn3);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1  = new Intent(MainActivity.this , MainActivity1.class);
                startActivity(i1);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2  = new Intent(MainActivity.this , MainActivity2.class);
                startActivity(i2);
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i3  = new Intent(MainActivity.this , MainActivity3.class);
                startActivity(i3);
            }
        });

    }
}
