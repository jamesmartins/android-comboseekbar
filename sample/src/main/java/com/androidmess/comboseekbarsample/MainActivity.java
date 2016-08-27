package com.androidmess.comboseekbarsample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.infteh.comboseekbar.ComboSeekBar;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ComboSeekBar comboSeekBar = (ComboSeekBar) findViewById(R.id.comboseekbar);
        List<String> points = new ArrayList<>();
        points.add("Point 1");
        points.add("Point 2");
        points.add("Point 3");
        points.add("Point 4");
        comboSeekBar.setAdapter(points);
    }
}
