package com.technocrats.rtcp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class basicsscreen1 extends AppCompatActivity {
    Button next1,backtomain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basicsscreen1);
        next1 = findViewById(R.id.next1);
        backtomain = findViewById(R.id.backtomain);
        backtomain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity28();
            }
        });
        next1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity8();
            }
        });
    }
    public void openActivity8(){
        Intent next1 = new Intent(basicsscreen1.this, basicsscreen2.class);
        startActivity(next1);
    }
    public void openActivity28(){
        Intent in = new Intent(basicsscreen1.this, homeScreen.class);
        startActivity(in);
    }
}
