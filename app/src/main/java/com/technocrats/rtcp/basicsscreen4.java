package com.technocrats.rtcp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class basicsscreen4 extends AppCompatActivity {
    ImageView tablle;
    Button next4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basicsscreen4);
        tablle = findViewById(R.id.tablle);
        next4 = findViewById(R.id.next4);
        next4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity14();
            }
        });
    }
    public void openActivity14(){
        Intent next4 = new Intent(basicsscreen4.this, basicsscreen5.class);
        startActivity(next4);
    }
}
