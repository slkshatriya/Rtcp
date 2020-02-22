package com.technocrats.rtcp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.technocrats.rtcp.ui.basicscreen15;

import androidx.appcompat.app.AppCompatActivity;

public class basicscreen14 extends AppCompatActivity {

    ImageView img1;
    Button next17;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basicscreen14);
        img1=findViewById(R.id.img1);
        next17 =findViewById(R.id.next16);
        next17.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity27();
            }
        }));
    }

    public void openActivity27(){
        Intent next17 = new Intent(basicscreen14.this, basicscreen15.class);
        startActivity(next17);

    }
}
