package com.example.camilo.motocompare;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Evaluacion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_evaluacion);

        Intent intent2 = getIntent();
    }

    public void motoActivity(View view) {
        Intent intent = new Intent(this, MotoActivity.class);
        startActivity(intent);

    }
}
