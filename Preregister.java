package com.example.log_in;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Preregister extends AppCompatActivity {
    private Button register_button,button_back_to_account ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preregister);
        addListenerOnButton();
    }

    public void  addListenerOnButton(){
        register_button = (Button)findViewById(R.id.register_button);
        button_back_to_account =(Button)findViewById(R.id.button_back_to_account);
        register_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(".registr1");
                startActivity(intent);
            }
        });
        button_back_to_account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent nextPAge = new Intent(".MainActivity");
                startActivity(nextPAge);
            }
        });


    }
}
