package com.technocrats.rtcp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class compscreen2 extends AppCompatActivity {
Button next51;
ImageView compscr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compscreen2);
        next51=findViewById(R.id.next51);
        compscr = findViewById(R.id.compscr);
        next51.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity51();
            }
        });
    }
    public void openActivity51(){
        Intent next51=new Intent(compscreen2.this,compsearching.class);
        startActivity(next51);
    }
}
