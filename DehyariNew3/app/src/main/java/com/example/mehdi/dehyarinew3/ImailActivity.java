package com.example.mehdi.dehyarinew3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.net.InetAddress;

public class ImailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_imail);
        Button btnSend=findViewById(R.id.btnSend);
        final EditText editPishnahad=findViewById(R.id.editPishnahad);

        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    if (isConnected())
                        sendImail(editPishnahad.getText().toString());
                    else
                        Toast.makeText(ImailActivity.this, "اتصال اینترنت را بررسی نمایید", Toast.LENGTH_SHORT).show();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        });


    }

    private void sendImail(String s) {
        Intent i = new Intent(Intent.ACTION_SEND);
        i.setType("message/rfc822");
        i.putExtra(Intent.EXTRA_EMAIL  , new String[]{"dehyarmashad@gmail.com"});
        i.putExtra(Intent.EXTRA_SUBJECT, "پیشنهاد");
        i.putExtra(Intent.EXTRA_TEXT   , s);
        try {
            startActivity(Intent.createChooser(i, "Send mail..."));
        } catch (android.content.ActivityNotFoundException ex) {
            Toast.makeText(ImailActivity.this, "There are no email clients installed.", Toast.LENGTH_SHORT).show();
        }
    }
    public boolean isConnected() throws InterruptedException, IOException {
        final String command = "ping -c 1 google.com";
        return Runtime.getRuntime().exec(command).waitFor() == 0;
    }
}
