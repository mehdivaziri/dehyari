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

public class Omrani_shive_pasmand extends AppCompatActivity {

    private RecyclerView mList;
    private ImageView imgBack;
    private List<ModelListGhanon> mainLists=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_omrani_shive_pasmand);


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
        listGhanon1.setTitle("شیوه نامه اجرایی دفن پسماندهای عادی در سطح روستاهای کشور");
        mainLists.add(listGhanon1);
        ModelListGhanon listGhanon2=new ModelListGhanon();
        listGhanon2.setTitle("چارچوب توسعه فرهنگ شهروندی در زمینه مدیریت پسماندهای جامد در مناطق روستایی");
        mainLists.add(listGhanon2);
        ModelListGhanon listGhanon3=new ModelListGhanon();
        listGhanon3.setTitle("شیوه نامه تهیه بیوکمپوست از پسماندهای فساد پذیر و فضولات دامی در مناطق روستایی کشور");
        mainLists.add(listGhanon3);

        ModelListGhanon listGhanon4=new ModelListGhanon();
        listGhanon4.setTitle("شیوه نامه پردازش،جداسازی و بازیافت پسماندهای عادی در مناطق روستایی کشور");
        mainLists.add(listGhanon4);

        ModelListGhanon listGhanon5=new ModelListGhanon();
        listGhanon5.setTitle("شیوه نامه چارچوب تنظیم گزارش عملکرد در بخش مدیریت پسماند روستایی استانهای ساحلی");
        mainLists.add(listGhanon5);

        ModelListGhanon listGhanon6=new ModelListGhanon();
        listGhanon6.setTitle("قبض اعلام و وصول هزینه های خدمات مدیریت پسماندهای عادی روستایی وشیوه نامه نحوه کاربرد آن");
        mainLists.add(listGhanon6);

        ModelListGhanon listGhanon7=new ModelListGhanon();
        listGhanon7.setTitle("دستورالعمل نحوه تعیین هزینه خدمات مدیریت پسماندهای روستایی");
        mainLists.add(listGhanon7);

        ModelListGhanon listGhanon8=new ModelListGhanon();
        listGhanon8.setTitle("دستورالعمل کنترل بهداشت قنادی ها در مناطق روستایی");
        mainLists.add(listGhanon8);

        ModelListGhanon listGhanon9=new ModelListGhanon();
        listGhanon9.setTitle("شیوه نامه تهیه طرح های تفکیک از مبدا و دفن بهداشتی پسماندهای روستایی");
        mainLists.add(listGhanon9);

        ModelListGhanon listGhanon10=new ModelListGhanon();
        listGhanon10.setTitle("دستورالعمل استفاده از ظروف و مخازن نگهداری موقت پسماندهای جامد در مناطق روستایی کشور");
        mainLists.add(listGhanon10);

        ModelListGhanon listGhanon11=new ModelListGhanon();
        listGhanon11.setTitle("دستورالعمل نظارت و کنترل بهداشت نانوایی های مناطق روستایی");
        mainLists.add(listGhanon11);

        ModelListGhanon listGhanon12=new ModelListGhanon();
        listGhanon12.setTitle("شیوه نامه تهیه طرح های تفکیک از مبداء و دفن بهداشتی پسماندهای روستایی");
        mainLists.add(listGhanon12);

        ModelListGhanon listGhanon13=new ModelListGhanon();
        listGhanon13.setTitle("دستورالعمل و راهنمای ساخت واحدهای بیوکمپوست خانگی در مناطق روستایی");
        mainLists.add(listGhanon13);

        ModelListGhanon listGhanon14=new ModelListGhanon();
        listGhanon14.setTitle("دستورالعمل کنترل بهداشت کشتار دام و قصابی ها در مناطق روستایی");
        mainLists.add(listGhanon14);


        Omrani_shivepasmand_Adapter mAdapter = new Omrani_shivepasmand_Adapter(mainLists);
        //seting recyclerview
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        mList.setLayoutManager(mLayoutManager);
        mList.setItemAnimator(new DefaultItemAnimator());
        //set adapter to recyclerview
        mList.setAdapter(mAdapter);



    }
}
