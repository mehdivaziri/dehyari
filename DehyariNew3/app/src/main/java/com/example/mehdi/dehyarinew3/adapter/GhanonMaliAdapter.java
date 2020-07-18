package com.example.mehdi.dehyarinew3.adapter;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.mehdi.dehyarinew3.R;
import com.example.mehdi.dehyarinew3.Zir_menu.GhanonEdari;
import com.example.mehdi.dehyarinew3.ac_edari.DownloadActivity;
import com.example.mehdi.dehyarinew3.model.ModelListGhanon;

import java.util.List;



    public class GhanonMaliAdapter extends RecyclerView.Adapter<com.example.mehdi.dehyarinew3.adapter.GhanonMaliAdapter.MyViewHolder>{

        public static final String TABRIK ="tabrik";




        private List<ModelListGhanon> mainLists;

        public class MyViewHolder extends RecyclerView.ViewHolder {
            public TextView txtTitle;

            public MyViewHolder(View view) {
                super(view);
                txtTitle = (TextView) view.findViewById(R.id.txtTitle);

            }
        }


        public GhanonMaliAdapter(List<ModelListGhanon> mainLists) {
            this.mainLists = mainLists;
        }

        @Override
        public com.example.mehdi.dehyarinew3.adapter.GhanonMaliAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View itemView = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.row_list_ghanon,parent ,false);

            return new com.example.mehdi.dehyarinew3.adapter.GhanonMaliAdapter.MyViewHolder(itemView);
        }

        @Override
        public void onBindViewHolder(final com.example.mehdi.dehyarinew3.adapter.GhanonMaliAdapter.MyViewHolder holder, int position) {
            ModelListGhanon mainList = mainLists.get(position);
            holder.txtTitle.setText(mainList.getTitle());

            if (holder.txtTitle.getText()=="دستور العمل حقوق و مزایا دهیاران97") {
                holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent GoActivity = new Intent(view.getContext(), DownloadActivity.class);
                        //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                        GoActivity.putExtra(TABRIK,
                                "دستور العمل حقوق و مزایا دهیاران97");
                        view.getContext().startActivity(GoActivity);
                    }
                });

            }



            if (holder.txtTitle.getText()=="دستمزد مبنای کسر بیمه97") {
                holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent GoActivity = new Intent(view.getContext(), DownloadActivity.class);
                        //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                        GoActivity.putExtra(TABRIK,
                                "دستمزد مبنای کسر بیمه97");
                        view.getContext().startActivity(GoActivity);
                    }
                });

            }


            if (holder.txtTitle.getText()=="دستورالعمل تهیه اسناد هزینه و مدارک ضمیمهدستورالعمل تهیه اسناد هزینه و مدارک ضمیمه") {
                holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent GoActivity = new Intent(view.getContext(), DownloadActivity.class);
                        //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                        GoActivity.putExtra(TABRIK,
                                "دستورالعمل تهیه اسناد هزینه و مدارک ضمیمه");
                        view.getContext().startActivity(GoActivity);
                    }
                });

            }


            if (holder.txtTitle.getText()=="شیوه نامه حقوق مسئولین مالی") {
                holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent GoActivity = new Intent(view.getContext(), DownloadActivity.class);
                        //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                        GoActivity.putExtra(TABRIK,
                                "شیوه نامه حقوق مسئولین مالی");
                        view.getContext().startActivity(GoActivity);
                    }
                });

            }

            if (holder.txtTitle.getText()=="شیوه نامه حقوق مسئولین فنی") {
                holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent GoActivity = new Intent(view.getContext(), DownloadActivity.class);
                        //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                        GoActivity.putExtra(TABRIK,
                                "شیوه نامه حقوق مسئولین فنی");
                        view.getContext().startActivity(GoActivity);
                    }
                });

            }

            if (holder.txtTitle.getText()=="طرز استفاده از تنخواه گردان دهیاری ها") {
                holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent GoActivity = new Intent(view.getContext(), DownloadActivity.class);
                        //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                        GoActivity.putExtra(TABRIK,
                                "طرز استفاده از تنخواه گردان دهیاری ها");
                        view.getContext().startActivity(GoActivity);
                    }
                });

            }

            if (holder.txtTitle.getText()=="دستورالعمل نحوه حسابرسی دهیاریها") {
                holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent GoActivity = new Intent(view.getContext(), DownloadActivity.class);
                        //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                        GoActivity.putExtra(TABRIK,
                                "دستورالعمل نحوه حسابرسی دهیاریها");
                        view.getContext().startActivity(GoActivity);
                    }
                });

            }

            if (holder.txtTitle.getText()=="قرارداد انجام حسابرسی") {
                holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent GoActivity = new Intent(view.getContext(), DownloadActivity.class);
                        //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                        GoActivity.putExtra(TABRIK,
                                "قرارداد انجام حسابرسی");
                        view.getContext().startActivity(GoActivity);
                    }
                });

            }

            if (holder.txtTitle.getText()=="ضوابط تهیه و الصاق برچسب اموال دهیاری") {
                holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent GoActivity = new Intent(view.getContext(), DownloadActivity.class);
                        //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                        GoActivity.putExtra(TABRIK,
                                "ضوابط تهیه و الصاق برچسب اموال دهیاری");
                        view.getContext().startActivity(GoActivity);
                    }
                });

            }

            if (holder.txtTitle.getText()=="دستورالعمل حقوق و مزایای دهیاران در سال96") {
                holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent GoActivity = new Intent(view.getContext(), DownloadActivity.class);
                        //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی جش
                        GoActivity.putExtra(TABRIK,
                                "دستورالعمل حقوق و مزایای دهیاران در سال96");
                        view.getContext().startActivity(GoActivity);
                    }
                });

            }

            if (holder.txtTitle.getText()=="دستورالعمل نحوه تعیین حقوق و مزایای دهیاران") {
                holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent GoActivity = new Intent(view.getContext(), DownloadActivity.class);
                        //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                        GoActivity.putExtra(TABRIK,
                                "دستورالعمل نحوه تعیین حقوق و مزایای دهیاران");
                        view.getContext().startActivity(GoActivity);
                    }
                });

            }

            if (holder.txtTitle.getText()=="ممنوعیت به کارگیری کارکنان استاداری،فرمانداری و بخشداری ب عنوان مسوول مالی دهیاری ها") {
                holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent GoActivity = new Intent(view.getContext(), DownloadActivity.class);
                        //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                        GoActivity.putExtra(TABRIK,
                                "ممنوعیت به کارگیری کارکنان استاداری،فرمانداری و بخشداری ب عنوان مسوول مالی دهیاری ها");
                        view.getContext().startActivity(GoActivity);
                    }
                });

            }

            if (holder.txtTitle.getText()=="رشته ها و گرایش های تحصیلی مسوول امور مالی") {
                holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent GoActivity = new Intent(view.getContext(), DownloadActivity.class);
                        //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                        GoActivity.putExtra(TABRIK,
                                "رشته ها و گرایش های تحصیلی مسوول امور مالی");
                        view.getContext().startActivity(GoActivity);
                    }
                });

            }


            if (holder.txtTitle.getText()=="ابلاغ فرم قرارداد و حکم حقوقی دهیاران تمام وقت و پاره وقت") {
                holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent GoActivity = new Intent(view.getContext(), DownloadActivity.class);
                        //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                        GoActivity.putExtra(TABRIK,
                                "ابلاغ فرم قرارداد و حکم حقوقی دهیاران تمام وقت و پاره وقت");
                        view.getContext().startActivity(GoActivity);
                    }
                });

            }


            if (holder.txtTitle.getText()=="دستورالعمل نحوه پرداخت حقوق و مزایای مسوولین مالی دهیاری ها") {
                holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent GoActivity = new Intent(view.getContext(), DownloadActivity.class);
                        //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                        GoActivity.putExtra(TABRIK,
                                "دستورالعمل نحوه پرداخت حقوق و مزایای مسوولین مالی دهیاری ها");
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

