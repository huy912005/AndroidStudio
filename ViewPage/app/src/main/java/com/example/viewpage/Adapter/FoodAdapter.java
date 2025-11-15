package com.example.viewpage.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.viewpage.Model.Food;
import com.example.viewpage.R;

import java.util.List;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.ViewHolder> {

    private List<Food> list;

    public FoodAdapter(List<Food> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public FoodAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_food, parent, false);
        return new FoodAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FoodAdapter.ViewHolder holder, int position) {
        Food f = list.get(position);
        holder.img.setImageResource(f.getImage());
        holder.txtName.setText(f.getName());
        holder.txtPrice.setText(f.getPrice());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        ImageView img;
        TextView txtName, txtPrice;

        public ViewHolder(View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.imgItem);
            txtName = itemView.findViewById(R.id.txtTitle);
            txtPrice = itemView.findViewById(R.id.txtSubtitle);
        }
    }
}
