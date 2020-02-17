package com.example.valentiniradukundaetuumontpellierfr.tp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TableLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Spinner domaine;
    LinearLayout layout;
    TextView v1;
    Button valider;
    EditText ed1;


    static final int VALIDATION_DIALOG=6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       domaine=(Spinner) findViewById(R.id.spinner1);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.DomaineCompetence, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        domaine.setAdapter(adapter);

        valider=(Button)findViewById(R.id.validation);
        ed1=(EditText) findViewById(R.id.et1);


        valider.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nom=ed1.getText().toString();

                Intent i1 =new Intent (getApplicationContext(),TestIntentActivity.class);
                i1.putExtra("nom",nom);
                startActivity(i1);

             // openDialog();

            }
        });





        // Exercice 3 b

       /* layout= new LinearLayout(this);
        v1=new TextView(this);
        v1.setText("amazing grace");

       layout.setGravity(1);
        layout.addView(v1);
        setContentView(layout);*/




    }



    // Dialog box
    private void openDialog() {
ValidationDialog dialog= new ValidationDialog();
dialog.show(getSupportFragmentManager(),"Validation dialog");


    }



}
