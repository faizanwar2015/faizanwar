package com.example.resalat.firstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;

public class Display_Method extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display__method);

        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.Extra_Message);
        TextView textView = new TextView(this);
        textView.setText(message);
        textView.setTextSize(50);
        ViewGroup layout = (ViewGroup)findViewById(R.id.user_screen);
        layout.addView(textView);


    }
}
