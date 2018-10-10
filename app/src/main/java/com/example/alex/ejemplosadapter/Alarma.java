package com.example.alex.ejemplosadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.alex.ejemplosadapter.adapter.AlarmaAdapter;
import com.example.alex.ejemplosadapter.modelo.AlarmaModelo;

import java.util.ArrayList;

public class Alarma extends AppCompatActivity {
    private ListView listaAlarma;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarma);


        AlarmaAdapter adapter = new AlarmaAdapter(this, listar());
        listaAlarma = (ListView) findViewById(R.id.listaAlarma);
        listaAlarma.setAdapter(adapter);
    }


    private ArrayList<AlarmaModelo> listar(){
        String[] alarmas = getResources().getStringArray(R.array.alarmas);
        ArrayList<AlarmaModelo> lista = new ArrayList<>();
        for (String alarma2: alarmas) {
            lista.add(new AlarmaModelo(alarma2,false));
        }

        return lista;
    }
}
