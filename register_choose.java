package com.example.log_in;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class register_choose extends AppCompatActivity {
    private Button btn,btn1,btn2,btn3,btn4,btn5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register_choose);
        addListenerOnButton();
    }
    public void  addListenerOnButton(){
        btn = (Button)findViewById(R.id.button8);
        btn1 =(Button)findViewById(R.id.button9);
        btn2 =(Button)findViewById(R.id.button10);
        btn3 =(Button)findViewById(R.id.button11);
        btn4 =(Button)findViewById(R.id.button12);
        btn5 =(Button)findViewById(R.id.button13);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(".register");
                startActivity(intent);
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nextPAge = new Intent(".register");
                startActivity(nextPAge);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(".register");
                startActivity(intent);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nextPAge = new Intent(".register");
                startActivity(nextPAge);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(".register");
                startActivity(intent);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nextPAge = new Intent(".register");
                startActivity(nextPAge);
            }
        });

    }
}
