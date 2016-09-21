package com.example.resalat.swingerdiaper;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.MotionEvent;
import android.view.GestureDetector;
import android.support.v4.view.GestureDetectorCompat;

public class MainActivity extends ActionBarActivity implements GestureDetector.OnGestureListener,GestureDetector.OnDoubleTapListener {

    private TextView faizMessage;
    private GestureDetectorCompat gesturedetector;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    faizMessage = (TextView)findViewById(R.id.faizMessage);
        this.gesturedetector = new GestureDetectorCompat(this,this);
        gesturedetector.setOnDoubleTapListener(this);

    }


    @Override
    public boolean onTouchEvent(MotionEvent event) {
        this.gesturedetector.onTouchEvent(event);
        return super.onTouchEvent(event);
    }

    @Override
    public boolean onSingleTapConfirmed(MotionEvent e) {
        faizMessage.setText("single tap confirmed");
        return false;
    }

    @Override
    public boolean onDoubleTap(MotionEvent e) {
        faizMessage.setText("double tap confirmed");
        return false;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent e) {
        faizMessage.setText("double tap confirmed");
        return false;
    }

    @Override
    public boolean onDown(MotionEvent e) {
        faizMessage.setText("down tap confirmed");
        return false;

    }

    @Override
    public void onShowPress(MotionEvent e) {
        faizMessage.setText("press confirmed");
    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        faizMessage.setText("single tap confirmed");
        return false;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        faizMessage.setText("scroll confirmed");
        return false;
    }

    @Override
    public void onLongPress(MotionEvent e) {
        faizMessage.setText("long press confirmed");
    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        faizMessage.setText("onFling confirmed");
        return false;
    }


}
