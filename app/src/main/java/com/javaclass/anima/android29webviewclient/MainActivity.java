package com.javaclass.anima.android29webviewclient;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    WebView webView;
    Button click1,click2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView = (WebView) findViewById(R.id.webview);

        click1 = (Button) findViewById(R.id.click1);
        click2 = (Button) findViewById(R.id.click2);

        click1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sendToJavaScript1();
            }
        });


        click2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                send2JavaScript2();
            }
        });

        initWebview();
    }

    private void initWebview(){
        webView.setWebViewClient(new WebViewClient());

        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);

        webView.loadUrl("file:///android_asset/myweb.html");

    }

    private void sendToJavaScript1(){
        webView.loadUrl("javascript:fromAndroid('Hello,World.')");
    }

    private void send2JavaScript2(){
        webView.loadUrl("javascript:fromAndroid('"+(int)(Math.random()*49+1)+ "')");
    }
}



