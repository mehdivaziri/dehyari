package com.example.mehdi.dehyarinew3.Zir_menu;

import android.os.Build;
import android.os.Bundle;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

import com.example.mehdi.dehyarinew3.R;
import com.example.mehdi.dehyarinew3.adapter.GanonHdAdapter;
import com.example.mehdi.dehyarinew3.model.ModelListGhanon;

import java.util.ArrayList;
import java.util.List;

public class GhanonEdariActivity extends AppCompatActivity {
    private RecyclerView mList;
    private ImageView imgBack;
    private List<ModelListGhanon> mainLists=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_ghanon_hd);
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

        ModelListGhanon listGhanon=new ModelListGhanon();
        listGhanon.setTitle("آیین نگارش مکاتبات اداری");
        mainLists.add(listGhanon);
        listGhanon.setTitle("نمونه نامه های اداری");
        mainLists.add(listGhanon);
        listGhanon.setTitle("عبارت استاندارد در نامه های اداری و رسمی");
        mainLists.add(listGhanon);
        listGhanon.setTitle("نمونه تبریک ها");
        mainLists.add(listGhanon);
        listGhanon.setTitle("نحوه تعیین درجه دهیاریها");
        mainLists.add(listGhanon);
        listGhanon.setTitle("فن بیان و گویندگی");
        mainLists.add(listGhanon);
        listGhanon.setTitle("سخنوری و روایط عمومی");
        mainLists.add(listGhanon);
        listGhanon.setTitle("ده قانون طلائی برای برگزاری سمینارهاوگردهمائی ها");
        mainLists.add(listGhanon);
        listGhanon.setTitle("40اصل فن بیان در برخورد با مشتری");
        mainLists.add(listGhanon);

        GanonHdAdapter mAdapter = new GanonHdAdapter(mainLists);
        //seting recyclerview
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        mList.setLayoutManager(mLayoutManager);
        mList.setItemAnimator(new DefaultItemAnimator());
        //set adapter to recyclerview
        mList.setAdapter(mAdapter);
    }
}
