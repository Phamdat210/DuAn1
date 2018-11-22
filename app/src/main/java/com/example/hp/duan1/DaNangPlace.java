package com.example.hp.duan1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class DaNangPlace extends AppCompatActivity {
    private Button btnDanangHoiAn;
    private Button btnDanangBridge;
    private Button btnDanangPeninsula;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_da_nang_place);

        btnDanangHoiAn = (Button) findViewById(R.id.btnDanangHoiAn);
        btnDanangBridge = (Button) findViewById(R.id.btnDanangBridge);
        btnDanangPeninsula = (Button) findViewById(R.id.btnDanangPeninsula);

        btnDanangHoiAn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DaNangPlace.this,DaNangHoiAnPlace.class);
                startActivity(intent);
            }
        });
        btnDanangBridge.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DaNangPlace.this,DaNangDragonBridgePlace.class);
                startActivity(intent);
            }
        });
        btnDanangPeninsula.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DaNangPlace.this,DaNangPeninsulaPlace.class);
                startActivity(intent);
            }
        });

    }
}
