package com.vineeth.creation.clorikapplication;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import java.util.ArrayList;


/**
 * Created by vineeth on 05/03/2017.
 */

public class Tab1 extends Fragment {
    public Tab1(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.tab1, container, false);
        ArrayList<Item> items=generateData();
        ListView listView = (ListView)rootView.findViewById(R.id.list);
        listView.setAdapter(new Adapter(getActivity(),items));
        return rootView;
    }
    private ArrayList<Item> generateData(){
        ArrayList<Item> items = new ArrayList<Item>();
        Item item=new Item();
        item.setTitle("User");
        item.setSubtitle("");
        items.add(item);
        item=new Item();
        item.setTitle("User");
        item.setSubtitle("");
        items.add(item);
        item=new Item();
        item.setTitle("Content");
        item.setSubtitle("");
        items.add(item);
        item=new Item();
        item.setTitle("Content");
        item.setSubtitle("");
        items.add(item);
        item=new Item();
        item.setTitle("Choice");
        item.setSubtitle("");
        items.add(item);
        item=new Item();
        item.setTitle("Content");
        item.setSubtitle("Subtitle");
        items.add(item);
        item=new Item();
        item.setTitle("User");
        item.setSubtitle("");
        items.add(item);
        item=new Item();
        item.setTitle("Choice");
        item.setSubtitle("ChoiceSUbtitle");
        items.add(item);
        return items;
    }
}