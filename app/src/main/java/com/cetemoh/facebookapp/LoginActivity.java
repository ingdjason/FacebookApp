package com.cetemoh.facebookapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    String username, password;
    EditText edtUsername, edtPassword;
    Button btnLogin;
    TextView tvHelp, tvNew;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edtUsername = findViewById(R.id.edtUsername);
        edtPassword = findViewById(R.id.edtPassword);
        btnLogin = findViewById(R.id.btnLogin);
        tvHelp = findViewById(R.id.tvHelp);
        tvNew = findViewById(R.id.tvNew);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //code todo : get username and password
                username = edtUsername.getText().toString();
                password = edtPassword.getText().toString();

                if(!username.equals("") && !password.equals("")){
                    //Code todo: if username and password not empty ( different )
                    // start a new activity
                    Intent i = new Intent(getApplicationContext(), MainActivity.class);
                    i.putExtra("nom", username);
                    i.putExtra("number", 1);
                    startActivity(i);
                }else{
                    //Code todo: if username and password empty
                    Toast.makeText(LoginActivity.this, "Entrer un nom d'utilisateur et un mot de passe...", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }

    public void onForget(View view){
        //code todo
        Toast.makeText(this, "Contacter administrateur pour plus d'information...", Toast.LENGTH_SHORT).show();
    }


}
