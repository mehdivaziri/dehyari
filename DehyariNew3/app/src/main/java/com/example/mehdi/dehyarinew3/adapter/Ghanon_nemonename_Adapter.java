package com.example.mehdi.dehyarinew3.adapter;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.mehdi.dehyarinew3.R;
import com.example.mehdi.dehyarinew3.ac_edari.Aeennegaresh_edari;
import com.example.mehdi.dehyarinew3.ac_edari.DownloadActivity;
import com.example.mehdi.dehyarinew3.ac_edari.ac_nemonename.Dakhst_vam;
import com.example.mehdi.dehyarinew3.ac_edari.ac_nemonename.Darkhast_tashilat;
import com.example.mehdi.dehyarinew3.ac_edari.ac_nemonename.Eteraz_ekhtar;
import com.example.mehdi.dehyarinew3.ac_edari.ac_nemonename.Ezharname;
import com.example.mehdi.dehyarinew3.ac_edari.ac_nemonename.Pardakh_hoghogh;
import com.example.mehdi.dehyarinew3.ac_edari.ac_nemonename.Sodor_mojavez;
import com.example.mehdi.dehyarinew3.ac_edari.ac_nemonename.TabrikActivity;
import com.example.mehdi.dehyarinew3.model.ModelListGhanon;

