package com.example.mehdi.dehyarinew3.sherkat_tavon.adapter;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.mehdi.dehyarinew3.Download_pic;
import com.example.mehdi.dehyarinew3.R;
import com.example.mehdi.dehyarinew3.Zir_menu.Act_aeenname_mali;
import com.example.mehdi.dehyarinew3.Zir_menu.Act_asasname_tashkilat;
import com.example.mehdi.dehyarinew3.Zir_menu.Act_bakhshnamebodje;
import com.example.mehdi.dehyarinew3.Zir_menu.Act_form_dehyari;
import com.example.mehdi.dehyarinew3.Zir_menu.Act_form_sakhteman;
import com.example.mehdi.dehyarinew3.Zir_menu.Act_ghanon_mali;
import com.example.mehdi.dehyarinew3.Zir_menu.Act_sherkat_tavoni;
import com.example.mehdi.dehyarinew3.Zir_menu.Act_taghsidatkeshvar;
import com.example.mehdi.dehyarinew3.ac_edari.ac_nemonename.TabrikActivity;
import com.example.mehdi.dehyarinew3.gardeshgari.Mashhad_gardesh;
import com.example.mehdi.dehyarinew3.gardeshgari.Matanegh_gardesh;
import com.example.mehdi.dehyarinew3.model.ModelListGhanon;
import com.example.mehdi.dehyarinew3.sherkat_tavon.Polis_sakhteman;
import com.example.mehdi.dehyarinew3.sherkat_tavon.Sad_mabar;
import com.example.mehdi.dehyarinew3.sherkat_tavon.Sherkat_tavoni;

import java.util.List;




    public class Sherkattavoni_Adapter extends RecyclerView.Adapter<com.example.mehdi.dehyarinew3.sherkat_tavon.adapter.Sherkattavoni_Adapter.MyViewHolder> {


        public static final String TABRIK ="tabrik";
        private List<ModelListGhanon> mainLists;

        public class MyViewHolder extends RecyclerView.ViewHolder {
            public TextView txtTitle;

            public MyViewHolder(View view) {
                super(view);
                txtTitle = (TextView) view.findViewById(R.id.txtTitle);

            }
        }


        public Sherkattavoni_Adapter(List<ModelListGhanon> mainLists) {
            this.mainLists = mainLists;
        }

        @Override
        public com.example.mehdi.dehyarinew3.sherkat_tavon.adapter.Sherkattavoni_Adapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View itemView = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.row_list_ghanon, parent, false);

            return new com.example.mehdi.dehyarinew3.sherkat_tavon.adapter.Sherkattavoni_Adapter.MyViewHolder(itemView);
        }

        @Override
        public void onBindViewHolder(final com.example.mehdi.dehyarinew3.sherkat_tavon.adapter.Sherkattavoni_Adapter.MyViewHolder holder, int position) {
            ModelListGhanon mainList = mainLists.get(position);
            holder.txtTitle.setText(mainList.getTitle());


            if (holder.txtTitle.getText() == "واحد پلیس ساختمان") {
                holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent GoActivity = new Intent(view.getContext(),Polis_sakhteman.class);
                        GoActivity.putExtra(TABRIK,
                                "واحد پلیس ساختمان");
                        //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                        view.getContext().startActivity(GoActivity);
                    }
                });
            }








            if (holder.txtTitle.getText() == "واحد سد معبر") {
                holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent GoActivity = new Intent(view.getContext(), Download_pic.class);
                        GoActivity.putExtra(TABRIK,
                                "واحد سد معبر");
                        //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                        view.getContext().startActivity(GoActivity);
                    }
                });
            }

            if (holder.txtTitle.getText() == "واحد خدمات بیمه ای") {
                holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent GoActivity = new Intent(view.getContext(), Download_pic.class);
                        GoActivity.putExtra(TABRIK,
                                "واحد خدمات بیمه ای");
                        //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                        view.getContext().startActivity(GoActivity);
                    }
                });
            }

            if (holder.txtTitle.getText() == "واحد نمایشگاه فروش تجهیزات و مبلمان پارکی") {
                holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent GoActivity = new Intent(view.getContext(), Download_pic.class);
                        GoActivity.putExtra(TABRIK,
                                "واحد نمایشگاه فروش تجهیزات و مبلمان پارکی");
                        //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                        view.getContext().startActivity(GoActivity);
                    }
                });
            }

            if (holder.txtTitle.getText() == "کارخانه آسفالت دهیاریها") {
                holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent GoActivity = new Intent(view.getContext(), Download_pic.class);
                        GoActivity.putExtra(TABRIK,
                                "کارخانه آسفالت دهیاریها");
                        //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                        view.getContext().startActivity(GoActivity);
                    }
                });
            }


            if (holder.txtTitle.getText() == "نشریه استانی نوید خراسان") {
                holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent GoActivity = new Intent(view.getContext(), Download_pic.class);
                        GoActivity.putExtra(TABRIK,
                                "نشریه استانی نوید خراسان");
                        //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                        view.getContext().startActivity(GoActivity);
                    }
                });
            }

            if (holder.txtTitle.getText() == "پروژه های عمرانی استانی") {
                holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent GoActivity = new Intent(view.getContext(), Download_pic.class);
                        GoActivity.putExtra(TABRIK,
                                "پروژه های عمرانی استانی");
                        //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                        view.getContext().startActivity(GoActivity);
                    }
                });
            }

            if (holder.txtTitle.getText() == "راه اندازی سایت،کانال های ویژه دهیاریها") {
                holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent GoActivity = new Intent(view.getContext(), Download_pic.class);
                        GoActivity.putExtra(TABRIK,
                                "راه اندازی سایت،کانال های ویژه دهیاریها");
                        //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                        view.getContext().startActivity(GoActivity);
                    }
                });
            }



            if (holder.txtTitle.getText() == "معین اقتصادی روستایی بخش مرکزی مشهد") {
                holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent GoActivity = new Intent(view.getContext(), Download_pic.class);
                        GoActivity.putExtra(TABRIK,
                                "معین اقتصادی روستایی بخش مرکزی مشهدا");
                        //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                        view.getContext().startActivity(GoActivity);
                    }
                });
            }


            if (holder.txtTitle.getText() == "اجرای طرح جامع مدیریت پسماند روستایی") {
                holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent GoActivity = new Intent(view.getContext(), Download_pic.class);
                        GoActivity.putExtra(TABRIK,
                                "اجرای طرح جامع مدیریت پسماند روستایی");
                        //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                        view.getContext().startActivity(GoActivity);
                    }
                });
            }


        }


        @Override
        public int getItemCount () {
            return mainLists.size();
        }


}
