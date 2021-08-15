package com.training.pagos.android;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
/*
Implemente una app en Android que permita devolver el importa a cobrar por un empleado
para lo cual debe ingresar su nombre, horas trabajadas y costo por hora. Se debe crear una clase llamada
Pago, que pinir el proceso de calculo, de importe así como los metodos get y set de los atriobutos de la aplicacion.
* */
    private EditText editTextNombreEmpleado;
    private EditText editTextHorasTrabajadas;
    private EditText editTextCostoPorHora;
    private TextView textViewImporte;
    private Button botonCalc;

    private String nombreEmpleado;
    private int horasTrabajadas;
    private double costoPorHora;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //obtener valores del layout

        editTextNombreEmpleado = (EditText)findViewById(R.id.editTextNombreEmp);
        editTextHorasTrabajadas = (EditText)findViewById(R.id.editTextHoraTrabajada);
        editTextCostoPorHora = (EditText) findViewById(R.id.editTextCostoHora);
        textViewImporte = (TextView)findViewById(R.id.textViewImporteCobrar);
        botonCalc = (Button)findViewById(R.id.botonCalcular);

        botonCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Pago obPago = new Pago();
                //obtiene valores
                obPago.setEmpleado(editTextNombreEmpleado.getText().toString());
                obPago.setNumeroHorasTrabajadas(Integer.parseInt(editTextHorasTrabajadas.getText().toString()));
                obPago.setCostoPorHora(Integer.parseInt(editTextCostoPorHora.getText().toString()));

                double importe = obPago.calcularImporte();
                textViewImporte.setText(String.format("%.2f", importe));
            }
        });
    }
}