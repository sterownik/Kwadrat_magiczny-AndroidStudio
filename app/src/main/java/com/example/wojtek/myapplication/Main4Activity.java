package com.example.wojtek.myapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import static android.view.Window.FEATURE_NO_TITLE;
import static android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN;

public class Main4Activity extends AppCompatActivity {
    TextView textView14;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().setFlags(FLAG_FULLSCREEN, FLAG_FULLSCREEN);//USTWIAM FLAGI
        requestWindowFeature(FEATURE_NO_TITLE);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ImageView imageView = (ImageView)findViewById(R.id.imageView);
        imageView.setImageResource(R.drawable.obraz);
        TextView textView14 = (TextView)findViewById(R.id.textView14);
        textView14.setText("Albrecht Dürer 1514, w prawym górnym rogu można zauważyć 'kwadrat magiczny'");

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
