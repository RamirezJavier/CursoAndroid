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

        //View Holder Pattern
        ViewHolder holder;

        if(convertView==null)
        {
            //Inflamos la vista de nuestro Layout
            LayoutInflater layoutInflater = LayoutInflater.from(this.context);
            convertView = layoutInflater.inflate(this.layout, null);

            holder = new ViewHolder(); //Nueva instancia del holder
            //Referencia a los elementos que vamos a modificar
            holder.nameTextView = convertView.findViewById(R.id.tvMyAdapter);
            convertView.setTag(holder); //Meter un objeto
        }
        else
        {
            holder = (ViewHolder) convertView.getTag();
        }

        //Nos traemos el valor actual de la posicion
        String currentOpcion = opciones.get(position);

        holder.nameTextView.setText(currentOpcion);

        return convertView; //MODIFICAR ESTE RETURN
    }

    static class ViewHolder {
        private TextView nameTextView;
    }
}
