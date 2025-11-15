package com.example.viewpage.Adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.viewpage.CultureFragment;
import com.example.viewpage.FoodFragment;
import com.example.viewpage.SportFragment;

public class ViewPagerAdapter extends FragmentStateAdapter {

    public ViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new CultureFragment(); // Văn hóa
            case 1:
                return new SportFragment();   // Thể thao
            case 2:
            default:
                return new FoodFragment();    // Ẩm thực
        }
    }

    @Override
    public int getItemCount() {
        return 3;
    }
}
