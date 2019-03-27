package com.rt.javier.curso_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class GridActivity extends AppCompatActivity {

    GridView gridView;
    List<String> opciones;
    MyAdapter myAdapter;

    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid);

        gridView = findViewById(R.id.gridview);

        //Datos a mostrar
        opciones = new ArrayList<String>();
        opciones.add("Resolver ecuacion cuadratica");
        opciones.add("Hipotenusa de un triangulo");
        opciones.add("Radio de un circulo");
        opciones.add("Resolver ecuacion cuadratica");
        opciones.add("Hipotenusa de un triangulo");



        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Toast.makeText(GridActivity.this, "Le diste click a: " + opciones.get(position), Toast.LENGTH_SHORT).show();

            }
        });

        //Enlanzar el contenido con nuestro adaptador cool
        myAdapter = new MyAdapter(this, R.layout.grid_item, opciones);
        gridView.setAdapter(myAdapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.action_bar_menu, menu);

        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case R.id.add_item:
                this.opciones.add("Agregaste #"+(++counter));
                this.myAdapter.notifyDataSetChanged();
                return true;

            default:
                return super.onOptionsItemSelected(item);

        }
    }
}
