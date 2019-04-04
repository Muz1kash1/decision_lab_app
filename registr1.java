package com.example.log_in;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class registr1 extends AppCompatActivity {
    private Button btn, btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registr1);
        addListenerOnButton();
    }
    public void  addListenerOnButton(){
        btn = (Button)findViewById(R.id.register_button_on_register1);
        btn1 =(Button)findViewById(R.id.buton_i_alreade_has_account);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(".register_choose");
                startActivity(intent);
            }
        });
       btn1.setOnClickListener(new View.OnClickListener() {
           @Override
          public void onClick(View v) {
               Intent nextPAge = new Intent(".MainActivity");
               startActivity(nextPAge);
           }
        });


    }
}
