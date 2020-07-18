package com.example.mehdi.dehyarinew3.ac_edari;

import android.Manifest;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Environment;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.mehdi.dehyarinew3.CheckForSDCard;
import com.example.mehdi.dehyarinew3.R;
import com.example.mehdi.dehyarinew3.TextViewEx;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import pub.devrel.easypermissions.EasyPermissions;

    public class Aeennegaresh_edari extends AppCompatActivity {
    private ImageView imgShare;
    private TextViewEx txtMatn;
    private String s1;
    private String s2;
    private String s3;
    private  boolean setLongMessage=false;
    private ImageView imgBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aeennegaresh_edari);


        imgShare =findViewById(R.id.imgShare);
        final TextViewEx txtViewEx = (TextViewEx) findViewById(R.id.txtMatn);
        txtViewEx.setText(getString(R.string.name_edari), false); // true: enables justification

        Window window = this.getWindow();
        if (Build.VERSION.SDK_INT > Build.VERSION_CODES.KITKAT_WATCH) {
            // clear FLAG_TRANSLUCENT_STATUS flag:
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);

// add FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS flag to the window
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);

// finally change the color
            window.setStatusBarColor(ContextCompat.getColor(this,R.color.colorPrimaryDark));
        }



        // Optional hyphenation:
        // Words syllables must be pre-separated with a syllableSeparator string (character)
        // Example: A com*put*er is a gen*er*al pur*pose de*vice that...
        //   txtViewEx.setHyphenate(true, "*");

     /*   String currentString = txtMatn.getText().toString();
        if (currentString.length()<3000){
            s1=currentString;
        }else {
            String[] separated = currentString.split(".");
            StringBuilder stringBuilder=new StringBuilder();
            for (int i=0;i<separated.length;i++){
                stringBuilder.append(separated[i]);
                if (stringBuilder.toString().length()<3000&&!setLongMessage){
                    s1=stringBuilder.toString();
                    setLongMessage=true;
                    stringBuilder.delete(0,stringBuilder.length());
                }
                if (setLongMessage){
                    s2=stringBuilder.toString();
                    stringBuilder.delete(0,stringBuilder.length());
                }
            }


        }*/


        imgBack=findViewById(R.id.imgBack);
        imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });


        imgShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent sharingIntent1 = new Intent(android.content.Intent.ACTION_SEND);
                sharingIntent1.setType("text/plain");
                sharingIntent1.putExtra(android.content.Intent.EXTRA_SUBJECT, "Subject Here");
                sharingIntent1.putExtra(android.content.Intent.EXTRA_TEXT,  txtViewEx.getText().toString());
                startActivity(Intent.createChooser(sharingIntent1, "Share text via"));

            }
        });



    }
}
