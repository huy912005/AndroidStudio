package com.example.viewpage.Adapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.viewpage.Model.Culture;
import com.example.viewpage.R;

import java.util.List;

public class CultureAdapter extends RecyclerView.Adapter<CultureAdapter.ViewHolder> {

    private List<Culture> list;

    public CultureAdapter(List<Culture> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_culture, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Culture c = list.get(position);
        holder.img.setImageResource(c.getImage());
        holder.txtName.setText(c.getName());
        holder.txtCountry.setText(c.getCountry());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        ImageView img;
        TextView txtName, txtCountry;

        public ViewHolder(View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.imgItem);
            txtName = itemView.findViewById(R.id.txtTitle);
            txtCountry = itemView.findViewById(R.id.txtSubtitle);
        }
    }
}

