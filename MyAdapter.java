package com.rt.javier.curso_app;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class MyAdapter extends BaseAdapter {

    Context context;
    int layout;
    List<String> opciones;

    public MyAdapter(Context context, int layout, List<String> opciones){
        this.context = context;
        this.layout = layout;
        this.opciones = opciones;

    }


    @Override
    public int getCount() {

        return this.opciones.size();
    }

    @Override
    public Object getItem(int position) {
        return this.opciones.get(position);
    }

    @Override
    public long getItemId(int id) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        //Copiamos la vista
        View v = convertView;

        //Inflamos la vista de nuestro Layout
        LayoutInflater layoutInflater = LayoutInflater.from(this.context);
        v = layoutInflater.inflate(R.layout.list_item, null);

        //Nos traemos el valor actual de la posicion
        String currentOpcion = opciones.get(position);

        //Referencia a los elementos que vamos a midificar
        TextView tvOpciones = v.findViewById(R.id.tvMyAdapter);
        tvOpciones.setText(currentOpcion);

        return v; //MODIFICAR ESTE RETURN
    }
}
