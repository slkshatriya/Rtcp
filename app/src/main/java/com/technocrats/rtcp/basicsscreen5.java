package com.technocrats.rtcp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class basicsscreen5 extends AppCompatActivity {
    ImageView imgelse;
    Button next6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basicsscreen5);

        imgelse = findViewById(R.id.imgelse);
        next6 = findViewById(R.id.next6);
        next6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActiviity14();
            }
        });

    }
    public void openActiviity14(){
        Intent next6 = new Intent(basicsscreen5.this, basicsscreen6.class );
        startActivity(next6);
    }
}
