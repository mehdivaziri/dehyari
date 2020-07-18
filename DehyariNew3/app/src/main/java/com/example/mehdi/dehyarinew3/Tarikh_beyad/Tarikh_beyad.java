package com.example.mehdi.dehyarinew3.Tarikh_beyad;

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
import com.example.mehdi.dehyarinew3.Sherkat_asasnametavoni.Shivename_tavoni_Adapter;
import com.example.mehdi.dehyarinew3.model.ModelListGhanon;

import java.util.ArrayList;
import java.util.List;

public class Tarikh_beyad extends AppCompatActivity {
    private RecyclerView mList;
    private ImageView imgBack;
    private List<ModelListGhanon> mainLists=new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_tarikh_beyad);


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
     /*   ModelListGhanon listGhanon1=new ModelListGhanon();
        listGhanon1.setTitle("ضوابط اجاره ماشین آلات");
        mainLists.add(listGhanon1);
        ModelListGhanon listGhanon2=new ModelListGhanon();
        listGhanon2.setTitle("ضوابط واگذاری پروژه های عمرانی و خدماتی دهیاری ها به شرکت تعاونی دهیاری ها");
        mainLists.add(listGhanon2);
        ModelListGhanon listGhanon3=new ModelListGhanon();
        listGhanon3.setTitle("شیوه نامه ارزیابی و بازدید از شرکت تعاونی دهیاری ها");
        mainLists.add(listGhanon3);
        ModelListGhanon listGhanon4=new ModelListGhanon();
        listGhanon4.setTitle("ضوابط واگذاری پروژه های عمرانی و خدماتی");
        mainLists.add(listGhanon4);
        ModelListGhanon listGhanon5=new ModelListGhanon();
        listGhanon5.setTitle("عضویت دهیاران در هیئت مدیره و مدیریت عامل دهیاری ها");
        mainLists.add(listGhanon5);
        ModelListGhanon listGhanon6=new ModelListGhanon();
        listGhanon6.setTitle("شرح وظایف بازرس شرکت تعاونی دهیاری ها");
        mainLists.add(listGhanon6);






        ModelListGhanon listGhanon7=new ModelListGhanon();
        listGhanon7.setTitle("ابلاغ الگوی ورقه سهام شرکت های تعاونی دهیاری ها");
        mainLists.add(listGhanon7);

        ModelListGhanon listGhanon8=new ModelListGhanon();
        listGhanon8.setTitle("شیوه نامه اجرایی آموزش مدیران عامل و اعضای شرکت تعاونی دهیاری ها");
        mainLists.add(listGhanon8);

        ModelListGhanon listGhanon9=new ModelListGhanon();
        listGhanon9.setTitle("شیوه نامه آموزش مدیران عامل و اعضای شرکت تعاونی دهیاری ها");
        mainLists.add(listGhanon9);

        ModelListGhanon listGhanon10=new ModelListGhanon();
        listGhanon10.setTitle("اصلاح آیین نامه تشکیل مجمع عمومی شرکت های تعاونی دهیاری ها");
        mainLists.add(listGhanon10);

        ModelListGhanon listGhanon11=new ModelListGhanon();
        listGhanon11.setTitle("آیین نامه تشکیل مجمع عمومی شرکت نعاونی دهیاری ها");
        mainLists.add(listGhanon11);

        ModelListGhanon listGhanon12=new ModelListGhanon();
        listGhanon12.setTitle("اساسنامه جدید شرکت های تعاونی دهیاری ها");
        mainLists.add(listGhanon12);

        ModelListGhanon listGhanon13=new ModelListGhanon();
        listGhanon13.setTitle("آیین نامه اداری واستخدامی تعاونی ها");
        mainLists.add(listGhanon13);

        ModelListGhanon listGhanon14=new ModelListGhanon();
        listGhanon14.setTitle("آیین نامه وظایف،اختیارات و حقوق و مزایای مدیر عامل تعاونی ها");
        mainLists.add(listGhanon14);

        ModelListGhanon listGhanon15=new ModelListGhanon();
        listGhanon15.setTitle("راهنمای تنظیم آیین نامه معاملات در تعاونی ها");
        mainLists.add(listGhanon15);

*/


        Shivename_tavoni_Adapter mAdapter = new Shivename_tavoni_Adapter(mainLists);
        //seting recyclerview
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        mList.setLayoutManager(mLayoutManager);
        mList.setItemAnimator(new DefaultItemAnimator());
        //set adapter to recyclerview
        mList.setAdapter(mAdapter);



    }
}
