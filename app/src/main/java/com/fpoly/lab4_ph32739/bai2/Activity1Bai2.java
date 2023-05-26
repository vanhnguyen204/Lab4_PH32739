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

import org.w3c.dom.Text;

public class Activity1Bai2 extends AppCompatActivity {
    EditText edtProduct;
    public static String KEY_NAME_PRODUCT = "tenSanPham";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity1_bai2);

        edtProduct = findViewById(R.id.edt_product);

        Button btnSend = findViewById(R.id.btn_send);

        TextView txtGiaSanPham = findViewById(R.id.txt_giaBaoSP);
        float giaSp = getIntent().getFloatExtra(Activity2Bai2.KEY_PRICE_PRODUCT, 0);
        txtGiaSanPham.setText(giaSp + ""+"VNĐ");
        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getNameProduct = edtProduct.getText().toString();
                if (getNameProduct.length() == 0 || getNameProduct.trim().equals("")) {
                    Toast.makeText(Activity1Bai2.this, "Bạn phải nhập tên của sản phẩm muốn mua !", Toast.LENGTH_SHORT).show();
                } else {
                    Intent intent = new Intent(Activity1Bai2.this, Activity2Bai2.class);
                    intent.putExtra(KEY_NAME_PRODUCT, getNameProduct);
                    startActivity(intent);
                }

            }
        });
    }


}