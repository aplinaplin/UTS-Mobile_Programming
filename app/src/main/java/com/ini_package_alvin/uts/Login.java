package com.ini_package_alvin.uts;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.app.AlertDialog;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.os.Bundle;

public class Login extends AppCompatActivity {

    EditText username, password;
    Button btnLogin;
    String keynama, keypass;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnLogin = findViewById(R.id.loginButton);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                username=findViewById(R.id.user);
                password=findViewById(R.id.password);
                btnLogin=findViewById(R.id.loginButton);

                keynama= username.getText().toString();
                keypass= password.getText().toString();

                if(keynama.equals("alvin")&& keypass.equals("12345")){
                    Toast.makeText(getApplicationContext(),"Login Sukses!",
                            Toast.LENGTH_LONG).show();

                    Intent intent = new Intent(Login.this,
                            MainActivity.class);
                    Login.this.startActivity(intent);
                    finish();
                } else{
                    AlertDialog.Builder builder = new AlertDialog.Builder(Login.this);
                    builder.setMessage("Username atau Password salah").setNegativeButton(
                            "ulangi", null).create().show();

                    username.setText("");
                    password.setText("");
                }
            }
        });
    }
}