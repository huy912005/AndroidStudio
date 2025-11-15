package com.example.viewpage.Data;

import com.example.viewpage.Model.Culture;
import com.example.viewpage.Model.Food;
import com.example.viewpage.Model.Sport;
import com.example.viewpage.R;

import java.util.ArrayList;
import java.util.List;

public class DataProvider {

    public static List<Culture> getCultureList() {
        List<Culture> list = new ArrayList<>();
        list.add(new Culture(R.drawable.vietnam, "Áo dài", "Việt Nam"));
        list.add(new Culture(R.drawable.japan, "Kimono", "Nhật Bản"));
        list.add(new Culture(R.drawable.korea, "Hanbok", "Hàn Quốc"));
        return list;
    }

    public static List<Sport> getSportList() {
        List<Sport> list = new ArrayList<>();
        list.add(new Sport(R.drawable.football, "Bóng đá", "Trên cạn"));
        list.add(new Sport(R.drawable.swimming, "Bơi lội", "Dưới nước"));
        list.add(new Sport(R.drawable.running, "Chạy bộ", "Trên cạn"));
        return list;
    }

    public static List<Food> getFoodList() {
        List<Food> list = new ArrayList<>();
        list.add(new Food(R.drawable.pho, "Phở", "40.000đ"));
        list.add(new Food(R.drawable.sushi, "Sushi", "120.000đ"));
        list.add(new Food(R.drawable.banhmi, "Bánh mì", "20.000đ"));
        return list;
    }
}
