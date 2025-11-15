package com.example.viewpage;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.viewpage.Adapter.CultureAdapter;
import com.example.viewpage.Data.DataProvider;

public class CultureFragment extends Fragment {

    private RecyclerView recyclerView;

    public CultureFragment() { }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_list, container, false);
        recyclerView = view.findViewById(R.id.recyclerView);

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        // Adapter sẽ được thêm sau ở phần adapter
        recyclerView.setAdapter(new CultureAdapter(DataProvider.getCultureList()));

        return view;
    }
}

