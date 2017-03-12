package com.example.camilo.motocompare;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class BuscandoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buscando);
    }

    public void buscandoActivity(View view) {
        Intent intent = new Intent(this, MotoActivity.class);
        startActivity(intent);

    }
}
