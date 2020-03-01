package com.technocrats.rtcp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class basicscreen15 extends AppCompatActivity {

    Button next18;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basicscreen15);
        next18 =findViewById(R.id.next18);
        next18.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity28();
            }
        }));
    }

    public void openActivity28(){
        Intent next18 = new Intent(basicscreen15.this, basicscreen16.class);
        startActivity(next18);
    }
}
