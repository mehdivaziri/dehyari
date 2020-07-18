package com.example.mehdi.dehyarinew3.search;

import android.app.TabActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Switch;
import android.widget.Toast;

import com.example.mehdi.dehyarinew3.R;
import com.example.mehdi.dehyarinew3.ac_edari.DownloadActivity;
import com.example.mehdi.dehyarinew3.ac_edari.ac_nemonename.TabrikActivity;
import com.example.mehdi.dehyarinew3.activity.MainActivity;
import com.example.mehdi.dehyarinew3.adapter.Edarinagaresh_tabrik_Adapter;
import com.example.mehdi.dehyarinew3.model.MovieNames;

import java.util.ArrayList;

public class SearchActivity extends AppCompatActivity {
    public static final String TITLE_PAGE = "titlePage";
    private EditText etsearch;
    private ListView list;
    private ListViewAdapter adapter;
    private String[] moviewList;
    public static ArrayList<MovieNames> movieNamesArrayList;
    public static ArrayList<MovieNames> array_sort;
    int textlength = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_search);

        moviewList = new String[]{"تبریک روز شورا", "تبریک انتصاب", "تبریک انتصاب هیات رییسه مجلس",
                "تبریک هفته دولت", "تبریک روز نیروی انتظامی", "تبریک دهه فجر", "تبریک انتخاب مجدد", "تبریک روز پدر",
                "اعلام حضور در شغل جدید","تبریک جهت انتصاب","نحوه تعیین درجه دهیاریها","فن بیان و گویندگی","سخنوری و روایط عمومی","ده قانون طلائی برای برگزاری سمینارهاوگردهمائی ها","40اصل فن بیان در برخورد با مشتری",
                "شیوه نامه نحوه مکاتبات اداری دهیاریهای کشور","دستورالعمل ایجاد یکنواختی نظام عوارض شورای اسلامی بخش","قانون تاسیس دهیاریهای خودکفا","اساسنامه،تشکیلات و سازمان دهیاریها",
                "فصل1:کلیات"
              //download
              ,"احکام دائمی برنامه توسعه کشور","بخشنامه کمیته انطباق","نظام نامه ارزیابی عملکرد دهیاریهای کشور","شیوه نامه اطلاع رسانی عمومی مدیریت روستا","شیوه نامه نحوه انتخاب و عزل دهیار",
                "تعرفه عوارض و بهای خدمات","منشور اخلاقی دهیاری","شیوه نامه تهیه و نصب منشور اخلاقی دهیاری","آیین نامه نحوه وضع و وصول عوارض توسط شورای بخش","بخشنامه ضرورت ارسال مصوبه عزل دهیار به کارگروه انطباق",
                "آیین نامه استخدامی دهیاریهای کشور","بخشنامه بودجه 98","فرم ماموریت دهیار","فرم مرخصی دهیار","فرم گزارش کار دهیار","ضمائم سند هزینه(10 فرم)","قرار داد اجاره ماشین آلات","نمونه آگهی مناقصه عمومی",
                "مصوبه شورای اسلامی روستا","قرار داد اجاره ماشین آلات","شناسنامه ساختمان روستایی","فرم حکم حقوقی دهیار","تحویل و تحول دهیاری","لیست اموال","قراردادجمع آوری پسماند روستا",
                "قرارداد مصالح ساختمانی","قرر داد پیماانکاری به کارگیری ماشین آلات","صورتجلسه تعیین سمت اعضای هیات","رسید دریافت چک از دهیاری","سربرگ دهیاری A5","سربرگ شوراA5",
                "فصل2:مقررات عضویت","فصل3:ارکان تعاونی","فصل4:مقررات مالی","فصل5:مقررات مختلف","شیوه نامه ها و دستورالعمل ها","دستور العمل حقوق و مزایا دهیاران97","دستمزد مبنای کسر بیمه97",
                "دستورالعمل تهیه اسناد هزینه و مدارک ضمیمه","شیوه نامه حقوق مسئولین مالی","شیوه نامه حقوق مسئولین فنی","طرز استفاده از تنخواه گردان دهیاری ها"
                ,"دستورالعمل نحوه حسابرسی دهیاریها","قرارداد انجام حسابرسی","ضوابط تهیه و الصاق برچسب اموال دهیاری","دستورالعمل نحوه تعیین حقوق و مزایای دهیاران","ممنوعیت به کارگیری کارکنان استاداری،فرمانداری و بخشداری ب عنوان مسوول مالی دهیاری ها"
                ,"رشته ها و گرایش های تحصیلی مسوول امور مالی","ابلاغ فرم قرارداد و حکم حقوقی دهیاران تمام وقت و پاره وقت","دستورالعمل نحوه پرداخت حقوق و مزایای مسوولین مالی دهیاری ها"


              //activiti khodesh



        };

        list = (ListView) findViewById(R.id.listView);

        movieNamesArrayList = new ArrayList<>();
        array_sort = new ArrayList<>();

        for (int i = 0; i < moviewList.length; i++) {
            MovieNames movieNames = new MovieNames(moviewList[i]);
            // Binds all strings into an array
            movieNamesArrayList.add(movieNames);
            array_sort.add(movieNames);
        }

        adapter = new ListViewAdapter(this,movieNamesArrayList);
        list.setAdapter(adapter);


        etsearch = (EditText) findViewById(R.id.editText);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (array_sort.get(position).getMovieName()) {
                    case "تبریک روز شورا":
                        goNextPage(position, TabrikActivity.class);
                        break;
                    case "تبریک انتصاب":
                        goNextPage(position, TabrikActivity.class);
                        break;

                    case "تبریک هفته دولت":
                        goNextPage(position, TabrikActivity.class);
                        break;

                    case "تبریک انتصاب هیات رییسه مجلس":
                        goNextPage(position, TabrikActivity.class);
                        break;

                    case "تبریک روز نیروی انتظامی":
                        goNextPage(position, TabrikActivity.class);
                        break;
                    case "تبریک دهه فجر":
                        goNextPage(position, TabrikActivity.class);
                        break;
                    case "تبریک انتخاب مجدد":
                        goNextPage(position, TabrikActivity.class);
                        break;
                    case "تبریک روز پدر":
                        goNextPage(position, TabrikActivity.class);
                        break;
                    case "اعلام حضور در شغل جدید":
                        goNextPage(position, TabrikActivity.class);
                        break;
                    case "تبریک جهت انتصاب":
                        goNextPage(position, TabrikActivity.class);
                        break;
                    case "نحوه تعیین درجه دهیاریها":
                        goNextPage(position, TabrikActivity.class);
                        break;
                    case "فن بیان و گویندگی":
                        goNextPage(position, TabrikActivity.class);
                        break;
                    case "سخنوری و روایط عمومی":
                        goNextPage(position, TabrikActivity.class);
                        break;
                    case "ده قانون طلائی برای برگزاری سمینارهاوگردهمائی ها":
                        goNextPage(position, TabrikActivity.class);
                        break;
                    case "40اصل فن بیان در برخورد با مشتری":
                        goNextPage(position, TabrikActivity.class);
                        break;


                   //activiti download
                    case "احکام دائمی برنامه توسعه کشور":
                        goNextPage(position, DownloadActivity.class);
                        break;
                    case "بخشنامه کمیته انطباق":
                        goNextPage(position, DownloadActivity.class);
                        break;
                    case "نظام نامه ارزیابی عملکرد دهیاریهای کشور":
                        goNextPage(position, DownloadActivity.class);
                        break;
                    case "شیوه نامه اطلاع رسانی عمومی مدیریت روستا":
                        goNextPage(position, DownloadActivity.class);
                        break;
                    case "شیوه نامه نحوه انتخاب و عزل دهیار":
                        goNextPage(position, DownloadActivity.class);
                        break;
                        case "تعرفه عوارض و بهای خدمات":
                        goNextPage(position, DownloadActivity.class);
                        break;

                    case "منشور اخلاقی دهیاری":
                        goNextPage(position, DownloadActivity.class);
                        break;

                    case "شیوه نامه تهیه و نصب منشور اخلاقی دهیاری":
                        goNextPage(position, DownloadActivity.class);
                        break;

                    case "آیین نامه نحوه وضع و وصول عوارض توسط شورای بخش":
                        goNextPage(position, DownloadActivity.class);
                        break;

                    case "بخشنامه ضرورت ارسال مصوبه عزل دهیار به کارگروه انطباق":
                        goNextPage(position, DownloadActivity.class);
                        break;


                    case "آیین نامه استخدامی دهیاریهای کشور":
                        goNextPage(position, DownloadActivity.class);
                        break;

                    case "بخشنامه بودجه 98":
                        goNextPage(position, DownloadActivity.class);
                        break;

                    case "فرم ماموریت دهیار":
                        goNextPage(position, DownloadActivity.class);
                        break;



                    case "فرم مرخصی دهیار98":
                        goNextPage(position, DownloadActivity.class);
                        break;

                    case "فرم گزارش کار دهیار":
                        goNextPage(position, DownloadActivity.class);
                        break;
                    case "ضمائم سند هزینه(10 فرم)":
                        goNextPage(position, DownloadActivity.class);
                        break;

                    case "قرار داد اجاره ماشین آلات":
                        goNextPage(position, DownloadActivity.class);
                        break;

                    case "نمونه آگهی مناقصه عمومی":
                        goNextPage(position, DownloadActivity.class);
                        break;

                    case "مصوبه شورای اسلامی روستا":
                        goNextPage(position, DownloadActivity.class);
                        break;

                    case "قرارداد مصالح ساختمانی":
                        goNextPage(position, DownloadActivity.class);
                        break;

                    case "قرر داد پیماانکاری به کارگیری ماشین آلات":
                        goNextPage(position, DownloadActivity.class);
                        break;

                    case "صورتجلسه تعیین سمت اعضای هیات":
                        goNextPage(position, DownloadActivity.class);
                        break;

                    case "رسید دریافت چک از دهیاری":
                        goNextPage(position, DownloadActivity.class);
                        break;

                    case "سربرگ دهیاری A5":
                        goNextPage(position, DownloadActivity.class);
                        break;

                    case "سربرگ شوراA5":
                        goNextPage(position, DownloadActivity.class);
                        break;

                    case "فصل2:مقررات عضویت":
                        goNextPage(position, DownloadActivity.class);
                        break;

                    case "فصل3:ارکان تعاونی":
                        goNextPage(position, DownloadActivity.class);
                        break;



                    case "فصل4:مقررات مالی":
                        goNextPage(position, DownloadActivity.class);
                        break;

                    case "فصل5:مقررات مختلف":
                        goNextPage(position, DownloadActivity.class);
                        break;

                    case "شیوه نامه ها و دستورالعمل ها":
                        goNextPage(position, DownloadActivity.class);
                        break;

                    case "دستور العمل حقوق و مزایا دهیاران97":
                        goNextPage(position, DownloadActivity.class);
                        break;

                    case "دستمزد مبنای کسر بیمه97":
                        goNextPage(position, DownloadActivity.class);
                        break;

                    case "دستورالعمل تهیه اسناد هزینه و مدارک ضمیمه":
                        goNextPage(position, DownloadActivity.class);
                        break;


                    case "شیوه نامه حقوق مسئولین مالی":
                        goNextPage(position, DownloadActivity.class);
                        break;

                    case "شیوه نامه حقوق مسئولین فنی":
                        goNextPage(position, DownloadActivity.class);
                        break;


                    case "طرز استفاده از تنخواه گردان دهیاری ها":
                        goNextPage(position, DownloadActivity.class);
                        break;


                    case "دستورالعمل نحوه حسابرسی دهیاریها":
                        goNextPage(position, DownloadActivity.class);
                        break;


                    case "قرارداد انجام حسابرسی":
                        goNextPage(position, DownloadActivity.class);
                        break;


                    case "ضوابط تهیه و الصاق برچسب اموال دهیاری":
                        goNextPage(position, DownloadActivity.class);
                        break;


                    case "دستورالعمل نحوه تعیین حقوق و مزایای دهیاران":
                        goNextPage(position, DownloadActivity.class);
                        break;



                    case "ممنوعیت به کارگیری کارکنان استاداری،فرمانداری و بخشداری ب عنوان مسوول مالی دهیاری ها":
                        goNextPage(position, DownloadActivity.class);
                        break;

                    case "رشته ها و گرایش های تحصیلی مسوول امور مالی":
                        goNextPage(position, DownloadActivity.class);
                        break;

                    case "ابلاغ فرم قرارداد و حکم حقوقی دهیاران تمام وقت و پاره وقت":
                        goNextPage(position, DownloadActivity.class);
                        break;

                    case "دستورالعمل نحوه پرداخت حقوق و مزایای مسوولین مالی دهیاری ها":
                        goNextPage(position, DownloadActivity.class);
                        break;



                    default:
                        break;
                }
            }
        });

        etsearch.addTextChangedListener(new TextWatcher() {


            public void afterTextChanged(Editable s) {
            }

            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            public void onTextChanged(CharSequence s, int start, int before, int count) {
                textlength = etsearch.getText().length();
                array_sort.clear();
                for (int i = 0; i < movieNamesArrayList.size(); i++) {
                    if (textlength <= movieNamesArrayList.get(i).getMovieName().length()) {
                        Log.d("ertyyy",movieNamesArrayList.get(i).getMovieName().toLowerCase().trim());
                        if (movieNamesArrayList.get(i).getMovieName().toLowerCase().trim().contains(
                                etsearch.getText().toString().toLowerCase().trim())) {
                            array_sort.add(movieNamesArrayList.get(i));
                        }
                    }
                }
                adapter = new ListViewAdapter(SearchActivity.this, array_sort);
                list.setAdapter(adapter);

            }
        });

    }

    private void goNextPage(int position,Class Main) {
        Intent intent=new Intent(SearchActivity.this, Main);
        intent.putExtra(Edarinagaresh_tabrik_Adapter.TABRIK,array_sort.get(position).getMovieName());
        startActivity(intent);
    }
}