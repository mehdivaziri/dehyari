package com.example.mehdi.dehyarinew3.search;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.mehdi.dehyarinew3.R;
import com.example.mehdi.dehyarinew3.model.MovieNames;

import java.util.ArrayList;


public class ListViewAdapter extends BaseAdapter {

    // Declare Variables

    Context mContext;
    LayoutInflater inflater;
    private ArrayList<MovieNames> arraylist;

    public ListViewAdapter(Context context, ArrayList<MovieNames> arraylist) {
        mContext = context;
        inflater = LayoutInflater.from(mContext);
        this.arraylist = arraylist;

    }

    public class ViewHolder {
        TextView name;
    }

    @Override
    public int getCount() {
        return arraylist.size();
    }

    @Override
    public MovieNames getItem(int position) {
        return arraylist.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    public View getView(final int position, View view, ViewGroup parent) {
        final ViewHolder holder;
        if (view == null) {
            holder = new ViewHolder();
            view = inflater.inflate(R.layout.list_item_search, null);
            // Locate the TextViews in listview_item.xml
            holder.name = (TextView) view.findViewById(R.id.name);
            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();
        }
        // Set the results into TextViews
        holder.name.setText(arraylist.get(position).getMovieName());
        return view;
    }


}