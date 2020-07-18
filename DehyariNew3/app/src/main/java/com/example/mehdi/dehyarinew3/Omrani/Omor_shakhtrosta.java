package com.example.mehdi.dehyarinew3.Omrani;

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
import com.example.mehdi.dehyarinew3.model.ModelListGhanon;

import java.util.ArrayList;
import java.util.List;

public class Omor_shakhtrosta extends AppCompatActivity {
    private RecyclerView mList;
    private ImageView imgBack;
    private List<ModelListGhanon> mainLists=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_omor_shakhtrosta);

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
        listGhanon1.setTitle("دستورالعمل اجرایی فرآیند تشکیل کمسیون و نحوه رسیدگی به تخلفات ساختمانی در روستاها");
        mainLists.add(listGhanon1);
        ModelListGhanon listGhanon2=new ModelListGhanon();
        listGhanon2.setTitle("تعیین مرجع صدور پروانه ساختمانی در روستاهایدفاقد دهیاری و خارج از حریم شهر");
        mainLists.add(listGhanon2);
        ModelListGhanon listGhanon3=new ModelListGhanon();
        listGhanon3.setTitle("محل واریز عوارض و جرائم ساخت و سازهای خارج از حریم شهرها و خارج از محدوده روستاهای دارای دهیاری");
        mainLists.add(listGhanon3);


        ModelListGhanon listGhanon4=new ModelListGhanon();
        listGhanon4.setTitle("تعیین مرجع صدور پروانه ساختمانی،شیوه رسیدگی به تخلفات ساختمانی و نحوه تعیین  جرائم و عوارض متعلقه");
        mainLists.add(listGhanon4);


        ModelListGhanon listGhanon5=new ModelListGhanon();
        listGhanon5.setTitle("گردش کار صدور پروانه ساختمانی روستایی در روستاهای دارای دهیار");
        mainLists.add(listGhanon5);


        Omor_sakhtroste_Adapter mAdapter = new Omor_sakhtroste_Adapter(mainLists);
        //seting recyclerview
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        mList.setLayoutManager(mLayoutManager);
        mList.setItemAnimator(new DefaultItemAnimator());
        //set adapter to recyclerview
        mList.setAdapter(mAdapter);








    }
}
