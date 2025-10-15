package com.example.thigk;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Profile extends AppCompatActivity {
    private TextView tvName_2314,tvPass_2314,tvSdt_2314;
    private Button btnBack_2314;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_profile);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        tvName_2314=findViewById(R.id.textView_Name);
        tvPass_2314=findViewById(R.id.textView7);
        tvSdt_2314=findViewById(R.id.textView5);
        tvName_2314.setText(getIntent().getStringExtra("Name"));
        tvPass_2314.setText(getIntent().getStringExtra("Pass"));
        tvSdt_2314.setText(getIntent().getStringExtra("Sdt"));
        btnBack_2314=findViewById(R.id.btn_back2314);
        btnBack_2314.setOnClickListener(view -> {
            Intent intent= new Intent(this,MainActivity.class);
            startActivity(intent);
        });
    }
}