package com.example.recyclerview;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.zip.Inflater;


//create a adapter

public class programmingAdapter extends RecyclerView.Adapter<programmingAdapter.programmingviewholder> {

    private String[] data;

    public programmingAdapter(String[] data){

        this.data=data;
    }
    @NonNull
    @Override

    //creates all the views and send it on view holder


    public programmingviewholder onCreateViewHolder(@NonNull ViewGroup parent , int viewtype) {


        LayoutInflater inflater = LayoutInflater.from ( parent.getContext () );

        View view;
        view = inflater.inflate ( R.layout.list_item_layout , parent , false );
        return new programmingviewholder (view);
    }
    @Override
    public void onBindViewHolder(@NonNull programmingviewholder programmingviewholder , int i) {

        String title=data[i];
        programmingviewholder.texttitle=setText(title);

    }

    private TextView setText(String title) {
        return null;
    }

    @Override
    public int getItemCount() {
        return data.length;
    }

    public class programmingviewholder extends RecyclerView.ViewHolder{

        ImageView imgicon;
        TextView texttitle;

        public programmingviewholder(View itemview){

            super(itemview);

           imgicon=(ImageView) itemview.findViewById ( R.id.imgicon );
           texttitle=(TextView)    itemview.findViewById ( R.id.texttitle );


        }
    }

}
