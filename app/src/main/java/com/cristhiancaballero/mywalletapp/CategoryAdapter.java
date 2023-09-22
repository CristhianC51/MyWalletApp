package com.cristhiancaballero.mywalletapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.ViewHolder> {

    private ArrayList<Category> dataSet;

    public CategoryAdapter(ArrayList<Category> dataSet) {
        this.dataSet = dataSet;
    }

    @NonNull
    @Override
    public CategoryAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View myView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_rv_categoria, parent, false);
        return new ViewHolder(myView);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryAdapter.ViewHolder holder, int position) {
        Category myCategory = dataSet.get(position);
        holder.loadItem(myCategory);
    }

    @Override
    public int getItemCount() {
        return dataSet.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        private TextView tvName;
        private CircleImageView civImage;
        private ImageView ivColor;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tvName = itemView.findViewById(R.id.tv_name);
            civImage = itemView.findViewById(R.id.iv_principal);
            ivColor = itemView.findViewById(R.id.iv_color);
        }

        public void loadItem(Category myCategory) {
            tvName.setText(myCategory.getName());
            //ivColor.setBackgroundColor(String.valueOf(myCategory.getColor()));
        }
    }

}
