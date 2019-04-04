package com.example.log_in;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class register extends AppCompatActivity {
    private Button Button_register_on_register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        addListenerOnButton();
    }

    public void addListenerOnButton() {
        Button_register_on_register = (Button) findViewById(R.id.Button_register_on_register);
        Button_register_on_register.setOnClickListener(new View.OnClickListener() {
           @Override
            public void onClick(View v) {
               Intent intent = new Intent(".registr1");
               startActivity(intent);
            }
        });
   }
}
