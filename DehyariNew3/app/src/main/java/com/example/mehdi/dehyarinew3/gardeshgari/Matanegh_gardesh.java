package com.example.mehdi.dehyarinew3.gardeshgari;

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
import com.example.mehdi.dehyarinew3.gardeshgari.adapter.Gardeshgary_Adapter;
import com.example.mehdi.dehyarinew3.gardeshgari.adapter.Manateghghardesh_Adapter;
import com.example.mehdi.dehyarinew3.model.ModelListGhanon;

import java.util.ArrayList;
import java.util.List;

public class Matanegh_gardesh extends AppCompatActivity {
    private RecyclerView mList;
    private ImageView imgBack;
    private List<ModelListGhanon> mainLists=new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_matanegh_gardesh);

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
        listGhanon1.setTitle("سیمای کلی استان");
        mainLists.add(listGhanon1);
        ModelListGhanon listGhanon2=new ModelListGhanon();
        listGhanon2.setTitle("تصاویر جاذبه های گردشگری");
        mainLists.add(listGhanon2);

        ModelListGhanon listGhanon3=new ModelListGhanon();
        listGhanon3.setTitle("نقشه های گردشگری");
        mainLists.add(listGhanon3);

        ModelListGhanon listGhanon4=new ModelListGhanon();
        listGhanon4.setTitle("کلیپ روستاهای گردشگری");
        mainLists.add(listGhanon4);



        Manateghghardesh_Adapter mAdapter = new Manateghghardesh_Adapter(mainLists);
        //seting recyclerview
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        mList.setLayoutManager(mLayoutManager);
        mList.setItemAnimator(new DefaultItemAnimator());
        //set adapter to recyclerview
        mList.setAdapter(mAdapter);

    }
}
