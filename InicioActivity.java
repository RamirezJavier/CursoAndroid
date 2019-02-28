package com.rt.javier.curso_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;


public class InicioActivity extends AppCompatActivity {

    Button Calculo1, Calculo2, Calculo3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        Calculo1 = findViewById(R.id.btCalculo1);
        Calculo2 = findViewById(R.id.btCalculo2);
        Calculo3 = findViewById(R.id.btCalculo3);


        Calculo1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(InicioActivity.this, Calculo1Activity.class));

            }
        });








    }
}