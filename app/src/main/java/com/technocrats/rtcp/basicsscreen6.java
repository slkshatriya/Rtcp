package com.technocrats.rtcp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class basicsscreen6 extends AppCompatActivity {
    ImageView imgswitch;
    Button next7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basicsscreen6);

        imgswitch = findViewById(R.id.imgswitch);
        next7 = findViewById(R.id.next7);
        next7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity16();
            }
        });
    }
    public void openActivity16(){
        Intent next6 = new Intent(basicsscreen6.this, basicsscreen7.class);
        startActivity(next6);
    }
}
