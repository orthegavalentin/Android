package com.example.valentiniradukundaetuumontpellierfr.tp1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class TestIntentActivity extends AppCompatActivity  {
    TextView tv1;
    Button ok,retour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_intent);

        tv1=(TextView)findViewById(R.id.textView);
        ok=(Button)findViewById(R.id.ok_button);
        retour=(Button)findViewById(R.id.return_button);
        /*ok.setOnClickListener(this);
        retour.setOnClickListener(this);*/
        Bundle bundle=getIntent().getExtras();
        String nom= bundle.getString("nom");

        tv1.setText(nom);



    }

   public void OkMethod(View view){

       Intent i1=new Intent (getApplicationContext(),ThirdActivity.class);
       startActivity(i1);


   }


   public void RetourMethod(View view){


       this.finish();

   }
}
