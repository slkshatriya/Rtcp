package com.technocrats.rtcp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class basicscreen17 extends AppCompatActivity {

    ImageView capture12;
    Button next20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basicscreen17);
        capture12=findViewById(R.id.capture12);
        next20=findViewById(R.id.next20);
        next20.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity30();
            }
        }));

    }

    public void openActivity30(){
        Intent next20 = new Intent(basicscreen17.this, basicscreen18.class);
        startActivity(next20);
    }
}
