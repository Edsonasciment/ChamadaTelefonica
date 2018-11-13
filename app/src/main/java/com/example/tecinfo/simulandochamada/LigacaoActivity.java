package com.example.tecinfo.simulandochamada;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class LigacaoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ligacao);

        final TextView text_Numero = (TextView) findViewById(R.id.text_Numero);
        final Button btn_Apagar = (Button) findViewById(R.id.btn_Apagar);

        final Button btn_N1 = (Button) findViewById(R.id.btn_N1);
        final Button btn_N2 = (Button) findViewById(R.id.btn_N2);
        final Button btn_N3 = (Button) findViewById(R.id.btn_N3);
        final Button btn_N4 = (Button) findViewById(R.id.btn_N4);
        final Button btn_N5 = (Button) findViewById(R.id.btn_N5);
        final Button btn_N6 = (Button) findViewById(R.id.btn_N6);
        final Button btn_N7 = (Button) findViewById(R.id.btn_N7);
        final Button btn_N8 = (Button) findViewById(R.id.btn_N8);
        final Button btn_N9 = (Button) findViewById(R.id.btn_N9);

        final Button btn_Ponto = (Button) findViewById(R.id.btn_Ponto);
        final Button btn_0 = (Button) findViewById(R.id.btn_0);
        final Button btn_Ast = (Button) findViewById(R.id.btn_Ast);






    }
}
