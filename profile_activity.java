package com.example.log_in;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.log_in.fargment_letter;
import com.example.log_in.statistic;
import com.example.log_in.star;

public class profile_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_activity);
    }
    public void Change (View view){
        Fragment fragment = null;

        switch (view.getId()){
            case R.id.letter:
                fragment = new fargment_letter();
                break;
            case R.id.star:
                fragment = new star();
                break;
            case R.id.statistic:
                fragment = new statistic();
                break;

        }

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.fragment_for_profile, fragment);
        ft.commit();

    }



}
