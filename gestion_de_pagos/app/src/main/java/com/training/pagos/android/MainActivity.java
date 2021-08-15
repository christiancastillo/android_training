package com.training.pagos.android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
/*
Implemente una app en Android que permita devolver el importa a cobrar por un empleado
para lo cual debe ingresar su nombre, horas trabajadas y costo por hora. Se debe crear una clase llamada
Pago, que pinir el proceso de calculo, de importe así como los metodos get y set de los atriobutos de la aplicacion.
* */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}