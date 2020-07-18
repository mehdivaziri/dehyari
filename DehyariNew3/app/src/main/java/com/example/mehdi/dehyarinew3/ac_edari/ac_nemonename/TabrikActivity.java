package com.example.mehdi.dehyarinew3.ac_edari.ac_nemonename;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Build;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mehdi.dehyarinew3.R;
import com.example.mehdi.dehyarinew3.TextViewEx;
import com.example.mehdi.dehyarinew3.adapter.Edarinagaresh_tabrik_Adapter;

public class TabrikActivity extends AppCompatActivity {
    private ImageView imgShare;
    private TextViewEx txtMatn;
    private String s1;
    private String s2;
    private  boolean setLongMessage=false;
    private ImageView imgBack;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_tabrik);
        TextView txtTitle=findViewById(R.id.txtTitle);
        //....font
        Typeface face = Typeface.createFromAsset(getAssets(),
                "fonts/BMitra_0.ttf");

        imgShare =findViewById(R.id.imgShare);
        TextViewEx txtViewEx = (TextViewEx) findViewById(R.id.txtMatn);
      //  txtViewEx.setText(getString(R.string.darkhastvam), false); // true: enables justification
        String item=getIntent().getExtras().getString(Edarinagaresh_tabrik_Adapter.TABRIK);
        if (item.equals("تبریک روز شورا")){
            txtTitle.setText("تبریک روز شورا");
            // change font and background
              txtViewEx.setText(getString(R.string.tabrkrozshora), false);
        //    txtViewEx.setTypeface(face);
      //      txtViewEx.setTextColor(Color.RED);

        }else if (item.equals("تبریک انتصاب")){
            txtTitle.setText("تبریک انتصاب");
            txtViewEx.setText(getString(R.string.tabrikentesab), false);
        }


        else if (item.equals("تبریک انتصاب هیات رییسه مجلس")){
            txtTitle.setText("تبریک انتصاب هیات رییسه مجلس");
            txtViewEx.setText(getString(R.string.tabri_heyatraees), false);
        }

        else if (item.equals("تبریک هفته دولت")){
            txtTitle.setText("تبریک هفته دولت");
            txtViewEx.setText(getString(R.string.tabrik_haftedolat), false);
        }

        else if (item.equals("تبریک روز نیروی انتظامی")){
            txtTitle.setText("تبریک روز نیروی انتظامی");
            txtViewEx.setText(getString(R.string.tabrik_nirientezami), false);
        }

        else if (item.equals("تبریک دهه فجر")){
            txtTitle.setText("تبریک دهه فجر");
            txtViewEx.setText(getString(R.string.tabrik_dahefagr), false);
        }

        else if (item.equals("تبریک انتخاب مجدد")){
            txtTitle.setText("تبریک انتخاب مجدد");
            txtViewEx.setText(getString(R.string.tabrik_entekmojadad), false);
        }

        else if (item.equals("تبریک روز پدر")){
            txtTitle.setText("تبریک روز پدر");
            txtViewEx.setText(getString(R.string.tabrik_rozpedar), false);
        }

        else if (item.equals("اعلام حضور در شغل جدید")){
            txtTitle.setText("اعلام حضور در شغل جدید");
            txtViewEx.setText(getString(R.string.tabrik_shogljadidi), false);
        }

        else if (item.equals("تبریک جهت انتصاب")){
            txtTitle.setText("تبریک جهت انتصاب");
            txtViewEx.setText(getString(R.string.tabrik_entekmojadad), false);
        }


        else if (item.equals("نحوه تعیین درجه دهیاریها")){
            txtTitle.setText("نحوه تعیین درجه دهیاریها");
            txtViewEx.setText(getString(R.string.taeen_darajedehyari), false);
        }


        else if (item.equals("فن بیان و گویندگی")){
            txtTitle.setText("فن بیان و گویندگی");
            txtViewEx.setText(getString(R.string.fanbayangoyan), false);
        }


        else if (item.equals("سخنوری و روایط عمومی")){
            txtTitle.setText("سخنوری و روایط عمومی");
            txtViewEx.setText(getString(R.string.sokhanvary), false);
        }

        else if (item.equals("ده قانون طلائی برای برگزاری سمینارهاوگردهمائی ها")){
            txtTitle.setText("ده قانون طلائی برای برگزاری سمینارهاوگردهمائی ها");
            txtViewEx.setText(getString(R.string.dohghanontalaee), false);
        }

        else if (item.equals("40اصل فن بیان در برخورد با مشتری")){
            txtTitle.setText("40اصل فن بیان در برخورد با مشتری");
            txtViewEx.setText(getString(R.string.chelasl_talaee), false);
        }

        else if (item.equals("شیوه نامه نحوه مکاتبات اداری دهیاریهای کشور")){
            txtTitle.setText("شیوه نامه نحوه مکاتبات اداری دهیاریهای کشور");
            txtViewEx.setText(getString(R.string.dhivename_mokatebatdeh), false);
        }

               else if (item.equals("دستورالعمل ایجاد یکنواختی نظام عوارض شورای اسلامی بخش")){
            txtTitle.setText("دستورالعمل ایجاد یکنواختی نظام عوارض شورای اسلامی بخش");
            txtViewEx.setText(getString(R.string.dastorejadnezam_yak), false);
        }

        else if (item.equals("فصل1:کلیات")){
            txtTitle.setText("فصل1:کلیات");
            txtViewEx.setText(getString(R.string.koliyat_taini), false);
        }

        else if (item.equals("قانون تاسیس دهیاریهای خودکفا")){
            txtTitle.setText("قانون تاسیس دهیاریهای خودکفا");
            txtViewEx.setText(getString(R.string.ghanon_tasis_khokafa), false);
        }


        else if (item.equals("فصل اول:کلیات اساسنامه")){
            txtTitle.setText("فصل اول:کلیات اساسنامه");
            txtViewEx.setText(getString(R.string.asasname_tashkilat), false);
        }

        else if (item.equals("فصل دوم:وظایف اساسنامه")){
            txtTitle.setText("فصل دوم:وظایف اساسنامه");
            txtViewEx.setText(getString(R.string.asaname_vazayef), false);
        }

        else if (item.equals("فصل سوم:بودجه و امور مالی اساسنامه")){
            txtTitle.setText("فصل سوم:بودجه و امور مالی اساسنامه");
            txtViewEx.setText(getString(R.string.asasname_bodjeh), false);
        }


        else if (item.equals("بخش اول:انواع معاملات و نصاب آنها")){
            txtTitle.setText("بخش اول:انواع معاملات و نصاب آنها");
            txtViewEx.setText(getString(R.string.Aeenmali_bakhsh1), false);
        }

        else if (item.equals("بخش دوم:روش انجام معاملات")){
            txtTitle.setText("بخش دوم:روش انجام معاملات");
            txtViewEx.setText(getString(R.string.Aeenmali_bakhsh2), false);
        }
        else if (item.equals("بخش سوم:مناقصه")){
            txtTitle.setText("بخش سوم:مناقصه");
            txtViewEx.setText(getString(R.string.Aeenmali_bakhsh3), false);
        }

        else if (item.equals("بخش چهارم:تحویل کالا یا خدمت")){
            txtTitle.setText("بخش چهارم:تحویل کالا یا خدمت");
            txtViewEx.setText(getString(R.string.Aeenmali_bakhsh4), false);
        }

        else if (item.equals("بخش پنجم:مزایده")){
            txtTitle.setText("بخش پنجم:مزایده");
            txtViewEx.setText(getString(R.string.Aeenmali_bakhsh5), false);
        }

        else if (item.equals("بخش ششم:سایر مقررات معاملات")){
            txtTitle.setText("بخش ششم:سایر مقررات معاملات");
            txtViewEx.setText(getString(R.string.Aeenmali_bakhsh6), false);
        }
        else if (item.equals("بخش هفتم:بودجه")){
            txtTitle.setText("بخش هفتم:بودجه");
            txtViewEx.setText(getString(R.string.Aeenmali_bakhsh7), false);
        }
        else if (item.equals("بخش هشتم:درآمد و منابع")){
            txtTitle.setText("بخش هشتم:درآمد و منابع");
            txtViewEx.setText(getString(R.string.Aeenmali_bakhsh8), false);
        }
        else if (item.equals("بخش نهم:گردش عملیات منابع و مصارف دهیاری ها")){
            txtTitle.setText("بخش نهم:گردش عملیات منابع و مصارف دهیاری ها");
            txtViewEx.setText(getString(R.string.Aeenmali_bakhsh9), false);
        }
        else if (item.equals("بخش دهم:حسابداری")){
            txtTitle.setText("بخش دهم:حسابداری");
            txtViewEx.setText(getString(R.string.Aeenmali_bakhsh10), false);
        }
        else if (item.equals("بخش یازدهم:ممیزی و حسابرسی")){
            txtTitle.setText("بخش یازدهم:ممیزی و حسابرسی");
            txtViewEx.setText(getString(R.string.Aeenmali_bakhsh11), false);
        }
        else if (item.equals("بخش دوازدهم:اموال")){
            txtTitle.setText("بخش دوازدهم:اموال");
            txtViewEx.setText(getString(R.string.Aeenmali_bakhsh12), false);
        }

        else if (item.equals("درآمدها و منابع تامین اعتبار")){
            txtTitle.setText("درآمدها و منابع تامین اعتبار");
            txtViewEx.setText(getString(R.string.Aeenmali_daramadha), false);
        }

        else if (item.equals("خدمات اداری-روستایی")){
            txtTitle.setText("خدمات اداری-روستایی");
            txtViewEx.setText(getString(R.string.Aeenmali_khadamatedary), false);
        }

        else if (item.equals("سرفصل های عمرانی")){
            txtTitle.setText("سرفصل های عمرانی");
            txtViewEx.setText(getString(R.string.Aeenmali_sarfaslomrani), false);
        }

        else if (item.equals("کیفیت انتخابات")){
            txtTitle.setText("کیفیت انتخابات");
            txtViewEx.setText(getString(R.string.Entekhabat_keyfiyat), false);
        }


        else if (item.equals("شرایط انتخاب کنندگان و انتخاب شوندگان")){
            txtTitle.setText("شرایط انتخاب کنندگان و انتخاب شوندگان");
            txtViewEx.setText(getString(R.string.Entekhbat_sharayet), false);
        }


        else if (item.equals("هیات اجرایی و وظایف آنها")){
            txtTitle.setText("هیات اجرایی و وظایف آنها");
            txtViewEx.setText(getString(R.string.Entekhabat_heyatejrae), false);
        }


        else if (item.equals("هیاتهای نظارت و وظایف آنها")){
            txtTitle.setText("هیاتهای نظارت و وظایف آنها");
            txtViewEx.setText(getString(R.string.Entekhabat_hayatnezarat), false);
        }


        else if (item.equals("تخلفات")){
            txtTitle.setText("تخلفات");
            txtViewEx.setText(getString(R.string.Entekhabat_takhalof), false);
        }


        else if (item.equals("سایر مقررات")){
            txtTitle.setText("سایر مقررات");
            txtViewEx.setText(getString(R.string.Entekhabat_sayer), false);
        }

        else if (item.equals("بیانات رهبری درباره شوراها")){
            txtTitle.setText("بیانات رهبری درباره شوراها");
            txtViewEx.setText(getString(R.string.bayanatrehbari), false);
        }


        else if (item.equals("شوراها در قانون اساسی")){
            txtTitle.setText("شوراها در قانون اساسی");
            txtViewEx.setText(getString(R.string.shoraghanon), false);
        }







        else if (item.equals("تشکیلات")){
            txtTitle.setText("تشکیلات");
            txtViewEx.setText(getString(R.string.Tashkilat_shora), false);
        }


        else if (item.equals("ترتیب رسیدگی به تخلفات")){
            txtTitle.setText("ترتیب رسیدگی به تخلفات");
            txtViewEx.setText(getString(R.string.Tatib_takhalof), false);
        }


        else if (item.equals("سایر مقررات")){
            txtTitle.setText("سایر مقررات");
            txtViewEx.setText(getString(R.string.sayer_ghavanin), false);
        }

        else if (item.equals("اظهارنامه")){
            txtTitle.setText("اظهارنامه");
            txtViewEx.setText(getString(R.string.ezharname), false);
        }
