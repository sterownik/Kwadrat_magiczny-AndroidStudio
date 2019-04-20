package com.example.wojtek.myapplication;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.ExtractedText;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    Button button;
    Button button2,button4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button)findViewById(R.id.button);
        Button button2 = (Button)findViewById(R.id.button2);
        Button button4 = (Button)findViewById(R.id.button4);
        button.setBackgroundColor(Color.GREEN);
        button2.setBackgroundColor(Color.CYAN);
        button4.setBackgroundColor(Color.RED);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Main3Activity.class);
                startActivity(intent);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                System.exit(0);
            }
        });

    }

   public void onClickMagic  (View view)
    {
        Intent intent = new Intent(this,Main2Activity.class);
        startActivity(intent);
    }





}
