package com.example.alonso.vulmaster;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class deporte extends AppCompatActivity {
    Button regresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deporte);

        regresar = (Button)findViewById(R.id.btnregresar);
        //Decimos que "ingresar" al boton declarado en el activity_ingresar el cual nombramos btn Registrar de acuerdo a su ID
        regresar.setOnClickListener(new View.OnClickListener()


        {
            @Override
            public void onClick(View v) {
                Intent regresar = new Intent(deporte.this,Testing.class);
                //Creamos un intent de ingresar donde es igual a un nuevo intent en el cual decimos que estamos declarando
                //en la actividad INGRESAR y que nos va a llevar a la actividad REGISTRO
                startActivity(regresar);
                //StartActivity es para accionar el tranlado de activity

            }
        });
    }
}
