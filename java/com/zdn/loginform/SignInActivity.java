package com.zdn.loginform;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class SignInActivity extends AppCompatActivity {

    private Button btnExit;
    private Button btnRegister;
    private EditText etRusername, etRpassword, etRCpassword,etRaddress, etRphone, etEmail;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);



        etRusername = (EditText) findViewById(R.id.etRusername);
        etRpassword = (EditText) findViewById(R.id.etRpassword);
        etRCpassword = (EditText) findViewById(R.id.etRCpassword);
        etRphone = (EditText) findViewById(R.id.etRusername);
        etRaddress = (EditText) findViewById(R.id.etRaddress);
        etEmail = (EditText) findViewById(R.id.etEmail);




        btnExit = (Button) findViewById(R.id.btnExit);
        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        btnRegister = (Button) findViewById(R.id.btnRegister);
        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}
