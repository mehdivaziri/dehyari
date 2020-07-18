package com.example.mehdi.dehyarinew3.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ProgressBar;

import com.example.mehdi.dehyarinew3.DownloadTask;
import com.example.mehdi.dehyarinew3.R;

public class Bashgah_news extends AppCompatActivity {
    private Button btnDownload;
    private Button btnView;
    private String URL = "http://www.azhmanschool.ir/img/IranElecomp.pdf";
    private String URL2 = "http://www.azhmanschool.ir/admin/dehyar.apk";
    private WebView webview;
    private ProgressBar progressbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_bashgah_news);





        webview = (WebView) findViewById(R.id.webview);
        webview.getSettings().setJavaScriptEnabled(true);
        String url = "http://www.tdbm.ir";
        webview.loadUrl(url);




    }
}
