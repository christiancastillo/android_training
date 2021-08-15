package mx.gob.jurisjacala.android_training;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText etNota1, etNota2;
    private Button btnProcesar;
    private TextView tvPromedio, tvCondicion;
    private int nota1,nota2;
    String condicion;
    double promedio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //obtener los valores del layout
        etNota1 = (EditText) this.findViewById(R.id.editTextNota1);
        etNota2 = (EditText) findViewById(R.id.editTextNota2);
        tvPromedio = (TextView)findViewById(R.id.textViewPromedio);
        tvCondicion = (TextView) findViewById(R.id.textViewCondicion);
        btnProcesar = (Button)findViewById(R.id.btnProcesar);

        btnProcesar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //Obtener los valores de los controles
                nota1 = Integer.parseInt(etNota1.getText().toString());
                nota2 = Integer.parseInt(etNota2.getText().toString());
                promedio = nota1+nota2/2.0;

                //determina la condicion del alumno
                if(promedio <= 9.99){
                    condicion = "Reprobado";
                } else if (promedio <= 12.99){
                    condicion = "Recuperacion";
                } else {
                    condicion = "Aprobado";
                }
                //imprimir resultados
                tvPromedio.setText(String.format("%.2f",promedio));
                tvCondicion.setText(condicion);
            }
        });
    }
}