import java.util.List;




    public class Ghanon_nemonename_Adapter extends RecyclerView.Adapter<com.example.mehdi.dehyarinew3.adapter.Ghanon_nemonename_Adapter.MyViewHolder>{



        public static final String TABRIK ="tabrik";


        private List<ModelListGhanon> mainLists;


        public class MyViewHolder extends RecyclerView.ViewHolder {
            public TextView txtTitle;

            public MyViewHolder(View view) {
                super(view);
                txtTitle = (TextView) view.findViewById(R.id.txtTitle);


            }
        }


        public Ghanon_nemonename_Adapter(List<ModelListGhanon> mainLists) {

            this.mainLists = mainLists;
        }

        @Override
        public com.example.mehdi.dehyarinew3.adapter.Ghanon_nemonename_Adapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View itemView = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.row_list_ghanon,parent ,false);

            return new com.example.mehdi.dehyarinew3.adapter.Ghanon_nemonename_Adapter.MyViewHolder(itemView);
        }

        @Override
        public void onBindViewHolder(final com.example.mehdi.dehyarinew3.adapter.Ghanon_nemonename_Adapter.MyViewHolder holder, int position) {
            ModelListGhanon mainList = mainLists.get(position);
            holder.txtTitle.setText(mainList.getTitle());
            if (holder.txtTitle.getText()=="درخواست وام مسکن و تعمیرات") {
                holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent GoActivity = new Intent(view.getContext(), Dakhst_vam.class);
                        //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                        view.getContext().startActivity(GoActivity);
                    }
                });

            }
            if (holder.txtTitle.getText()=="درخواست تسهیلات") {
                holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent GoActivity = new Intent(view.getContext(), Darkhast_tashilat.class);
                        //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                        view.getContext().startActivity(GoActivity);
                    }
                });

            }


            if (holder.txtTitle.getText()=="اعتراض و اخطار") {
                holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent GoActivity = new Intent(view.getContext(), Eteraz_ekhtar.class);
                        //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                        view.getContext().startActivity(GoActivity);
                    }
                });

            }

            if (holder.txtTitle.getText()=="نامه پرداخت حقوق معوقه") {
                holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent GoActivity = new Intent(view.getContext(), Pardakh_hoghogh.class);
                        //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                        view.getContext().startActivity(GoActivity);
                    }
                });

            }



            if (holder.txtTitle.getText()=="صدور مجوز") {
                holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent GoActivity = new Intent(view.getContext(), Sodor_mojavez.class);
                        //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                        view.getContext().startActivity(GoActivity);
                    }
                });

            }

            if (holder.txtTitle.getText()=="اظهارنامه") {
                holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent GoActivity = new Intent(view.getContext(), TabrikActivity.class);
                        GoActivity.putExtra(TABRIK,
                                "اظهارنامه");
                        //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                        view.getContext().startActivity(GoActivity);
                    }
                });

            }

            if (holder.txtTitle.getText()=="استعفا نامه اداری") {
                holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent GoActivity = new Intent(view.getContext(), TabrikActivity.class);
                        GoActivity.putExtra(TABRIK,
                                "استعفا نامه اداری");
                        //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                        view.getContext().startActivity(GoActivity);
                    }
                });

            }

            if (holder.txtTitle.getText()=="درخواست دسته چک") {
                holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent GoActivity = new Intent(view.getContext(), TabrikActivity.class);
                        GoActivity.putExtra(TABRIK,
                                "درخواست دسته چک");
                        //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                        view.getContext().startActivity(GoActivity);
                    }
                });

            }

            if (holder.txtTitle.getText()=="درخواست بخشودگی جرائم") {
                holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent GoActivity = new Intent(view.getContext(), TabrikActivity.class);
                        GoActivity.putExtra(TABRIK,
                                "درخواست بخشودگی جرائم");
                        //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                        view.getContext().startActivity(GoActivity);
                    }
                });

            }

            if (holder.txtTitle.getText()=="درخواست همکاری به آگهی") {
                holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent GoActivity = new Intent(view.getContext(), TabrikActivity.class);
                        GoActivity.putExtra(TABRIK,
                                "درخواست همکاری به آگهی");
                        //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                        view.getContext().startActivity(GoActivity);
                    }
                });

            }

            if (holder.txtTitle.getText()=="پاسخ به پیام تبریک انتصاب") {
                holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent GoActivity = new Intent(view.getContext(), TabrikActivity.class);
                        GoActivity.putExtra(TABRIK,
                                "پاسخ به پیام تبریک انتصاب");
                        //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                        view.getContext().startActivity(GoActivity);
                    }
                });

            }

            if (holder.txtTitle.getText()=="نامه به اداره دارایی و مالیاتی") {
                holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent GoActivity = new Intent(view.getContext(), TabrikActivity.class);
                        GoActivity.putExtra(TABRIK,
                                "نامه به اداره دارایی و مالیاتی");
                        //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                        view.getContext().startActivity(GoActivity);
                    }
                });

            }
            if (holder.txtTitle.getText()=="استعفا نامه اداری") {
                holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent GoActivity = new Intent(view.getContext(), TabrikActivity.class);
                        GoActivity.putExtra(TABRIK,
                                "استعفا نامه اداری");
                        //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                        view.getContext().startActivity(GoActivity);
                    }
                });

            }

            if (holder.txtTitle.getText()=="استشهاد محلی درخواست پروانه کسب") {
                holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent GoActivity = new Intent(view.getContext(), TabrikActivity.class);
                        GoActivity.putExtra(TABRIK,
                                "استشهاد محلی درخواست پروانه کسب");
                        //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                        view.getContext().startActivity(GoActivity);
                    }
                });

            }

            if (holder.txtTitle.getText()=="اخطار به علت تاخیر و بی انضباطی") {
                holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent GoActivity = new Intent(view.getContext(), TabrikActivity.class);
                        GoActivity.putExtra(TABRIK,
                                "اخطار به علت تاخیر و بی انضباطی");
                        //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                        view.getContext().startActivity(GoActivity);
                    }
                });

            }

            if (holder.txtTitle.getText()=="اعتراض به تنیجه گزینش") {
                holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent GoActivity = new Intent(view.getContext(), TabrikActivity.class);
                        GoActivity.putExtra(TABRIK,
                                "اعتراض به تنیجه گزینش");
                        //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                        view.getContext().startActivity(GoActivity);
                    }
                });

            }

            if (holder.txtTitle.getText()=="درخواست استفاده از دیوار جهت تبلیغات") {
                holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent GoActivity = new Intent(view.getContext(), TabrikActivity.class);
                        GoActivity.putExtra(TABRIK,
                                "درخواست استفاده از دیوار جهت تبلیغات");
                        //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                        view.getContext().startActivity(GoActivity);
                    }
                });

            }
            if (holder.txtTitle.getText()=="تقدیر و تشکر بابت همکاری") {
                holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent GoActivity = new Intent(view.getContext(), TabrikActivity.class);
                        GoActivity.putExtra(TABRIK,
                                "تقدیر و تشکر بابت همکاری");
                        //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                        view.getContext().startActivity(GoActivity);
                    }
                });

            }
            if (holder.txtTitle.getText()=="نامه به فرمانداری جهت درخواست گاز") {
                holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent GoActivity = new Intent(view.getContext(), TabrikActivity.class);
                        GoActivity.putExtra(TABRIK,
                                "نامه به فرمانداری جهت درخواست گاز");
                        //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                        view.getContext().startActivity(GoActivity);
                    }
                });

            }
            if (holder.txtTitle.getText()=="تقدیرنامه اداری") {
                holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent GoActivity = new Intent(view.getContext(), TabrikActivity.class);
                        GoActivity.putExtra(TABRIK,
                                "تقدیرنامه اداری");
                        //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                        view.getContext().startActivity(GoActivity);
                    }
                });

            }
            if (holder.txtTitle.getText()=="تقاضای تقسیط مالیات") {
                holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent GoActivity = new Intent(view.getContext(), TabrikActivity.class);
                        GoActivity.putExtra(TABRIK,
                                "تقاضای تقسیط مالیات");
                        //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                        view.getContext().startActivity(GoActivity);
                    }
                });

            }  if (holder.txtTitle.getText()=="پیام تبریک انتصاب") {
                holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent GoActivity = new Intent(view.getContext(), TabrikActivity.class);
                        GoActivity.putExtra(TABRIK,
                                "پیام تبریک انتصاب");
                        //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                        view.getContext().startActivity(GoActivity);
                    }
                });

            }  if (holder.txtTitle.getText()=="درخواست امریه") {
                holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent GoActivity = new Intent(view.getContext(), TabrikActivity.class);
                        GoActivity.putExtra(TABRIK,
                                "درخواست امریه");
                        //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                        view.getContext().startActivity(GoActivity);
                    }
                });

            }  if (holder.txtTitle.getText()=="درخواست مرخصی") {
                holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent GoActivity = new Intent(view.getContext(), TabrikActivity.class);
                        GoActivity.putExtra(TABRIK,
                                "درخواست مرخصی");
                        //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                        view.getContext().startActivity(GoActivity);
                    }
                });

            }  if (holder.txtTitle.getText()=="عدم پاسخ یک اداره به نامه ارسالی") {
                holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent GoActivity = new Intent(view.getContext(), TabrikActivity.class);
                        GoActivity.putExtra(TABRIK,
                                "عدم پاسخ یک اداره به نامه ارسالی");
                        //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                        view.getContext().startActivity(GoActivity);
                    }
                });

            }  if (holder.txtTitle.getText()=="درخواست غرفه در نمایشگاه") {
                holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent GoActivity = new Intent(view.getContext(), TabrikActivity.class);
                        GoActivity.putExtra(TABRIK,
                                "درخواست غرفه در نمایشگاه");
                        //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                        view.getContext().startActivity(GoActivity);
                    }
                });

            }
            if (holder.txtTitle.getText()=="درخواست و تقاضای افزایش حقوق پرسنل از مدیران") {
                holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent GoActivity = new Intent(view.getContext(), TabrikActivity.class);
                        GoActivity.putExtra(TABRIK,
                                "درخواست و تقاضای افزایش حقوق پرسنل از مدیران");
                        //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                        view.getContext().startActivity(GoActivity);
                    }
                });

            }
            if (holder.txtTitle.getText()=="درخواست وام از بانک") {
                holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent GoActivity = new Intent(view.getContext(), TabrikActivity.class);
                        GoActivity.putExtra(TABRIK,
                                "درخواست وام از بانک");
                        //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                        view.getContext().startActivity(GoActivity);
                    }
                });

            }
            if (holder.txtTitle.getText()=="درخواست احداث سالن ورزشی") {
                holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent GoActivity = new Intent(view.getContext(), TabrikActivity.class);
                        GoActivity.putExtra(TABRIK,
                                "درخواست احداث سالن ورزشی");
                        //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                        view.getContext().startActivity(GoActivity);
                    }
                });

            }  if (holder.txtTitle.getText()=="نامه به فرمانداری") {
                holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent GoActivity = new Intent(view.getContext(), TabrikActivity.class);
                        GoActivity.putExtra(TABRIK,
                                "نامه به فرمانداری");
                        //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                        view.getContext().startActivity(GoActivity);
                    }
                });

            }  if (holder.txtTitle.getText()=="دعوت و شرکت در جلسه") {
                holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent GoActivity = new Intent(view.getContext(), TabrikActivity.class);
                        GoActivity.putExtra(TABRIK,
                                "دعوت و شرکت در جلسه");
                        //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                        view.getContext().startActivity(GoActivity);
                    }
                });

            }
            if (holder.txtTitle.getText()=="درخواست جهت وقت ملاقات") {
                holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent GoActivity = new Intent(view.getContext(), TabrikActivity.class);
                        GoActivity.putExtra(TABRIK,
                                "درخواست جهت وقت ملاقات");
                        //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                        view.getContext().startActivity(GoActivity);
                    }
                });

            }
            if (holder.txtTitle.getText()=="تعهد نامه پرداخت اقساط وام") {
                holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent GoActivity = new Intent(view.getContext(), TabrikActivity.class);
                        GoActivity.putExtra(TABRIK,
                                "تعهد نامه پرداخت اقساط وام");
                        //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                        view.getContext().startActivity(GoActivity);
                    }
                });

            }
            if (holder.txtTitle.getText()=="معرفی نامه") {
                holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent GoActivity = new Intent(view.getContext(), TabrikActivity.class);
                        GoActivity.putExtra(TABRIK,
                                "معرفی نامه");
                        //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                        view.getContext().startActivity(GoActivity);
                    }
                });

            }




























      /*  holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(view.getContext(), Harkat_Activity.class);
               // intent.putExtra("id",1);
                view.getContext().startActivity(intent);
                //این طوریه اولی مربوط به همین صفحه دومی به صفحه ای که میخواهیم بریم\\میخوام اول idرو از این صفحه بگیرم بعد برم صفحه بعد||خوب الان شما گرف
               //میخوام برم صفحه بعد startActivity(new Intent(MainAdapter.this, HarkatAdapter.class));
             //  Intent GoActivity = new Intent(MainAdapter.this,Harkat_Activity.class);
              //  startActivity(GoActivity);
               // view.getContext().startActivity(GoActivity);
            }
        });*/
        }

        @Override
        public int getItemCount() {
            return mainLists.size();
        }



}
