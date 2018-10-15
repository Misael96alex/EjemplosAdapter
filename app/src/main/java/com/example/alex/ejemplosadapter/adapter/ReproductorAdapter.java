package com.example.alex.ejemplosadapter.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.alex.ejemplosadapter.R;
import com.example.alex.ejemplosadapter.modelo.ReproductorModelo;

import java.util.ArrayList;

public class ReproductorAdapter extends BaseAdapter {
    private Context context;
    private ArrayList<ReproductorModelo> canciones;

    public ReproductorAdapter(Context context, ArrayList<ReproductorModelo> canciones) {
        this.context = context;
        this.canciones = canciones;
    }
    public ArrayList<ReproductorModelo> getCanciones(){
         return canciones;
    }

    @Override
    public int getCount() {return canciones.size(); }

    @Override
    public ReproductorModelo getItem(int position) {return canciones.get(position); }

    @Override
    public long getItemId(int position) { return position; }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View cancionObj = convertView;

        if (convertView == null){
            cancionObj = inflater.inflate(R.layout.cancion_template,null);
        }
        final TextView txtCancion = (TextView) cancionObj.findViewById(R.id.txt_cancion);
        TextView txtArtista = (TextView) cancionObj.findViewById(R.id.txt_artista);

        txtCancion.setText(getItem(position).getCancion());
        txtArtista.setText(getItem(position).getArtista());

        return cancionObj;

    }
}
