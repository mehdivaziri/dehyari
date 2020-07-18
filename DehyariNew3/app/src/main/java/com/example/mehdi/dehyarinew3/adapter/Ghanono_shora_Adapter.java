package com.example.mehdi.dehyarinew3.adapter;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.mehdi.dehyarinew3.Entekhabat.Entekhabat;
import com.example.mehdi.dehyarinew3.R;
import com.example.mehdi.dehyarinew3.Zir_menu.Act_aeenname_mali;
import com.example.mehdi.dehyarinew3.Zir_menu.Act_asasname_tashkilat;
import com.example.mehdi.dehyarinew3.Zir_menu.Act_bakhshnamebodje;
import com.example.mehdi.dehyarinew3.Zir_menu.Act_form_dehyari;
import com.example.mehdi.dehyarinew3.Zir_menu.Act_form_sakhteman;
import com.example.mehdi.dehyarinew3.Zir_menu.Act_ghanon_mali;
import com.example.mehdi.dehyarinew3.Zir_menu.Act_ghanon_omrani;
import com.example.mehdi.dehyarinew3.Zir_menu.Act_sherkat_tavoni;
import com.example.mehdi.dehyarinew3.Zir_menu.Act_taghsidatkeshvar;
import com.example.mehdi.dehyarinew3.Zir_menu.GhanonEdari;
import com.example.mehdi.dehyarinew3.ac_edari.DownloadActivity;
import com.example.mehdi.dehyarinew3.ac_edari.ac_nemonename.TabrikActivity;
import com.example.mehdi.dehyarinew3.ac_shorarosta.Rosta_bayanat;
import com.example.mehdi.dehyarinew3.ac_shorarosta.Rosta_ghanonasasi;
import com.example.mehdi.dehyarinew3.model.ModelListGhanon;

import java.util.List;



public class Ghanono_shora_Adapter extends RecyclerView.Adapter<Ghanono_shora_Adapter.MyViewHolder> {
    public static final String TABRIK ="tabrik";

    private List<ModelListGhanon> mainLists;

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView txtTitle;

        public MyViewHolder(View view) {
            super(view);
            txtTitle = (TextView) view.findViewById(R.id.txtTitle);

        }
    }
    public Ghanono_shora_Adapter(List<ModelListGhanon> mainLists) {
        this.mainLists = mainLists;
    }

    @Override
    public com.example.mehdi.dehyarinew3.adapter.Ghanono_shora_Adapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row_list_ghanon, parent, false);

        return new com.example.mehdi.dehyarinew3.adapter.Ghanono_shora_Adapter.MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final com.example.mehdi.dehyarinew3.adapter.Ghanono_shora_Adapter.MyViewHolder holder, int position) {
        ModelListGhanon mainList = mainLists.get(position);
        holder.txtTitle.setText(mainList.getTitle());
        if (holder.txtTitle.getText() == "بیانات رهبری درباره شوراها") {
            holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent GoActivity = new Intent(view.getContext(), TabrikActivity.class);
                    GoActivity.putExtra(TABRIK,
                            "بیانات رهبری درباره شوراها");

                    //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                    view.getContext().startActivity(GoActivity);
                }
            });
        }

        if (holder.txtTitle.getText() == "شوراها در قانون اساسی") {
            holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent GoActivity = new Intent(view.getContext(), TabrikActivity.class);
                    GoActivity.putExtra(TABRIK,
                            "شوراها در قانون اساسی");

                    //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                    view.getContext().startActivity(GoActivity);
                }
            });
        }
        if (holder.txtTitle.getText() == "قانون اصلاح موادی از قانون شوراهای اسلامی کشور و انتخاب شهرداران") {
            holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent GoActivity = new Intent(view.getContext(), DownloadActivity.class);
                    GoActivity.putExtra(TABRIK,
                            "قانون اصلاح موادی از قانون شوراهای اسلامی کشور و انتخاب شهرداران");

                    //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                    view.getContext().startActivity(GoActivity);
                }
            });
        }

        if (holder.txtTitle.getText() == "تشکیلات") {
            holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent GoActivity = new Intent(view.getContext(), TabrikActivity.class);
                    GoActivity.putExtra(TABRIK,
                            "تشکیلات");

                    //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                    view.getContext().startActivity(GoActivity);
                }
            });
        }

        if (holder.txtTitle.getText() == "انتخابات") {
            holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent GoActivity = new Intent(view.getContext(), Entekhabat.class);
                    GoActivity.putExtra(TABRIK,
                            "انتخابات");

                    //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                    view.getContext().startActivity(GoActivity);
                }
            });
        }

        if (holder.txtTitle.getText() == "وظایف و اختیارات شوراها") {
            holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent GoActivity = new Intent(view.getContext(), DownloadActivity.class);
                    GoActivity.putExtra(TABRIK,
                            "وظایف و اختیارات شوراها");

                    //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                    view.getContext().startActivity(GoActivity);
                }
            });
        }


        if (holder.txtTitle.getText() == "ترتیب رسیدگی به تخلفات") {
            holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent GoActivity = new Intent(view.getContext(), TabrikActivity.class);
                    GoActivity.putExtra(TABRIK,
                            "ترتیب رسیدگی به تخلفات");

                    //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                    view.getContext().startActivity(GoActivity);
                }
            });
        }



        if (holder.txtTitle.getText() == "سایر مقررات") {
            holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent GoActivity = new Intent(view.getContext(), TabrikActivity.class);
                    GoActivity.putExtra(TABRIK,
                            "سایر مقررات");

                    //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                    view.getContext().startActivity(GoActivity);
                }
            });
        }


        if (holder.txtTitle.getText() == " حق الجلسه شوراهای اسلامی") {
            holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent GoActivity = new Intent(view.getContext(), DownloadActivity.class);
                    GoActivity.putExtra(TABRIK,
                            "حق الجلسه شوراهای اسلامی");

                    //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                    view.getContext().startActivity(GoActivity);
                }
            });
        }

        if (holder.txtTitle.getText() == " آیین نامه نحوه هزینه بودجه شوراها") {
            holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent GoActivity = new Intent(view.getContext(), DownloadActivity.class);
                    GoActivity.putExtra(TABRIK,
                            "آیین نامه نحوه هزینه بودجه شوراها");

                    //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                    view.getContext().startActivity(GoActivity);
                }
            });
        }



    }


    @Override
    public int getItemCount() {
        return mainLists.size();
    }
}

