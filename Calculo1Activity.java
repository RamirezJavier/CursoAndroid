package com.rt.javier.curso_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Calculo1Activity extends AppCompatActivity {

    EditText valor_a, valor_b, valor_c;
    Button btCalcular;
    TextView showResultado;
    double x1, x2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculo1);

        valor_a = findViewById(R.id.etValor_a);
        valor_b = findViewById(R.id.etValor_b);
        valor_c = findViewById(R.id.etValor_c);
        btCalcular = findViewById(R.id.btCalcularX);
        showResultado = findViewById(R.id.tvResultado);


        btCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double a = Double.parseDouble(valor_a.getText().toString());
                double b = Double.parseDouble(valor_b.getText().toString());
                double c = Double.parseDouble(valor_c.getText().toString());

                double d = ((b*b)-4*a*c);

                if(d<0){
                    showResultado.setText("No existen soluciones reales :(");
                }
                else{
                    x1 = (-b + Math.sqrt(d)) / (2*a);
                    x2 = (-b - Math.sqrt(d)) / (2*a);

                    showResultado.setText("Solucion x1= "+x1 + "\n Solución x2= "+x2);
                }



            }
        });


    }
}
