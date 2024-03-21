package com.example.ipl_customlistview;

import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdaptor extends BaseAdapter {

    MainActivity mainActivity;
    String[] title;
    String[] subtitle;
    int[] img;
    public CustomAdaptor(MainActivity mainActivity,String[] title,String[] subtitle,int[] img)
    {
        this.mainActivity=mainActivity;
        this.title=title;
        this.subtitle=subtitle;
        this.img=img;
    }
    @Override
    public int getCount() {
        return title.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        view= LayoutInflater.from(mainActivity).inflate(R.layout.activity_main_item,parent, false);
        ImageView imageView=view.findViewById(R.id.img);
        TextView txt1=view.findViewById(R.id.title);
        TextView txt2=view.findViewById(R.id.subtitle);

        imageView.setImageResource(img[position]);
        txt1.setText(""+title[position]);
        txt2.setText(""+subtitle[position]);

        return view;
    }
}
