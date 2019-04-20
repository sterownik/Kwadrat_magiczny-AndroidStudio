package com.example.wojtek.myapplication;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
  public Button button22,button23,button24,button25,button26,button27,button28,button29,button30,button32;
    EditText editText,editText2,editText3;
    public TextView textView8,textView9,textView10,textView5,textView6,textView7;
    int b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        final EditText editText = (EditText)findViewById(R.id.editText);
        final EditText editText2 = (EditText)findViewById(R.id.editText2);
        final EditText editText3 = (EditText)findViewById(R.id.editText3);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        final TextView textView5 = (TextView)findViewById(R.id.textView5);
        final TextView textView6 = (TextView)findViewById(R.id.textView6);
        final TextView textView7 = (TextView)findViewById(R.id.textView7);
        final TextView textView8 = (TextView)findViewById(R.id.textView8);
        final TextView textView9 = (TextView)findViewById(R.id.textView9);
        final TextView textView10 = (TextView)findViewById(R.id.textView10);

        final Button button22 = (Button)findViewById(R.id.button22);
        final Button button23 = (Button)findViewById(R.id.button23);
        final  Button button24 = (Button)findViewById(R.id.button24);
        final  Button button25 = (Button)findViewById(R.id.button25);
        final  Button button26 = (Button)findViewById(R.id.button26);
        final  Button button27 = (Button)findViewById(R.id.button27);
        final  Button button28 = (Button)findViewById(R.id.button28);
        final  Button button29 = (Button)findViewById(R.id.button29);
        final  Button button30 = (Button)findViewById(R.id.button30);
        final  Button button32 = (Button)findViewById(R.id.button32);

        /*button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button23.setText(editText.getText());

            }
        });*/
        button32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               /* b1=Integer.parseInt(editText.getText().toString());
                button22.setText(b1+" ");*/
               b1 = Integer.parseInt(editText.getText().toString());
               b2 = Integer.parseInt(editText2.getText().toString());
               b3 = Integer.parseInt(editText3.getText().toString());
               if(b1 <= b2+b3)
               {
                   Toast.makeText(getApplicationContext(),"Suma liczb B i C musi być mniejsza niż A",Toast.LENGTH_LONG).show();
                   editText.getText().clear();
                   editText2.getText().clear();
                   editText3.getText().clear();
               }
               else if ((b2/b3)==(0.5))
               {
                    Toast.makeText(getApplicationContext(),"Dzielenie B przez C ma być różne od 1/2",Toast.LENGTH_LONG).show();
                   editText.getText().clear();
                   editText2.getText().clear();
                   editText3.getText().clear();
               }
               else if( b1 < 0 || b2 < 0 || b3 < 0)
               {
                   Toast.makeText(getApplicationContext(),"Liczby musza być dodatnie",Toast.LENGTH_LONG).show();
                   editText.getText().clear();
                   editText2.getText().clear();
                   editText3.getText().clear();
               }
               else
               {
                   button22.setText(b1-b2+" ");
                   button23.setText(b1+b2-b3+" ");
                   button24.setText(b1+b3+" ");
                   button25.setText(b1+b2+b3+" ");
                   button26.setText(b1+" ");
                   button27.setText(b1-b2-b3+" ");
                   button28.setText(b1-b3+" ");
                   button29.setText(b1-b2+b3+ " ");
                   button30.setText(b1+b2+" ");

                   textView5.setText(3*b1+" ");
                   textView6.setText(3*b1+" ");
                   textView7.setText(3*b1+" ");
                   textView8.setText(3*b1+" ");
                   textView9.setText(3*b1+" ");
                   textView10.setText(3*b1+" ");



               }

            }
        });
        button22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Wzór na Liczbę to A - B ",Toast.LENGTH_LONG).show();
            }
        });
        button23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Wzór na Liczbę to A + B - C",Toast.LENGTH_LONG).show();
            }
        });
        button24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Wzór na Liczbę to A + C",Toast.LENGTH_LONG).show();
            }
        });
        button25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Wzór na Liczbę to A + B + C",Toast.LENGTH_LONG).show();
            }
        });
        button26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Wzór na Liczbę to A",Toast.LENGTH_LONG).show();
            }
        });
        button27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Wzór na Liczbę to A - B - C",Toast.LENGTH_LONG).show();
            }
        });
        button28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Wzór na Liczbę to A - C",Toast.LENGTH_LONG).show();
            }
        });
        button29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Wzór na Liczbę to A - B + C",Toast.LENGTH_LONG).show();
            }
        });
        button30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Wzór na Liczbę to A + B",Toast.LENGTH_LONG).show();
            }
        });
    }


}
