package com.example.nour_ouaer_mesure_glycmie;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private Button btnConsulter;
    private TextView msg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnConsulter=findViewById(R.id.btnConsulter);
        msg=findViewById(R.id.msg);
        btnConsulter.setOnClickListener(new View.OnClickListener() {
           @Override
            public void onClick(View v) {
             msg.setText("Félicitation");
           }
       });
    }
    //public void calculer(View view){
        //Toast.makeText(this, "Le bouton CONSULTER a été cliqué !", Toast.LENGTH_SHORT).show();
    //}
}