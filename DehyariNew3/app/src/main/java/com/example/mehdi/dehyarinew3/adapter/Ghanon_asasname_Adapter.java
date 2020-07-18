package com.example.mehdi.dehyarinew3.adapter;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.mehdi.dehyarinew3.Asasname_tashkilat.Asasname_tashkilat;
import com.example.mehdi.dehyarinew3.R;
import com.example.mehdi.dehyarinew3.Zir_menu.GhanonEdari;
import com.example.mehdi.dehyarinew3.ac_edari.DownloadActivity;
import com.example.mehdi.dehyarinew3.ac_edari.ac_nemonename.TabrikActivity;
import com.example.mehdi.dehyarinew3.model.ModelListGhanon;

import java.util.List;



    public class Ghanon_asasname_Adapter extends RecyclerView.Adapter<com.example.mehdi.dehyarinew3.adapter.Ghanon_asasname_Adapter.MyViewHolder>{




        public static final String TABRIK ="tabrik";

        private List<ModelListGhanon> mainLists;

        public class MyViewHolder extends RecyclerView.ViewHolder {
            public TextView txtTitle;

            public MyViewHolder(View view) {
                super(view);
                txtTitle = (TextView) view.findViewById(R.id.txtTitle);

            }
        }


        public Ghanon_asasname_Adapter(List<ModelListGhanon> mainLists) {
            this.mainLists = mainLists;
        }

        @Override
        public com.example.mehdi.dehyarinew3.adapter.Ghanon_asasname_Adapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View itemView = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.row_list_ghanon,parent ,false);

            return new com.example.mehdi.dehyarinew3.adapter.Ghanon_asasname_Adapter.MyViewHolder(itemView);
        }

        @Override
        public void onBindViewHolder(final com.example.mehdi.dehyarinew3.adapter.Ghanon_asasname_Adapter.MyViewHolder holder, int position) {
            ModelListGhanon mainList = mainLists.get(position);
            holder.txtTitle.setText(mainList.getTitle());



            if (holder.txtTitle.getText()=="قانون تاسیس دهیاریهای خودکفا") {
                holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent GoActivity = new Intent(view.getContext(), TabrikActivity.class);
                        //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                        GoActivity.putExtra(TABRIK,
                                "قانون تاسیس دهیاریهای خودکفا");
                        view.getContext().startActivity(GoActivity);
                    }
                });

            }

            if (holder.txtTitle.getText()=="اساسنامه،تشکیلات و سازمان دهیاریها") {
                holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent GoActivity = new Intent(view.getContext(), Asasname_tashkilat.class);
                        //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                        GoActivity.putExtra(TABRIK,
                                "اساسنامه،تشکیلات و سازمان دهیاریها");
                        view.getContext().startActivity(GoActivity);
                    }
                });

            }



            if (holder.txtTitle.getText()=="آیین نامه استخدامی دهیاریهای کشور") {
                holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent GoActivity = new Intent(view.getContext(), DownloadActivity.class);
                        //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                        GoActivity.putExtra(TABRIK,
                                "آیین نامه استخدامی دهیاریهای کشور");
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
