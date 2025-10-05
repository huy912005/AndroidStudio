package com.example.activity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private Button btnClick;
    private Boolean isPasswordVisible=false;
    private ImageView imgViewPassword;
    private EditText edt;
    final String userName = "tenNguoiDung";
    private EditText edtUserName;
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
        btnClick=findViewById(R.id.btnClick);
        edtUserName = findViewById(R.id.edtUserName);
        btnClick.setOnClickListener(view -> {
            Intent intent = new Intent(this,Profile.class);
            intent.putExtra(userName,edtUserName.getText().toString());
            startActivity(intent);
        });
        imgViewPassword=findViewById(R.id.imgVisible);
        edt=findViewById(R.id.editText);
        imgViewPassword.setOnClickListener(view -> {
            int cursorPosition = edt.getSelectionStart();
            if(isPasswordVisible){
                edt.setTransformationMethod(new PasswordTransformationMethod());
                isPasswordVisible = false;
            }
            else{
                edt.setTransformationMethod(new HideReturnsTransformationMethod());
                isPasswordVisible=true;
            }
            edt.setSelection(cursorPosition);
        });
    }
}