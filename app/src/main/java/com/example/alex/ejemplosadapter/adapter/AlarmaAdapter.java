package com.example.alex.ejemplosadapter.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;

import com.example.alex.ejemplosadapter.R;
import com.example.alex.ejemplosadapter.modelo.AlarmaModelo;

import java.util.List;

public class AlarmaAdapter extends ArrayAdapter<AlarmaModelo>{

    public AlarmaAdapter(@NonNull Context context, List<AlarmaModelo> objetos) {
        super(context, R.layout.list_template,objetos);
    }

    @NonNull
    @Override
    public View getView(final int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View view = convertView;
        if (convertView == null){
            view = inflater.inflate(R.layout.list_template,null);
        }

        TextView hora = (TextView) view.findViewById(R.id.hora);
        final TextView activo = (TextView) view.findViewById(R.id.activo);
        Switch btnActivo = (Switch) view.findViewById(R.id.btnActivo);

        hora.setText(getItem(position).getHora());
        if (getItem(position).isActivo())activo.setText("Activado");
        else activo.setText("Desactivado");

        btnActivo.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    activo.setText("Activado");
                    getItem(position).setActivo(isChecked);
                }else {
                    activo.setText("Desactivado");
                    getItem(position).setActivo(isChecked);
                }
            }
        });

        return view;

    }
}
