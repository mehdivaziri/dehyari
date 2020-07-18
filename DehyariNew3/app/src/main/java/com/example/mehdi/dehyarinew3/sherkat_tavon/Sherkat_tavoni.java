package com.example.mehdi.dehyarinew3.sherkat_tavon;

import android.os.Build;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

import com.example.mehdi.dehyarinew3.R;
import com.example.mehdi.dehyarinew3.gardeshgari.adapter.Gardeshgary_Adapter;
import com.example.mehdi.dehyarinew3.model.ModelListGhanon;
import com.example.mehdi.dehyarinew3.sherkat_tavon.adapter.Sherkattavoni_Adapter;

import java.util.ArrayList;
import java.util.List;

public class Sherkat_tavoni extends AppCompatActivity {
    private RecyclerView mList;
    private ImageView imgBack;
  //  public static final String TABRIK ="tabrik";
    private List<ModelListGhanon> mainLists=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_sherkat_tavoni);

        init();
        imgBack=findViewById(R.id.imgBack);
        imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        Window window = this.getWindow();
        if (Build.VERSION.SDK_INT > Build.VERSION_CODES.KITKAT_WATCH) {
            // clear FLAG_TRANSLUCENT_STATUS flag:
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);

// add FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS flag to the window
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);

// finally change the colorنمونه نامه های اداری
            window.setStatusBarColor(ContextCompat.getColor(this,R.color.colorPrimaryDark));
        }
    }

    private void init() {
        mList =findViewById(R.id.mList);

        ModelListGhanon listGhanon1=new ModelListGhanon();
        listGhanon1.setTitle("واحد پلیس ساختمان");
        mainLists.add(listGhanon1);
        ModelListGhanon listGhanon2=new ModelListGhanon();
        listGhanon2.setTitle("واحد سد معبر");
        mainLists.add(listGhanon2);
        ModelListGhanon listGhanon3=new ModelListGhanon();
        listGhanon3.setTitle("واحد خدمات بیمه ای");
        mainLists.add(listGhanon3);
        ModelListGhanon listGhanon4=new ModelListGhanon();
        listGhanon4.setTitle("واحد نمایشگاه فروش تجهیزات و مبلمان پارکی");
        mainLists.add(listGhanon4);
        ModelListGhanon listGhanon5=new ModelListGhanon();
        listGhanon5.setTitle("کارخانه آسفالت دهیاریها");
        mainLists.add(listGhanon5);
        ModelListGhanon listGhanon6=new ModelListGhanon();
        listGhanon6.setTitle("نشریه استانی نوید خراسان");
        mainLists.add(listGhanon6);
        ModelListGhanon listGhanon7=new ModelListGhanon();
        listGhanon7.setTitle("پروژه های عمرانی استانی");
        mainLists.add(listGhanon7);
        ModelListGhanon listGhanon8=new ModelListGhanon();
        listGhanon8.setTitle("راه اندازی سایت،کانال های ویژه دهیاریها");
        mainLists.add(listGhanon8);
        ModelListGhanon listGhanon9=new ModelListGhanon();
        listGhanon9.setTitle("معین اقتصادی روستایی بخش مرکزی مشهد");
        mainLists.add(listGhanon9);

        ModelListGhanon listGhanon10=new ModelListGhanon();
        listGhanon10.setTitle("اجرای طرح جامع مدیریت پسماند روستایی");
        mainLists.add(listGhanon10);

        Sherkattavoni_Adapter mAdapter = new Sherkattavoni_Adapter(mainLists);
        //seting recyclerview
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        mList.setLayoutManager(mLayoutManager);
        mList.setItemAnimator(new DefaultItemAnimator());
        //set adapter to recyclerview
        mList.setAdapter(mAdapter);


    }
}
