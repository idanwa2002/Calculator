package com.example.idan.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
TextView a;
Button r;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        a = (TextView) findViewById(R.id.txt);
        r = (Button) findViewById(R.id.retu);
        a.setText("The last result is"+getIntent().getExtras().getString("result"));
    }
    public void ret (View view){
        Intent c = new Intent(this, MainActivity.class);
        startActivity(c);
    }
}

