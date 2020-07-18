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




    public class  Omrani_shivepasmand_Adapter extends RecyclerView.Adapter<com.example.mehdi.dehyarinew3.Omrani.Omrani_shivepasmand_Adapter.MyViewHolder>{


        public static final String TABRIK ="tabrik";
        private List<ModelListGhanon> mainLists;


        public class MyViewHolder extends RecyclerView.ViewHolder {
            public TextView txtTitle;

            public MyViewHolder(View view) {
                super(view);
                txtTitle = (TextView) view.findViewById(R.id.txtTitle);


            }
        }


        public Omrani_shivepasmand_Adapter(List<ModelListGhanon> mainLists) {
            this.mainLists = mainLists;
        }

        @Override
        public com.example.mehdi.dehyarinew3.Omrani.Omrani_shivepasmand_Adapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View itemView = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.row_list_ghanon,parent ,false);

            return new com.example.mehdi.dehyarinew3.Omrani.Omrani_shivepasmand_Adapter.MyViewHolder(itemView);
        }

        @Override
        public void onBindViewHolder(final com.example.mehdi.dehyarinew3.Omrani.Omrani_shivepasmand_Adapter.MyViewHolder holder, int position) {
            ModelListGhanon mainList = mainLists.get(position);
            holder.txtTitle.setText(mainList.getTitle());
            if (holder.txtTitle.getText()=="شیوه نامه اجرایی دفن پسماندهای عادی در سطح روستاهای کشور") {
                holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent GoActivity = new Intent(view.getContext(), DownloadActivity.class);
                        GoActivity.putExtra(TABRIK,
                                "شیوه نامه اجرایی دفن پسماندهای عادی در سطح روستاهای کشور");
                        //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                        view.getContext().startActivity(GoActivity);
                    }
                });

            }
            if (holder.txtTitle.getText()=="چارچوب توسعه فرهنگ شهروندی در زمینه مدیریت پسماندهای جامد در مناطق روستایی") {
                holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent GoActivity = new Intent(view.getContext(), DownloadActivity.class);
                        GoActivity.putExtra(TABRIK,
                                "چارچوب توسعه فرهنگ شهروندی در زمینه مدیریت پسماندهای جامد در مناطق روستایی");
                        //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                        view.getContext().startActivity(GoActivity);
                    }
                });

            }



            if (holder.txtTitle.getText()=="شیوه نامه تهیه بیوکمپوست از پسماندهای فساد پذیر و فضولات دامی در مناطق روستایی کشور") {
                holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent GoActivity = new Intent(view.getContext(), DownloadActivity.class);
                        //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                        GoActivity.putExtra(TABRIK,
                                "شیوه نامه تهیه بیوکمپوست از پسماندهای فساد پذیر و فضولات دامی در مناطق روستایی کشور");
                        view.getContext().startActivity(GoActivity);
                    }
                });

            }


            if (holder.txtTitle.getText()=="شیوه نامه پردازش،جداسازی و بازیافت پسماندهای عادی در مناطق روستایی کشور") {
                holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent GoActivity = new Intent(view.getContext(), DownloadActivity.class);
                        //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                        GoActivity.putExtra(TABRIK,
                                "شیوه نامه پردازش،جداسازی و بازیافت پسماندهای عادی در مناطق روستایی کشور");
                        view.getContext().startActivity(GoActivity);
                    }
                });

            }

            if (holder.txtTitle.getText()=="شیوه نامه چارچوب تنظیم گزارش عملکرد در بخش مدیریت پسماند روستایی استانهای ساحلی") {
                holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent GoActivity = new Intent(view.getContext(), DownloadActivity.class);
                        //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                        GoActivity.putExtra(TABRIK,
                                "شیوه نامه چارچوب تنظیم گزارش عملکرد در بخش مدیریت پسماند روستایی استانهای ساحلی");
                        view.getContext().startActivity(GoActivity);
                    }
                });

            }

            if (holder.txtTitle.getText()=="قبض اعلام و وصول هزینه های خدمات مدیریت پسماندهای عادی روستایی وشیوه نامه نحوه کاربرد آن") {
                holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent GoActivity = new Intent(view.getContext(), DownloadActivity.class);
                        //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                        GoActivity.putExtra(TABRIK,
                                "قبض اعلام و وصول هزینه های خدمات مدیریت پسماندهای عادی روستایی وشیوه نامه نحوه کاربرد آن");
                        view.getContext().startActivity(GoActivity);
                    }
                });

            }


            if (holder.txtTitle.getText()=="دستورالعمل نحوه تعیین هزینه خدمات مدیریت پسماندهای روستایی") {
                holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent GoActivity = new Intent(view.getContext(), DownloadActivity.class);
                        //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                        GoActivity.putExtra(TABRIK,
                                "دستورالعمل نحوه تعیین هزینه خدمات مدیریت پسماندهای روستایی");
                        view.getContext().startActivity(GoActivity);
                    }
                });

            }


            if (holder.txtTitle.getText()=="دستورالعمل کنترل بهداشت قنادی ها در مناطق روستایی") {
                holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent GoActivity = new Intent(view.getContext(), DownloadActivity.class);
                        //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                        GoActivity.putExtra(TABRIK,
                                "دستورالعمل کنترل بهداشت قنادی ها در مناطق روستایی");
                        view.getContext().startActivity(GoActivity);
                    }
                });

            }


            if (holder.txtTitle.getText()=="شیوه نامه تهیه طرح های تفکیک از مبدا و دفن بهداشتی پسماندهای روستایی") {
                holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent GoActivity = new Intent(view.getContext(), DownloadActivity.class);
                        //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                        GoActivity.putExtra(TABRIK,
                                "شیوه نامه تهیه طرح های تفکیک از مبدا و دفن بهداشتی پسماندهای روستایی");
                        view.getContext().startActivity(GoActivity);
                    }
                });

            }


            if (holder.txtTitle.getText()=="دستورالعمل استفاده از ظروف و مخازن نگهداری موقت پسماندهای جامد در مناطق روستایی کشور") {
                holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent GoActivity = new Intent(view.getContext(), DownloadActivity.class);
                        //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                        GoActivity.putExtra(TABRIK,
                                "دستورالعمل استفاده از ظروف و مخازن نگهداری موقت پسماندهای جامد در مناطق روستایی کشور");
                        view.getContext().startActivity(GoActivity);
                    }
                });

            }


            if (holder.txtTitle.getText()=="دستورالعمل نظارت و کنترل بهداشت نانوایی های مناطق روستایی") {
                holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent GoActivity = new Intent(view.getContext(), DownloadActivity.class);
                        //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                        GoActivity.putExtra(TABRIK,
                                "دستورالعمل نظارت و کنترل بهداشت نانوایی های مناطق روستایی");
                        view.getContext().startActivity(GoActivity);
                    }
                });

            }


            if (holder.txtTitle.getText()=="شیوه نامه تهیه طرح های تفکیک از مبداء و دفن بهداشتی پسماندهای روستایی") {
                holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent GoActivity = new Intent(view.getContext(), DownloadActivity.class);
                        //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                        GoActivity.putExtra(TABRIK,
                                "شیوه نامه تهیه طرح های تفکیک از مبداء و دفن بهداشتی پسماندهای روستایی");
                        view.getContext().startActivity(GoActivity);
                    }
                });

            }


            if (holder.txtTitle.getText()=="دستورالعمل و راهنمای ساخت واحدهای بیوکمپوست خانگی در مناطق روستایی") {
                holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent GoActivity = new Intent(view.getContext(), DownloadActivity.class);
                        //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                        GoActivity.putExtra(TABRIK,
                                "دستورالعمل و راهنمای ساخت واحدهای بیوکموست خانگی در مناطق روستایی");
                        view.getContext().startActivity(GoActivity);
                    }
                });

            }


            if (holder.txtTitle.getText()=="دستورالعمل کنترل بهداشت کشتار دام و قصابی ها در مناطق روستاییشیوه نامه مدیریت کاهش خطرات سیل") {
                holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent GoActivity = new Intent(view.getContext(), DownloadActivity.class);
                        //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                        GoActivity.putExtra(TABRIK,
                                "دستورالعمل کنترل بهداشت کشتار دام و قصابی ها در مناطق روستایی");
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
