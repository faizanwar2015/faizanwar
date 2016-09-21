package com.example.resalat.myandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    public final static String EXTRA_MESSAGE = "com.example.resalat.myandroid.MESSAGE"; // created a key holder to store the message passed by the user

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class); //new intent is created of going to dispactivity class

        EditText editText = (EditText) findViewById(R.id.edit_message);// we have chosen editText as the medium of taking input from user
        String message = editText.getText().toString();// String entered into edittext is transfered to message
        intent.putExtra(EXTRA_MESSAGE, message);// the content of message is transfered to extra_message
        startActivity(intent);// activity is initiated

    }
}





