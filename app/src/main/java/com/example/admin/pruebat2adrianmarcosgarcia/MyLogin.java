package com.example.admin.pruebat2adrianmarcosgarcia;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MyLogin extends AppCompatActivity {

    TextView id_titulo_login,tv_registro_login;
    EditText et_login_nombre,et_login_contra;
    Button bt_login_entrar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_login);

        getSupportActionBar().hide();

        id_titulo_login = (TextView)findViewById(R.id.id_titulo_login);
        tv_registro_login = (TextView)findViewById(R.id.tv_registro_login);
        bt_login_entrar = (Button) findViewById(R.id.bt_login_entrar);

        Typeface fuente1 = Typeface.createFromAsset(getAssets(), "AmaticSC-Regular.ttf");
        id_titulo_login.setTypeface(fuente1);

        bt_login_entrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MyLogin.this, MyMain.class);
                startActivity(intent);
                finish();
            }
        });

    }
}
