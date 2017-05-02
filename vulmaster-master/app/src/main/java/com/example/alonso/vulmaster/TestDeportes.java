package com.example.alonso.vulmaster;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TestDeportes extends AppCompatActivity {
    Button Enviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_deportes);

        Enviar = (Button)findViewById(R.id.btnenviar);
        //Decimos que "ingresar" al boton declarado en el activity_ingresar el cual nombramos btn Registrar de acuerdo a su ID
        Enviar.setOnClickListener(new View.OnClickListener()


        {
            @Override
            public void onClick(View v) {
                Intent Enviar = new Intent(TestDeportes.this,deporte.class);
                //Creamos un intent de ingresar donde es igual a un nuevo intent en el cual decimos que estamos declarando
                //en la actividad INGRESAR y que nos va a llevar a la actividad REGISTRO
                startActivity(Enviar);
                //StartActivity es para accionar el tranlado de activity

            }
        });
    }
}
