package com.example.account;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class CreateAccount extends AppCompatActivity {
    private TextView txtLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_create_account);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        txtLogin=findViewById(R.id.txtv_fogot);
        String text = "Have account? Log in";
        SpannableString sAS= new SpannableString(text);
        sAS.setSpan(new StyleSpan(Typeface.BOLD),13,text.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        sAS.setSpan(new UnderlineSpan(),13,text.length(),Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        txtLogin.setText(sAS);
        txtLogin.setOnClickListener(v -> {
            Intent intent = new Intent(CreateAccount.this, MainActivity.class);
            startActivity(intent);
        });
    }
}