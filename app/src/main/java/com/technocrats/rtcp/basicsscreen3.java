package com.technocrats.rtcp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class basicsscreen3 extends AppCompatActivity {
    ImageView tabble;
    Button next3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basicsscreen3);

        tabble = findViewById(R.id.tabble);
        next3 = findViewById(R.id.next3);
        next3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity12();
            }
        });
    }
    public void openActivity12(){
        Intent next3 = new Intent(basicsscreen3.this, basicsscreen4.class);
        startActivity(next3);
    }
}
