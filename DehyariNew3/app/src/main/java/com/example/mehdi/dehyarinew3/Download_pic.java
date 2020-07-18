package com.example.mehdi.dehyarinew3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.example.mehdi.dehyarinew3.adapter.Edarinagaresh_tabrik_Adapter;

public class Download_pic extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_download_pic);
        ImageView imageView=findViewById(R.id.imageView);

        String item=getIntent().getExtras().getString(Edarinagaresh_tabrik_Adapter.TABRIK);


        if (item.equals("واحد پلیس ساختمان")) {
            Glide.with(this)
                    .load("http://tdbm.ir/img_deh/polic12.jpg")
                    .centerCrop()
                    .placeholder(R.drawable.saatsheni1)
                    .into(imageView);
        }

     else if (item.equals("واحد سد معبر")){
        Glide.with(this)
                .load("http://tdbm.ir/img_deh/sad13.jpg")
                .centerCrop()
                .placeholder(R.drawable.saatsheni1)
                .into(imageView);
    }

        else if (item.equals("واحد خدمات بیمه ای")){
            Glide.with(this)
                    .load("http://tdbm.ir/img_deh/reder.jpg")
                    .centerCrop()
                    .placeholder(R.drawable.saatsheni1)
                    .into(imageView);
        }


        else if (item.equals("واحد نمایشگاه فروش تجهیزات و مبلمان پارکی")){
            Glide.with(this)
                    .load("http://tdbm.ir/img_deh/reder.jpg")
                    .centerCrop()
                    .placeholder(R.drawable.saatsheni1)
                    .into(imageView);
        }


        else if (item.equals("کارخانه آسفالت دهیاریها")){
            Glide.with(this)
                    .load("http://tdbm.ir/img_deh/reder.jpg")
                    .centerCrop()
                    .placeholder(R.drawable.saatsheni1)
                    .into(imageView);
        }


        else if (item.equals("نشریه استانی نوید خراسان")){
            Glide.with(this)
                    .load("http://tdbm.ir/apk/reder.jpg")
                    .centerCrop()
                    .placeholder(R.drawable.saatsheni1)
                    .into(imageView);
        }


        else if (item.equals("پروژه های عمرانی استانی")){
            Glide.with(this)
                    .load("http://tdbm.ir/img_deh/reder.jpg")
                    .centerCrop()
                    .placeholder(R.drawable.saatsheni1)
                    .into(imageView);
        }


        else if (item.equals("راه اندازی سایت،کانال های ویژه دهیاریها")){
            Glide.with(this)
                    .load("http://tdbm.ir/img_deh/reder.jpg")
                    .centerCrop()
                    .placeholder(R.drawable.saatsheni1)
                    .into(imageView);
        }

        else if (item.equals("معین اقتصادی روستایی بخش مرکزی مشهد")){
            Glide.with(this)
                    .load("http://tdbm.ir/img_deh/reder.jpg")
                    .centerCrop()
                    .placeholder(R.drawable.saatsheni1)
                    .into(imageView);
        }

        else if (item.equals("اجرای طرح جامع مدیریت پسماند روستایی")){
            Glide.with(this)
                    .load("http://tdbm.ir/img_deh/reder.jpg")
                    .centerCrop()
                    .placeholder(R.drawable.saatsheni1)
                    .into(imageView);
        }




    }
}
