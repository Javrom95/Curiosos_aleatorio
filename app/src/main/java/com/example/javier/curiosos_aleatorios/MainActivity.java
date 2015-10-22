package com.example.javier.curiosos_aleatorios;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends Activity {

    TextView resul;
    EditText enter;
    Button btn;
    String [] array = {"Las hormigas se estiran cuando se despiertan por la mañana.","Las avestruces pueden correr más rápido que los caballos."
            ,"Las medallas de oro de los juegos olímpicos están hechas de plata",
            "Naciste con 300 huesos, pero en la edad adulta tendrás solo 206.","Toma unos 8 minutos en llegar la luz del sol a la tierra."};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn = (Button) findViewById(R.id.btn);
        resul = (TextView) findViewById(R.id.numRanText);
      btn.setOnClickListener(new View.OnClickListener() {

          public void onClick(View v) {




              Random randomGenerator = new Random(); //Construct new number Generator
              int randomNumber = randomGenerator.nextInt(5); // limit to ten
              resul.setText(array[randomNumber]);


          }

      });




    }
}
