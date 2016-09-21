package com.example.resalat.myandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        Intent intent = getIntent();// the intent is received
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);// the string is received

        TextView textView = new TextView(this);// we want textview as the resultant screen
        textView.setTextSize(40);// of size 40


        textView.setText(message); // display the message
        ViewGroup layout = (ViewGroup) findViewById(R.id.activity_display_message);// display the output on the screen id
        // and adding the activity_display_message content to the viewgroup layout(whenever a virtual text is created , it is binded to viewgroup)
        layout.addView(textView);
        RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams)textView.getLayoutParams();
        params.addRule(RelativeLayout.CENTER_VERTICAL);
        params.addRule(RelativeLayout.CENTER_HORIZONTAL);


    }
}
