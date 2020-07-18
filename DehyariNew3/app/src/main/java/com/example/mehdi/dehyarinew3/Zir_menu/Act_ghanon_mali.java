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
import com.example.mehdi.dehyarinew3.adapter.GhanonMaliAdapter;
import com.example.mehdi.dehyarinew3.adapter.GhanonOmraniAdapter;
import com.example.mehdi.dehyarinew3.model.ModelListGhanon;

import java.util.ArrayList;
import java.util.List;

public class Act_ghanon_mali extends AppCompatActivity {

    private RecyclerView mList;
    private ImageView imgBack;
    private List<ModelListGhanon> mainLists=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_act_ghanon_mali);
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
        listGhanon1.setTitle("دستور العمل حقوق و مزایا دهیاران97");
        mainLists.add(listGhanon1);
        ModelListGhanon listGhanon2=new ModelListGhanon();
        listGhanon2.setTitle("دستمزد مبنای کسر بیمه97");
        mainLists.add(listGhanon2);
        ModelListGhanon listGhanon3=new ModelListGhanon();
        listGhanon3.setTitle("دستورالعمل تهیه اسناد هزینه و مدارک ضمیمه");
        mainLists.add(listGhanon3);
        ModelListGhanon listGhanon4=new ModelListGhanon();
        listGhanon4.setTitle("شیوه نامه حقوق مسئولین مالی");
        mainLists.add(listGhanon4);
        ModelListGhanon listGhanon5=new ModelListGhanon();
        listGhanon5.setTitle("شیوه نامه حقوق مسئولین فنی");
        mainLists.add(listGhanon5);
        ModelListGhanon listGhanon6=new ModelListGhanon();
        listGhanon6.setTitle("طرز استفاده از تنخواه گردان دهیاری ها");
        mainLists.add(listGhanon6);
        ModelListGhanon listGhanon7=new ModelListGhanon();
        listGhanon7.setTitle("دستورالعمل نحوه حسابرسی دهیاریها");
        mainLists.add(listGhanon7);
        ModelListGhanon listGhanon8=new ModelListGhanon();
        listGhanon8.setTitle("قرارداد انجام حسابرسی");
        mainLists.add(listGhanon8);
        ModelListGhanon listGhanon9=new ModelListGhanon();
        listGhanon9.setTitle("ضوابط تهیه و الصاق برچسب اموال دهیاری");
        mainLists.add(listGhanon9);

        ModelListGhanon listGhanon10=new ModelListGhanon();
        listGhanon10.setTitle("دستورالعمل حقوق و مزایای دهیاران در سال96");
        mainLists.add(listGhanon10);

        ModelListGhanon listGhanon11=new ModelListGhanon();
        listGhanon11.setTitle("دستورالعمل نحوه تعیین حقوق و مزایای دهیاران");
        mainLists.add(listGhanon11);

        ModelListGhanon listGhanon12=new ModelListGhanon();
        listGhanon12.setTitle("ممنوعیت به کارگیری کارکنان استاداری،فرمانداری و بخشداری ب عنوان مسوول مالی دهیاری ها");
        mainLists.add(listGhanon12);

        ModelListGhanon listGhanon13=new ModelListGhanon();
        listGhanon13.setTitle("رشته ها و گرایش های تحصیلی مسوول امور مالی");
        mainLists.add(listGhanon13);

        ModelListGhanon listGhanon14=new ModelListGhanon();
        listGhanon14.setTitle("ابلاغ فرم قرارداد و حکم حقوقی دهیاران تمام وقت و پاره وقت");
        mainLists.add(listGhanon14);


        ModelListGhanon listGhanon15=new ModelListGhanon();
        listGhanon15.setTitle("دستورالعمل نحوه پرداخت حقوق و مزایای مسوولین مالی دهیاری ها");
        mainLists.add(listGhanon15);







        GhanonMaliAdapter mAdapter = new GhanonMaliAdapter(mainLists);
        //seting recyclerview
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        mList.setLayoutManager(mLayoutManager);
        mList.setItemAnimator(new DefaultItemAnimator());
        //set adapter to recyclerview
        mList.setAdapter(mAdapter);
    }
}
