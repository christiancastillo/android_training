package com.android.training.fragments;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnAlertBox;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnAlertBox = (Button)findViewById(R.id.buttonAlertBox);
        AlertDialog.Builder dlgAlert = new AlertDialog.Builder(this);

        btnAlertBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dlgAlert.setTitle("Titulo del mensaje de alerta");
                dlgAlert.setPositiveButton("OK",null);
                dlgAlert.setMessage("Mensaje de la alerta");
                dlgAlert.create().show();
            }
        });
    }
}