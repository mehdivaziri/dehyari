package com.example.mehdi.dehyarinew3.Omrani;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.mehdi.dehyarinew3.R;
import com.example.mehdi.dehyarinew3.ac_edari.DownloadActivity;
import com.example.mehdi.dehyarinew3.model.ModelListGhanon;

import java.util.List;





    public class  Omrani_Atashnes_Adapter extends RecyclerView.Adapter<com.example.mehdi.dehyarinew3.Omrani.Omrani_Atashnes_Adapter.MyViewHolder>{


        public static final String TABRIK ="tabrik";
        private List<ModelListGhanon> mainLists;


        public class MyViewHolder extends RecyclerView.ViewHolder {
            public TextView txtTitle;

            public MyViewHolder(View view) {
                super(view);
                txtTitle = (TextView) view.findViewById(R.id.txtTitle);


            }
        }


        public Omrani_Atashnes_Adapter(List<ModelListGhanon> mainLists) {
            this.mainLists = mainLists;
        }

        @Override
        public com.example.mehdi.dehyarinew3.Omrani.Omrani_Atashnes_Adapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View itemView = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.row_list_ghanon,parent ,false);

            return new com.example.mehdi.dehyarinew3.Omrani.Omrani_Atashnes_Adapter.MyViewHolder(itemView);
        }

        @Override
        public void onBindViewHolder(final com.example.mehdi.dehyarinew3.Omrani.Omrani_Atashnes_Adapter.MyViewHolder holder, int position) {
            ModelListGhanon mainList = mainLists.get(position);
            holder.txtTitle.setText(mainList.getTitle());
            if (holder.txtTitle.getText()=="شیوه نامه جذب نیروهای وظیفه برای پایگاه های آتش نشانی روستایی") {
                holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent GoActivity = new Intent(view.getContext(), DownloadActivity.class);
                        GoActivity.putExtra(TABRIK,
                                "شیوه نامه جذب نیروهای وظیفه برای پایگاه های آتش نشانی روستایی");
                        //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                        view.getContext().startActivity(GoActivity);
                    }
                });

            }
            if (holder.txtTitle.getText()=="جدول شرایط احراز عناوین شغلی و منابع آموزشی رشته های شغلی آتش نمشانی") {
                holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent GoActivity = new Intent(view.getContext(), DownloadActivity.class);
                        GoActivity.putExtra(TABRIK,
                                "جدول شرایط احراز عناوین شغلی و منابع آموزشی رشته های شغلی آتش نمشانی");
                        //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                        view.getContext().startActivity(GoActivity);
                    }
                });

            }



            if (holder.txtTitle.getText()=="فرم تعهد دهیاری") {
                holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent GoActivity = new Intent(view.getContext(), DownloadActivity.class);
                        //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                        GoActivity.putExtra(TABRIK,
                                "فرم تعهد دهیاری");
                        view.getContext().startActivity(GoActivity);
                    }
                });

            }


            if (holder.txtTitle.getText()=="فرو تعهد کارکنان وظیفه") {
                holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent GoActivity = new Intent(view.getContext(), DownloadActivity.class);
                        //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                        GoActivity.putExtra(TABRIK,
                                "فرو تعهد کارکنان وظیفه");
                        view.getContext().startActivity(GoActivity);
                    }
                });

            }

            if (holder.txtTitle.getText()=="مقررات انضباطی کارکنان وظیفه مامور به خدمت در دستگاههاومراکز دولتی و اجرایی کشور") {
                holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent GoActivity = new Intent(view.getContext(), DownloadActivity.class);
                        //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                        GoActivity.putExtra(TABRIK,
                                "مقررات انضباطی کارکنان وظیفه مامور به خدمت در دستگاههاومراکز دولتی و اجرایی کشور");
                        view.getContext().startActivity(GoActivity);
                    }
                });

            }

            if (holder.txtTitle.getText()=="دستورالعمل البسه") {
                holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent GoActivity = new Intent(view.getContext(), DownloadActivity.class);
                        //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                        GoActivity.putExtra(TABRIK,
                                "دستورالعمل البسه");
                        view.getContext().startActivity(GoActivity);
                    }
                });

            }


            if (holder.txtTitle.getText()=="دستورالعمل فعالیت و ادره پایگاه آتش نشانی روستایی") {
                holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent GoActivity = new Intent(view.getContext(), DownloadActivity.class);
                        //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                        GoActivity.putExtra(TABRIK,
                                "دستورالعمل فعالیت و ادره پایگاه آتش نشانی روستایی");
                        view.getContext().startActivity(GoActivity);
                    }
                });

            }


            if (holder.txtTitle.getText()=="فرم ثبت حوادث و آتش سوزی پایگاه آتش نشانی روستایی") {
                holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent GoActivity = new Intent(view.getContext(), DownloadActivity.class);
                        //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                        GoActivity.putExtra(TABRIK,
                                "فرم ثبت حوادث و آتش سوزی پایگاه آتش نشانی روستایی");
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
