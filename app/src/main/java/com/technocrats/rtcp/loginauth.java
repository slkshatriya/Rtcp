package com.technocrats.rtcp;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class loginauth extends AppCompatActivity {
    FirebaseAuth firebaseAuth;
    EditText inputemail;
    EditText inputpassword;
    Button signin;
    TextView tvsignup;
    FirebaseAuth.AuthStateListener authStateListener;
    private static final String TAG = "loginauth";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginauth);
        firebaseAuth = FirebaseAuth.getInstance();
        inputemail = (EditText) findViewById(R.id.emailidc);
        inputpassword = (EditText) findViewById(R.id.passwordidc);
        signin = (Button) findViewById(R.id.signin);
        tvsignup = (TextView) findViewById(R.id.signup);

        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = inputemail.getText().toString().trim();
                String password = inputpassword.getText().toString().trim();
                Log.d(TAG, "onClick: ");
                if (email.isEmpty()){
                    inputemail.setError("please enter your email");
                    inputemail.requestFocus();
                }
                else if (password.isEmpty()){
                    inputpassword.setError("please enter your password");
                    inputpassword.requestFocus();
                }
                else if (email.isEmpty() && password.isEmpty()){
                    Toast.makeText(loginauth.this, "please enter a valid detail", Toast.LENGTH_LONG);
                    return;
                }
                else if (!(email.isEmpty() && password.isEmpty())){
                    firebaseAuth.signInWithEmailAndPassword(email,password).addOnCompleteListener(loginauth.this, new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (!task.isSuccessful()){
                                Toast.makeText(loginauth.this, "login error try again", Toast.LENGTH_SHORT).show();
                            }
                            else{
                                Intent inhome = new Intent(loginauth.this, homeScreen.class);
                                startActivity(inhome);
                            }

                        }
                    });

                }

                else {
                    Toast.makeText(loginauth.this, "error getting trouble", Toast.LENGTH_LONG).show();
                }
            }
        });
        tvsignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent insignup = new Intent(loginauth.this, MainActivity.class);
                startActivity(insignup);
            }
        });
    }


    }



