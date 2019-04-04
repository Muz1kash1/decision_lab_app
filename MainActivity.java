package com.example.log_in;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button_enter, button_back_to_register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitymain);
        addListenerOnButton();

    }
    public void  addListenerOnButton(){
        button_back_to_register = (Button)findViewById(R.id.button_back_to_register);
        button_enter =(Button)findViewById(R.id.button_enter);
        button_back_to_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(".registr1");
                startActivity(intent);
            }
        });
        button_enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nextPAge = new Intent("");
                startActivity(nextPAge);
            }
        });


    }
}
