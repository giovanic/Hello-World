package com.example.ml078.projeto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Primeiro extends AppCompatActivity {
    private EditText nomeEditText;
    private TextView saudacaoTextView;
    private String saudacao;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_primeiro);
        this.nomeEditText = (EditText) findViewById(R.id.nomeEditText);
        this.saudacaoTextView = (TextView) findViewById(R.id.saudacaoTextView);
        this.saudacao = getResources().getString(R.string.saudacao);
    }
        public void surpreenderUsuario(View v){
            Editable texto = this.nomeEditText.getText();
            String msg = saudacao + " " + texto.toString();
            this.saudacaoTextView.setText(msg);

        }

    }

