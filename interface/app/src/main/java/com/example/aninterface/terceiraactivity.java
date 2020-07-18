package com.example.aninterface;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class terceiraactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terceiraactivity);
    }

    public void proximaTela2(View view) {
        Intent intent = new Intent(this, quartaactivity.class);
        startActivity(intent);
    }
}