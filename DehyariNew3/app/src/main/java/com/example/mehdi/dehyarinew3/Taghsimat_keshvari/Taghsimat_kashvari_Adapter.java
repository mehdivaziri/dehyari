package com.example.mehdi.dehyarinew3.Taghsimat_keshvari;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.mehdi.dehyarinew3.R;
import com.example.mehdi.dehyarinew3.Zir_menu.Act_aeenname_mali;
import com.example.mehdi.dehyarinew3.Zir_menu.Act_asasname_tashkilat;
import com.example.mehdi.dehyarinew3.Zir_menu.Act_bakhshnamebodje;
import com.example.mehdi.dehyarinew3.Zir_menu.Act_form_dehyari;
import com.example.mehdi.dehyarinew3.Zir_menu.Act_form_sakhteman;
import com.example.mehdi.dehyarinew3.Zir_menu.Act_sherkat_tavoni;
import com.example.mehdi.dehyarinew3.Zir_menu.Act_taghsidatkeshvar;
import com.example.mehdi.dehyarinew3.ac_edari.DownloadActivity;
import com.example.mehdi.dehyarinew3.gardeshgari.Mashhad_gardesh;
import com.example.mehdi.dehyarinew3.model.ModelListGhanon;
import com.example.mehdi.dehyarinew3.sherkat_tavon.Polis_sakhteman;
import com.example.mehdi.dehyarinew3.sherkat_tavon.Sad_mabar;

import java.util.List;





    public class Taghsimat_kashvari_Adapter extends RecyclerView.Adapter<com.example.mehdi.dehyarinew3.Taghsimat_keshvari.Taghsimat_kashvari_Adapter.MyViewHolder> {
        public static final String TABRIK ="tabrik";
        private List<ModelListGhanon> mainLists;

        public class MyViewHolder extends RecyclerView.ViewHolder {
            public TextView txtTitle;

            public MyViewHolder(View view) {
                super(view);
                txtTitle = (TextView) view.findViewById(R.id.txtTitle);

            }
        }


        public Taghsimat_kashvari_Adapter(List<ModelListGhanon> mainLists) {
            this.mainLists = mainLists;
        }

        @Override
        public com.example.mehdi.dehyarinew3.Taghsimat_keshvari.Taghsimat_kashvari_Adapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View itemView = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.row_list_ghanon, parent, false);

            return new com.example.mehdi.dehyarinew3.Taghsimat_keshvari.Taghsimat_kashvari_Adapter.MyViewHolder(itemView);
        }

        @Override
        public void onBindViewHolder(final com.example.mehdi.dehyarinew3.Taghsimat_keshvari.Taghsimat_kashvari_Adapter.MyViewHolder holder, int position) {
            ModelListGhanon mainList = mainLists.get(position);
            holder.txtTitle.setText(mainList.getTitle());
            if (holder.txtTitle.getText() == "قانون تعاریف و ضوابط تقسیمات کشوری") {
                holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent GoActivity = new Intent(view.getContext(), DownloadActivity.class);
                        GoActivity.putExtra(TABRIK,
                                "قانون تعاریف و ضوابط تقسیمات کشوری");
                        //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                        view.getContext().startActivity(GoActivity);
                    }
                });
            }

            if (holder.txtTitle.getText() == "تاریخچه تقسیمات کشوری") {
                holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent GoActivity = new Intent(view.getContext(), DownloadActivity.class);
                        GoActivity.putExtra(TABRIK,
                                "تاریخچه تقسیمات کشوری");
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
