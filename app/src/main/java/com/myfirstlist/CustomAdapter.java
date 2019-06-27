package com.myfirstlist;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.CustomHolder> {
    private String[] data;
    String[] images;
    MainActivity mainActivity;
    public CustomAdapter(String[] product_info, MainActivity mainActivity, String[] product_image) {
        this.mainActivity=mainActivity;
        this.data=product_info;
        this.images=product_image;
    }

    @NonNull
    @Override
    public CustomHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.rv,parent,false);
        return new CustomHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomHolder holder, int position) {
        String str=data[position];
        holder.tvname.setText(str);
        Log.e("url",images[position]);
        Picasso.with(mainActivity).load(images[position]).placeholder(R.mipmap.pic)
                .into(holder.imgIcon);
    }

    @Override
    public int getItemCount() {
        return images.length;
    }

    public class CustomHolder extends RecyclerView.ViewHolder {
        TextView tvname;
        ImageView imgIcon;
        RatingBar ratingBar;
        TextView tvPrice;
        public CustomHolder(@NonNull View itemView) {
            super(itemView);
            tvname=itemView.findViewById(R.id.tvtext);
            imgIcon=itemView.findViewById(R.id.img);
            ratingBar=itemView.findViewById(R.id.ratingBar);
            tvPrice=itemView.findViewById(R.id.tvPrice);
        }
    }
}
