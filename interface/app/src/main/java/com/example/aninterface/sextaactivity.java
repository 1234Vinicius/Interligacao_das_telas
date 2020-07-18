package com.example.aninterface;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class sextaactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sextaactivity);
    }
    public void proximaTela5(View view) {
        Intent intent = new Intent(this, setimaactivity.class);
        startActivity(intent);
}
}