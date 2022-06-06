package com.example.alearningapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.alearningapp.R;

public class Adaptor extends BaseAdapter {

    Context ctx;
    String Alp[];
    int ima[];
    LayoutInflater f;

    public Adaptor(Context c, String[] Alphabet, int[] img){

        this.ctx = c;
        this.Alp = Alphabet;
        this.ima = img;
        f = LayoutInflater.from(c);
    }


    @Override
    public int getCount() {
        return Alp.length;
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
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = f.inflate(R.layout.row, null);
        TextView txt = (TextView) convertView.findViewById(R.id.text1);
        ImageView fruitImage = (ImageView) convertView.findViewById(R.id.image);

        txt.setText(Alp[position]);
        fruitImage.setImageResource(ima[position]);

        return convertView;
    }
}
