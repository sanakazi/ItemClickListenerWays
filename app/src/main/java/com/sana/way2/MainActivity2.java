package com.sana.way2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.sana.R;


public class MainActivity2 extends AppCompatActivity implements Adapter2.ItemClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Fragment2 fg = new Fragment2();
        getSupportFragmentManager().beginTransaction().add(R.id.frame_container, fg).commit();

    }
/*
* Note: You cannot implement this method inside fragment, you have to do it using the activity class the fragment uses
*/
    @Override
    public void ItemClick(String fruitName) {
        Toast.makeText(MainActivity2.this, "You clicked on " + fruitName, Toast.LENGTH_SHORT).show();
    }
}
