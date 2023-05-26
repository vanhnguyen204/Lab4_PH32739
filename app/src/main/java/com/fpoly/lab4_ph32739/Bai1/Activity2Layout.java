package com.fpoly.lab4_ph32739.Bai1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.fpoly.lab4_ph32739.R;

public class Activity2Layout extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity2_bai1);
        Button btnGoBack = findViewById(R.id.btn_back);
        btnGoBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity2Layout.this, Activity1Layout.class);
                startActivity(intent);
            }
        });

    }

}