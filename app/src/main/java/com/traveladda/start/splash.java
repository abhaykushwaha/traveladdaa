package com.traveladda.start;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.traveladda.R;


public class splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if(getApplicationContext()==null){
                    return;
                }
                else{startActivity(new Intent(getApplicationContext() , user_type.class));
                finish();
            }}
        },3000);
    }
}