package com.technocrats.rtcp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class basicsscreen2 extends AppCompatActivity {
    ImageView taable,table;
    Button next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basicsscreen2);

        taable = findViewById(R.id.taable);
        table = findViewById(R.id.table);
        next = findViewById(R.id.next2);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openActivity10();
            }
        });

    }
    public void openActivity10(){
        Intent next2 = new Intent(basicsscreen2.this, basicsscreen3.class);
        startActivity(next2);
    }
}
