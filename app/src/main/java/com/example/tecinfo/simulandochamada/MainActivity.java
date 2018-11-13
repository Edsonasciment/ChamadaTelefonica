package com.example.tecinfo.simulandochamada;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    SharedPreferences meusDados;
    public static final String mypreference = "call";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        meusDados = getSharedPreferences(mypreference, Context.MODE_PRIVATE);

        Button btnLogin = findViewById(R.id.btn_Login);
        TextView btn_Casdastrar = findViewById(R.id.txt_Registrar);
        final EditText email = findViewById(R.id.edt_Email);
        final EditText senha = findViewById(R.id.edt_NovaSenha);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String meuEmail = email.getText().toString();
                String minhaSenha = senha.getText().toString();

                if (meusDados.contains("email") && meusDados.contains("senha")) {

                    if (meuEmail.equals(meusDados.getString("email", ""))
                        && minhaSenha.equals(meusDados.getString("senha", "")) ) {

                        Intent intent = new Intent(MainActivity.this, LigacaoActivity.class);
                        startActivity(intent);
                        finish();

                    } else {
                        Toast.makeText(getApplicationContext(),
                        "Email ou senha invalidos", Toast.LENGTH_LONG).show();

                    }



                } else {
                    Toast.makeText(getApplicationContext(),"Não existem cadastros!", Toast.LENGTH_LONG).show();

                }



            }
        });



    }
}
