package com.example.cecyt9.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class calcu extends AppCompatActivity {

    private EditText NoU, NoD;
    int nouno, nodos;
    double res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calcu);

        NoU = (EditText) findViewById(R.id.editText3);
        NoD = (EditText) findViewById(R.id.editText4);
    }

    public void onClickMas(View v){
        nouno = Integer.parseInt(NoU.getText().toString.trim());
        nodos = Integer.parseInt(NoD.getText().toString.trim());
        res = nouno+nodos;
    }
    public void onClickMenos(View v){
        nouno = Integer.parseInt(NoU.getText().toString.trim());
        nodos = Integer.parseInt(NoD.getText().toString.trim());
        res = nouno-nodos;
    }
    public void onClickPor(View v){
        nouno = Integer.parseInt(NoU.getText().toString.trim());
        nodos = Integer.parseInt(NoD.getText().toString.trim());
        res = nouno*nodos;
    }
    public void onClickDivi(View v){
        nouno = Integer.parseInt(NoU.getText().toString.trim());
        nodos = Integer.parseInt(NoD.getText().toString.trim());
        res = nouno/nodos;
    }
}
