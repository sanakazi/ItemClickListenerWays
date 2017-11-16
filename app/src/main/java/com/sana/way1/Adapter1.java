package com.sana.way1;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.sana.Model;
import com.sana.R;

import java.util.ArrayList;

/**
 * Created by SanaKazi on 11/16/2017.
 */

public class Adapter1 extends RecyclerView.Adapter<Adapter1.SingleItemRowHolder> {

    private ArrayList<Model> itemsList;
    private Context mContext;
    private static final String TAG=Adapter1.class.getSimpleName();
  //  GenreClickListener mListener;


   /* public interface GenreClickListener{
        void ItemClick(int catId, int typeId, String typeName, String coverImage);
    }*/

    public Adapter1(Context context, ArrayList<Model> itemsList ) {
        this.itemsList = itemsList;
        this.mContext = context;
     //   mListener=(GenreClickListener)context;

    }

    @Override
    public SingleItemRowHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_adapter, null);
        SingleItemRowHolder mh = new SingleItemRowHolder(v);
        return mh;
    }

    @Override
    public void onBindViewHolder(SingleItemRowHolder holder,final int i) {

        holder.txt_id.setText(String.valueOf(itemsList.get(i).getId()));
        holder.txt_fruit_name.setText(String.valueOf(itemsList.get(i).getFruit()));
        holder.txt_color.setText(String.valueOf(itemsList.get(i).getColor()));
        holder.l1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext,"You clicked on " + itemsList.get(i).getFruit() ,Toast.LENGTH_SHORT).show();
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
