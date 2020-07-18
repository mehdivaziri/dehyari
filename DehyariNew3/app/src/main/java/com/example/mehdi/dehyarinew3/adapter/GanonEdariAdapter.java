package com.example.mehdi.dehyarinew3.adapter;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.mehdi.dehyarinew3.R;
import com.example.mehdi.dehyarinew3.Zir_menu.Act_nemone_name;
import com.example.mehdi.dehyarinew3.Zir_menu.GhanonEdari;
import com.example.mehdi.dehyarinew3.ac_edari.Aeennegaresh_edari;
import com.example.mehdi.dehyarinew3.ac_edari.DownloadActivity;
import com.example.mehdi.dehyarinew3.ac_edari.ac_nemonename.Ebarat_standard;
import com.example.mehdi.dehyarinew3.ac_edari.ac_nemonename.Nemone_tabrik;
import com.example.mehdi.dehyarinew3.ac_edari.ac_nemonename.TabrikActivity;
import com.example.mehdi.dehyarinew3.activity.SampelEdariActivity;
import com.example.mehdi.dehyarinew3.model.ModelListGhanon;

import java.util.List;

public class GanonEdariAdapter extends RecyclerView.Adapter<GanonEdariAdapter.MyViewHolder>{



    public static final String TABRIK ="tabrik";


    private List<ModelListGhanon> mainLists;


    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView txtTitle;

