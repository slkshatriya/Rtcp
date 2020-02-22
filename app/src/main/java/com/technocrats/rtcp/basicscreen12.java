package com.technocrats.rtcp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class basicscreen12 extends AppCompatActivity {
    ImageView  imageg ;
    Button next15;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basicscreen12);

        imageg=findViewById(R.id.imageg);
        next15=findViewById(R.id.next15);
        next15.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity25();
            }
        }));
    }

    public void openActivity25(){
        Intent next15 = new Intent(basicscreen12.this, basicscreen13.class);
        startActivity(next15);
    }
}
