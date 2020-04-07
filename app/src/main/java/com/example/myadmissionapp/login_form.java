package com.example.myadmissionapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class login_form extends AppCompatActivity {
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_form);
        getSupportActionBar().setTitle("Login Form");
        button=(Button)findViewById(R.id.signin);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openhome();
            }
        });
    }
    public void btn_loginForm(View view) {
        startActivity(new Intent(getApplicationContext(),signup_form.class));
    }
    public void openhome(){
        Intent intent = new Intent(this,home.class);
        startActivity(intent);
    }


}
