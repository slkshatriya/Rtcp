package com.technocrats.rtcp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class basicsscreen11 extends AppCompatActivity {

    ImageView image12;
    Button next14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basicsscreen11);
         image12=findViewById(R.id.image12);
         next14=findViewById(R.id.next14);
        next14.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openactivity24();
            }
        }));
    }

    public void openactivity24(){
        Intent next14 = new Intent(basicsscreen11.this, basicscreen12.class);
        startActivity(next14);
    }
}
