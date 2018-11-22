package com.example.hp.duan1;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.TextView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class HanoiMausoleumPlace extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private RatingBar ratingBar;
    private TextView tvRateCount, tvRateMessage;
    private float ratedValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hanoi_hoan_kiem_place);
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        ratingBar = findViewById(R.id.ratingBar);
        tvRateCount = findViewById(R.id.tvRateCount);
        tvRateMessage = findViewById(R.id.tvRateMessage);

        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                ratedValue = ratingBar.getRating();
                tvRateCount.setText("Your Rating: " + ratedValue + "/5. ");
                if (ratedValue < 1) {
                    tvRateMessage.setText("Oh no...");
                } else if (ratedValue < 2) {
                    tvRateMessage.setText("Ok.");
                } else if (ratedValue < 3) {
                    tvRateMessage.setText("Not bad.");
                } else if (ratedValue < 4) {
                    tvRateMessage.setText("Nice.");
                } else if (ratedValue < 5) {
                    tvRateMessage.setText("Very Nice.");
                } else if (ratedValue == 5) {
                    tvRateMessage.setText("Thank You...!!!");
                }
            }
        });
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng sydney = new LatLng(21.03685, 105.834655);
        mMap.addMarker(new MarkerOptions().position(sydney).title("Ho Chi Minh Mausoleum"));
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(sydney, 15f));
    }
}
