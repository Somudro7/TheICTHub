package com.example.nizamuddinshamrat.theicthub;

/**
 * Created by Nizam Uddin Shamrat on 10/9/2017.
 */

import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


public class CustomAdapter extends BaseAdapter {

    String[] namez;
    String [] discriptionz;
    int[] imagez;
    Context context;
    public static LayoutInflater inflater =null;

    public CustomAdapter(FragmentActivity mainActivity, String[]name, String[] discription, int[] image  ){

        namez = name;
        discriptionz = discription;
        imagez = image;
        context = mainActivity;
        inflater = (LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);

    }


    @Override
    public int getCount() {
        return namez.length;
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }
    private class Myholder{
        TextView tvs;
        TextView tvs2;
        ImageView iv;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        Myholder myholder = new Myholder();
        View myview;

        myview = inflater.inflate(R.layout.listlayout,null);
        myholder.tvs=(TextView)myview.findViewById(R.id.txt1);
        myholder.tvs2 = (TextView)myview.findViewById(R.id.txt2);
        myholder.iv = (ImageView)myview.findViewById(R.id.img);
        myholder.tvs.setText(namez[position]);
        myholder.tvs2.setText(discriptionz[position]);
        myholder.iv.setImageResource(imagez[position]);

        return myview;
    }
}

