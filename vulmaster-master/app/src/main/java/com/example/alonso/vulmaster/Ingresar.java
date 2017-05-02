package com.example.alonso.vulmaster;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

public class Ingresar extends AppCompatActivity {

    Button ingresar;
    Button Aceptar;
//Declaras la variable Boton y la nombras "ingresar"

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingresar);

        ingresar = (Button)findViewById(R.id.btnRegistrar);
        //Decimos que "ingresar" al boton declarado en el activity_ingresar el cual nombramos btn Registrar de acuerdo a su ID
        ingresar.setOnClickListener(new View.OnClickListener()


        {
            @Override
            public void onClick(View v) {
                Intent ingresar = new Intent(Ingresar.this,Registrar.class);
                //Creamos un intent de ingresar donde es igual a un nuevo intent en el cual decimos que estamos declarando
                //en la actividad INGRESAR y que nos va a llevar a la actividad REGISTRO
                startActivity(ingresar);
                //StartActivity es para accionar el tranlado de activity

            }
        });

        Aceptar = (Button)findViewById(R.id.btnaceptar);
        //Decimos que "ingresar" al boton declarado en el activity_ingresar el cual nombramos btn Registrar de acuerdo a su ID
        Aceptar.setOnClickListener(new View.OnClickListener()


        {
            @Override
            public void onClick(View v) {
                Intent aceptar = new Intent(Ingresar.this,Testing.class);
                //Creamos un intent de ingresar donde es igual a un nuevo intent en el cual decimos que estamos declarando
                //en la actividad INGRESAR y que nos va a llevar a la actividad REGISTRO
                startActivity(aceptar);
                //StartActivity es para accionar el tranlado de activity

            }
        });


    }

        }

