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

public class AdministradorActivity extends AppCompatActivity {

    private EditText nombread, apellidosad, contraseñaad, comdeportivoad, numcanchasad, direccionad;
    private Button ingresarad;
    DatabaseReference databaseAdministrador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_administrador);

        getSupportActionBar().hide();

        nombread = (EditText) findViewById(R.id.edtnombread);
        apellidosad = (EditText) findViewById(R.id.edtapellidosad);
        contraseñaad = (EditText) findViewById(R.id.edtcontraseñaad);
        comdeportivoad = (EditText) findViewById(R.id.edtcompdeportivoad);
        numcanchasad = (EditText) findViewById(R.id.edtnumcanchas);
        direccionad = (EditText) findViewById(R.id.edtdireccionad);
        ingresarad = (Button) findViewById(R.id.btningresarad);

        databaseAdministrador = FirebaseDatabase.getInstance().getReference("administrador");

        ingresarad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addUsuario();
            }
        });

    }

    private void addUsuario() {
        //getting the values to save
        String name = nombread.getText().toString().trim();
        String lastname = apellidosad.getText().toString().trim();
        String password = contraseñaad.getText().toString().trim();
        String compdep = comdeportivoad.getText().toString().trim();
        String numfields = numcanchasad.getText().toString().trim();
        String address = direccionad.getText().toString().trim();

        //checking if the value is provided
        if (!TextUtils.isEmpty(name)) {

            //getting a unique id using push().getKey() method
            //it will create a unique id and we will use it as the Primary Key for our Artist
            String id = databaseAdministrador.push().getKey();

            //creating an Artist Object
            Usuario user1 = new Usuario(id, name, lastname, password, compdep, numfields, address);

            //Saving the Artist
            databaseAdministrador.child(id).setValue(user1);

            //setting edittext to blank again
            nombread.setText("");
            apellidosad.setText("");
            contraseñaad.setText("");
            comdeportivoad.setText("");
            numcanchasad.setText("");
            direccionad.setText("");

            //displaying a success toast
            Toast.makeText(this, "Administrador agregado", Toast.LENGTH_LONG).show();
        } else {
            //if the value is not given displaying a toast
            Toast.makeText(this, "Ingrese usuario de Administrador", Toast.LENGTH_LONG).show();
        }
    }
}
