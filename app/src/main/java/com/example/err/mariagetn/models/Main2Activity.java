package com.example.err.mariagetn.models;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.err.mariagetn.R;
import com.example.err.mariagetn.dao.*;
import com.example.err.mariagetn.dao.User;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Main2Activity extends AppCompatActivity {


    EditText editUsername,editPassword;
    Button btnConnexion,btnAnnuler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        editUsername= (EditText) findViewById(R.id.editUsername);
        editPassword= (EditText) findViewById(R.id.editPassword);
        btnConnexion= (Button) findViewById(R.id.btnconnexion);
        btnAnnuler= (Button) findViewById(R.id.btnAnnuler);



        btnConnexion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String UserName=editUsername.getText().toString();
                String Password=editPassword.getText().toString();

                IUser iUser=APIClient.getClient().create(IUser.class);


                    iUser.getUserByEmailandPassword(UserName,Password).enqueue(new Callback<List<com.example.err.mariagetn.dao.User>>() {
                        @Override
                        public void onResponse(Call<List<User>> call, Response<List<User>> response) {

                            if (response.body().size()!=0)
                                startActivity(new Intent(getApplicationContext(),HomeActivity.class));
                            else {
                                
                                editPassword.setError("Error");
                                editUsername.setError("Error");
                            }

                        }

                        @Override
                        public void onFailure(Call<List<User>> call, Throwable t) {
                            editUsername.setError("Error");
                            editPassword.setError("Error");

                        }
                    });


            }
        });





        btnAnnuler.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                editUsername.setText("");
                editPassword.setText("");
            }
        });






    }
}