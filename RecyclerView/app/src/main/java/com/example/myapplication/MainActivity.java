package com.example.myapplication;

import android.os.Bundle;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements SelectListener {

    private RecyclerView recyclerView;
    private CustomAdapter adapter;
    private List<MyModel> dataList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_view);

        // Chuẩn bị dữ liệu
        dataList = prepareData();

        // Gán Adapter
        adapter = new CustomAdapter(this, dataList, this);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }

    private List<MyModel> prepareData() {
        List<MyModel> list = new ArrayList<>();

        list.add(new MyModel("Dám bị ghét – Kishimi Ichiro & Koga Fumitake", "https://bizweb.dktcdn.net/100/180/408/products/dam-bi-ghet-66321809-ea17-49c5-a66a-a085e52f1356.jpg?v=1745935146100", 120000, 95000, 1));
        list.add(new MyModel("Tôi tư duy, tôi thành đạt – Napoleon Hill", "https://static.oreka.vn/800-800_6bb6af1e-a082-4895-aa51-e6a27c5c426e", 180000, 135000, 1));
        list.add(new MyModel("Khéo ăn nói sẽ có được thiên hạ – Trác Nhã", "https://vn-test-11.slatic.net/p/f3212848e73800aa870135d920d2f0f5.jpg", 89000, 69000, 1));
        list.add(new MyModel("Trí Tuệ Do Thái – Eran Katz", "https://www.netabooks.vn/Data/Sites/1/Product/23262/tri-tue-do-thai-5.jpg", 169000, 129000, 1));
        list.add(new MyModel("Code Dạo Ký Sự – Phạm Huy Hoàng", "https://salt.tikicdn.com/cache/w300/ts/product/29/36/bf/5984f3b5f1ac7bf746714950527279c0.jpg", 120000, 95000, 1));
        list.add(new MyModel("Hiểu về trái tim – Minh Niệm", "https://bizweb.dktcdn.net/100/180/408/products/hieu-ve-trai-tim.jpg?v=1663401683207", 180000, 145000, 1));
        list.add(new MyModel("Đi tìm lẽ sống – Viktor E. Frankl", "https://cdn1.fahasa.com/media/catalog/product/8/9/8935086847695.jpg", 180000, 139000, 1));
        list.add(new MyModel("Tuổi trẻ đáng giá bao nhiêu – Rosie Nguyễn", "https://www.netabooks.vn/Data/Sites/1/Product/2625/tuoi-tre-dang-gia-bao-nhieu-01.jpg", 120000, 95000, 1));
        list.add(new MyModel("Đắc nhân tâm – Dale Carnegie (Bản tiếng Việt)", "https://nxbhcm.com.vn/Image/Biasach/dacnhantam86.jpg", 130000, 99000, 1));
        list.add(new MyModel("Nhà giả kim – Paulo Coelho", "https://nxbhcm.com.vn/Image/Biasach/nhagiakimTB2020.jpg", 160000, 119000, 1));
        return list;
    }

    @Override
    public void onItemClicked(MyModel model) {
        Toast.makeText(this,
                "Bạn đã chọn: " + model.getTenSanPham()
                        + "\nGiá khuyến mãi: ₫" + (int) model.getGiaKhuyenMai()
                        + "\nSố lượng: " + model.getSoLuong()
                        + "\nTổng: ₫" + (int) model.getTongTien(),
                Toast.LENGTH_LONG).show();
    }

}
