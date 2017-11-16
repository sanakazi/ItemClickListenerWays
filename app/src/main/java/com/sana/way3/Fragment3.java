package com.sana.way3;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.sana.Model;
import com.sana.R;
import com.sana.way2.Adapter2;
import com.sana.way2.MainActivity2;

import java.util.ArrayList;

/**
 * Created by SanaKazi on 11/16/2017.
 */

public class Fragment3 extends Fragment {
    private RecyclerView recycle_view;
    ArrayList<Model> itemsList;
    Adapter3 adapter3;

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
        Model a = new Model(1,"Custard Apple", "green");
        Model b = new Model(2,"Guava", "green");
        Model c = new Model(3,"Grapes", "green");
        itemsList.add(a);
        itemsList.add(b);
        itemsList.add(c);

        setAdapter();



    }

    private  void setAdapter()
    {
       // adapter3 = new Adapter3(getActivity(),itemsList,);

        adapter3 = new Adapter3(getActivity(), itemsList, (object, position) -> {
            Model obj = (Model) object;
            System.out.println("project = [" + obj + "], position = [" + position + "]");
          //  ApplicationContext.getInstance().project = project;
            if (getActivity() instanceof MainActivity3) {
              Toast.makeText(getActivity(),"You clicked on " + obj.getFruit() ,Toast.LENGTH_SHORT).show();
            }
        });

        recycle_view.setAdapter(adapter3);

    }


}
