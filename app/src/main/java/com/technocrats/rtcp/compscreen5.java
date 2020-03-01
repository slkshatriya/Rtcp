package com.technocrats.rtcp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class compscreen5 extends AppCompatActivity {
    Button next54;
    TextView competitive11,competitive12,competitive13,competitive14,competitive15,competitive16;
    ImageView comp12,comp13,comp14,comp15,comp16;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compscreen5);
        competitive11=findViewById(R.id.compitetive11);
        competitive12=findViewById(R.id.compitetive12);
        competitive13=findViewById(R.id.compitetive13);
        competitive14=findViewById(R.id.compitetive14);
        competitive15=findViewById(R.id.compitetive15);
        competitive16=findViewById(R.id.compitetive16);
        comp12=findViewById(R.id.comp12);
        comp13=findViewById(R.id.comp13);
        comp14=findViewById(R.id.comp14);
        comp15=findViewById(R.id.comp15);
        comp16=findViewById(R.id.comp16);

        next54=findViewById(R.id.next54);
        next54.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity54();
            }
        });
    }
    public void openActivity54(){
        Intent next54=new Intent(compscreen5.this,compscreen6.class);
        startActivity(next54);
    }
}
