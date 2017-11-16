package com.sana.way2;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.sana.Model;
import com.sana.R;

import java.util.ArrayList;

/**
 * Created by SanaKazi on 11/16/2017.
 */

public class Fragment2 extends Fragment {
    private RecyclerView recycle_view;
    ArrayList<Model> itemsList;
    Adapter2 adapter2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_main1, container, false);
        recycle_view = view.findViewById(R.id.recycle_view);
        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        recycle_view.setLayoutManager(llm);
        createData();
        return view;
    }

    private void createData()
    {
        itemsList = new ArrayList<>();
        Model a = new Model(1,"Chiku", "brown");
        Model b = new Model(2,"Mango", "yellow");
        Model c = new Model(3,"Watermelon", "green");
        itemsList.add(a);
        itemsList.add(b);
        itemsList.add(c);

        setAdapter();



    }

    private  void setAdapter()
    {
        adapter2 = new Adapter2(getActivity(),itemsList);
        recycle_view.setAdapter(adapter2);

    }


}
