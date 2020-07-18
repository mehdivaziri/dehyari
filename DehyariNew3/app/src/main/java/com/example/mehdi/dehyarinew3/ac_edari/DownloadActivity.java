package com.example.mehdi.dehyarinew3.ac_edari;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.mehdi.dehyarinew3.DownloadTask;
import com.example.mehdi.dehyarinew3.FileDownloader;
import com.example.mehdi.dehyarinew3.R;
import com.example.mehdi.dehyarinew3.activity.MainActivity;
import com.example.mehdi.dehyarinew3.adapter.Edarinagaresh_tabrik_Adapter;

import java.io.File;
import java.io.IOException;

public class DownloadActivity extends AppCompatActivity {
    private Button btnDownload;
    private Button btnView;
    private String URL = "https://azhmanschool.ir/dehyari/aeennegaresh.pdf";
    private String URL2 = "https://azhmanschool.ir/dehyari/aeennegaresh.pdf";
    private WebView webview;
    private  ProgressBar progressbar;
    


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_download);

        try {
            if (!isConnected()){
                Toast.makeText(this, "اتصال اینترنت را بررسی نمایید", Toast.LENGTH_SHORT).show();
                onBackPressed();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }





        //http://www.azhmanschool.ir\img\IranElecomp.pdf
        webview = (WebView)findViewById(R.id.webview);
        webview.getSettings().setJavaScriptEnabled(true);
        String item=getIntent().getExtras().getString(Edarinagaresh_tabrik_Adapter.TABRIK);
        String url = null;
        if (item.equals("تبریک انتصاب هیات رییسه مجلس")){





            URL="http://tdbm.ir/apk/reder.jpg";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }else if (item.equals("تبریک هفته دولت")){
            URL="http://tdbm.ir/apk/aeennegaresh.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }
    else if (item.equals("احکام دائمی برنامه توسعه کشور")){
        URL="http://tdbm.ir/apk/ahkamdayemibarname.pdf";
        url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
    }

        else if (item.equals("بخشنامه کمیته انطباق")){
            URL="http://tdbm.ir/apk/bakhshname_komiteh.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }

        else if (item.equals("نظام نامه ارزیابی عملکرد دهیاریهای کشور")){
            URL="http://tdbm.ir/apk/nezamname_arzyabi_amalkard.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }


        else if (item.equals("شیوه نامه اطلاع رسانی عمومی مدیریت روستا")){
            URL="http://tdbm.ir/apk/shivename_etelaresani_omomi.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }

        else if (item.equals("شیوه نامه نحوه انتخاب و عزل دهیار")){
            URL="http://tdbm.ir/apk/shivename_azldehyar.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }

        else if (item.equals("تعرفه عوارض و بهای خدمات")){
            URL="http://tdbm.ir/apk/avarez10_2.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }

        else if (item.equals("تعرفه عوارض و بهای خدمات")){
            URL="http://tdbm.ir/apk/avarez10_2.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }

        else if (item.equals("منشور اخلاقی دهیاری")){
            URL="http://tdbm.ir/apk/manshor.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }

        else if (item.equals("شیوه نامه تهیه و نصب منشور اخلاقی دهیاری")){
            URL="http://tdbm.ir/apk/shivename_manshor.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }

        else if (item.equals("آیین نامه نحوه وضع و وصول عوارض توسط شورای بخش")){
            URL="http://tdbm.ir/apk/aeenname_nahvevaz_avarez.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }

        else if (item.equals("بخشنامه ضرورت ارسال مصوبه عزل دهیار به کارگروه انطباق")){
            URL="http://tdbm.ir/apk/ersal_azldehyar_entebagh.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }


        else if (item.equals("تملک زمین روستایی")){
            URL="http://tdbm.ir/apk/tamalok_zaminrosta.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }

        else if (item.equals("ابلاغیه دریافت عوارض تفکیک اراضی روستایی")){
            URL="http://tdbm.ir/apk/eblaghi_daryaftavarez.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }

        else if (item.equals("مرجع صدور مجوز و گردش کار تفکیک و افراز اراضی روستایی در محدوده روستاهای دارای دهیاری")){
            URL="http://tdbm.ir/apk/MarjaeSodourMojavez.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }

        else if (item.equals("دستورالعمل اجرایی فرآیند تشکیل کمسیون و نحوه رسیدگی به تخلفات ساختمانی در روستاها")){
            URL="http://tdbm.ir/apk/DastourAmalTakhalofatRusta.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }

        else if (item.equals("تعیین مرجع صدور پروانه ساختمانی در روستاهایدفاقد دهیاری و خارج از حریم شهر")){
            URL="http://tdbm.ir/apk/TaeenEmarjaSodourParvane.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }

        else if (item.equals("محل واریز عوارض و جرائم ساخت و سازهای خارج از حریم شهرها و خارج از محدوده روستاهای دارای دهیاری")){
            URL="http://tdbm.ir/apk/MahaleVarizeAvarez.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }


        else if (item.equals("تعیین مرجع صدور پروانه ساختمانی،شیوه رسیدگی به تخلفات ساختمانی و نحوه تعیین  جرائم و عوارض متعلقه")){
            URL="http://tdbm.ir/apk/TaeenEmarjaSodourParvaneNahveyeTaeenJaraem.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }

        else if (item.equals("گردش کار صدور پروانه ساختمانی روستایی در روستاهای دارای دهیار")){
            URL="http://tdbm.ir/apk/GardesheKar.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }

        else if (item.equals("راهنمای آموزش زیرسازی و بهسازی معابر روستایی ویژه دهیاران")){
            URL="http://tdbm.ir/apk/rahnamae_amozeshzirsakht.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }
        else if (item.equals("ضوابط واگذاری پروژه های عمرانی و خدماتی دهیاری به شرکت تعاونی")){
            URL="http://tdbm.ir/apk/zavabet_vagozariproje.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }

        else if (item.equals("نقشه های اجرائی ساختمان غسالخانه روستائی")){
            URL="http://tdbm.ir/apk/NaghsheEjraeeghasalkhane.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }

        else if (item.equals("عدم هزینه کرد اعتبارات دهیاری ها جهت تهیه طرح هادی در روستا")){
            URL="http://tdbm.ir/apk/tahrhadi.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }


        else if (item.equals("مشخصات تابلوی پروژه های عمرانی دهیاری ها")){
            URL="http://tdbm.ir/apk/tablo_porozhe.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }

        else if (item.equals("نقشه های تیپ پایگاه های آتش نشانی")){
            URL="http://tdbm.ir/apk/naghshe_atashnedhani.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }


        else if (item.equals("سازماندهی ارایه خدمات فنی و مهندسی به دهیاری ها")){
            URL="http://tdbm.ir/apk/Sazmandehi.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }

        else if (item.equals("نقشه های اجرائی طرح ساختمان دهیاری")){
            URL="http://tdbm.ir/apk/naghsheejraeisakhtemanedehyari.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }

        else if (item.equals("دستورالعمل ساخت و مکان یابی پایگاه های آتش نشانی")){
            URL="http://tdbm.ir/apk/makanyabi_atash.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }

        else if (item.equals("آشنایی با طرح هادی و کنترل نظارت بر ساخت و ساز روستایی")){
            URL="http://tdbm.ir/apk/AshnaeeBatarha.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }

        else if (item.equals("شیوه نامه عقد قراردادهای عمرانی و خدماتی")){
            URL="http://tdbm.ir/apk/ShiveNameGharardad.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }

        else if (item.equals("دستورالعمل جدول گذاری معابر روستایی")){
            URL="http://tdbm.ir/apk/DastourJadvalGozari.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }


        else if (item.equals("شیوه نامه بهسازی ابنیه خشتی")){
            URL="http://tdbm.ir/apk/ShiveNameBehsazi.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }


        else if (item.equals("شیوه نامه مدیریت کاهش خطرات سیل")){
            URL="http://tdbm.ir/apk/ShiveNameModiriat.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }

        else if (item.equals("شیوه نامه ساخت غسالخانه روستایی")){
            URL="http://tdbm.ir/apk/ShiveNameSakhtGhasalKhane.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }


        else if (item.equals("دستورالعمل ایجاد و ساماندهی آرامگاه روستایی")){
            URL="http://tdbm.ir/apk/DastourIjadeGourestan.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }


        else if (item.equals("دهیار به عنوان مدیر بحران روستا")){
            URL="http://tdbm.ir/apk/Modiryat_Bohran.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }


        else if (item.equals("فضای سبز")){
            URL="http://tdbm.ir/apk/shivenameeijadeboostanroostaei.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }


        else if (item.equals("شیوه نامه اجرایی دفن پسماندهای عادی در سطح روستاهای کشور")){
            URL="http://tdbm.ir/apk/shiveName93.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }

        else if (item.equals("چارچوب توسعه فرهنگ شهروندی در زمینه مدیریت پسماندهای جامد در مناطق روستایی")){
            URL="http://tdbm.ir/apk/shiveName92.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }

        else if (item.equals("شیوه نامه تهیه بیوکمپوست از پسماندهای فساد پذیر و فضولات دامی در مناطق روستایی کشور")){
            URL="http://tdbm.ir/apk/shive-name-tahiye-biyokompost.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }

        else if (item.equals("شیوه نامه پردازش،جداسازی و بازیافت پسماندهای عادی در مناطق روستایی کشور")){
            URL="http://tdbm.ir/apk/shiveName91Pardazesh.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }

        else if (item.equals("شیوه نامه چارچوب تنظیم گزارش عملکرد در بخش مدیریت پسماند روستایی استانهای ساحلی")){
            URL="http://tdbm.ir/apk/shiveName91Charchoob.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }

        else if (item.equals("قبض اعلام و وصول هزینه های خدمات مدیریت پسماندهای عادی روستایی وشیوه نامه نحوه کاربرد آن")){
            URL="http://tdbm.ir/apk/shiveName86.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }

        else if (item.equals("دستورالعمل نحوه تعیین هزینه خدمات مدیریت پسماندهای روستایی")){
            URL="http://tdbm.ir/apk/shiveName86.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }

        else if (item.equals("دستورالعمل کنترل بهداشت قنادی ها در مناطق روستایی")){
            URL="http://tdbm.ir/apk/shiveName86Farvardin.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }
        else if (item.equals("شیوه نامه تهیه طرح های تفکیک از مبدا و دفن بهداشتی پسماندهای روستایی")){
            URL="http://tdbm.ir/apk/shiveName85.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }

        else if (item.equals("دستورالعمل استفاده از ظروف و مخازن نگهداری موقت پسماندهای جامد در مناطق روستایی کشور")){
            URL="http://tdbm.ir/apk/shiveName84.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }


        else if (item.equals("دستورالعمل نظارت و کنترل بهداشت نانوایی های مناطق روستایی")){
            URL="http://tdbm.ir/apk/shiveName84Mehr.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }

        else if (item.equals("شیوه نامه تهیه طرح های تفکیک از مبداء و دفن بهداشتی پسماندهای روستایی")){
            URL="http://tdbm.ir/apk/shiveName84Mordad.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }

        else if (item.equals("دستورالعمل و راهنمای ساخت واحدهای بیوکمپوست خانگی در مناطق روستایی")){
            URL="http://tdbm.ir/apk/shiveName83Rahnamaee.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }

        else if (item.equals("دستورالعمل کنترل بهداشت کشتار دام و قصابی ها در مناطق روستایی")){
            URL="http://tdbm.ir/apk/shiveName83Behdasht.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }


        else if (item.equals("شیوه نامه جذب نیروهای وظیفه برای پایگاه های آتش نشانی روستایی")){
            URL="http://tdbm.ir/apk/Shivename_atash.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }

        else if (item.equals("جدول شرایط احراز عناوین شغلی و منابع آموزشی رشته های شغلی آتش نمشانی")){
            URL="http://tdbm.ir/apk/jadval_anaeen_atash.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }


        else if (item.equals("فرم تعهد دهیاری")){
            URL="http://tdbm.ir/apk/form_tahod_dehyari.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }


        else if (item.equals("فرو تعهد کارکنان وظیفه")){
            URL="http://tdbm.ir/apk/form_taahod_vazife.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }


        else if (item.equals("مقررات انضباطی کارکنان وظیفه مامور به خدمت در دستگاههاومراکز دولتی و اجرایی کشور")){
            URL="http://tdbm.ir/apk/moghararat_enzebati_vazife.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }


        else if (item.equals("دستورالعمل البسه")){
            URL="http://tdbm.ir/apk/eblaghe-arm-va-lebase-atashneshani.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }


        else if (item.equals("دستورالعمل فعالیت و ادره پایگاه آتش نشانی روستایی")){
            URL="http://tdbm.ir/apk/Dastoe_faliyat_atash.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }


        else if (item.equals("فرم ثبت حوادث و آتش سوزی پایگاه آتش نشانی روستایی")){
            URL="http://tdbm.ir/apk/form_sabtname_atash.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }


        else if (item.equals("بازنگری نقشه های غسالخانه روستایی")){
            URL="http://tdbm.ir/apk/Baznegari_ghosal.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }


        else if (item.equals("شیوه نامه ساخت غسالخانه روستایی")){
            URL="http://tdbm.ir/apk/form_sabtname_atash.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }


        else if (item.equals("استفتاء از دفتر مقام معظم رهبری")){
            URL="http://tdbm.ir/apk/estefta.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }


        else if (item.equals("اقدامات صورت گرفته پیرامون ساماندهی حمل و نقل روستایی")){
            URL="http://tdbm.ir/apk/Eghdamat_hamlvnaghl.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }

        else if (item.equals("ساز و کار برگزاری دوره راهداری برای دهیاران")){
            URL="http://tdbm.ir/apk/SazokarDoreRahdari.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }


        else if (item.equals("همکاری در عملیات عادی و جاری،زمستانی و فوری راه های روستایی")){
            URL="http://tdbm.ir/apk/HamKariDarAmaliat.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }


        else if (item.equals("آیین نامه ساماندهی حمل و نقل روستایی")){
            URL="http://tdbm.ir/apk/AeenNameSamandehi.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }


        else if (item.equals("تفاهم نامه همکاری مشترک وزارت کشور و راه وشهرسازی درزمینه بهسازی معابر،ایمن سازی و نگهداری راه روستایی")){
            URL="http://tdbm.ir/apk/Tafahom_rah.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }


        else if (item.equals("نحوه آسفالت راه های روستایی با استفاده از قیر تخصیصی وزارت راه و شهرسازی")){
            URL="http://tdbm.ir/apk/NahveAsfalt.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }


        else if (item.equals("بهداشت محیط روستایی")){
            URL="http://tdbm.ir/apk/Behdasht_service.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }

        else if (item.equals("دستور العمل حقوق و مزایا دهیاران97")){
            URL="http://tdbm.ir/apk/dastor_hoghogh96.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }
        else if (item.equals("دستمزد مبنای کسر بیمه97")){
            URL="http://tdbm.ir/apk/kasr_bime.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }

        else if (item.equals("دستورالعمل تهیه اسناد هزینه و مدارک ضمیمه")){
            URL="http://tdbm.ir/apk/madarekmali.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }


        else if (item.equals("شیوه نامه حقوق مسئولین مالی")){
            URL="http://tdbm.ir/apk/5555.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }


        else if (item.equals("شیوه نامه حقوق مسئولین فنی")){
            URL="http://tdbm.ir/apk/shive.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }


        else if (item.equals("طرز استفاده از تنخواه گردان دهیاری ها")){
            URL="http://tdbm.ir/apk/tankhah.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }


        else if (item.equals("دستورالعمل نحوه حسابرسی دهیاریها")){
            URL="http://tdbm.ir/apk/hesabrasi.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }


        else if (item.equals("قرارداد انجام حسابرسی")){
            URL="http://tdbm.ir/apk/ghardad_hesab.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }


        else if (item.equals("ضوابط تهیه و الصاق برچسب اموال دهیاری")){
            URL="http://tdbm.ir/apk/zavabetbarchasb.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }


        else if (item.equals("دستورالعمل حقوق و مزایای دهیاران در سال96")){
            URL="http://tdbm.ir/apk/hoghogh966.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }


        else if (item.equals("دستورالعمل نحوه تعیین حقوق و مزایای دهیاران")){
            URL="http://tdbm.ir/apk/hoghoghdehyar.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }


        else if (item.equals("ممنوعیت به کارگیری کارکنان استاداری،فرمانداری و بخشداری ب عنوان مسوول مالی دهیاری ها")){
            URL="http://tdbm.ir/apk/1.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }


        else if (item.equals("رشته ها و گرایش های تحصیلی مسوول امور مالی")){
            URL="http://tdbm.ir/apk/mali1.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }

        else if (item.equals("ابلاغ فرم قرارداد و حکم حقوقی دهیاران تمام وقت و پاره وقت")){
            URL="http://tdbm.ir/apk/eblagh1.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }

        else if (item.equals("دستورالعمل نحوه پرداخت حقوق و مزایای مسوولین مالی دهیاری ها")){
            URL="http://tdbm.ir/apk/19957hoghoogh masolin omoor mali.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }

        else if (item.equals("فصل2:مقررات عضویت")){
            URL="http://tdbm.ir/apk/tavoni2.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }

        else if (item.equals("فصل3:ارکان تعاونی")){
            URL="http://tdbm.ir/apk/tavoni3.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }

        else if (item.equals("فصل4:مقررات مالی")){
            URL="http://tdbm.ir/apk/tavoni4.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }

        else if (item.equals("فصل5:مقررات مختلف")){
            URL="http://tdbm.ir/apk/tavoni5.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }

        else if (item.equals("ضوابط اجاره ماشین آلات")){
            URL="http://tdbm.ir/apk/zavabet_mashin.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }

        else if (item.equals("ضوابط واگذاری پروژه های عمرانی و خدماتی دهیاری ها به شرکت تعاونی دهیاری ها")){
            URL="http://tdbm.ir/apk/zavabetvagozariproje.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }

        else if (item.equals("شیوه نامه ارزیابی و بازدید از شرکت تعاونی دهیاری ها")){
            URL="http://tdbm.ir/apk/shivename_arzyabi.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }

        else if (item.equals("ضوابط واگذاری پروژه های عمرانی و خدماتی")){
            URL="http://tdbm.ir/apk/zavabetvagozari11.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }

        else if (item.equals("عضویت دهیاران در هیئت مدیره و مدیریت عامل دهیاری ها")){
            URL="http://tdbm.ir/apk/zavabet10.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }

        else if (item.equals("شرح وظایف بازرس شرکت تعاونی دهیاری ها")){
            URL="http://tdbm.ir/apk/vazayef_bazras9.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }

        else if (item.equals("ابلاغ الگوی ورقه سهام شرکت های تعاونی دهیاری ها")){
            URL="http://tdbm.ir/apk/ebagholgo8.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }

        else if (item.equals("شیوه نامه اجرایی آموزش مدیران عامل و اعضای شرکت تعاونی دهیاری ها")){
            URL="http://tdbm.ir/apk/shivemodir7.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }

        else if (item.equals("اصلاح آیین نامه تشکیل مجمع عمومی شرکت های تعاونی دهیاری ها")){
            URL="http://tdbm.ir/apk/eslahaeen6.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }
        else if (item.equals("آیین نامه تشکیل مجمع عمومی شرکت نعاونی دهیاری ها")){
            URL="http://tdbm.ir/apk/tashkitmajma5.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }

        else if (item.equals("اساسنامه جدید شرکت های تعاونی دهیاری ها")){
            URL="http://tdbm.ir/apk/asasnamej4.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }

        else if (item.equals("آیین نامه اداری واستخدامی تعاونی ها")){
            URL="http://tdbm.ir/apk/aeenname3.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }

        else if (item.equals("آیین نامه وظایف،اختیارات و حقوق و مزایای مدیر عامل تعاونی ها")){
            URL="http://tdbm.ir/apk/aeen2.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }

        else if (item.equals("راهنمای تنظیم آیین نامه معاملات در تعاونی ها")){
            URL="http://tdbm.ir/apk/rahnametanzim1.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }



        else if (item.equals("آیین نامه استخدامی دهیاریهای کشور")){
            URL="http://tdbm.ir/apk/Aeen_estekhdam.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }

        else if (item.equals("فرم مشخصات پروژه")){
            URL="http://tdbm.ir/apk/form_moshakhasatproje.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }

        else if (item.equals("نصاب معاملات دهیاری های سال97")){
            URL="http://tdbm.ir/apk/nasab97.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }

        else if (item.equals("بخشنامه بودجه 98")){
            URL="http://tdbm.ir/apk/bakhsh_bodjeh98.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }

        else if (item.equals("فرم ماموریت دهیار")){
            URL="http://tdbm.ir/apk/mamorayatdehyar.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }

        else if (item.equals("فرم مرخصی دهیار")){
            URL="http://tdbm.ir/apk/morakhasidehyar.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }

        else if (item.equals("فرم گزارش کار دهیار")){
            URL="http://tdbm.ir/apk/gazareshkar_dehyar.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }
        else if (item.equals("ضمائم سند هزینه(10 فرم)")){
            URL="http://tdbm.ir/apk/sanadhazine_dehyar.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }
        else if (item.equals("قرار داد اجاره ماشین آلات")){
            URL="http://tdbm.ir/apk/gharardad_ejare.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }

        else if (item.equals("نمونه آگهی مناقصه عمومی")){
            URL="http://tdbm.ir/apk/agahi_monaghese.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }

        else if (item.equals("مصوبه شورای اسلامی روستا")){
            URL="http://tdbm.ir/apk/mosavabe_shoraeslami.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }

        else if (item.equals("قرار داد اجاره ماشین آلات")){
            URL="http://tdbm.ir/apk/gharardad_ejare.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }

        else if (item.equals("فرم حکم حقوقی دهیار")){
            URL="http://tdbm.ir/apk/form_hoghoghidehyar.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }

        else if (item.equals("تحویل و تحول دهیاری")){
            URL="http://tdbm.ir/apk/tahvil_tahavoldehyari.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }

        else if (item.equals("لیست اموال")){
            URL="http://tdbm.ir/apk/list_amval.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }

        else if (item.equals("قراردادجمع آوری پسماند روستا")){
            URL="http://tdbm.ir/apk/ghardad_jampasman.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }

        else if (item.equals("قرارداد مصالح ساختمانی")){
            URL="http://tdbm.ir/apk/gharardad_kharidmasaleh.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }

        else if (item.equals("قرار داد پیمانکاری به کارگیری ماشین آلات")){
            URL="http://tdbm.ir/apk/peymankarimashin.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }
        else if (item.equals("صورتجلسه تعیین سمت اعضای هیات")){
            URL="http://tdbm.ir/apk/taeen_heyatraeessho.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }
        else if (item.equals("رسید دریافت چک از دهیاری")){
            URL="http://tdbm.ir/apk/resid_chek.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }
        else if (item.equals("سربرگ دهیاری A5")){
            URL="http://tdbm.ir/apk/sarbar_dehyari.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }
        else if (item.equals("سربرگ شوراA5")){
            URL="http://tdbm.ir/apk/sarbarg_shora.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }

        else if (item.equals("شناسنامه ساختمان روستایی")){
            URL="http://tdbm.ir/apk/forme sodure parvane sakhtemani.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }

        else if (item.equals("استعلام ضوابط ساخت و ساز")){
            URL="http://tdbm.ir/apk/01.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }

        else if (item.equals("تقاضای صدور پروانه ساختمان روستایی")){
            URL="http://tdbm.ir/apk/02.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }

        else if (item.equals("گواهی مالکیت زمین")){
            URL="http://tdbm.ir/apk/03.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }

        else if (item.equals("دستور تهیه نقشه")){
            URL="http://tdbm.ir/apk/04.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }

        else if (item.equals("برگ تعهد معماری")){
            URL="http://tdbm.ir/apk/05.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }

        else if (item.equals("برگ تعهد محاسبات سازه")){
            URL="http://tdbm.ir/apk/06.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }

        else if (item.equals("تعهد نظارت")){
            URL="http://tdbm.ir/apk/07.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }

        else if (item.equals("استعلام شروع به کار عملیات ساهتمانی")){
            URL="http://tdbm.ir/apk/08.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }

        else if (item.equals("مرحله اول(بعد ازبتن ریزی پی)")){
            URL="http://tdbm.ir/apk/09.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }

        else if (item.equals("مرحله دوم(اجرای اسکلت و سازه)")){
            URL="http://tdbm.ir/apk/10.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }

        else if (item.equals("مرحله سوم(اجرای سفت کاری و نازک)")){
            URL="http://tdbm.ir/apk/11.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }

        else if (item.equals("مرحله چهارم(گزارش نهایی کار)")){
            URL="http://tdbm.ir/apk/12.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }

        else if (item.equals("گزارش پیشرفت عملیات ساختمانی")){
            URL="http://tdbm.ir/apk/13.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }
        else if (item.equals("اخطاریه به مالک")){
            URL="http://tdbm.ir/apk/14.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }
        else if (item.equals("گزارش تخلف به مراجع انتظامی")){
            URL="http://tdbm.ir/apk/15.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }

        else if (item.equals("گزارش تخلف به کمیسیون ماده99")){
            URL="http://tdbm.ir/apk/16.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }

        else if (item.equals("محاسبه اجزای طرح")){
            URL="http://tdbm.ir/apk/mohasebe1.xlsx";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }



        else if (item.equals("نکات قابل توجه در تهیه طرح های درآمدزا")){
            URL="http://tdbm.ir/apk/nokat_frayand.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }



        else if (item.equals("مشخصات طرح فرمها")){
            URL="http://tdbm.ir/apk/moshakhasat_tarhform.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }



        else if (item.equals("فرايند پرداخت وام به طرح درآمدزاي دهياري")){
            URL="http://tdbm.ir/apk/farayand_pardakht.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }


        else if (item.equals("قانون تعاریف و ضوابط تقسیمات کشوری")){
            URL="http://tdbm.ir/apk/taqsimat_keshvari.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }

        else if (item.equals("تاریخچه تقسیمات کشوری")){
            URL="http://tdbm.ir/apk/Tarikh_taghsimat.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }


        else if (item.equals("قانون اصلاح موادی از قانون شوراهای اسلامی کشور و انتخاب شهرداران")){
            URL="http://tdbm.ir/apk/Shora_eslahi.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }


        else if (item.equals("وظایف و اختیارات شوراها")){
            URL="http://tdbm.ir/apk/Vazayef_shora.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }

        else if (item.equals("حق الجلسه شوراهای اسلامی")){
            URL="http://tdbm.ir/apk/Hagh_jalase.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }

        else if (item.equals("آیین نامه نحوه هزینه بودجه شوراها")){
            URL="http://tdbm.ir/apk/Aeen_nahve_hazine.pdf";
            url="http://drive.google.com/viewerng/viewer?embedded=true&url="+URL;
        }







        webview.loadUrl(url);

        btnDownload=findViewById(R.id.btnView);
        btnDownload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View view) {
            //    new DownloadTask(view.getContext(), URL2);
                new Thread(new Runnable() {
                    public void run() {
                     //   download(URL2);
                      new DownloadTask(view.getContext(), URL);

                    }
                }).start();



            }
        });
        btnView=findViewById(R.id.btnView);
        btnView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
    public void download(String URL2)
    {
        new DownloadFile().execute(URL2, "");
    }
    public void view(View v)
    {
        File pdfFile;  // -> filename = maven.pdf
        pdfFile = new File(Environment.getExternalStorageDirectory() + "/dehyaripdf/" + "IranElecomp.pdf");
        Uri path = Uri.fromFile(pdfFile);
        Intent pdfIntent = new Intent(Intent.ACTION_VIEW);
        pdfIntent.setDataAndType(path, "application/pdf");
        pdfIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);

        try{
            startActivity(pdfIntent);
        }catch(ActivityNotFoundException e){
            Toast.makeText(DownloadActivity.this, "No Application available to view PDF", Toast.LENGTH_SHORT).show();
        }
    }

    private class DownloadFile extends AsyncTask<String, Void, Void> {

        @Override
        protected Void doInBackground(String... strings) {
            String fileUrl = strings[0];   // -> http://maven.apache.org/maven-1.x/maven.pdf
            String fileName = strings[1];  // -> maven.pdf
            String extStorageDirectory = Environment.getExternalStorageDirectory().toString();
            File folder = new File(extStorageDirectory, "dehyaripdf");
            folder.mkdir();

            File pdfFile = new File(folder, fileName);

            try{
                pdfFile.createNewFile();
            }catch (IOException e){
                e.printStackTrace();
            }
            FileDownloader.downloadFile(fileUrl, pdfFile);
            return null;
        }
    }
    public boolean isConnected() throws InterruptedException, IOException {
        final String command = "ping -c 1 google.com";
        return Runtime.getRuntime().exec(command).waitFor() == 0;
    }


}
