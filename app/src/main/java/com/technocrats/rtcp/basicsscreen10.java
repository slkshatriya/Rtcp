package com.technocrats.rtcp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class basicsscreen10 extends AppCompatActivity {
    ImageView imge;
    Button next13;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basicsscreen10);
         imge=findViewById(R.id.imge);
         next13=findViewById(R.id.next13);
         next13.setOnClickListener((new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 openActivity23();
             }
         }));
    }

    public void openActivity23(){
        Intent next13 = new Intent(basicsscreen10.this, basicsscreen11.class);
        startActivity(next13);
    }
}
