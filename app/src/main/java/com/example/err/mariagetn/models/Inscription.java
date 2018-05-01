package com.example.err.mariagetn.models;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.err.mariagetn.R;

public class Inscription extends AppCompatActivity {
    EditText nom,prenom,email,password, tel, conf, adresse;
    String Nom, Prenom, Email, Password, Tel, Conf, Adresse;
    Button Valider, Annuler;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inscription);
        nom = (EditText) findViewById(R.id.id_nom);
        prenom=(EditText) findViewById(R.id.id_prenom);
        tel=(EditText)findViewById(R.id.id_tell);
        email=(EditText)findViewById(R.id.id_emaiil);
        password=(EditText)findViewById(R.id.id_passwordd);
        conf=(EditText)findViewById(R.id.id_conff);
        adresse=(EditText)findViewById(R.id.adress);
        Valider=(Button)findViewById(R.id.button1);
        Annuler=(Button)findViewById(R.id.button2);

        Valider.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Nom = nom.getText().toString();
                Prenom = prenom.getText().toString();
                Email = email.getText().toString();
                Password = password.getText().toString();
                Tel = tel.getText().toString();
                Conf = conf.getText().toString();
                Adresse = adresse.getText().toString();

            }
        });
    }
}


