package com.technocrats.rtcp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class compsearching extends AppCompatActivity {
Button next52;
ImageView comp6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compsearching);
        next52=findViewById(R.id.next52);
        comp6=findViewById(R.id.comp6);
        next52.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity52();
            }
        });
    }
    public void openActivity52(){
        Intent next52=new Intent(compsearching.this,compscreen4.class);
        startActivity(next52);
    }
}
