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
String s, sr;
Intent back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        a = (TextView) findViewById(R.id.txt);
        r = (Button) findViewById(R.id.retu);
        s=back.getStringExtra("str");
        a.setText("The last result is"+ s);
    }
    public void onActivityResult (int rqcode, Intent data_back) {
        if (data_back!=null)
            sr = data_back.getStringExtra("re");
    }
    public void ret (View view){
        back.putExtra("re", s);
        setResult(RESULT_OK, back);
        finish();
    }
}

