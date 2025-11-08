package com.example.myapplication;

import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class CustomViewHolder extends RecyclerView.ViewHolder {

    public CardView cardView;
    public ImageView imgSanPham;
    public TextView tvTenSanPham, tvGiaGoc, tvGiaKhuyenMai, tvSoLuong, tvTongTien;
    public ImageButton btnTru, btnCong;

    public CustomViewHolder(@NonNull View itemView) {
        super(itemView);

        // Gán đúng ID theo item_gio_hang.xml
        cardView = itemView.findViewById(R.id.card_item_gio_hang);
        imgSanPham = itemView.findViewById(R.id.imgSanPham);
        tvTenSanPham = itemView.findViewById(R.id.tvTenSanPham);
        tvGiaGoc = itemView.findViewById(R.id.tvGiaGoc);
        tvGiaKhuyenMai = itemView.findViewById(R.id.tvGiaKhuyenMai);
        tvSoLuong = itemView.findViewById(R.id.tvSoLuong);
        tvTongTien = itemView.findViewById(R.id.tvTongTien);
        btnTru = itemView.findViewById(R.id.btnTru);
        btnCong = itemView.findViewById(R.id.btnCong);
    }
}
