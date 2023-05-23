package com.example.project;

import android.content.ClipData;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder>{

    Context context;
    List<recycler_item> items;

    public Adapter(Context context, List<recycler_item> items) {
        this.context = context;
        this.items = items;
    }



    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_view,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.countryView.setText(items.get(position).getcountry());
        holder.populationView.setText(items.get(position).getPopulation());
        holder.sqkmView.setText(items.get(position).getSquarekm());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public List<recycler_item> getItems() {
        return items;
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        ImageView imageView;
        TextView countryView, populationView, sqkmView;
        View.OnClickListener onClickListener;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            countryView = itemView.findViewById(R.id.country);
            populationView = itemView.findViewById(R.id.population);
            sqkmView = itemView.findViewById(R.id.sqkm);
        }

        @Override
        public void onClick(View view) {
            return;
        }
    }
}
