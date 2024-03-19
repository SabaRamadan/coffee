 package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

 public class MainActivity extends AppCompatActivity {

     @Override
     protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_main);


         EditText editt = findViewById(R.id.editt);
         Button bthobbies = findViewById(R.id.bthobbies);
         TextView hiddentext = findViewById(R.id.hiddentext);

         bthobbies.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 String hobbies=editt.getText().toString();
                 if(hobbies.isEmpty()){
                     return;
                 }
                 hiddentext.setText(hobbies);
                 hiddentext.setVisibility(View.VISIBLE);
             }
         });



     }
 }