package com.example.alex.ejemplosadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.alex.ejemplosadapter.adapter.ReproductorAdapter;
import com.example.alex.ejemplosadapter.modelo.ReproductorModelo;

import java.util.ArrayList;

public class Reproductor extends AppCompatActivity {
    private ListView listCanciones;
    private ReproductorAdapter adapter;
    private Button btnAgregar;
    private EditText edtCancion, edtArtista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reproductor);
        createList();
        agregarCancion();
    }
    private ArrayList<ReproductorModelo> listar(){
        ArrayList<ReproductorModelo> lista = new ArrayList<>();
        lista.add(new ReproductorModelo("Cancion 1", "Artista 1"));
        lista.add(new ReproductorModelo("Cancion 2", "Artista 2"));

        return lista;
    }

    private void createList(){
        adapter = new ReproductorAdapter(this, listar());
        listCanciones = (ListView) findViewById(R.id.list_canciones);
        listCanciones.setAdapter(adapter);
        listCanciones.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                TextView txtReproduccion = (TextView) findViewById(R.id.txt_reproduccion);
                txtReproduccion.setText("Reproduciendo: " + adapter.getCanciones().get(position).getCancion());
            }
        });
    }

    private void agregarCancion(){
        btnAgregar = (Button) findViewById(R.id.btn_agregar);
        edtCancion = (EditText) findViewById(R.id.edt_cancion);
        edtArtista = (EditText) findViewById(R.id.edt_artista);
        btnAgregar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edtArtista.getText().toString().equals("")
                        || edtCancion.getText().toString().equals("")){

                    Toast.makeText(getApplicationContext(),"Complete las casillas de texto",
                            Toast.LENGTH_SHORT).show();

                }else {
                    adapter.getCanciones().add(new ReproductorModelo(
                            edtCancion.getText().toString(),
                            edtArtista.getText().toString()));
                    adapter.notifyDataSetChanged();
                    edtCancion.setText("");
                    edtArtista.setText("");
                }
            }
        });
    }
}
