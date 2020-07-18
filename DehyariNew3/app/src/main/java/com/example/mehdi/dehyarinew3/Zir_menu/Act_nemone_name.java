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
import com.example.mehdi.dehyarinew3.adapter.Ghanon_nemonename_Adapter;
import com.example.mehdi.dehyarinew3.model.ModelListGhanon;

import java.util.ArrayList;
import java.util.List;

public class Act_nemone_name extends AppCompatActivity {
    private RecyclerView mList;
    private ImageView imgBack;
    private List<ModelListGhanon> mainLists=new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_act_nemone_name);
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
        listGhanon1.setTitle("درخواست وام مسکن و تعمیرات");
        mainLists.add(listGhanon1);
        ModelListGhanon listGhanon2=new ModelListGhanon();
        listGhanon2.setTitle("درخواست تسهیلات");
        mainLists.add(listGhanon2);
        ModelListGhanon listGhanon3=new ModelListGhanon();
        listGhanon3.setTitle("اعتراض و اخطار");
        mainLists.add(listGhanon3);
        ModelListGhanon listGhanon4=new ModelListGhanon();
        listGhanon4.setTitle("نامه پرداخت حقوق معوقه");
        mainLists.add(listGhanon4);
        ModelListGhanon listGhanon5=new ModelListGhanon();
        listGhanon5.setTitle("صدور مجوز");
        mainLists.add(listGhanon5);
        ModelListGhanon listGhanon6=new ModelListGhanon();
        listGhanon6.setTitle("اظهارنامه");
        mainLists.add(listGhanon6);
        ModelListGhanon listGhanon7=new ModelListGhanon();
        listGhanon7.setTitle("استعفا نامه اداری");
        mainLists.add(listGhanon7);
        ModelListGhanon listGhanon8=new ModelListGhanon();
        listGhanon8.setTitle("درخواست دسته چک");
        mainLists.add(listGhanon8);
        ModelListGhanon listGhanon9=new ModelListGhanon();
        listGhanon9.setTitle("درخواست بخشودگی جرائم");
        mainLists.add(listGhanon9);

        ModelListGhanon listGhanon10=new ModelListGhanon();
        listGhanon10.setTitle("درخواست همکاری به آگهی");
        mainLists.add(listGhanon10);

        ModelListGhanon listGhanon11=new ModelListGhanon();
        listGhanon11.setTitle("پاسخ به پیام تبریک انتصاب");
        mainLists.add(listGhanon11);

        ModelListGhanon listGhanon12=new ModelListGhanon();
        listGhanon12.setTitle("نامه به اداره دارایی و مالیاتی");
        mainLists.add(listGhanon12);


        ModelListGhanon listGhanon13=new ModelListGhanon();
        listGhanon13.setTitle("نامه درخصوص غیبت و عدم حضور");
        mainLists.add(listGhanon13);

        ModelListGhanon listGhanon14=new ModelListGhanon();
        listGhanon14.setTitle("استعفا نامه اداری");
        mainLists.add(listGhanon14);

        ModelListGhanon listGhanon15=new ModelListGhanon();
        listGhanon15.setTitle("استشهاد محلی درخواست پروانه کسب");
        mainLists.add(listGhanon15);


        ModelListGhanon listGhanon16=new ModelListGhanon();
        listGhanon16.setTitle("اخطار به علت تاخیر و بی انضباطی");
        mainLists.add(listGhanon16);

        ModelListGhanon listGhanon17=new ModelListGhanon();
        listGhanon17.setTitle("اعتراض به تنیجه گزینش");
        mainLists.add(listGhanon17);

        ModelListGhanon listGhanon18=new ModelListGhanon();
        listGhanon18.setTitle("درخواست استفاده از دیوار جهت تبلیغات");
        mainLists.add(listGhanon18);

        ModelListGhanon listGhanon19=new ModelListGhanon();
        listGhanon19.setTitle("تقدیر و تشکر بابت همکاری");
        mainLists.add(listGhanon19);

        ModelListGhanon listGhanon20=new ModelListGhanon();
        listGhanon20.setTitle("نامه به فرمانداری جهت درخواست گاز");
        mainLists.add(listGhanon20);

        ModelListGhanon listGhanon21=new ModelListGhanon();
        listGhanon21.setTitle("تقدیرنامه اداری");
        mainLists.add(listGhanon21);

        ModelListGhanon listGhanon22=new ModelListGhanon();
        listGhanon22.setTitle("تقاضای تقسیط مالیات");
        mainLists.add(listGhanon22);

        ModelListGhanon listGhanon23=new ModelListGhanon();
        listGhanon23.setTitle("پیام تبریک انتصاب");
        mainLists.add(listGhanon23);

        ModelListGhanon listGhanon24=new ModelListGhanon();
        listGhanon24.setTitle("درخواست امریه");
        mainLists.add(listGhanon24);

        ModelListGhanon listGhanon25=new ModelListGhanon();
        listGhanon25.setTitle("درخواست مرخصی");
        mainLists.add(listGhanon25);

        ModelListGhanon listGhanon26=new ModelListGhanon();
        listGhanon26.setTitle("عدم پاسخ یک اداره به نامه ارسالی");
        mainLists.add(listGhanon26);

        ModelListGhanon listGhanon27=new ModelListGhanon();
        listGhanon27.setTitle("درخواست غرفه در نمایشگاه");
        mainLists.add(listGhanon27);

        ModelListGhanon listGhanon28=new ModelListGhanon();
        listGhanon28.setTitle("درخواست و تقاضای افزایش حقوق پرسنل از مدیران");
        mainLists.add(listGhanon28);

        ModelListGhanon listGhanon29=new ModelListGhanon();
        listGhanon29.setTitle("درخواست وام از بانک");
        mainLists.add(listGhanon29);

        ModelListGhanon listGhanon30=new ModelListGhanon();
        listGhanon30.setTitle("درخواست احداث سالن ورزشی");
        mainLists.add(listGhanon30);

        ModelListGhanon listGhanon31=new ModelListGhanon();
        listGhanon31.setTitle("نامه به فرمانداری");
        mainLists.add(listGhanon31);

        ModelListGhanon listGhanon32=new ModelListGhanon();
        listGhanon32.setTitle("دعوت و شرکت در جلسه");
        mainLists.add(listGhanon32);

        ModelListGhanon listGhanon33=new ModelListGhanon();
        listGhanon33.setTitle("درخواست جهت وقت ملاقات");
        mainLists.add(listGhanon33);

        ModelListGhanon listGhanon34=new ModelListGhanon();
        listGhanon34.setTitle("تعهد نامه پرداخت اقساط وام");
        mainLists.add(listGhanon34);

        ModelListGhanon listGhanon35=new ModelListGhanon();
        listGhanon35.setTitle("معرفی نامه");
        mainLists.add(listGhanon35);

        Ghanon_nemonename_Adapter mAdapter = new Ghanon_nemonename_Adapter(mainLists);
        //seting recyclerview
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        mList.setLayoutManager(mLayoutManager);
        mList.setItemAnimator(new DefaultItemAnimator());
        //set adapter to recyclerview
        mList.setAdapter(mAdapter);
    }

}
