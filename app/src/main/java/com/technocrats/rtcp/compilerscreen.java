package com.technocrats.rtcp;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class compilerscreen extends AppCompatActivity {
    WebView web;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compilerscreen);
        web = (WebView)findViewById(R.id.web);
        web.getSettings().setJavaScriptEnabled(true);
        web.getSettings().setDomStorageEnabled(true);

        web.setWebViewClient(new WebViewClient());

        web.loadUrl("https://www.onlinegdb.com/online_c++_compiler");
    }
    @Override
    public void onBackPressed() {
        if (web.canGoBack()){
            web.goBack();
        }else {
            super.onBackPressed();
        }
    }
}
