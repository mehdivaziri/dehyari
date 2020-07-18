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

public class Omor_fani_omrani extends AppCompatActivity {
    private RecyclerView mList;
    private ImageView imgBack;
    private List<ModelListGhanon> mainLists=new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_omor_faniomrani);

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
        listGhanon1.setTitle("راهنمای آموزش زیرسازی و بهسازی معابر روستایی ویژه دهیاران");
        mainLists.add(listGhanon1);
        ModelListGhanon listGhanon2=new ModelListGhanon();
        listGhanon2.setTitle("ضوابط واگذاری پروژه های عمرانی و خدماتی دهیاری به شرکت تعاونی");
        mainLists.add(listGhanon2);
        ModelListGhanon listGhanon3=new ModelListGhanon();
        listGhanon3.setTitle("نقشه های اجرائی ساختمان غسالخانه روستائی");
        mainLists.add(listGhanon3);

        ModelListGhanon listGhanon4=new ModelListGhanon();
        listGhanon4.setTitle("عدم هزینه کرد اعتبارات دهیاری ها جهت تهیه طرح هادی در روستا");
        mainLists.add(listGhanon4);

        ModelListGhanon listGhanon5=new ModelListGhanon();
        listGhanon5.setTitle("مشخصات تابلوی پروژه های عمرانی دهیاری ها");
        mainLists.add(listGhanon5);

        ModelListGhanon listGhanon6=new ModelListGhanon();
        listGhanon6.setTitle("نقشه های تیپ پایگاه های آتش نشانی");
        mainLists.add(listGhanon6);

        ModelListGhanon listGhanon7=new ModelListGhanon();
        listGhanon7.setTitle("سازماندهی ارایه خدمات فنی و مهندسی به دهیاری ها");
        mainLists.add(listGhanon7);

        ModelListGhanon listGhanon8=new ModelListGhanon();
        listGhanon8.setTitle("نقشه های اجرائی طرح ساختمان دهیاری");
        mainLists.add(listGhanon8);

        ModelListGhanon listGhanon9=new ModelListGhanon();
        listGhanon9.setTitle("دستورالعمل ساخت و مکان یابی پایگاه های آتش نشانی");
        mainLists.add(listGhanon9);

        ModelListGhanon listGhanon10=new ModelListGhanon();
        listGhanon10.setTitle("آشنایی با طرح هادی و کنترل نظارت بر ساخت و ساز روستایی");
        mainLists.add(listGhanon10);

        ModelListGhanon listGhanon11=new ModelListGhanon();
        listGhanon11.setTitle("شیوه نامه عقد قراردادهای عمرانی و خدماتی");
        mainLists.add(listGhanon11);

        ModelListGhanon listGhanon12=new ModelListGhanon();
        listGhanon12.setTitle("دستورالعمل جدول گذاری معابر روستایی");
        mainLists.add(listGhanon12);

        ModelListGhanon listGhanon13=new ModelListGhanon();
        listGhanon13.setTitle("شیوه نامه بهسازی ابنیه خشتی");
        mainLists.add(listGhanon13);

        ModelListGhanon listGhanon14=new ModelListGhanon();
        listGhanon14.setTitle("شیوه نامه مدیریت کاهش خطرات سیل");
        mainLists.add(listGhanon14);

        ModelListGhanon listGhanon15=new ModelListGhanon();
        listGhanon15.setTitle("شیوه نامه ساخت غسالخانه روستایی");
        mainLists.add(listGhanon15);

        ModelListGhanon listGhanon16=new ModelListGhanon();
        listGhanon16.setTitle("دستورالعمل ایجاد و ساماندهی آرامگاه روستایی");
        mainLists.add(listGhanon16);

        ModelListGhanon listGhanon17=new ModelListGhanon();
        listGhanon17.setTitle("دهیار به عنوان مدیر بحران روستا");
        mainLists.add(listGhanon17);

        ModelListGhanon listGhanon18=new ModelListGhanon();
        listGhanon18.setTitle("بازنگری نقشه های غسالخانه روستایی");
        mainLists.add(listGhanon18);

        Omor_faniomrani_Adapter mAdapter = new Omor_faniomrani_Adapter(mainLists);
        //seting recyclerview
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        mList.setLayoutManager(mLayoutManager);
        mList.setItemAnimator(new DefaultItemAnimator());
        //set adapter to recyclerview
        mList.setAdapter(mAdapter);






    }
}
