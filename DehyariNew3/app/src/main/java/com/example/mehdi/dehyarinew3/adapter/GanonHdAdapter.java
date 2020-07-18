package com.example.mehdi.dehyarinew3.adapter;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.mehdi.dehyarinew3.Play_sond;
import com.example.mehdi.dehyarinew3.Play_sond1;
import com.example.mehdi.dehyarinew3.Sitha_karbordi.Site_karbordi;
import com.example.mehdi.dehyarinew3.Taghsimat_keshvari.Taghsim_keshvari;
import com.example.mehdi.dehyarinew3.Tarha_daramadza.Tahr_daramad;
import com.example.mehdi.dehyarinew3.Tarikh_beyad.Tarikh_beyad;
import com.example.mehdi.dehyarinew3.Zir_menu.Act_aeenname_mali;
import com.example.mehdi.dehyarinew3.Zir_menu.Act_asasname_tashkilat;
import com.example.mehdi.dehyarinew3.Zir_menu.Act_bakhshnamebodje;
import com.example.mehdi.dehyarinew3.Zir_menu.Act_form_dehyari;
import com.example.mehdi.dehyarinew3.Zir_menu.Act_form_sakhteman;
import com.example.mehdi.dehyarinew3.Zir_menu.Act_ghanon_mali;
import com.example.mehdi.dehyarinew3.Zir_menu.Act_ghanon_omrani;
import com.example.mehdi.dehyarinew3.Zir_menu.Act_sherkat_tavoni;
import com.example.mehdi.dehyarinew3.Zir_menu.Act_sitpor;
import com.example.mehdi.dehyarinew3.Zir_menu.Act_taghsidatkeshvar;
import com.example.mehdi.dehyarinew3.Zir_menu.GhanonEdari;
import com.example.mehdi.dehyarinew3.R;
import com.example.mehdi.dehyarinew3.ac_edari.DownloadActivity;
import com.example.mehdi.dehyarinew3.model.ModelListGhanon;

import java.util.List;


public class GanonHdAdapter extends RecyclerView.Adapter<GanonHdAdapter.MyViewHolder> {
    public static final String TABRIK ="tabrik";
    private List<ModelListGhanon> mainLists;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView txtTitle;

        public MyViewHolder(View view) {
            super(view);
            txtTitle = (TextView) view.findViewById(R.id.txtTitle);

        }
    }


    public GanonHdAdapter(List<ModelListGhanon> mainLists) {
        this.mainLists = mainLists;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row_list_ghanon, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final MyViewHolder holder, int position) {
        ModelListGhanon mainList = mainLists.get(position);
        holder.txtTitle.setText(mainList.getTitle());
        if (holder.txtTitle.getText() == "اداری") {
            holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent GoActivity = new Intent(view.getContext(), GhanonEdari.class);
                    //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                    view.getContext().startActivity(GoActivity);
                }
            });
        }

        if (holder.txtTitle.getText() == "عمرانی") {
            holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent GoActivity = new Intent(view.getContext(), Act_ghanon_omrani.class);
                    //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                    view.getContext().startActivity(GoActivity);
                }
            });
        }
        if (holder.txtTitle.getText() == "امورمالی") {
            holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent GoActivity = new Intent(view.getContext(), Act_ghanon_mali.class);
                    //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                    view.getContext().startActivity(GoActivity);
                }
            });
        }

        if (holder.txtTitle.getText() == "شرکت های تعاونی") {
            holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent GoActivity = new Intent(view.getContext(), Act_sherkat_tavoni.class);
                    //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                    view.getContext().startActivity(GoActivity);
                }
            });
        }

        if (holder.txtTitle.getText() == "اساسنامه و تشکیلات") {
            holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent GoActivity = new Intent(view.getContext(), Act_asasname_tashkilat.class);
                    //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                    view.getContext().startActivity(GoActivity);
                }
            });
        }

        if (holder.txtTitle.getText() == "آئین نامه مالی") {
            holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent GoActivity = new Intent(view.getContext(), Act_aeenname_mali.class);
                    //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                    view.getContext().startActivity(GoActivity);
                }
            });
        }

        if (holder.txtTitle.getText()=="بخشنامه بودجه 98") {
            holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent GoActivity = new Intent(view.getContext(), DownloadActivity.class);
                    //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                    GoActivity.putExtra(TABRIK,
                            "بخشنامه بودجه 98");
                    view.getContext().startActivity(GoActivity);
                }
            });

        }

        if (holder.txtTitle.getText()=="سرود ملی ایران") {
            holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent GoActivity = new Intent(view.getContext(), Play_sond.class);
                    //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                    GoActivity.putExtra(TABRIK,
                            "سرود ملی ایران");
                    view.getContext().startActivity(GoActivity);
                }
            });

        }

        if (holder.txtTitle.getText()=="تلاوت قرآن") {
            holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent GoActivity = new Intent(view.getContext(), Play_sond1.class);
                    //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                    GoActivity.putExtra(TABRIK,
                            "تلاوت قرآن");
                    view.getContext().startActivity(GoActivity);
                }
            });

        }




        if (holder.txtTitle.getText() == "فرم های دهیاری") {
            holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent GoActivity = new Intent(view.getContext(), Act_form_dehyari.class);
                    //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                    view.getContext().startActivity(GoActivity);
                }
            });
        }

        if (holder.txtTitle.getText() == "فرم های ساختمانی") {
            holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent GoActivity = new Intent(view.getContext(), Act_form_sakhteman.class);
                    //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                    view.getContext().startActivity(GoActivity);
                }
            });
        }



        if (holder.txtTitle.getText() == "تقسیمات کشوری") {
            holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent GoActivity = new Intent(view.getContext(), Taghsim_keshvari.class);
                    //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                    view.getContext().startActivity(GoActivity);
                }
            });
        }

        if (holder.txtTitle.getText() == "سایت های کاربردی") {
            holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent GoActivity = new Intent(view.getContext(), Site_karbordi.class);
                    //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                    view.getContext().startActivity(GoActivity);
                }
            });
        }

        if (holder.txtTitle.getText() == "طرح های درآمدزا") {
            holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent GoActivity = new Intent(view.getContext(),Tahr_daramad.class);
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
