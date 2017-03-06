package com.vineeth.creation.clorikapplication;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by vineeth on 05/03/2017.
 */

public class Adapter extends ArrayAdapter<Item> {

    private final Context context;
    private final ArrayList<Item> arrayList;
    public Adapter(Context context, ArrayList<Item> arraylist) {
        super(context,R.layout.listrow,arraylist);
        this.context=context;
        this.arrayList=arraylist;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.listrow, parent, false);
        TextView labelView = (TextView) rowView.findViewById(R.id.title);
        TextView valueView = (TextView) rowView.findViewById(R.id.subtitle);
        ImageButton img=(ImageButton) rowView.findViewById(R.id.Imagebutton);
        ImageView image=(ImageView) rowView.findViewById(R.id.imageView_round);
        if(arrayList.get(position).getTitle()!="User")
        {
            image.setSelected(false);
        }
        else image.setImageResource(R.drawable.img);
        if(arrayList.get(position).getTitle()=="User") img.setImageResource(R.drawable.add);
        else if(arrayList.get(position).getTitle()=="Content") img.setImageResource(R.drawable.send);
        else img.setImageResource(R.drawable.choice);
        if(arrayList.get(position).getSubtitle()=="") {
            labelView.setText(arrayList.get(position).getTitle());
            valueView.setSelected(false);
        }
        else{
        labelView.setText(arrayList.get(position).getTitle());
        valueView.setText(arrayList.get(position).getSubtitle());}
        return rowView;
    }
}
