package com.forbit.onlineshop;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.forbit.onlineshop.ui.MenActivity;

import java.util.List;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.MyViewHolder> {


    Context context;
    int [] pimage;
    String [] pname;

    public ProductAdapter(Context context, int[] pimage, String[] pname) {
        this.context = context;
        this.pimage = pimage;
        this.pname = pname;
    }

    @NonNull
    @Override
    public ProductAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.product_layout, parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.imageview.setImageResource(pimage[position]);
        holder.textView.setText(pname[position]);
    }

    @Override
    public int getItemCount() {
        return pname.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView imageview;
        TextView textView;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            imageview = itemView.findViewById(R.id.productpic);
            textView = itemView.findViewById(R.id.productname);
        }
    }
}
