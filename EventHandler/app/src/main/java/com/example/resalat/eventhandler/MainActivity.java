package com.example.resalat.eventhandler;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button faizButton= (Button)findViewById(R.id.faizButton);
        faizButton.setOnClickListener(
new Button.OnClickListener(){
        public void onClick(View v)
            {
                TextView faizText = (TextView) findViewById(R.id.faizText);
                faizText.setText("good job faiz");
            }
        }
        );

    faizButton.setOnLongClickListener(
            new Button.OnLongClickListener()
            {
                public boolean onLongClick (View v)
                {
                    TextView faizText = (TextView) findViewById(R.id.faizText);
                    faizText.setText("That was a long one");
                    return true;
                }
            }
    );

    }
}
