package com.example.mehdi.dehyarinew3.Zir_menu;

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
import com.example.mehdi.dehyarinew3.adapter.GanonHdAdapter;
import com.example.mehdi.dehyarinew3.adapter.GhanonOmraniAdapter;
import com.example.mehdi.dehyarinew3.model.ModelListGhanon;

import java.util.ArrayList;
import java.util.List;

public class Act_ghanon_omrani extends AppCompatActivity {

    private RecyclerView mList;
    private ImageView imgBack;
    private List<ModelListGhanon> mainLists=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_ghanon_omrani);
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
        listGhanon1.setTitle("امورتفکیک و افراز اراضی");
         mainLists.add(listGhanon1);
        ModelListGhanon listGhanon2=new ModelListGhanon();
        listGhanon2.setTitle("امور ساخت و ساز روستایی");
        mainLists.add(listGhanon2);
        ModelListGhanon listGhanon3=new ModelListGhanon();
        listGhanon3.setTitle("امور فنی و عمرانی دهیاری ها");
        mainLists.add(listGhanon3);
        ModelListGhanon listGhanon4=new ModelListGhanon();
        listGhanon4.setTitle("فضای سبز");
        mainLists.add(listGhanon4);
        ModelListGhanon listGhanon5=new ModelListGhanon();
        listGhanon5.setTitle("شیوه نامه های پسماند");
        mainLists.add(listGhanon5);
        ModelListGhanon listGhanon6=new ModelListGhanon();
        listGhanon6.setTitle("آتش نشانی و مدیریت بحران");
        mainLists.add(listGhanon6);
        ModelListGhanon listGhanon7=new ModelListGhanon();
        listGhanon7.setTitle("ساماندهی آرامستان ها");
        mainLists.add(listGhanon7);
        ModelListGhanon listGhanon8=new ModelListGhanon();
        listGhanon8.setTitle("حمل و نقل");
        mainLists.add(listGhanon8);
        ModelListGhanon listGhanon9=new ModelListGhanon();
        listGhanon9.setTitle("بهداشت محیط روستایی");
        mainLists.add(listGhanon9);

        GhanonOmraniAdapter mAdapter = new GhanonOmraniAdapter(mainLists);
        //seting recyclerview
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        mList.setLayoutManager(mLayoutManager);
        mList.setItemAnimator(new DefaultItemAnimator());
        //set adapter to recyclerview
        mList.setAdapter(mAdapter);
    }
}
