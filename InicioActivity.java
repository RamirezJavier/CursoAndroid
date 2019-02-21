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

    Button btnSaludar;
    TextView tvMensaje;
    RadioButton rbIsHombre;
    RadioButton rbIsMujer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        btnSaludar = findViewById(R.id.btnEnviarSaludo);
        tvMensaje = findViewById(R.id.tvMensaje);
        rbIsHombre = findViewById(R.id.rbHombre);
        rbIsMujer = findViewById(R.id.rbMujer);


        btnSaludar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(rbIsHombre.isChecked()==true)
                {
                    tvMensaje.setText("Bienvenido");
                }
                else if(rbIsMujer.isChecked()==true)
                {
                    tvMensaje.setText("Bienvenida");
                    startActivity(new Intent(InicioActivity.this, Menu.class));
                }
                else
                {
                    Toast.makeText(getApplicationContext(), "Tienes que elegir uno, xd ", Toast.LENGTH_SHORT).show();
                }

            }
        });





    }
}
