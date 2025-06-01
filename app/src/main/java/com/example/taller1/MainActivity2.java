package com.example.taller1;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    private TextView txtSaludo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        txtSaludo = findViewById(R.id.textView);

        Bundle bundle = getIntent().getExtras();

        if (bundle != null) {
            String nombre = bundle.getString("nombre", "");
            String apellido = bundle.getString("apellido", "");
            String password = bundle.getString("password", "");

            String mensaje = "Hola!, Bienvenido \n" + nombre + " " + apellido + "\nTu contraseña es: " + password;
            txtSaludo.setText(mensaje);
        } else {
            txtSaludo.setText("Hola!, Bienvenido");
        }
    }
}
