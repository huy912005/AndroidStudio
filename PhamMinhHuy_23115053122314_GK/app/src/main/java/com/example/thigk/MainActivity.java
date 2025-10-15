package com.example.thigk;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private Button btn_login2314;
    private EditText edt_name2314,edt_sdt2314,edt_pass2314;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        btn_login2314=findViewById(R.id.btn_login_2314);
        edt_name2314=findViewById(R.id.edt_name2314);
        edt_pass2314=findViewById(R.id.edt_passWord2314);
        edt_sdt2314=findViewById(R.id.edt_sdt2314);
        btn_login2314.setOnClickListener(view -> {
            Intent intent= new Intent(this, Profile.class);
            intent.putExtra("Name",edt_name2314.getText().toString());
            intent.putExtra("Pass",edt_pass2314.getText().toString());
            intent.putExtra("Sdt",edt_sdt2314.getText().toString());
            startActivity(intent);
        });
    }
}