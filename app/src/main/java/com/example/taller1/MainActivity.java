package com.example.taller1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText txtNombre, txtApellido, txtPassword;
    private Button buttonEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNombre = findViewById(R.id.txtNombre);
        txtApellido = findViewById(R.id.txtApellido);
        txtPassword = findViewById(R.id.txtPassword);
        buttonEnviar = findViewById(R.id.buttonEnviar);

        // Listener usando lambda para el botón
        buttonEnviar.setOnClickListener(this::btEnviar);
    }

    public void btEnviar(View view) {
        String nombre = txtNombre.getText().toString().trim();
        String apellido = txtApellido.getText().toString().trim();
        String password = txtPassword.getText().toString();

        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("nombre", nombre);
        intent.putExtra("apellido", apellido);
        intent.putExtra("password", password);
        startActivity(intent);
    }
}
