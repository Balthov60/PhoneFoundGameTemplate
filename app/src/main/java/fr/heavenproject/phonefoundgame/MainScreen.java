package fr.heavenproject.phonefoundgame;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainScreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main_screen);
    }


    public void onLowerBarClick(View view) {
        switch(view.getId())
        {
            case R.id.phone:
                Log.i("Launch", "phone app");
                break;

            case R.id.contact:
                Log.i("Launch", "contact app");
                break;

            case R.id.message:
                Log.i("Launch", "message app");
                break;

            case R.id.mail:
                Log.i("Launch", "mail app");
                break;
        }
    }
}
