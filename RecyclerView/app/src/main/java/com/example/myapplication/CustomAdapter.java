package com.example.myapplication;

import android.content.Context;
import android.graphics.Paint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bumptech.glide.Glide;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class CustomAdapter extends RecyclerView.Adapter<CustomViewHolder> {

    private final Context context;
    private final List<MyModel> list;
    private final SelectListener listener;

    public CustomAdapter(Context context, List<MyModel> list, SelectListener listener) {
        this.context = context;
        this.list = list;
        this.listener = listener;
    }

    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // 🔹 Đổi lại nếu file layout của bạn tên khác (VD: R.layout.item_gio_hang)
        View view = LayoutInflater.from(context).inflate(R.layout.list_item, parent, false);
        return new CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int position) {
        // ✅ Khai báo currentModel TRƯỚC khi dùng Glide
        MyModel currentModel = list.get(position);

        // ✅ Load ảnh online bằng Glide
        Glide.with(context)
                .load(currentModel.getHinhAnh())
                .placeholder(R.drawable.ic_launcher_background)
                .into(holder.imgSanPham);

        // ✅ Set dữ liệu sản phẩm
        holder.tvTenSanPham.setText(currentModel.getTenSanPham());
        holder.tvGiaGoc.setText("₫" + currentModel.getGiaGoc());
        holder.tvGiaKhuyenMai.setText("₫" + currentModel.getGiaKhuyenMai());
        holder.tvGiaGoc.setPaintFlags(holder.tvGiaGoc.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
        holder.tvSoLuong.setText(String.valueOf(currentModel.getSoLuong()));
        holder.tvTongTien.setText("Tổng: ₫" + currentModel.getGiaKhuyenMai() * currentModel.getSoLuong());

        // ✅ Sự kiện click
        holder.cardView.setOnClickListener(v -> listener.onItemClicked(currentModel));

        holder.btnTru.setOnClickListener(v -> {
            int sl = Integer.parseInt(holder.tvSoLuong.getText().toString());
            if (sl > 1) {
                sl--;
                holder.tvSoLuong.setText(String.valueOf(sl));
            }
        });

        holder.btnCong.setOnClickListener(v -> {
            int sl = Integer.parseInt(holder.tvSoLuong.getText().toString());
            sl++;
            holder.tvSoLuong.setText(String.valueOf(sl));
        });
    }

    @Override
    public int getItemCount() {
        return list != null ? list.size() : 0;
    }
}
