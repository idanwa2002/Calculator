package com.example.idan.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button pl, min, tm, dvd, cl, ans, crd;
    EditText et;
    double x1 = 0, x2 = 0,b;
    int op = 1;
    String str, ret;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pl = (Button) findViewById(R.id.pls);
        min = (Button) findViewById(R.id.mins);
        tm = (Button) findViewById(R.id.tim);
        dvd = (Button) findViewById(R.id.divd);
        cl = (Button) findViewById(R.id.cler);
        ans = (Button) findViewById(R.id.answ);
        crd = (Button) findViewById(R.id.crdts);
        et = (EditText) findViewById(R.id.ett);
    }

    public void plus(View view) {
        if ((!et.getText().toString().equals("")) && ((!et.getText().toString().equals(".")) && ((!et.getText().toString().equals("-")) && (!et.getText().toString().equals("-."))))) {
            String dp = et.getText().toString();
            x2 = Double.parseDouble(dp);
            switch (op) {
                case 1:
                    x1 = x1 + x2;
                    break;
                case 2:
                    x1 = x1 - x2;
                    break;
                case 3:
                    x1 = x1 * x2;
                    break;
                case 4:
                    if (x2 == 0)
                        Toast.makeText(this, "error", Toast.LENGTH_SHORT).show();
                    x1 = x1 / x2;
                    break;
            }
            str = Double.toString(x1);
            et.setHint(str);
        } else {
            Toast.makeText(this, "You need to enter a number first", Toast.LENGTH_SHORT).show();
        }
        op = 1;
    }

    public void minus(View view) {
        if ((!et.getText().toString().equals("")) && ((!et.getText().toString().equals(".")) && (!et.getText().toString().equals("-")) && (!et.getText().toString().equals("-.")))) {
            String dp = et.getText().toString();
            x2 = Double.parseDouble(dp);
            switch (op) {
                case 1:
                    x1 = x1 + x2;
                    break;
                case 2:
                    x1 = x1 - x2;
                    break;
                case 3:
                    x1 = x1 * x2;
                    break;
                case 4:
                    if (x2 == 0)
                        Toast.makeText(this, "error", Toast.LENGTH_SHORT).show();
                    x1 = x1 / x2;
                    break;
            }
            str = Double.toString(x1);
            et.setHint(str);
        } else {
            Toast.makeText(this, "You need to enter a number first", Toast.LENGTH_SHORT).show();
        }
        op = 2;
    }

    public void times(View view) {
        if ((!et.getText().toString().equals("")) && ((!et.getText().toString().equals(".")) && (!et.getText().toString().equals("-")) && (!et.getText().toString().equals("-.")))) {
            String dp = et.getText().toString();
            x2 = Double.parseDouble(dp);
            switch (op) {
                case 1:
                    x1 = x1 + x2;
                    break;
                case 2:
                    x1 = x1 - x2;
                    break;
                case 3:
                    x1 = x1 * x2;
                    break;
                case 4:
                    if (x2 == 0)
                        Toast.makeText(this, "error", Toast.LENGTH_SHORT).show();
                    x1 = x1 / x2;
                    break;
            }
            str = Double.toString(x1);
            et.setHint(str);
        } else {
            Toast.makeText(this, "You need to enter a number first", Toast.LENGTH_SHORT).show();
        }
        op = 3;
    }

    public void divide(View view) {
        if ((!et.getText().toString().equals("")) && ((!et.getText().toString().equals(".")) && (!et.getText().toString().equals("-")) && (!et.getText().toString().equals("-.")))) {
            String dp = et.getText().toString();
            x2 = Double.parseDouble(dp);
            switch (op) {
                case 1:
                    x1 = x1 + x2;
                    break;
                case 2:
                    x1 = x1 - x2;
                    break;
                case 3:
                    x1 = x1 * x2;
                    break;
                case 4:
                    if (x2 == 0)
                        Toast.makeText(this, "error", Toast.LENGTH_SHORT).show();
                    x1 = x1 / x2;
                    break;
            }
            str = Double.toString(x1);
            et.setHint(str);
        } else {
            Toast.makeText(this, "You need to enter a number first", Toast.LENGTH_SHORT).show();
        }
        op = 4;
    }

    public void clear(View view) {
        et.setText("");
        et.setText("Display");
        x1 = 0;
        x2 = 0;
        op = 0;
    }

    public void answer(View view) {
        if ((!et.getText().toString().equals("")) && ((!et.getText().toString().equals(".")) && (!et.getText().toString().equals("-")) && (!et.getText().toString().equals("-.")))) {
            String dp = et.getText().toString();
            x2 = Double.parseDouble(dp);
            switch (op) {
                case 1:
                    x1 = x1 + x2;
                    break;
                case 2:
                    x1 = x1 - x2;
                    break;
                case 3:
                    x1 = x1 * x2;
                    break;
                case 4:
                    if (x2 == 0)
                        Toast.makeText(this, "error", Toast.LENGTH_SHORT).show();
                    x1 = x1 / x2;
                    break;
            }
            str = Double.toString(x1);
            et.setHint(str);
        } else {
            Toast.makeText(this, "You need to enter a number first", Toast.LENGTH_SHORT).show();
        }
        b=x1;
        x2=x1=0; op=1;
    }
    public void credits(View view) {
        Intent t= new Intent(this,MainActivity.class);
        if (x1==0){
            str=Double.toString(b);
            t.putExtra("str", str);
        }
        else{
            str=Double.toString(x1);
            t.putExtra("str", str);
        }
        startActivityForResult(t,1); }
        public void onActivityResult (int a, int b, Intent c){
            ret=c.getStringExtra("re");
            et.setText("The last result is" + ret);
    }
    }

