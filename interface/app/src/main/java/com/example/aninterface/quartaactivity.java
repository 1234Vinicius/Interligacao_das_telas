package com.example.aninterface;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class quartaactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quartaactivity);
    }

    public void proximaTela3(View view) {

        Intent intent = new Intent(this, quintaactivity.class);
        startActivity(intent);
    }
}