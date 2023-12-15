package com.example.applicationdialogs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button showDialogButton = findViewById(R.id.button);
        textView = (TextView) findViewById(R.id.textView);

        // Configuración del OnClickListener para el botón
        showDialogButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mostrarAlertDialog();
            }
        });
    }

    // Método para mostrar el AlertDialog
    private void mostrarAlertDialog() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Titulo del dialogo");
        builder.setMessage("selecciona una opcion");

        // Configuración del botón positivo (Yes)
        builder.setPositiveButton("Si", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                textView.setText("Has seleccionado SI");
            }
        });

        // Configuración del botón negativo (No)
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                textView.setText("Has seleccionado NO");
            }
        });

        // Crear y mostrar el AlertDialog
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
}
