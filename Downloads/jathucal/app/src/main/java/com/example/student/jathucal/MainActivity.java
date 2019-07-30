package com.example.student.jathucal;

import android.content.Intent;
import android.renderscript.ScriptGroup;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.time.Instant;

public class MainActivity extends AppCompatActivity {
    EditText Fdigit,Sdigit;
    String num01,num02;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Fdigit=findViewById(R.id.editText3);
        Sdigit=findViewById(R.id.editText4);

    }
    public void sendDtata(View v){
        Intent intent = new Intent(MainActivity.this,Main2Activity.class);
        num01=Fdigit.getText().toString();
        num02=Sdigit.getText().toString();

        intent.putExtra("Firstvalue",num01);
        intent.putExtra("secoundvalue",num02);

        startActivity(intent);





    }


}
