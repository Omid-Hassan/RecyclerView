package com.example.recyclerviewlab;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {
    private final LinkedList<String> mWordList = new LinkedList<>();
    private final LinkedList<String> mDescriptions = new LinkedList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        for(int x = 0; x < 20; x++)
        {
            mWordList.addLast("Word " + x);
            mDescriptions.addLast("Word " + x);
        }

    }
}