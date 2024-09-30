package com.example.e_certificates;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private CheckBox c1, c2, c3, c4;
    private RadioButton o,n;
    private Button suivant,quitter;
    private String q1="";
    private String q2="" ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        c1=findViewById(R.id.checkBox1);
        c2 = findViewById(R.id.checkBox2);
        c3 = findViewById(R.id.checkBox3);
        c4 = findViewById(R.id.checkBox4);
        o = findViewById(R.id.o);
        n= findViewById(R.id.n);
        suivant=findViewById(R.id.suivant);
        quitter=findViewById(R.id.quitter);
        suivant.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
              if(c1.isChecked()){
                  q1="Multiple Versions Combined";
              } else if (c2.isChecked()) {
                  q1="Model Vue Controler";

              }
              else if(c3.isChecked()){
                  q1="Main Value Compiled";
              }else if(c4.isChecked()){
                  q1="Mandatory Validated Controls";
              }
              if(o.isChecked()){
                  q2="Oui";
              } else if (n.isChecked()) {
                  q2="Non";

              }
              Intent intent=new Intent(MainActivity.this, MainActivity2.class);
              intent.putExtra("q1",q1);
                intent.putExtra("q2",q2);
                startActivity(intent);
                MainActivity.this.finish();


            }
        });
        quitter.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                finish();
            }
        });



    }
}