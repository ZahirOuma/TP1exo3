package com.example.e_certificates;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {
    private TextView q1,q2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        q1=findViewById(R.id.reponse1);
        q2=findViewById(R.id.reponse2);
        q1.setText(this.getIntent().getStringExtra("q1"));
        q2.setText(this.getIntent().getStringExtra("q2"));



}
}