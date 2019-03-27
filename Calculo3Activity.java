package com.rt.javier.curso_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Calculo3Activity extends AppCompatActivity {

    ListView lvOpciones;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculo3);

        lvOpciones = findViewById(R.id.lvOpciones);

        //Datos a mostrar
        final List<String>opciones = new ArrayList<>();
        opciones.add("Resolver ecuacion cuadratica");
        opciones.add("Hipotenusa de un triangulo");
        opciones.add("Radio de un circulo");
        opciones.add("Resolver ecuacion cuadratica");
        opciones.add("Hipotenusa de un triangulo");
        opciones.add("Radio de un circulo");
        opciones.add("Resolver ecuacion cuadratica");
        opciones.add("Hipotenusa de un triangulo");
        opciones.add("Radio de un circulo");
        opciones.add("Resolver ecuacion cuadratica");
        opciones.add("Hipotenusa de un triangulo");
        opciones.add("Radio de un circulo");
        opciones.add("Resolver ecuacion cuadratica");
        opciones.add("Hipotenusa de un triangulo");
        opciones.add("Radio de un circulo");
        opciones.add("Resolver ecuacion cuadratica");
        opciones.add("Hipotenusa de un triangulo");
        opciones.add("Radio de un circulo");



        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, opciones);

        lvOpciones.setAdapter(adapter);

        lvOpciones.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(Calculo3Activity.this, "Le diste click a: " + opciones.get(position), Toast.LENGTH_SHORT).show();

            }
        });

        //Enlanzar el contenido con nuestro adaptador cool
        MyAdapter myAdapter = new MyAdapter(this, R.layout.list_item, opciones);
        lvOpciones.setAdapter(myAdapter);


    }
}





