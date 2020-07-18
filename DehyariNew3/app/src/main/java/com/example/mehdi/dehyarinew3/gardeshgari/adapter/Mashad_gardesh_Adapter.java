package com.example.mehdi.dehyarinew3.gardeshgari.adapter;

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
import com.example.mehdi.dehyarinew3.Zir_menu.Act_ghanon_mali;
import com.example.mehdi.dehyarinew3.Zir_menu.Act_ghanon_omrani;
import com.example.mehdi.dehyarinew3.Zir_menu.Act_sherkat_tavoni;
import com.example.mehdi.dehyarinew3.Zir_menu.Act_taghsidatkeshvar;
import com.example.mehdi.dehyarinew3.gardeshgari.Matanegh_gardesh;
import com.example.mehdi.dehyarinew3.model.ModelListGhanon;

import java.util.List;





    public class Mashad_gardesh_Adapter extends RecyclerView.Adapter<com.example.mehdi.dehyarinew3.gardeshgari.adapter.Mashad_gardesh_Adapter.MyViewHolder> {

        private List<ModelListGhanon> mainLists;

        public class MyViewHolder extends RecyclerView.ViewHolder {
            public TextView txtTitle;

            public MyViewHolder(View view) {
                super(view);
                txtTitle = (TextView) view.findViewById(R.id.txtTitle);

            }
        }


        public Mashad_gardesh_Adapter(List<ModelListGhanon> mainLists) {
            this.mainLists = mainLists;
        }

        @Override
        public com.example.mehdi.dehyarinew3.gardeshgari.adapter.Mashad_gardesh_Adapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View itemView = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.row_list_ghanon, parent, false);

            return new com.example.mehdi.dehyarinew3.gardeshgari.adapter.Mashad_gardesh_Adapter.MyViewHolder(itemView);
        }

        @Override
        public void onBindViewHolder(final com.example.mehdi.dehyarinew3.gardeshgari.adapter.Mashad_gardesh_Adapter.MyViewHolder holder, int position) {
            ModelListGhanon mainList = mainLists.get(position);
            holder.txtTitle.setText(mainList.getTitle());
            if (holder.txtTitle.getText() == "جاذبه های گردشگری") {
                holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent GoActivity = new Intent(view.getContext(), Matanegh_gardesh.class);
                        //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                        view.getContext().startActivity(GoActivity);
                    }
                });
            }

            if (holder.txtTitle.getText() == "تصاویر امرودک") {
                holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent GoActivity = new Intent(view.getContext(), Act_ghanon_omrani.class);
                        //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                        view.getContext().startActivity(GoActivity);
                    }
                });
            }
            if (holder.txtTitle.getText() == "کلیپ امرودک") {
                holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent GoActivity = new Intent(view.getContext(), Act_ghanon_mali.class);
                        //اکتویتی که میخواد بره رو بالا درج کنید.یک اکتیویتی ج
                        view.getContext().startActivity(GoActivity);
                    }
                });
            }

            if (holder.txtTitle.getText() == "طرح دهکده") {
                holder.txtTitle.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent GoActivity = new Intent(view.getContext(), Act_sherkat_tavoni.class);
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