///در جستجو اضافه شود

        else if (item.equals("استعفا نامه اداری")){
            txtTitle.setText("استعفا نامه اداری");
            txtViewEx.setText(getString(R.string.Estefaname), false);
        }

        else if (item.equals("درخواست دسته چک")){
            txtTitle.setText("درخواست دسته چک");
            txtViewEx.setText(getString(R.string.Daste_chek), false);
        }

        else if (item.equals("درخواست بخشودگی جرائم")){
            txtTitle.setText("درخواست بخشودگی جرائم");
            txtViewEx.setText(getString(R.string.Bakhshodegi_jaraem), false);
        }


        else if (item.equals("درخواست همکاری به آگهی")){
            txtTitle.setText("درخواست همکاری به آگهی");
            txtViewEx.setText(getString(R.string.Hamkari_agahi), false);
        }


        else if (item.equals("پاسخ به پیام تبریک انتصاب")){
            txtTitle.setText("پاسخ به پیام تبریک انتصاب");
            txtViewEx.setText(getString(R.string.Tabrih_entesab), false);
        }

        else if (item.equals("نامه به اداره دارایی و مالیاتی")){
            txtTitle.setText("نامه به اداره دارایی و مالیاتی");
            txtViewEx.setText(getString(R.string.Daraee), false);
        }

        else if (item.equals("نامه درخصوص غیبت و عدم حضور")){
            txtTitle.setText("نامه درخصوص غیبت و عدم حضور");
            txtViewEx.setText(getString(R.string.Ghaybat_adamhozor), false);
        }

        else if (item.equals("استعفا نامه اداری")){
            txtTitle.setText("استعفا نامه اداری");
            txtViewEx.setText(getString(R.string.Estefa_name), false);
        }

        else if (item.equals("استشهاد محلی درخواست پروانه کسب")){
            txtTitle.setText("استشهاد محلی درخواست پروانه کسب");
            txtViewEx.setText(getString(R.string.Estashad_mahali), false);
        }


        else if (item.equals("اخطار به علت تاخیر و بی انضباطی")){
            txtTitle.setText("اخطار به علت تاخیر و بی انضباطی");
            txtViewEx.setText(getString(R.string.Ekhat_takhir), false);
        }

        else if (item.equals("اعتراض به تنیجه گزینش")){
            txtTitle.setText("اعتراض به تنیجه گزینش");
            txtViewEx.setText(getString(R.string.Eteraz_natijegozinesh), false);
        }

        else if (item.equals("درخواست استفاده از دیوار جهت تبلیغات")){
            txtTitle.setText("درخواست استفاده از دیوار جهت تبلیغات");
            txtViewEx.setText(getString(R.string.Darkhst_estefadedivar), false);
        }

        else if (item.equals("تقدیر و تشکر بابت همکاری")){
            txtTitle.setText("تقدیر و تشکر بابت همکاری");
            txtViewEx.setText(getString(R.string.Taghdir_hamkari), false);
        }


        else if (item.equals("نامه به فرمانداری جهت درخواست گاز")){
            txtTitle.setText("نامه به فرمانداری جهت درخواست گاز");
            txtViewEx.setText(getString(R.string.Namefarmandari_gaz), false);
        }


        else if (item.equals("تقدیرنامه اداری")){
            txtTitle.setText("تقدیرنامه اداری");
            txtViewEx.setText(getString(R.string.Taghdirname_edari), false);
        }


        else if (item.equals("تقاضای تقسیط مالیات")){
            txtTitle.setText("تقاضای تقسیط مالیات");
            txtViewEx.setText(getString(R.string.Taghaza_taghsitmaliyat), false);
        }

        else if (item.equals("پیام تبریک انتصاب")){
            txtTitle.setText("پیام تبریک انتصاب");
            txtViewEx.setText(getString(R.string.Tabrik_entesab1), false);
        }

        else if (item.equals("درخواست امریه")){
            txtTitle.setText("درخواست امریه");
            txtViewEx.setText(getString(R.string.Darkhast_amrieh), false);
        }

        else if (item.equals("درخواست مرخصی")){
            txtTitle.setText("درخواست مرخصی");
            txtViewEx.setText(getString(R.string.Darkhst_morakhasi1), false);
        }


        else if (item.equals("عدم پاسخ یک اداره به نامه ارسالی")){
            txtTitle.setText("عدم پاسخ یک اداره به نامه ارسالی");
            txtViewEx.setText(getString(R.string.Edam_pasokhname), false);
        }


        else if (item.equals("درخواست غرفه در نمایشگاه")){
            txtTitle.setText("درخواست غرفه در نمایشگاه");
            txtViewEx.setText(getString(R.string.Darkhast_ghorfe), false);
        }

        else if (item.equals("درخواست و تقاضای افزایش حقوق پرسنل از مدیران")){
            txtTitle.setText("درخواست و تقاضای افزایش حقوق پرسنل از مدیران");
            txtViewEx.setText(getString(R.string.DArkhst_afzayeshhoghogh), false);
        }

        else if (item.equals("درخواست وام از بانک")){
            txtTitle.setText("درخواست وام از بانک");
            txtViewEx.setText(getString(R.string.Darkhst_vam1), false);
        }

        else if (item.equals("درخواست احداث سالن ورزشی")){
            txtTitle.setText("درخواست احداث سالن ورزشی");
            txtViewEx.setText(getString(R.string.Ehdas_salonvarzeshi), false);
        }

        else if (item.equals("نامه به فرمانداری")){
            txtTitle.setText("نامه به فرمانداری");
            txtViewEx.setText(getString(R.string.Name_befamandari), false);
        }

        else if (item.equals("دعوت و شرکت در جلسه")){
            txtTitle.setText("دعوت و شرکت در جلسه");
            txtViewEx.setText(getString(R.string.Davat_sherkatjalase), false);
        }
        else if (item.equals("درخواست جهت وقت ملاقات")){
            txtTitle.setText("درخواست جهت وقت ملاقات");
            txtViewEx.setText(getString(R.string.Darkhast_vaghmolaghat), false);
        }

        else if (item.equals("تعهد نامه پرداخت اقساط وام")){
            txtTitle.setText("تعهد نامه پرداخت اقساط وام");
            txtViewEx.setText(getString(R.string.Taahodname_vam), false);
        }

        else if (item.equals("معرفی نامه")){
            txtTitle.setText("تمعرفی نامه");
            txtViewEx.setText(getString(R.string.Moarefi_name), false);
        }


















        //اتمام  if

        Window window = this.getWindow();
        if (Build.VERSION.SDK_INT > Build.VERSION_CODES.KITKAT_WATCH) {
            // clear FLAG_TRANSLUCENT_STATUS flag:
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);

