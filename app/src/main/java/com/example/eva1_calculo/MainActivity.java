package com.example.eva1_calculo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //Metodo para ir a calcular cuadrado
    public void cuadrado (View view){
        Intent cuadrado = new Intent(this, cuadrados.class);
        startActivity(cuadrado);
    }
    //Metodo para ir a Calcular circulos
    public void circulos (View view) {
        Intent circulos = new Intent(this, circulos.class);
        startActivity(circulos);
    }
    //Metodo para ir a Calcular rectangulos
    public void rectangulos (View view) {
        Intent rectangulos = new Intent(this, Rectangulos.class);
        startActivity(rectangulos);
    }

}
