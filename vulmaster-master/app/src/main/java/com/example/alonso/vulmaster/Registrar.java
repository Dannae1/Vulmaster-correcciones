package com.example.alonso.vulmaster;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Registrar extends AppCompatActivity {

    Button registrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar);

        registrar = (Button)findViewById(R.id.btnregistrar2);
        //Decimos que "ingresar" al boton declarado en el activity_ingresar el cual nombramos btn Registrar de acuerdo a su ID
        registrar.setOnClickListener(new View.OnClickListener()


        {
            @Override
            public void onClick(View v) {
                Intent registrar = new Intent(Registrar.this,exito.class);
                //Creamos un intent de ingresar donde es igual a un nuevo intent en el cual decimos que estamos declarando
                //en la actividad INGRESAR y que nos va a llevar a la actividad REGISTRO
                startActivity(registrar);
                //StartActivity es para accionar el tranlado de activity

            }
        });


    }



}

