package com.lucas7x.trabalho_2.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import com.lucas7x.trabalho_2.R;
import com.lucas7x.trabalho_2.model.Heroi;
import com.lucas7x.trabalho_2.model.ListaHeroi;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button buttonCadastrar, buttonEditar;
    ListView listObjetos;
    EditText editId;

    private ArrayList<Heroi> nomes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonCadastrar = findViewById(R.id.buttonCadastrar);
        buttonEditar    = findViewById(R.id.buttonEditar);
        listObjetos     = findViewById(R.id.listObjetos);
        editId          = findViewById(R.id.editId);

        preencherLista();




        //criar adaptador para a lista
        ArrayAdapter<Heroi> adaptador = new ArrayAdapter<Heroi>(
                getApplicationContext(),
                android.R.layout.simple_list_item_2,        //layout
                android.R.id.text1,
                ListaHeroi.getInstance().getLista()
        );

        //adiciona adaptador para lista
        listObjetos.setAdapter(adaptador);

        listObjetos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent intent = new Intent(getApplicationContext(), ResumoActivity.class);
                intent.putExtra("idHeroi", i);
                startActivity(intent);




                /*String valorSelecionado = listObjetos.getItemAtPosition(i).toString();
                Toast.makeText(
                        getApplicationContext(),
                        Integer.toString(i),//valorSelecionado,
                        Toast.LENGTH_SHORT
                ).show();
                 */

            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();

        editId.setText("");

        ArrayAdapter<Heroi> adaptador = new ArrayAdapter<Heroi>(
                getApplicationContext(),
                android.R.layout.simple_list_item_2,        //layout
                android.R.id.text1,
                ListaHeroi.getInstance().getLista()
        );

        listObjetos.setAdapter(adaptador);
    }

    public void abrirTelaCadastro(View view) {
        Intent intent = new Intent(getApplicationContext(), CadastroActivity.class);
        startActivity(intent);
    }

    public void abrirTelaEdicao(View view) {
        Intent intent = new Intent(getApplicationContext(), EdicaoActivity.class);
        int idHeroi = Integer.parseInt(editId.getText().toString());
        intent.putExtra("idHeroi", idHeroi - 1);
        startActivity(intent);
    }

    public void preencherLista() {
        ListaHeroi.getInstance().addHeroi(new Heroi("Lucas", "Titan", "Invulnerabilidade"));
        ListaHeroi.getInstance().addHeroi(new Heroi("Lucas", "Titan", "Invulnerabilidade"));
        ListaHeroi.getInstance().addHeroi(new Heroi("Lucas", "Titan", "Invulnerabilidade"));
        ListaHeroi.getInstance().addHeroi(new Heroi("Lucas", "Titan", "Invulnerabilidade"));


        /*nomes = new ArrayList<>();

        nomes.add(new Heroi("Lucas", "Titan", "Invulnerabilidade"));
        nomes.add(new Heroi("Lucas", "Titan", "Invulnerabilidade"));
        nomes.add(new Heroi("Lucas", "Titan", "Invulnerabilidade"));

         */

    }



}