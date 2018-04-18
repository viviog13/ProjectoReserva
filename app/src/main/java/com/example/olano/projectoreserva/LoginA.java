package com.example.olano.projectoreserva;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginA extends AppCompatActivity {

    private EditText usuarioa;
    private EditText contraseñaa;
    private Button ingresara, registrara;
    String user;
    String password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        ingresara = (Button) findViewById(R.id.btningresara);
        registrara = (Button) findViewById(R.id.btnregistrara);
        usuarioa = (EditText) findViewById(R.id.edtusuarioa);
        contraseñaa = (EditText) findViewById(R.id.edtcontraseñaa);


        ingresara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                user = usuarioa.getText().toString();
                password = contraseñaa.getText().toString();

                if (user.equals("Vivian") && password.equals("abcd")){
                    Toast.makeText(LoginA.this, "Correcto", Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent(LoginA.this, PrincipalP.class);
                    intent.putExtra("usuario", user);
                    startActivity(intent);


                }else {
                    if (user.equals("Amador") && password.equals("abcd")) {
                        Toast.makeText(LoginA.this, "Correcto", Toast.LENGTH_SHORT).show();

                        Intent intent = new Intent(LoginA.this, PrincipalP.class);
                        intent.putExtra("usuario", user);
                        startActivity(intent);


                    } else {
                        if (user.equals("Levano") && password.equals("abcd")) {
                            Toast.makeText(LoginA.this, "Correcto", Toast.LENGTH_SHORT).show();

                            Intent intent = new Intent(LoginA.this, PrincipalP.class);
                            intent.putExtra("usuario", user);
                            startActivity(intent);


                        }
                        else {Toast.makeText(LoginA.this, "Datos Incorrectos", Toast.LENGTH_SHORT).show();}
                    }
                }
            }
        });
        registrara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginA.this, AdministradorActivity.class);
                startActivity(intent);
            }
        });

    }
}
