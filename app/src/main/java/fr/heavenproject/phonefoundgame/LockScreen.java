package fr.heavenproject.phonefoundgame;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.GestureDetectorCompat;
import android.view.GestureDetector;
import android.view.MotionEvent;

public class LockScreen extends Activity {

    private GestureDetectorCompat gestureDetectorCompat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        gestureDetectorCompat = new GestureDetectorCompat(this, new LearnGesture());
        setContentView(R.layout.activity_lock_screen);
    }

    /********************************************************************/
    /*                          Touch Events                            */
    /********************************************************************/

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        this.gestureDetectorCompat.onTouchEvent(event);
        return super.dispatchTouchEvent(event);
    }

    class LearnGesture extends GestureDetector.SimpleOnGestureListener
    {
        @Override
        public boolean onFling(MotionEvent event1, MotionEvent event2,
                               float velocityX, float velocityY)
        {
            if (Math.abs(event1.getX() - event2.getX()) > 100) {
                Intent intent = new Intent(LockScreen.this, MainScreen.class);
                finish();
                startActivity(intent);
            }
            return true;
        }

    }
}
