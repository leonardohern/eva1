package com.example.eva1_calculo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class cuadrados extends AppCompatActivity {

    private EditText etLado1, etLado2, etResultado;
    private Button btnCalcular;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuadrados);

        etLado1 = (EditText)findViewById(R.id.etLado1);
        etLado2 = (EditText)findViewById(R.id.etLado2);
        etResultado = (EditText)findViewById(R.id.etResultado);
        btnCalcular = (Button)findViewById(R.id.btnCalcular);


        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num= Integer.parseInt(etLado1.getText().toString());
                int num2= Integer.parseInt(etLado2.getText().toString());

                int perimetro=2*(num+num2);
                int area=num*num2;
            }
        });
    }



    //Metodo Para el Boton anterior
    public void volver1 (View view){
        Intent volver1 = new Intent(this, MainActivity.class);
        startActivity(volver1);
    }

}