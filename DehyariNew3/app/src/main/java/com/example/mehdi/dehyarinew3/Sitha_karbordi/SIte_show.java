package com.example.mehdi.dehyarinew3.Sitha_karbordi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.Button;

import com.example.mehdi.dehyarinew3.R;
import com.example.mehdi.dehyarinew3.adapter.Edarinagaresh_tabrik_Adapter;

public class SIte_show extends AppCompatActivity {
    private Button btnDownload;
    private Button btnView;
    private String URL = "http://www.azhmanschool.ir/img/IranElecomp.pdf";
    private String URL2 = "http://www.azhmanschool.ir/admin/dehyar.apk";
    private WebView webview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_site_show);



        webview = (WebView) findViewById(R.id.webview);
        webview.getSettings().setJavaScriptEnabled(true);
        String item=getIntent().getExtras().getString(Edarinagaresh_tabrik_Adapter.TABRIK);
        if (item.equals("پرتال وزارت کشور")) {

            String url = "https://www.moi.ir";
            webview.loadUrl(url);
        }

        if (item.equals("سامانه یکپارچه بودجه دهیاریها")) {

            String url = "http://imo.org.ir/";
            webview.loadUrl(url);
        }



        if (item.equals("سامانه آمار و اطلاعات دهیاریها")) {

            String url = "https://sade.silbarg.ir/index.aspx";
            webview.loadUrl(url);
        }


        if (item.equals("مشاهده سوابق بیمه تامین اجتماعی")) {

            String url = "https://www.tamin.ir/News/Item/6506/2/6506.html";
            webview.loadUrl(url);
        }


        if (item.equals("سامانه راه و روستا")) {

            String url = "http://map.roostanet.com";
            webview.loadUrl(url);
        }


        if (item.equals("سامانه اشتغال روستایی")) {

            String url = "https://kara.mcls.gov.ir/Home/Main_Header";
            webview.loadUrl(url);
        }

        if (item.equals("پژوهشهای روستایی")) {

            String url = "https://jrur.ut.ac.ir";
            webview.loadUrl(url);
        }







    }
}
