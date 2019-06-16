package com.myfirstlist;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MyListAdapter extends RecyclerView.Adapter<MyListAdapter.MyListHolder> {
    List<String> list;
    public MyListAdapter(){
        list=new ArrayList<>();
        list.add("sandeep");
        list.add("agdkhf");
        list.add("agdkhf");
    }
    @NonNull
    @Override
    public MyListHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.rv,parent,false);
        return new MyListHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyListHolder holder, int position) {
        holder.tvName.setText(list.get(position));
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class MyListHolder extends RecyclerView.ViewHolder {
        TextView tvName;
        public MyListHolder(@NonNull View itemView) {
            super(itemView);
            tvName=itemView.findViewById(R.id.tvName);
        }
    }
}
