package com.technocrats.rtcp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class basicscreen16 extends AppCompatActivity {

    ImageView Capture;
    Button next19;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basicscreen16);
        Capture=findViewById(R.id.capture);
        next19=findViewById(R.id.next19);
        next19.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity29();
            }
        }));
    }

    public void openActivity29(){

        Intent next19 = new Intent(basicscreen16.this, basicscreen17.class);
        startActivity(next19);
    }

}
