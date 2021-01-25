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

public class EdicaoActivity extends AppCompatActivity {

    EditText editNome, editCodinome, editPoder;
    Button buttonSalvarEdicao, buttonCancelarEdicao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edicao);

        editNome = findViewById(R.id.editNomeEdicao);
        editCodinome = findViewById(R.id.editCodinomeEdicao);
        editPoder = findViewById(R.id.editPoderEdicao);
        buttonSalvarEdicao = findViewById(R.id.buttonSalvarEdicao);
        buttonCancelarEdicao = findViewById(R.id.buttonCancelarEdicao);

        Bundle dados = getIntent().getExtras();
        int idHeroi = dados.getInt("idHeroi");
        Heroi heroi = ListaHeroi.getInstance().get(idHeroi);

        carregarDados(heroi);
    }

    public void carregarDados(Heroi h) {
        editNome.setText(h.getNomeComum());
        editCodinome.setText(h.getNomeHeroi());
        editPoder.setText(h.getPoder());
    }

    public void salvarEdicao(View view) {
        String nome = editNome.getText().toString();
        String codinome = editCodinome.getText().toString();
        String poder = editPoder.getText().toString();

        Heroi h = new Heroi(nome, codinome, poder);
        Bundle dados = getIntent().getExtras();
        int idHeroi = dados.getInt("idHeroi");

        ListaHeroi.getInstance().set(idHeroi, h);
        finish();
        //Toast.makeText(getApplicationContext(), h.toString(), Toast.LENGTH_SHORT).show();
    }

    public void cancelarEdicao(View view) {
        finish();
    }
}