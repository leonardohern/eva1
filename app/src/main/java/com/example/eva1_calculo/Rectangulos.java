package com.example.eva1_calculo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Rectangulos extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rectangulos);
    }
    //Metodo Para el Boton anterior
    public void volver3 (View view){
        Intent volver3 = new Intent(this, MainActivity.class);
        startActivity(volver3);
    }
}
