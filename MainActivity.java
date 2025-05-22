// vai dentro da src>main>java>com>example>ctruco>arquivo

package com.example.ctruco;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity{
    // Declare os botões como atributos da classe
    private Button buttontruco, button6, button9, button12;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

    // Define o layout XML que será usado (substitua pelo seu arquivo)
        setContentView(R.layout.activity_main);

    // Inicializa os botões, associando aos IDs do layout
        Button buttontruco = findViewById(R.id.buttontruco);
        Button button6 = findViewById(R.id.button6);
        Button button9 = findViewById(R.id.button9);
        Button button12 = findViewById(R.id.button12);

    // Deixa os botões inicialmente invisíveis
        button6.setVisibility(View.GONE);
        button9.setVisibility(View.GONE);
        button12.setVisibility(View.GONE);

    // Define os listeners para os botões
        buttontruco.setOnClickListener(v ->{
            button6.setVisibility(View.VISIBLE);
        });
        button6.setOnClickListener(v ->{
            button9.setVisibility(View.VISIBLE);
        });
        button9.setOnClickListener(v ->{
            button12.setVisibility(View.VISIBLE);
        });
    }
}