        public MyViewHolder(View view) {
            super(view);
            txtTitle = (TextView) view.findViewById(R.id.txtTitle);


        }
    }


    public GanonEdariAdapter(List<ModelListGhanon> mainLists) {
        this.mainLists = mainLists;
    }

    @Override
    public GanonEdariAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row_list_ghanon,parent ,false);

        return new GanonEdariAdapter.MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final GanonEdariAdapter.MyViewHolder holder, int position) {
        ModelListGhanon mainList = mainLists.get(position);
        holder.txtTitle.setText(mainList.getTitle());
        if (holder.txtTitle.getText()=="آیین نگارش") {
        //    holder.txtTitle.setBackgroundColor(Color.RED);
            holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent GoActivity = new Intent(view.getContext(), Aeennegaresh_edari.class);
                    //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                    view.getContext().startActivity(GoActivity);
                }
            });

        }
        if (holder.txtTitle.getText()=="نمونه نامه های اداری") {
            holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent GoActivity = new Intent(view.getContext(), Act_nemone_name.class);
                    //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                    view.getContext().startActivity(GoActivity);
                }
            });

        }



        if (holder.txtTitle.getText()=="عبارت استاندارد در نامه های اداری و رسمی") {
            holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent GoActivity = new Intent(view.getContext(), Ebarat_standard.class);
                    //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                    view.getContext().startActivity(GoActivity);
                }
            });

        }

        if (holder.txtTitle.getText()=="نمونه تبریک ها") {
            holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent GoActivity = new Intent(view.getContext(), Nemone_tabrik.class);
                    //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                    view.getContext().startActivity(GoActivity);
                }
            });

        }

        if (holder.txtTitle.getText()=="نحوه تعیین درجه دهیاریها") {
            holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent GoActivity = new Intent(view.getContext(), TabrikActivity.class);
                    GoActivity.putExtra(TABRIK,"نحوه تعیین درجه دهیاریها");
                    //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                    view.getContext().startActivity(GoActivity);
                }
            });

        }

        if (holder.txtTitle.getText()=="نحوه تعیین درجه دهیاریها") {
            holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent GoActivity = new Intent(view.getContext(), TabrikActivity.class);
                    GoActivity.putExtra(TABRIK,"نحوه تعیین درجه دهیاریها");
                    //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                    view.getContext().startActivity(GoActivity);
                }
            });

        }

        if (holder.txtTitle.getText()=="فن بیان و گویندگی") {
            holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent GoActivity = new Intent(view.getContext(), TabrikActivity.class);
                    GoActivity.putExtra(TABRIK,"فن بیان و گویندگی");
                    //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                    view.getContext().startActivity(GoActivity);
                }
            });

        }

        if (holder.txtTitle.getText()=="سخنوری و روایط عمومی") {
            holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent GoActivity = new Intent(view.getContext(), TabrikActivity.class);
                    GoActivity.putExtra(TABRIK,"سخنوری و روایط عمومی");
                    //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                    view.getContext().startActivity(GoActivity);
                }
            });

        }

        if (holder.txtTitle.getText()=="ده قانون طلائی برای برگزاری سمینارهاوگردهمائی ها") {
            holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent GoActivity = new Intent(view.getContext(), TabrikActivity.class);
                    GoActivity.putExtra(TABRIK,"ده قانون طلائی برای برگزاری سمینارهاوگردهمائی ها");
                    //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                    view.getContext().startActivity(GoActivity);
                }
            });

        }

        if (holder.txtTitle.getText()=="40اصل فن بیان در برخورد با مشتری") {
            holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent GoActivity = new Intent(view.getContext(), TabrikActivity.class);
                    GoActivity.putExtra(TABRIK,"40اصل فن بیان در برخورد با مشتری");
                    //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                    view.getContext().startActivity(GoActivity);
                }
            });

        }
        if (holder.txtTitle.getText()=="احکام دائمی برنامه توسعه کشور") {
            holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent GoActivity = new Intent(view.getContext(), DownloadActivity.class);
                    GoActivity.putExtra(TABRIK,"احکام دائمی برنامه توسعه کشور");
                    //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                    view.getContext().startActivity(GoActivity);
                }
            });

        }

        if (holder.txtTitle.getText()=="بخشنامه کمیته انطباق") {
            holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent GoActivity = new Intent(view.getContext(), DownloadActivity.class);
                    GoActivity.putExtra(TABRIK,"بخشنامه کمیته انطباق");
                    //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                    view.getContext().startActivity(GoActivity);
                }
            });

        }

        if (holder.txtTitle.getText()=="شیوه نامه نحوه مکاتبات اداری دهیاریهای کشور") {
            holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent GoActivity = new Intent(view.getContext(), TabrikActivity.class);
                    GoActivity.putExtra(TABRIK,"شیوه نامه نحوه مکاتبات اداری دهیاریهای کشور");
                    //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                    view.getContext().startActivity(GoActivity);
                }
            });

        }

        if (holder.txtTitle.getText()=="نظام نامه ارزیابی عملکرد دهیاریهای کشور") {
            holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent GoActivity = new Intent(view.getContext(), DownloadActivity.class);
                    GoActivity.putExtra(TABRIK,"نظام نامه ارزیابی عملکرد دهیاریهای کشور");
                    //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                    view.getContext().startActivity(GoActivity);
                }
            });

        }

        if (holder.txtTitle.getText()=="شیوه نامه اطلاع رسانی عمومی مدیریت روستا") {
            holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent GoActivity = new Intent(view.getContext(), DownloadActivity.class);
                    GoActivity.putExtra(TABRIK,"شیوه نامه اطلاع رسانی عمومی مدیریت روستا");
                    //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                    view.getContext().startActivity(GoActivity);
                }
            });

        }

        if (holder.txtTitle.getText()=="شیوه نامه نحوه انتخاب و عزل دهیار") {
            holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent GoActivity = new Intent(view.getContext(), DownloadActivity.class);
                    GoActivity.putExtra(TABRIK,"شیوه نامه نحوه انتخاب و عزل دهیار");
                    //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                    view.getContext().startActivity(GoActivity);
                }
            });

        }

        if (holder.txtTitle.getText()=="دستورالعمل ایجاد یکنواختی نظام عوارض شورای اسلامی بخش") {
            holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent GoActivity = new Intent(view.getContext(), TabrikActivity.class);
                    GoActivity.putExtra(TABRIK,"دستورالعمل ایجاد یکنواختی نظام عوارض شورای اسلامی بخش");
                    //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                    view.getContext().startActivity(GoActivity);
                }
            });

        }
        if (holder.txtTitle.getText()=="تعرفه عوارض و بهای خدمات") {
            holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent GoActivity = new Intent(view.getContext(), DownloadActivity.class);
                    GoActivity.putExtra(TABRIK,"تعرفه عوارض و بهای خدمات");
                    //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                    view.getContext().startActivity(GoActivity);
                }
            });

        }

        if (holder.txtTitle.getText()=="منشور اخلاقی دهیاری") {
            holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent GoActivity = new Intent(view.getContext(), DownloadActivity.class);
                    GoActivity.putExtra(TABRIK,"منشور اخلاقی دهیاری");
                    //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                    view.getContext().startActivity(GoActivity);
                }
            });

        }


        if (holder.txtTitle.getText()=="شیوه نامه تهیه و نصب منشور اخلاقی دهیاری") {
            holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent GoActivity = new Intent(view.getContext(), DownloadActivity.class);
                    GoActivity.putExtra(TABRIK,"شیوه نامه تهیه و نصب منشور اخلاقی دهیاری");
                    //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                    view.getContext().startActivity(GoActivity);
                }
            });

        }


        if (holder.txtTitle.getText()=="آیین نامه نحوه وضع و وصول عوارض توسط شورای بخش") {
            holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent GoActivity = new Intent(view.getContext(), DownloadActivity.class);
                    GoActivity.putExtra(TABRIK,"آیین نامه نحوه وضع و وصول عوارض توسط شورای بخش");
                    //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                    view.getContext().startActivity(GoActivity);
                }
            });

        }

        if (holder.txtTitle.getText()=="بخشنامه ضرورت ارسال مصوبه عزل دهیار به کارگروه انطباق") {
            holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent GoActivity = new Intent(view.getContext(), DownloadActivity.class);
                    GoActivity.putExtra(TABRIK,"بخشنامه ضرورت ارسال مصوبه عزل دهیار به کارگروه انطباق");
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



