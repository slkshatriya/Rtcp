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
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private FirebaseAuth firebaseAuth;
    EditText inputemail;
    EditText inputpassword;
    Button button;
    TextView tvsignin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firebaseAuth = FirebaseAuth.getInstance();
        inputemail =  findViewById(R.id.emailid_one);
        inputpassword =  findViewById(R.id.passwordid_one);
        button =  findViewById(R.id.sign_up_one);
        tvsignin =  findViewById(R.id.sign_in_one);
        if (FirebaseAuth.getInstance().getCurrentUser() != null){
            Intent login = new Intent(MainActivity.this, homeScreen.class);
            login.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(login);
        }

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG, "onClick: ");
                String email = inputemail.getText().toString();
                String password = inputpassword.getText().toString();
                if (email.isEmpty()){
                    inputemail.setError("please enter your email");
                    inputemail.requestFocus();
                    return;
                }
                if (password.isEmpty()){
                    inputpassword.setError("please enter your password");
                    inputpassword.requestFocus();
                    return;
                }
                if (email.isEmpty() && password.isEmpty()){
                    Toast.makeText(MainActivity.this, "please enter a valid detail", Toast.LENGTH_LONG);
                    return;
                }else if (!(email.isEmpty()) && !password.isEmpty()){
                    firebaseAuth.createUserWithEmailAndPassword(email,password).addOnCompleteListener(MainActivity.this, new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (task.isSuccessful()){
                                Toast.makeText(MainActivity.this, "login successful", Toast.LENGTH_LONG).show();
                                Intent login = new Intent(MainActivity.this, homeScreen.class);
                                startActivity(login);
                            }
                            else {
                                Toast.makeText(MainActivity.this, "sign up unsuccessful please enter alpha numeric data in password", Toast.LENGTH_LONG).show();
                            }

                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Log.d(TAG, "onFailure: "+e.getMessage());
                        }
                    });
                }





            }
        });
        tvsignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent in = new Intent(MainActivity.this, loginauth.class);
                startActivity(in);
            }
        });



    }
}
