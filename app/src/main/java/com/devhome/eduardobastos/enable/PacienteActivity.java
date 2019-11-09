package com.devhome.eduardobastos.enable;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.google.android.material.snackbar.Snackbar;

public class PacienteActivity extends AppCompatActivity {

    private Button buttonPaciente;
    private Spinner spinnerEstados;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paciente);



        buttonPaciente = findViewById(R.id.buttonEnviarPac);
        spinnerEstados = findViewById(R.id.spinnerEstados);

        carregarDadosSpinner();

        buttonPaciente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Cadastro realizado com sucesso!", Snackbar.LENGTH_LONG)
                        .show();
            }
        });
    }


    private void carregarDadosSpinner() {


        //configura Spinner de Estados
        String[] estados = getResources().getStringArray(R.array.estados);
        ArrayAdapter<String> adapterE = new ArrayAdapter<String>(
                this, android.R.layout.simple_spinner_item,
                estados
        );
        adapterE.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerEstados.setAdapter(adapterE);
    }
}

