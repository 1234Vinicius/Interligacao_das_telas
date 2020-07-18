package com.example.aninterface;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class setimaactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setimaactivity);
    }
    public void proximaTela6 (View view) {
        Intent intent = new Intent(this, oitoactivity.class);
        startActivity(intent);
}
}