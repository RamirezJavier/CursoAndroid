package com.rt.javier.curso_app;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class Calculo2Activity extends AppCompatActivity {

    Button btCalcular, btBorrar;
    EditText etCatetoC, etCatetoB;
    TextView tvResultado, tvError;
    double resultado;
    AlertDialog.Builder dAdvertencia;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculo2);

        //Botones
        btCalcular = findViewById(R.id.btCalcular);
        btBorrar = findViewById(R.id.btBorrar);

        //EditText
        etCatetoC = findViewById(R.id.etCatetoC);
        etCatetoB = findViewById(R.id.etCatetoB);

        //TextView
        tvResultado = findViewById(R.id.tvResultado);
        tvError = findViewById(R.id.tvError);


        //Click en el boton calcular
        btCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(etCatetoC.getText().toString().length() == 0){

                    dAdvertencia = new AlertDialog.Builder(Calculo2Activity.this);
                    dAdvertencia.setTitle("Error!!");
                    dAdvertencia.setMessage("No has ingresado el valor del cateto C");
                    dAdvertencia.setCancelable(false);

                    dAdvertencia.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            //dialog.cancel();
                            dialog.cancel();
                            etCatetoC.requestFocus();
                            tvError.setVisibility(View.VISIBLE);
                        }
                    });
                    dAdvertencia.show();

                }
                else if (etCatetoB.getText().toString().length()==0){

                    dAdvertencia = new AlertDialog.Builder(Calculo2Activity.this);
                    dAdvertencia.setTitle("Error!!");
                    dAdvertencia.setMessage("No has ingresado el valor del cateto B");
                    dAdvertencia.setCancelable(false);
                    dAdvertencia.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            //dialog.cancel();
                            dialog.cancel();
                            etCatetoB.requestFocus();
                        }
                    });
                    dAdvertencia.show();


                }
                else{
                    //Forma 1
                    double cateto_b;
                    String b = etCatetoB.getText().toString();
                    cateto_b = Double.parseDouble(b);

                    //Forma 2
                    double cateto_c = Double.parseDouble(etCatetoC.getText().toString());

                    tvError.setVisibility(View.INVISIBLE);

                    resultado = Math.pow((Math.pow(cateto_b, 2.0)) + (Math.pow(cateto_c, 2.0)), 0.5);
                    //resultado = Math.sqrt( (Math.pow(cateto_b, 2.0)) + (Math.pow(cateto_c, 2.0)) );
                    //resultado = Math.sqrt( (cateto_b*cateto_b) + (cateto_c*cateto_c));

                    //Mostrar resultado
                    //tvResultado.setText("La hipotenusa es: "+ resultado);
                    tvResultado.setText("La hipotenusa es: " + String.valueOf(resultado));
                }


                
            }
        });


        btBorrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                etCatetoC.setText("");
                etCatetoB.setText("");
                tvResultado.setText("");

                //Cursor se "vaya" al EditText del cateto c
                etCatetoC.requestFocus();

            }
        });






    }
}
