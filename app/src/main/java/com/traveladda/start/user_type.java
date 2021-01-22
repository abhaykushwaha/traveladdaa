package com.traveladda.start;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.traveladda.R;
import com.traveladda.driver.driver_login;
import com.traveladda.passenger.pass_login;

public class user_type extends AppCompatActivity {
private Button driver , pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_type);
       Button driver=findViewById(R.id.driver);
       Button pass=findViewById(R.id.pass);
       driver.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               startActivity(new Intent(getApplicationContext() , driver_login.class));
               finish();
           }
       });

        pass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext() , pass_login.class));
                finish();
            }
        });

    }
}