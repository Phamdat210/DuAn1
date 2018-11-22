package com.example.hp.duan1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ManHinhChinh extends AppCompatActivity {
    private Button btnHanoi;
    private Button btnDanang;
    private Button btnHochiminh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_man_hinh_chinh);

        btnHanoi = (Button) findViewById(R.id.btnHanoi);
        btnDanang = (Button) findViewById(R.id.btnDanang);
        btnHochiminh = (Button) findViewById(R.id.btnHochiminh);

        btnHanoi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ManHinhChinh.this,Hanoi.class);
                startActivity(intent);
            }
        });

        btnDanang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ManHinhChinh.this,DaNang.class);
                startActivity(intent);
            }
        });

        btnHochiminh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ManHinhChinh.this,HoChiMinh.class);
                startActivity(intent);
            }
        });
    }
}
