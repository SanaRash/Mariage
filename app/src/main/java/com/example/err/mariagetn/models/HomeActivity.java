package com.example.err.mariagetn.models;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import com.example.err.mariagetn.R;

import static com.example.err.mariagetn.R.id.parent;

public class HomeActivity extends AppCompatActivity {
  Spinner spinner , spinner2;
    Button btnChercher ;
    ArrayAdapter<CharSequence> adapter ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        btnChercher =(Button) findViewById(R.id.button);
        spinner = (Spinner) findViewById(R.id.spinner);
        adapter= ArrayAdapter.createFromResource(this,R.array.Nom_ville,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?>parent, View view, int Position, long l) {
                Toast.makeText(getBaseContext(),parent.getItemIdAtPosition(Position)+"Choisi",Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
        spinner2 = (Spinner) findViewById(R.id.spinner2);
        adapter =ArrayAdapter.createFromResource(this,R.array.catégories,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(adapter);

        spinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?>parent, View view, int Position, long l) {
                Toast.makeText(getBaseContext(),parent.getItemIdAtPosition(Position)+"Choisi",Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        btnChercher.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(),MapsActivity.class));
            }
        });
    }
}
