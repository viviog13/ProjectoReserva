package com.example.olano.projectoreserva;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.security.Principal;

public class LoginP extends AppCompatActivity {
    private EditText usuariou;
    private EditText contraseñau;
    private Button ingresaru, registraru;
    String user;
    String password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_p);

        ingresaru = (Button) findViewById(R.id.btningresaru);
        registraru = (Button) findViewById(R.id.btnregistraru);
        usuariou = (EditText) findViewById(R.id.edtusuariou);
        contraseñau = (EditText) findViewById(R.id.edtcontraseñau);

        ingresaru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                user = usuariou.getText().toString();
                password = contraseñau.getText().toString();

                if (user.equals("Vivian") && password.equals("1234")){
                    Toast.makeText(LoginP.this, "Correcto", Toast.LENGTH_SHORT).show();

                    Intent intent = new Intent(LoginP.this, PrincipalP.class);
                    intent.putExtra("usuario", user);
                    startActivity(intent);


                }else {
                    if (user.equals("Amador") && password.equals("1234")) {
                        Toast.makeText(LoginP.this, "Correcto", Toast.LENGTH_SHORT).show();

                        Intent intent = new Intent(LoginP.this, PrincipalP.class);
                        intent.putExtra("usuario", user);
                        startActivity(intent);


                    } else {
                        if (user.equals("Levano") && password.equals("1234")) {
                            Toast.makeText(LoginP.this, "Correcto", Toast.LENGTH_SHORT).show();

                            Intent intent = new Intent(LoginP.this, PrincipalP.class);
                            intent.putExtra("usuario", user);
                            startActivity(intent);


                        }
                        else {
                            if (user.equals("Lidia") && password.equals("lidia")) {
                                Toast.makeText(LoginP.this, "Correcto", Toast.LENGTH_SHORT).show();

                                Intent intent = new Intent(LoginP.this, PrincipalP.class);
                                intent.putExtra("usuario", user);
                                startActivity(intent);


                            }
                            else {Toast.makeText(LoginP.this, "Datos Incorrectos", Toast.LENGTH_SHORT).show();}
                        }
                    }
                }
            }


        });
        registraru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LoginP.this, UsuarioActivity.class);
                startActivity(intent);
            }
        });

    }
}
