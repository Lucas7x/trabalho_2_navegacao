package com.lucas7x.trabalho_2.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.lucas7x.trabalho_2.R;
import com.lucas7x.trabalho_2.model.Heroi;
import com.lucas7x.trabalho_2.model.ListaHeroi;

public class CadastroActivity extends AppCompatActivity {

    EditText editNome, editCodinome, editPoder;
    Button buttonSalvarCadastro, buttonCancelarCadastro;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);

        editNome        = findViewById(R.id.editNomeCadastro);
        editCodinome    = findViewById(R.id.editCodinomeCadastro);
        editPoder       = findViewById(R.id.editPoderCadastro);
        buttonSalvarCadastro    = findViewById(R.id.buttonSalvarCadastro);
        buttonCancelarCadastro  = findViewById(R.id.buttonCancelarCadastro);


    }

    public void salvarCadastro(View view) {
        String nome = editNome.getText().toString();
        String codinome = editCodinome.getText().toString();
        String poder = editPoder.getText().toString();

        Heroi h = new Heroi(nome, codinome, poder);
        ListaHeroi.getInstance().addHeroi(h);
        finish();

        /*
        Toast.makeText(
                getApplicationContext(),
                ListaHeroi.getInstance().get(4).toString(),
                Toast.LENGTH_SHORT
        ).show();

         */
    }

    public void cancelarCadastro(View view) {
        finish();
    }
}