package com.example.olano.projectoreserva;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class UsuarioActivity extends AppCompatActivity {
    private EditText nombre, apellidos, usuario, contraseña, repcontraseña, correo;
    private Button ingresar;

    DatabaseReference databaseUsuario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usuario);

        getSupportActionBar().hide();

        nombre = (EditText) findViewById(R.id.edtnombre);
        apellidos = (EditText) findViewById(R.id.edtapellidos);
        usuario = (EditText) findViewById(R.id.edtusuario);
        contraseña = (EditText) findViewById(R.id.edtcontraseña);
        repcontraseña = (EditText) findViewById(R.id.edtrepcontraseña);
        correo = (EditText) findViewById(R.id.edtcorreo);
        ingresar = (Button) findViewById(R.id.btningresar);

        databaseUsuario = FirebaseDatabase.getInstance().getReference("usuarios");

        ingresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addUsuario();
            }
        });
    }

    private void addUsuario() {
        //getting the values to save
        String name = nombre.getText().toString().trim();
        String lastname = apellidos.getText().toString().trim();
        String user = usuario.getText().toString().trim();
        String password = contraseña.getText().toString().trim();
        String reppassword = repcontraseña.getText().toString().trim();
        String email = correo.getText().toString().trim();

        //checking if the value is provided
        if (!TextUtils.isEmpty(name)) {

            //getting a unique id using push().getKey() method
            //it will create a unique id and we will use it as the Primary Key for our Artist
            String id = databaseUsuario.push().getKey();

            //creating an Artist Object
            Usuario user1 = new Usuario(id, name, lastname, user, password, reppassword, email);

            //Saving the Artist
            databaseUsuario.child(id).setValue(user1);

            //setting edittext to blank again
            nombre.setText("");
            apellidos.setText("");
            usuario.setText("");
            contraseña.setText("");
            repcontraseña.setText("");
            correo.setText("");

            //displaying a success toast
            Toast.makeText(this, "Usuario Agregado", Toast.LENGTH_LONG).show();
        } else {
            //if the value is not given displaying a toast
            Toast.makeText(this, "Ingrese Usuario", Toast.LENGTH_LONG).show();
        }

    }
}
