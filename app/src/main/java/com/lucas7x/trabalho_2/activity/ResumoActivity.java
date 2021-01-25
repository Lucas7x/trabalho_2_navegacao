package com.lucas7x.trabalho_2.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.lucas7x.trabalho_2.R;
import com.lucas7x.trabalho_2.model.Heroi;
import com.lucas7x.trabalho_2.model.ListaHeroi;

public class ResumoActivity extends AppCompatActivity {

    private TextView textNome, textCodinome, textPoder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resumo);

        textNome = findViewById(R.id.textNome);
        textCodinome = findViewById(R.id.textCodinome);
        textPoder = findViewById(R.id.textPoder);

        Bundle dados = getIntent().getExtras();
        Heroi heroi = ListaHeroi.getInstance().get(dados.getInt("idHeroi"));

        textNome.setText(heroi.getNomeComum());
        textCodinome.setText(heroi.getNomeHeroi());
        textPoder.setText(heroi.getPoder());

    }
}