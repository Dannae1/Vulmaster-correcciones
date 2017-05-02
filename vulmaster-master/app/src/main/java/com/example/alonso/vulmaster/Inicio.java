package com.example.alonso.vulmaster;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Inicio extends AppCompatActivity {
    Button ingreso;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);

        ingreso = (Button)findViewById(R.id.btningreso);
        //Decimos que "ingresar" al boton declarado en el activity_ingresar el cual nombramos btn Registrar de acuerdo a su ID
        ingreso.setOnClickListener(new View.OnClickListener()


        {
            @Override
            public void onClick(View v) {
                Intent ingreso = new Intent(Inicio.this,Ingresar.class);
                //Creamos un intent de ingresar donde es igual a un nuevo intent en el cual decimos que estamos declarando
                //en la actividad INGRESAR y que nos va a llevar a la actividad REGISTRO
                startActivity(ingreso);
                //StartActivity es para accionar el tranlado de activity

            }
        });
    }
}
