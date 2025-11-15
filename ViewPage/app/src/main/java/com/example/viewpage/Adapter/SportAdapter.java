package com.example.viewpage.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.viewpage.Model.Sport;
import com.example.viewpage.R;

import java.util.List;

public class SportAdapter extends RecyclerView.Adapter<SportAdapter.ViewHolder> {

    private List<Sport> list;

    public SportAdapter(List<Sport> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_sport, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Sport s = list.get(position);
        holder.img.setImageResource(s.getImage());
        holder.txtName.setText(s.getName());
        holder.txtType.setText(s.getType());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        ImageView img;
        TextView txtName, txtType;

        public ViewHolder(View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.imgItem);
            txtName = itemView.findViewById(R.id.txtTitle);
            txtType = itemView.findViewById(R.id.txtSubtitle);
        }
    }
}
