package com.example.prak2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView txt1, txt2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        txt1 = (TextView) findViewById(R.id.textView);
        txt2 = (TextView) findViewById(R.id.textView2);

        String A = getIntent().getExtras().getString("A");
        String B = getIntent().getExtras().getString("B");





    }
}