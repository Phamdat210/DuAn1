package com.example.hp.duan1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class HaNoiPlace extends AppCompatActivity {
    private Button btnHanoiHoanKiem;
    private Button btnHanoiMausoleum;
    private Button btnHanoiVanMieu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ha_noi_place);

        btnHanoiHoanKiem = (Button) findViewById(R.id.btnHanoiHoanKiem);
        btnHanoiMausoleum = (Button) findViewById(R.id.btnHanoiMausoleum);
        btnHanoiVanMieu = (Button) findViewById(R.id.btnHanoiVanMieu);

        btnHanoiHoanKiem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HaNoiPlace.this,HanoiHoanKiemPlace.class);
                startActivity(intent);
            }
        });

        btnHanoiMausoleum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HaNoiPlace.this,HanoiMausoleumPlace.class);
                startActivity(intent);
            }
        });

        btnHanoiVanMieu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HaNoiPlace.this,HanoiVanMieuPlace.class);
                startActivity(intent);
            }
        });
    }
}
