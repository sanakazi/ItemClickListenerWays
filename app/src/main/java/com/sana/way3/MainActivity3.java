package com.sana.way3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.sana.R;
import com.sana.way2.Adapter2;
import com.sana.way2.Fragment2;
import com.sana.way2.MainActivity2;

public class MainActivity3 extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Fragment3 fg = new Fragment3();
        getSupportFragmentManager().beginTransaction().add(R.id.frame_container, fg).commit();

    }

}