// add FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS flag to the window
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);

// finally change the color
            window.setStatusBarColor(ContextCompat.getColor(this,R.color.colorPrimaryDark));
        }



        // Optional hyphenation:
        // Words syllables must be pre-separated with a syllableSeparator string (character)
        // Example: A com*put*er is a gen*er*al pur*pose de*vice that...
        //   txtViewEx.setHyphenate(true, "*");

     /*   String currentString = txtMatn.getText().toString();
        if (currentString.length()<3000){
            s1=currentString;
        }else {
            String[] separated = currentString.split(".");
            StringBuilder stringBuilder=new StringBuilder();
            for (int i=0;i<separated.length;i++){
                stringBuilder.append(separated[i]);
                if (stringBuilder.toString().length()<3000&&!setLongMessage){
                    s1=stringBuilder.toString();
                    setLongMessage=true;
                    stringBuilder.delete(0,stringBuilder.length());
                }
                if (setLongMessage){
                    s2=stringBuilder.toString();
                    stringBuilder.delete(0,stringBuilder.length());
                }
            }


        }*/


        imgBack=findViewById(R.id.imgBack);
        imgBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });




        imgShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
                sharingIntent.setType("text/plain");
                sharingIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Subject Here");
                sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s1);
                if (null!=s2){
                    sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, s2);
                }
                startActivity(Intent.createChooser(sharingIntent, "Share text via"));
            }
        });

    }
}
