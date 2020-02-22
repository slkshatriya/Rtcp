package com.technocrats.rtcp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class basicsscreen7 extends AppCompatActivity {
    ImageView imgforloop,imgwhileloop;
    Button next8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basicsscreen7);

        imgforloop = findViewById(R.id.imgforloop);
        imgwhileloop = findViewById(R.id.imgwhileloop);
        next8 = findViewById(R.id.next8);
        next8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity17();
            }
        });
    }
    public void openActivity17(){
        Intent next8 = new Intent(basicsscreen7.this, basicsscreen8.class);
        startActivity(next8);
    }
}
