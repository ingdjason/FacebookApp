package com.cetemoh.facebookapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvName;
    String name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setDisplayShowHomeEnabled(true);


        tvName = findViewById(R.id.tvName);
        name = getIntent().getStringExtra("nom");
        tvName.setText(name);
        getIntent().getIntExtra("number",0);

        getSupportActionBar().setTitle("Votre nom est "+name);
        getSupportActionBar().setLogo(R.mipmap.ic_launcher);
        getSupportActionBar().setDisplayUseLogoEnabled(true);


    }
}
