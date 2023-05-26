package com.fpoly.lab4_ph32739.Bai1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.fpoly.lab4_ph32739.R;

public class Activity1Layout extends AppCompatActivity {

    private  final  String tag = "Status: ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity1_bai1);
        Button btnGoTo = findViewById(R.id.btn_go);
        btnGoTo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity1Layout.this, Activity2Layout.class);
                startActivity(intent);
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(tag,"onStart !");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(tag,"onResume !");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(tag,"onPause !");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(tag,"onStop !");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(tag,"onRestart !");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(tag,"onDestroy !");
    }
}