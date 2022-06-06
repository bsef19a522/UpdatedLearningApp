package com.example.alearningapp;

import androidx.appcompat.app.AppCompatActivity;

import android.database.DataSetObserver;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    String Alphabet[] = {"Apple","Ball","Cat","Dog"};
    int img[] = {R.drawable.apple,R.drawable.ball,R.drawable.cat,R.drawable.dog};

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