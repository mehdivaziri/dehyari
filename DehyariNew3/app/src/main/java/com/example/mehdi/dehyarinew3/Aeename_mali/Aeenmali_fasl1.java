package com.example.mehdi.dehyarinew3.Aeename_mali;

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
import com.example.mehdi.dehyarinew3.adapter.Ghanono_aeenmali_adapter;
import com.example.mehdi.dehyarinew3.model.ModelListGhanon;

import java.util.ArrayList;
import java.util.List;

public class Aeenmali_fasl1 extends AppCompatActivity {
    private RecyclerView mList;
    private ImageView imgBack;
    private List<ModelListGhanon> mainLists=new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_aeenmali_fasl1);

        Window window = this.getWindow();
        if (Build.VERSION.SDK_INT > Build.VERSION_CODES.KITKAT_WATCH) {
            // clear FLAG_TRANSLUCENT_STATUS flag:
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);

// add FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS flag to the window
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);

// finally change the color
            window.setStatusBarColor(ContextCompat.getColor(this,R.color.colorPrimaryDark));
        }
       /* Intent intent=new Intent(this,SampelEdariActivity.class);
        startActivity(intent);*/

        imgBack=findViewById(R.id.imgBack);
        imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

        init();


    }

    private void init() {
        mList =findViewById(R.id.mList);
        ModelListGhanon listGhanon1=new ModelListGhanon();
        listGhanon1.setTitle("بخش اول:انواع معاملات و نصاب آنها");
        mainLists.add(listGhanon1);
        ModelListGhanon listGhanon2=new ModelListGhanon();
        listGhanon2.setTitle("بخش دوم:روش انجام معاملات");
        mainLists.add(listGhanon2);
        ModelListGhanon listGhanon3=new ModelListGhanon();
        listGhanon3.setTitle("بخش سوم:مناقصه");
        mainLists.add(listGhanon3);
        ModelListGhanon listGhanon4=new ModelListGhanon();
        listGhanon4.setTitle("بخش چهارم:تحویل کالا یا خدمت");
        mainLists.add(listGhanon4);

        ModelListGhanon listGhanon5=new ModelListGhanon();
        listGhanon5.setTitle("بخش پنجم:مزایده");
        mainLists.add(listGhanon5);


        ModelListGhanon listGhanon6=new ModelListGhanon();
        listGhanon6.setTitle("بخش ششم:سایر مقررات معاملات");
        mainLists.add(listGhanon6);


        Aeenmali_fasl1_Adapter mAdapter = new Aeenmali_fasl1_Adapter(mainLists);
        //seting recyclerview
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        mList.setLayoutManager(mLayoutManager);
        mList.setItemAnimator(new DefaultItemAnimator());
        //set adapter to recyclerview
        mList.setAdapter(mAdapter);

    }
}
