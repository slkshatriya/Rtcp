package com.technocrats.rtcp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import javax.xml.transform.Templates;

public class basicscreen18 extends AppCompatActivity {
    Button next21;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basicscreen18);
        next21=findViewById(R.id.next21);
        next21.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity31();
            }
        }));
    }

    public void openActivity31(){
        Intent next21 = new Intent(basicscreen18.this, MainActivity.class);
        startActivity(next21);
    }
}
