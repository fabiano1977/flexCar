package com.fabianosilva.melhorcombustivel;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText editAlcool;
    private EditText editGasolina;
    private TextView textResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editAlcool = findViewById(R.id.editAlcool);
        editGasolina = findViewById(R.id.editGasolina);
        textResultado = findViewById(R.id.textResultado);
        
    }


    public void compararPreco(View v){


        Double precoAlcool = Double.parseDouble(editAlcool.getText().toString());
        Double precoGasolina = Double.parseDouble(editGasolina.getText().toString());
        Double resultado = precoAlcool/precoGasolina;
        if (resultado >= 0.7){
            textResultado.setText("A melhor opção é a Gasolina.");
        } else {
            textResultado.setText("A melhor opção é o Álcool.");
        }

    }
}