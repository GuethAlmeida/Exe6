package com.example.exe6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    EditText txtpeso;
    TextView txt1;
    TextView txt2;
    public void  calculo (View view){

        txtpeso = findViewById(R.id.txtpeso);
        txt1= findViewById(R.id.txt1);
        txt2 = findViewById(R.id.txt2);

        int p = Integer.parseInt(txtpeso.getText().toString());

        int p1 = p + ((15 * 100)/ p);
        txt1.setText("Se engordar 15% o peso é: " +Integer.toString(p1));
        int p2 = p - ((20 * 100)/ p);
        txt2.setText("Se emagrecer 20% o peso é: " + Integer.toString(p2));


    }
}