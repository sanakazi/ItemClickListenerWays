package com.sana.way3;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.sana.Model;
import com.sana.R;

import java.util.ArrayList;

/**
 * Created by SanaKazi on 11/16/2017.
 */

public class Adapter3 extends RecyclerView.Adapter<Adapter3.SingleItemRowHolder> {

    private ArrayList<Model> itemsList;
    private Context mContext;
    private static final String TAG=Adapter3.class.getSimpleName();
    OnItemClickListener onItemClickListener;


    public Adapter3(Context context, ArrayList<Model> itemsList,OnItemClickListener onItemClickListener) {
        this.itemsList = itemsList;
        this.mContext = context;
        this.onItemClickListener = onItemClickListener;

    }

    @Override
    public Adapter3.SingleItemRowHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_adapter, null);
        Adapter3.SingleItemRowHolder mh = new Adapter3.SingleItemRowHolder(v);
        return mh;
    }

    @Override
    public void onBindViewHolder(Adapter3.SingleItemRowHolder holder, final int i) {

        final Model obj = itemsList.get(i);

        holder.txt_id.setText(String.valueOf(itemsList.get(i).getId()));
        holder.txt_fruit_name.setText(String.valueOf(itemsList.get(i).getFruit()));
        holder.txt_color.setText(String.valueOf(itemsList.get(i).getColor()));
        holder.l1.setOnClickListener(v -> {
            if (onItemClickListener != null) {
                onItemClickListener.onItemClick(obj, i);
            }
        });

    }


    @Override
    public int getItemCount() {
        return (null != itemsList ? itemsList.size() : 0);
    }

    public class SingleItemRowHolder extends RecyclerView.ViewHolder {

        protected TextView txt_id,txt_fruit_name,txt_color;
        protected LinearLayout l1;
        public SingleItemRowHolder(View view) {
            super(view);

            this.txt_id = (TextView) view.findViewById(R.id.txt_id);
            this.txt_fruit_name = (TextView) view.findViewById(R.id.txt_fruit_name);
            this.txt_color = (TextView) view.findViewById(R.id.txt_color);
            this.l1=view.findViewById(R.id.l1);


        }

    }

}

