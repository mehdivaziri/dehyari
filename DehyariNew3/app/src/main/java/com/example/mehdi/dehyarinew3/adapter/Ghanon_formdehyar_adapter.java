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





    public class Ghanon_formdehyar_adapter extends RecyclerView.Adapter<com.example.mehdi.dehyarinew3.adapter.Ghanon_formdehyar_adapter.MyViewHolder>{





        public static final String TABRIK ="tabrik";

        private List<ModelListGhanon> mainLists;

        public class MyViewHolder extends RecyclerView.ViewHolder {
            public TextView txtTitle;

            public MyViewHolder(View view) {
                super(view);
                txtTitle = (TextView) view.findViewById(R.id.txtTitle);

            }
        }


        public Ghanon_formdehyar_adapter(List<ModelListGhanon> mainLists) {
            this.mainLists = mainLists;
        }

        @Override
        public com.example.mehdi.dehyarinew3.adapter.Ghanon_formdehyar_adapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View itemView = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.row_list_ghanon,parent ,false);

            return new com.example.mehdi.dehyarinew3.adapter.Ghanon_formdehyar_adapter.MyViewHolder(itemView);
        }

        @Override
        public void onBindViewHolder(final com.example.mehdi.dehyarinew3.adapter.Ghanon_formdehyar_adapter.MyViewHolder holder, int position) {
            ModelListGhanon mainList = mainLists.get(position);
            holder.txtTitle.setText(mainList.getTitle());


            if (holder.txtTitle.getText()=="فرم ماموریت دهیار") {
                holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent GoActivity = new Intent(view.getContext(), DownloadActivity.class);
                        //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                        GoActivity.putExtra(TABRIK,
                                "فرم ماموریت دهیار");
                        view.getContext().startActivity(GoActivity);
                    }
                });

            }


            if (holder.txtTitle.getText()=="فرم مرخصی دهیار") {
                holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent GoActivity = new Intent(view.getContext(), DownloadActivity.class);
                        //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                        GoActivity.putExtra(TABRIK,
                                "فرم مرخصی دهیار");
                        view.getContext().startActivity(GoActivity);
                    }
                });

            }


            if (holder.txtTitle.getText()=="فرم گزارش کار دهیار") {
                holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent GoActivity = new Intent(view.getContext(), DownloadActivity.class);
                        //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                        GoActivity.putExtra(TABRIK,
                                "فرم گزارش کار دهیار");
                        view.getContext().startActivity(GoActivity);
                    }
                });

            }


            if (holder.txtTitle.getText()=="ضمائم سند هزینه(10 فرم)") {
                holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent GoActivity = new Intent(view.getContext(), DownloadActivity.class);
                        //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                        GoActivity.putExtra(TABRIK,
                                "ضمائم سند هزینه(10 فرم)");
                        view.getContext().startActivity(GoActivity);
                    }
                });

            }


            if (holder.txtTitle.getText()=="قرار داد اجاره ماشین آلات") {
                holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent GoActivity = new Intent(view.getContext(), DownloadActivity.class);
                        //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                        GoActivity.putExtra(TABRIK,
                                "قرار داد اجاره ماشین آلات");
                        view.getContext().startActivity(GoActivity);
                    }
                });

            }


            if (holder.txtTitle.getText()=="نمونه آگهی مناقصه عمومی") {
                holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent GoActivity = new Intent(view.getContext(), DownloadActivity.class);
                        //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                        GoActivity.putExtra(TABRIK,
                                "نمونه آگهی مناقصه عمومی");
                        view.getContext().startActivity(GoActivity);
                    }
                });

            }


            if (holder.txtTitle.getText()=="مصوبه شورای اسلامی روستا") {
                holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent GoActivity = new Intent(view.getContext(), DownloadActivity.class);
                        //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                        GoActivity.putExtra(TABRIK,
                                "مصوبه شورای اسلامی روستا");
                        view.getContext().startActivity(GoActivity);
                    }
                });

            }


            if (holder.txtTitle.getText()=="قرار داد اجاره ماشین آلات") {
                holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent GoActivity = new Intent(view.getContext(), DownloadActivity.class);
                        //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                        GoActivity.putExtra(TABRIK,
                                "قرار داد اجاره ماشین آلات");
                        view.getContext().startActivity(GoActivity);
                    }
                });

            }

            if (holder.txtTitle.getText()=="شناسنامه ساختمان روستایی") {
                holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent GoActivity = new Intent(view.getContext(), DownloadActivity.class);
                        //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                        GoActivity.putExtra(TABRIK,
                                "شناسنامه ساختمان روستایی");
                        view.getContext().startActivity(GoActivity);
                    }
                });

            }


            if (holder.txtTitle.getText()=="فرم حکم حقوقی دهیار") {
                holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent GoActivity = new Intent(view.getContext(), DownloadActivity.class);
                        //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                        GoActivity.putExtra(TABRIK,
                                "فرم حکم حقوقی دهیار");
                        view.getContext().startActivity(GoActivity);
                    }
                });

            }


            if (holder.txtTitle.getText()=="تحویل و تحول دهیاری") {
                holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent GoActivity = new Intent(view.getContext(), DownloadActivity.class);
                        //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                        GoActivity.putExtra(TABRIK,
                                "تحویل و تحول دهیاری");
                        view.getContext().startActivity(GoActivity);
                    }
                });

            }


            if (holder.txtTitle.getText()=="لیست اموال") {
                holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent GoActivity = new Intent(view.getContext(), DownloadActivity.class);
                        //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                        GoActivity.putExtra(TABRIK,
                                "لیست اموال");
                        view.getContext().startActivity(GoActivity);
                    }
                });

            }


            if (holder.txtTitle.getText()=="قراردادجمع آوری پسماند روستا") {
                holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent GoActivity = new Intent(view.getContext(), DownloadActivity.class);
                        //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                        GoActivity.putExtra(TABRIK,
                                "قراردادجمع آوری پسماند روستا");
                        view.getContext().startActivity(GoActivity);
                    }
                });

            }


            if (holder.txtTitle.getText()=="قرارداد مصالح ساختمانی") {
                holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent GoActivity = new Intent(view.getContext(), DownloadActivity.class);
                        //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                        GoActivity.putExtra(TABRIK,
                                "قرارداد مصالح ساختمانی");
                        view.getContext().startActivity(GoActivity);
                    }
                });

            }


            if (holder.txtTitle.getText()=="قرر داد پیماانکاری به کارگیری ماشین آلات") {
                holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent GoActivity = new Intent(view.getContext(), DownloadActivity.class);
                        //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                        GoActivity.putExtra(TABRIK,
                                "قرار داد پیمانکاری به کارگیری ماشین آلات");
                        view.getContext().startActivity(GoActivity);
                    }
                });

            }

            if (holder.txtTitle.getText()=="صورتجلسه تعیین سمت اعضای هیات") {
                holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent GoActivity = new Intent(view.getContext(), DownloadActivity.class);
                        //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                        GoActivity.putExtra(TABRIK,
                                "صورتجلسه تعیین سمت اعضای هیات");
                        view.getContext().startActivity(GoActivity);
                    }
                });

            }

            if (holder.txtTitle.getText()=="رسید دریافت چک از دهیاری") {
                holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent GoActivity = new Intent(view.getContext(), DownloadActivity.class);
                        //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                        GoActivity.putExtra(TABRIK,
                                "رسید دریافت چک از دهیاری");
                        view.getContext().startActivity(GoActivity);
                    }
                });

            }

            if (holder.txtTitle.getText()=="سربرگ دهیاری A5") {
                holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent GoActivity = new Intent(view.getContext(), DownloadActivity.class);
                        //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                        GoActivity.putExtra(TABRIK,
                                "سربرگ دهیاری A5");
                        view.getContext().startActivity(GoActivity);
                    }
                });

            }

            if (holder.txtTitle.getText()=="سربرگ شوراA5") {
                holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent GoActivity = new Intent(view.getContext(), DownloadActivity.class);
                        //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                        GoActivity.putExtra(TABRIK,
                                "سربرگ شوراA5");
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



