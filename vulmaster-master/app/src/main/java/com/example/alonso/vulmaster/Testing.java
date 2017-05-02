package com.example.alonso.vulmaster;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Testing extends AppCompatActivity {
    Button deporte;
    Button Regresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testing);

        deporte = (Button)findViewById(R.id.btndeportes);
        //Decimos que "ingresar" al boton declarado en el activity_ingresar el cual nombramos btn Registrar de acuerdo a su ID
        deporte.setOnClickListener(new View.OnClickListener()


        {
            @Override
            public void onClick(View v) {
                Intent deporte = new Intent(Testing.this,deporte.class);
                //Creamos un intent de ingresar donde es igual a un nuevo intent en el cual decimos que estamos declarando
                //en la actividad INGRESAR y que nos va a llevar a la actividad REGISTRO
                startActivity(deporte);
                //StartActivity  accionar el tranlado de activity

            }
        });

        Regresar = (Button)findViewById(R.id.btnSalir);
        //Decimos que "ingresar" al boton declarado en el activity_ingresar el cual nombramos btn Registrar de acuerdo a su ID
        Regresar.setOnClickListener(new View.OnClickListener()


        {
            @Override
            public void onClick(View v) {
                Intent Regresar = new Intent(Testing.this,Inicio.class);
                //Creamos un intent de ingresar donde es igual a un nuevo intent en el cual decimos que estamos declarando
                //en la actividad INGRESAR y que nos va a llevar a la actividad REGISTRO
                startActivity(Regresar);
                //StartActivity  accionar el tranlado de activity

            }
        });
    }
}
