package com.example.app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;

public class registrar extends AppCompatActivity {

    String nombre;
    String edad;
    String altura;
    String peso;
    String telefono;
    EditText name;
    EditText Edad;
    EditText talla;
    EditText Peso;
    EditText nroCel;
    Button siguiente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar);

        name = findViewById(R.id.campo1);
        name.setHint("Nombre");
        Edad = findViewById(R.id.campo2);
        Edad.setHint("Edad");
        talla = findViewById(R.id.campo3);
        talla.setHint("Altura");
        Peso = findViewById(R.id.campo4);
        Peso.setHint("Peso");
        nroCel = findViewById(R.id.campo5);
        nroCel.setHint("Telefono");

        siguiente = findViewById(R.id.boton);
        siguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nombre = name.getText().toString();
                edad = Edad.getText().toString();
                altura = talla.getText().toString();
                peso = Peso.getText().toString();
                telefono = nroCel.getText().toString();
                Intent intent = new Intent(getApplicationContext(), registrar2.class);
                intent.putExtra("nombre", nombre);
                intent.putExtra("edad", edad);
                intent.putExtra("altura", altura);
                intent.putExtra("peso", peso);
                intent.putExtra("telefono", telefono);
                startActivity(intent);
            }
        });
    }

}