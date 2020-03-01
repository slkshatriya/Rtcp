package com.technocrats.rtcp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class compscreen4 extends AppCompatActivity {
Button next53;
ImageView comp7,comp8,comp9,comp10,comp11;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compscreen4);
        next53=findViewById(R.id.next53);
        comp7=findViewById(R.id.comp7);
        comp8=findViewById(R.id.comp8);
        comp9=findViewById(R.id.comp9);
        comp10=findViewById(R.id.comp10);
        comp11=findViewById(R.id.comp11);
        next53.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity53();
            }
        });

    }
    public void openActivity53(){
        Intent next53=new Intent(compscreen4.this,compscreen5.class);
        startActivity(next53);
    }
}
