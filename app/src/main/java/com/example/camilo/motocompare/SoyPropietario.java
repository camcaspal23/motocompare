package com.example.camilo.motocompare;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class SoyPropietario extends AppCompatActivity {

    Spinner spinner_marca, spinner_cilindraje;
    ArrayAdapter<CharSequence> adapter_marca, adapter_cilindraje;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soy_propietario);

        spinner_marca = (Spinner) findViewById(R.id.spinner_marca);
        adapter_marca = ArrayAdapter.createFromResource(this, R.array.marcas, android.R.layout.simple_spinner_item);
        adapter_marca.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_marca.setAdapter(adapter_marca);

        spinner_cilindraje = (Spinner) findViewById(R.id.spinner_cilindraje);
        adapter_cilindraje = ArrayAdapter.createFromResource(this, R.array.cilindrajes, android.R.layout.simple_spinner_item);
        adapter_cilindraje.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_cilindraje.setAdapter(adapter_cilindraje);

        Intent intent = getIntent();
    }
}
