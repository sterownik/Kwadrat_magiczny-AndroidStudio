package com.example.wojtek.myapplication;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    TextView textView;
    TextView textView11;
    TextView textView12;
    TextView textView13;
    Button button3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        TextView textView = (TextView)findViewById(R.id.textView);
        TextView textView11= (TextView)findViewById(R.id.textView11);
        TextView textView12= (TextView)findViewById(R.id.textView12);
        TextView textView13= (TextView)findViewById(R.id.textView13);
        Button button3 = (Button)findViewById(R.id.button3);

        textView.setText("              Program napisany na przedmiot Systemy                            Satelitarne i Mobilne autorstwa Wojciecha Gołdy");
        textView.setTextColor(Color.BLUE);

        textView11.setText("O programie: program ma za zadanie rysowanie 'Magiczne kwadratu' poprzez podanie 3 wartości liczbowych przez użytkownika, wartości muszą być dodatnie oraz spełniać warunki  że b/c<>1/2,1,2 oraz a>b+c ");

        textView12.setText("O kwadracie magicznym: Kwadrat magiczny to specjalna tablica, w która wpisano dodatnie liczby naturalne w taki sposób, aby suma liczb w każdym wierszu, w każdej kolumnie i w każdej przekątnej była taka sama. Kwadrat, w którym suma liczb w każdym wierszu i każdej kolumnie jest taka sama, ale sumy liczb w przekątnych są różne, nazywa się kwadratem półmagicznym.\n" +
                "Kwadrat magiczny znany był już w Chinach ok 2200 lat p.n.e. Mało kto jednak wie, że nazwę swoją zawdzięcza związkowi z… magią i wróżbami. Kwadrat magiczny traktowany był jako talizman. ");

        textView13.setText("Najsłynniejszym kwadratem magicznym jest prawdopodobnie ten, który umieścił Albert Dürer na swoim miedziorycie Melancholia I. Prawdopodobnie całkowicie nieprzypadkowo w ostatnim wierszu znajdziemy tu obok liczby 15 i 14 – liczby te składają się na datę powstania grafiki – czyli rok 1514 obraz po kliknieciu");

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Main4Activity.class);
                startActivity(intent);
            }
        });



        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

}
