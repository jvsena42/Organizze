package com.app.organizze.organizze.activity;

import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

import com.app.organizze.organizze.R;
import com.app.organizze.organizze.helper.DateCustom;

public class DespesasActivity extends AppCompatActivity {

    private TextInputEditText campoData,campoCategoria,campoDescricao;
    private EditText campoValor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_despesas);

        campoData = findViewById(R.id.editData);
        campoCategoria = findViewById(R.id.editCategoria);
        campoDescricao = findViewById(R.id.editDescricao);
        campoValor = findViewById(R.id.editValor);

        //Preencher o campo data com a data atual
        campoData.setText(DateCustom.dataAtual());
    }
}
