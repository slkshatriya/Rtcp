package com.technocrats.rtcp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class basicsscreen9 extends AppCompatActivity {
    ImageView imgex, imgex1;
    Button next12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basicsscreen9);

        imgex = findViewById(R.id.imgex);
        imgex1 = findViewById(R.id.imgex1);
        next12 = findViewById(R.id.next12);
        next12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity22();
            }
        });
    }
    public void openActivity22(){
        Intent next12 = new Intent(basicsscreen9.this, basicsscreen10.class);
        startActivity(next12);
    }
}
