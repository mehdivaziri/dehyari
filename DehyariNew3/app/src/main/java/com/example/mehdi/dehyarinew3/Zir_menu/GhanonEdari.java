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
import com.example.mehdi.dehyarinew3.adapter.GanonEdariAdapter;
import com.example.mehdi.dehyarinew3.adapter.GanonHdAdapter;
import com.example.mehdi.dehyarinew3.model.ModelListGhanon;

import java.util.ArrayList;
import java.util.List;

public class GhanonEdari extends AppCompatActivity {

    private RecyclerView mList;
    private ImageView imgBack;
    private List<ModelListGhanon> mainLists=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ghanon_edari);
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
        listGhanon1.setTitle("آیین نگارش");
        mainLists.add(listGhanon1);
        ModelListGhanon listGhanon2=new ModelListGhanon();
        listGhanon2.setTitle("نمونه نامه های اداری");
        mainLists.add(listGhanon2);
        ModelListGhanon listGhanon3=new ModelListGhanon();
        listGhanon3.setTitle("عبارت استاندارد در نامه های اداری و رسمی");
        mainLists.add(listGhanon3);
        ModelListGhanon listGhanon4=new ModelListGhanon();
        listGhanon4.setTitle("نمونه تبریک ها");
        mainLists.add(listGhanon4);
        ModelListGhanon listGhanon5=new ModelListGhanon();
        listGhanon5.setTitle("نحوه تعیین درجه دهیاریها");
        mainLists.add(listGhanon5);
        ModelListGhanon listGhanon6=new ModelListGhanon();
        listGhanon6.setTitle("فن بیان و گویندگی");
        mainLists.add(listGhanon6);
        ModelListGhanon listGhanon7=new ModelListGhanon();
        listGhanon7.setTitle("سخنوری و روایط عمومی");
        mainLists.add(listGhanon7);
        ModelListGhanon listGhanon8=new ModelListGhanon();
        listGhanon8.setTitle("ده قانون طلائی برای برگزاری سمینارهاوگردهمائی ها");
        mainLists.add(listGhanon8);
        ModelListGhanon listGhanon9=new ModelListGhanon();
        listGhanon9.setTitle("40اصل فن بیان در برخورد با مشتری");
        mainLists.add(listGhanon9);


        ModelListGhanon listGhanon10=new ModelListGhanon();
        listGhanon10.setTitle("احکام دائمی برنامه توسعه کشور");
        mainLists.add(listGhanon10);

        ModelListGhanon listGhanon11=new ModelListGhanon();
        listGhanon11.setTitle("بخشنامه کمیته انطباق");
        mainLists.add(listGhanon11);

        ModelListGhanon listGhanon12=new ModelListGhanon();
        listGhanon12.setTitle("شیوه نامه نحوه مکاتبات اداری دهیاریهای کشور");
        mainLists.add(listGhanon12);


        ModelListGhanon listGhanon13=new ModelListGhanon();
        listGhanon13.setTitle("نظام نامه ارزیابی عملکرد دهیاریهای کشور");
        mainLists.add(listGhanon13);


        ModelListGhanon listGhanon14=new ModelListGhanon();
        listGhanon14.setTitle("شیوه نامه اطلاع رسانی عمومی مدیریت روستا");
        mainLists.add(listGhanon14);

        ModelListGhanon listGhanon15=new ModelListGhanon();
        listGhanon15.setTitle("شیوه نامه نحوه انتخاب و عزل دهیار");
        mainLists.add(listGhanon15);

        ModelListGhanon listGhanon16=new ModelListGhanon();
        listGhanon16.setTitle("دستورالعمل ایجاد یکنواختی نظام عوارض شورای اسلامی بخش");
        mainLists.add(listGhanon16);


        ModelListGhanon listGhanon17=new ModelListGhanon();
        listGhanon17.setTitle("تعرفه عوارض و بهای خدمات");
        mainLists.add(listGhanon17);



        ModelListGhanon listGhanon18=new ModelListGhanon();
        listGhanon18.setTitle("منشور اخلاقی دهیاری");
        mainLists.add(listGhanon18);


        ModelListGhanon listGhanon19=new ModelListGhanon();
        listGhanon19.setTitle("شیوه نامه تهیه و نصب منشور اخلاقی دهیاری");
        mainLists.add(listGhanon19);


        ModelListGhanon listGhanon20=new ModelListGhanon();
        listGhanon20.setTitle("آیین نامه نحوه وضع و وصول عوارض توسط شورای بخش");
        mainLists.add(listGhanon20);


        ModelListGhanon listGhanon21=new ModelListGhanon();
        listGhanon21.setTitle("بخشنامه ضرورت ارسال مصوبه عزل دهیار به کارگروه انطباق");
        mainLists.add(listGhanon21);



        GanonEdariAdapter mAdapter = new GanonEdariAdapter(mainLists);
        //seting recyclerview
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        mList.setLayoutManager(mLayoutManager);
        mList.setItemAnimator(new DefaultItemAnimator());
        //set adapter to recyclerview
        mList.setAdapter(mAdapter);
    }

}
