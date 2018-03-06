package com.example.admin.pruebat2adrianmarcosgarcia;

import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MyMain extends AppCompatActivity {

    SwipeRefreshLayout srl_main_refrescar;
    LinearLayout id_contenedor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_main);

        srl_main_refrescar = (SwipeRefreshLayout) findViewById(R.id.srl_main_refrescar);
        srl_main_refrescar.setOnRefreshListener(refrescarTablon);

        id_contenedor = (LinearLayout)findViewById(R.id.id_contenedor);
    }

    protected SwipeRefreshLayout.OnRefreshListener refrescarTablon = new SwipeRefreshLayout.OnRefreshListener() {
        @Override
        public void onRefresh() {

            Snackbar mensaje = Snackbar.make(id_contenedor,"lost your FOX?",Snackbar.LENGTH_LONG);

            //Podemos colocar un boton en el SnackBar
            mensaje.setAction("UNDO", new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    //Creamos un toast para que nos diga que hemos clicado ese boton
                    Toast.makeText(MyMain.this, "Don´t care", Toast.LENGTH_LONG).show();
                }
            });
            mensaje.show();
            srl_main_refrescar.setRefreshing(false);
        }
    };

    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.derecho,menu);
        return true;
    }

    //Creamos los eventos para la seleccion de las opciones del menu
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.opciones) {
            Toast.makeText(this, "Options", Toast.LENGTH_LONG).show();
        } else if (id == R.id.fox) {
            Toast.makeText(this, "Take a fox", Toast.LENGTH_LONG).show();
        }

        return super.onOptionsItemSelected(item);
    }


}
