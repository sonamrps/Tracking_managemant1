package com.example.trackme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.TrackMe.R;

public class Login extends AppCompatActivity {
    EditText etUsername,etPassword;
    Button   btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
       etUsername = findViewById(R.id.etUsername);
       etPassword = findViewById(R.id.etPassword);
       btnLogin = findViewById(R.id.btnLogin);
      btnLogin.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {

          }
      });
    }


}
