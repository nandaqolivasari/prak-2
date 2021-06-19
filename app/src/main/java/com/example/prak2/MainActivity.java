package com.example.prak2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText A, B;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        A = (EditText) findViewById(R.id.editTIMA);
        B = (EditText) findViewById(R.id.editTIMB);



    }

    public void button(View view) {

        Intent skuy = new Intent( this, MainActivity2.class);
        skuy.putExtra("editTIMA", A.getText().toString());
        skuy.putExtra("editTIMB", B.getText().toString());
        startActivity(skuy);
    }


}