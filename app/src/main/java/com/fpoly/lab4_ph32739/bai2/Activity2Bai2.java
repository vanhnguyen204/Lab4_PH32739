package com.fpoly.lab4_ph32739.bai2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.fpoly.lab4_ph32739.R;

public class Activity2Bai2 extends AppCompatActivity {
    EditText edtProduct;

    public static  String KEY_PRICE_PRODUCT = "giaSanPham";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity2_bai2);
        TextView txtTenSanPham = findViewById(R.id.txt_nameOfProduct);
        String getTenSanPham = getIntent().getStringExtra(Activity1Bai2.KEY_NAME_PRODUCT);
        txtTenSanPham.setText(getTenSanPham);



        edtProduct = findViewById(R.id.edt_priceOfProduct);
        Button btnSend = findViewById(R.id.btn_Price);
        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkPrice()){
                    float giaSanPham = Float.parseFloat( edtProduct.getText().toString());
                    Intent intent = new Intent(Activity2Bai2.this, Activity1Bai2.class);
                    intent.putExtra(KEY_PRICE_PRODUCT,giaSanPham);
                    startActivity(intent);
                }

            }
        });
    }

    private boolean checkPrice(){
        try {
            float price = Float.parseFloat(edtProduct.getText().toString());
            return true;
        }catch (Exception e){
            Toast.makeText(this, "Gía phải là số !", Toast.LENGTH_SHORT).show();
            return false;
        }
    }
}