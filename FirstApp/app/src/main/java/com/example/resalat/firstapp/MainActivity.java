package com.example.resalat.firstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
public final static String Extra_Message= "com.example.resalat.message1";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
        public void message(View view){
        Intent intent = new Intent(this,Display_Method.class);
        EditText editText = (EditText)findViewById(R.id.edit_text);
        String message = editText.getText().toString();
        intent.putExtra(Extra_Message,message);
        startActivity(intent);
    }
}
