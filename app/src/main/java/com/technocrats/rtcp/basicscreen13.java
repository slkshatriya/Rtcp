package com.technocrats.rtcp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class basicscreen13 extends AppCompatActivity {

    ImageView imagegg;
    Button next16;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basicscreen13);
        imagegg=findViewById(R.id.imagegg);
        next16=findViewById(R.id.next16);
       next16.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity26();
            }
        }));
    }
    public void openActivity26(){
      Intent next16 = new Intent(basicscreen13.this, basicscreen14.class);
       startActivity(next16);
    }
}