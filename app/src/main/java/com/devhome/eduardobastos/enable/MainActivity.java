package com.devhome.eduardobastos.enable;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button buttonPaciente, buttonVoluntario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonPaciente = findViewById(R.id.buttonPaciente);
        buttonVoluntario = findViewById(R.id.buttonVoluntario);
    }

    public void pacienteForms(View view){

             startActivity( new Intent (getApplicationContext(), PacienteActivity.class) );

    }

    public void voluntarioForms(View view){

             startActivity(new Intent(getApplicationContext(), VoluntarioActivity.class));

    }
}
