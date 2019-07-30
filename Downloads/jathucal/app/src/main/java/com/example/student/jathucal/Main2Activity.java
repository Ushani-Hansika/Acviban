package com.example.student.jathucal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    String  fnum,snum;
    EditText eT1,eT2;
    TextView tvoutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        eT1=findViewById(R.id.editText3);
        eT2=findViewById(R.id.editText4);
        tvoutput=findViewById(R.id.textView3);

        Intent secondIntent = getIntent();

        fnum=secondIntent.getStringExtra("Firstvalue");
        snum=secondIntent.getStringExtra("secoundvalue");

        eT1.setText(fnum);
        eT2.setText(snum);

    }

    public void add(View v){
        tvoutput.setText(fnum+"+"+snum+"="+(Integer.parseInt(fnum)+Integer.parseInt(snum)));
    }

    public void subs(View v){
        tvoutput.setText(fnum+"-"+snum+"="+(Integer.parseInt(fnum)-Integer.parseInt(snum)));
    }

    public void div(View v){
        tvoutput.setText(fnum+"/"+snum+"="+(Integer.parseInt(fnum)/Integer.parseInt(snum)));

    }

    public void mul(View v){
        tvoutput.setText(fnum+"*"+snum+"="+(Integer.parseInt(fnum)*Integer.parseInt(snum)));

    }
}
