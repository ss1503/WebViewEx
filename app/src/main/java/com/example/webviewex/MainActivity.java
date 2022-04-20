package com.example.webviewex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    WebView wV;
    EditText getSiteEt;

    //public String url = "http://www.pornHub.com/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wV = (WebView) findViewById(R.id.webView);
        wV.getSettings().setJavaScriptEnabled(true);

        getSiteEt = (EditText) findViewById(R.id.siteEt);
    }

    public void go(View view) {
        String site = getSiteEt.getText().toString();

        wV.loadUrl(site);
        wV.setWebViewClient(new MyWebViewClient());
    }
}


class MyWebViewClient extends WebViewClient {
    public boolean shouldOverideUrlLoading(WebView view, String url) {
        view.loadUrl(url);
        return true;
    }
}