package com.example.admin.pruebat2adrianmarcosgarcia;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MySplash extends AppCompatActivity implements Animation.AnimationListener{

    ImageView iv_imagen_splash;
    TextView tv_texto_splash;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_splash);

        getSupportActionBar().hide();

        iv_imagen_splash =(ImageView)findViewById(R.id.iv_imagen_splash);
        tv_texto_splash = (TextView)findViewById(R.id.tv_texto_splash);

        Typeface fuente1 = Typeface.createFromAsset(getAssets(), "AmaticSC-Regular.ttf");
        tv_texto_splash.setTypeface(fuente1);

        Animation anim1 = AnimationUtils.loadAnimation(this, R.anim.animacion1);
        Animation anim2 = AnimationUtils.loadAnimation(this, R.anim.animacion2);

        iv_imagen_splash.startAnimation(anim2);
        tv_texto_splash.startAnimation(anim1);

        anim2.setAnimationListener(this);
    }

    @Override
    public void onAnimationStart(Animation animation) {

    }

    @Override
    public void onAnimationEnd(Animation animation) {

        Intent intent = new Intent(MySplash.this, MyLogin.class);
        intent.addFlags(intent.FLAG_ACTIVITY_NEW_TASK);
        intent.addFlags(intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
        finish();
    }

    @Override
    public void onAnimationRepeat(Animation animation) {

    }
}
