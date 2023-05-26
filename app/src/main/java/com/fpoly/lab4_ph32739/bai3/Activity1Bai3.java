package com.fpoly.lab4_ph32739.bai3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.fpoly.lab4_ph32739.R;

public class Activity1Bai3 extends AppCompatActivity {

    public static String KEY_USERNAME = "username";
    public static String KEY_PASSWORD = "password";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity1_bai3);
        EditText edtUserName = findViewById(R.id.edt_username);
        EditText edtPassword = findViewById(R.id.edt_password);
        Button btnDangNhap = findViewById(R.id.btn_dangnhap);
        Button btnDangKy = findViewById(R.id.btn_dangky);

        String getUserDk = getIntent().getStringExtra(Activity2Bai3.KEY_USERNAME_DK);
        String getPassDk = getIntent().getStringExtra(Activity2Bai3.KEY_PASSWORD_DK);

        edtUserName.setText(getUserDk);
        edtPassword.setText(getPassDk);

        btnDangNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean u = edtUserName.getText().toString().equals(getUserDk);
                boolean p = edtPassword.getText().toString().equals(getPassDk);
                if (edtUserName.getText().length()==0 && edtPassword.getText().length()==0){
                    Toast.makeText(Activity1Bai3.this, "Bạn phải nhập tài khoản và mật khẩu để đăng nhập", Toast.LENGTH_SHORT).show();
                }else if (u && p) {
                    Toast.makeText(Activity1Bai3.this, "Đăng nhập thành công !", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(Activity1Bai3.this, "Sai tài khoản hoặc mật khẩu", Toast.LENGTH_SHORT).show();
                }
            }
        });
        btnDangKy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Activity2Bai3.class);
                startActivity(intent);
            }
        });
    }
}