package com.technocrats.rtcp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class basicsscreen8 extends AppCompatActivity {
    ImageView imgdowhileloopfirst;
    Button next9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basicsscreen8);

        imgdowhileloopfirst = findViewById(R.id.imgdowhilefirst);
        next9 = findViewById(R.id.next11);
        next9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity18();
            }
        });
    }
    public void openActivity18(){
        Intent next11 = new Intent(basicsscreen8.this, basicsscreen9.class);
        startActivity(next11);
    }
}
