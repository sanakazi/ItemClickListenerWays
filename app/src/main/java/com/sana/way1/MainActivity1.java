package com.sana.way1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.sana.MainActivity;
import com.sana.Model;
import com.sana.R;

import java.util.ArrayList;

public class MainActivity1 extends AppCompatActivity {
    private RecyclerView recycle_view;
    ArrayList<Model> itemsList;
    Adapter1 adapter1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        recycle_view = findViewById(R.id.recycle_view);
        LinearLayoutManager llm = new LinearLayoutManager(MainActivity1.this);
        recycle_view.setLayoutManager(llm);
        createData();

    }

    private void createData()
    {
        itemsList = new ArrayList<>();
        Model a = new Model(1,"Apple", "red");
        Model b = new Model(2,"Grapes", "green");
        Model c = new Model(3,"Banana", "yellow");
        itemsList.add(a);
        itemsList.add(b);
        itemsList.add(c);

        setAdapter();



    }

    private  void setAdapter()
    {
        adapter1 = new Adapter1(MainActivity1.this,itemsList);
        recycle_view.setAdapter(adapter1);

    }
}
