package com.example.activity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Profile extends AppCompatActivity {
    private TextView txtView,txtProfileName,txtViewEmail;
    final String userName = "tenNguoiDung";
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
        txtView=findViewById(R.id.txtView);
        txtView.setOnClickListener(view -> {
            Intent intent= new Intent(this,MainActivity.class);
            startActivity(intent);
        });
        txtProfileName=findViewById(R.id.profileUserName);
        txtViewEmail=findViewById(R.id.txtViewId);
        String getPutExtra=getIntent().getStringExtra(userName);
        if(getPutExtra!=null && !getPutExtra.isEmpty()){
            txtProfileName.setText(getPutExtra);
            txtViewEmail.setText("Email : "+ getPutExtra +"@gmail.com");
        }
    }
}