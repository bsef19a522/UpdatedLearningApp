package com.example.alearningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.database.DataSetObserver;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    String Alphabet[] = {"Apple","Ball","Cat","Dog","Egg","Fish","Goat","Hat","Ice-cream","Jar","Key"
                            ,"Lamp","Map","Needle","Owl","Piano","Quilt","Rat","Sun","Tap","Umbrella"
                            ,"Van","Watch","X-Ray","Yellow","Zebra"};
    int img[] = {R.drawable.apple,R.drawable.ball,R.drawable.cat,R.drawable.dog,R.drawable.egg,
                R.drawable.fish,R.drawable.goat,R.drawable.hat,R.drawable.ice,R.drawable.jar,
                R.drawable.key,R.drawable.lamp,R.drawable.map,R.drawable.needle,R.drawable.owl,
                R.drawable.piano,R.drawable.quilt,R.drawable.rat,R.drawable.sun,R.drawable.tap,
                R.drawable.umbrella,R.drawable.van,R.drawable.watch,R.drawable.xray,
                R.drawable.yellow,R.drawable.zebra};

    ListView lst;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lst = findViewById(R.id.list);

        Adaptor ad = new Adaptor(getApplicationContext(), Alphabet, img);
        lst.setAdapter(ad);
    }
}