package com.example.alex.ejemplosadapter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void alarmas(View view) {
        Intent alarma = new Intent(getApplicationContext(),Alarma.class);
        startActivity(alarma);
    }
    public void reproductor(View view){
        Intent repro = new Intent(getApplicationContext(),Reproductor.class);
        startActivity(repro);
    }
}
