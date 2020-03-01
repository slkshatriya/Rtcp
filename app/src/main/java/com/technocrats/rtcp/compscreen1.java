package com.technocrats.rtcp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class compscreen1 extends AppCompatActivity {
Button next50;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compscreen1);
        next50=findViewById(R.id.next50);
        next50.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity50();

            }
        });



    }
    public  void openActivity50(){
        Intent next50=new Intent(compscreen1.this, compscreen2.class);
        startActivity(next50);
    }
}
