package com.example.a201495_2.porkgestion;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class lechon extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lechon);
    }

    public void onClick(View view){
        Intent miIntent=new Intent(lechon.this,Partolact.class);
        startActivity(miIntent);
    }
}
