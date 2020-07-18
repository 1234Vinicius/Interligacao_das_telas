package com.example.aninterface;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class quintaactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quintaactivity);
    }

    public void proximaTela4(View view) {
        Intent intent = new Intent(this, sextaactivity.class);
        startActivity(intent);

    }
}