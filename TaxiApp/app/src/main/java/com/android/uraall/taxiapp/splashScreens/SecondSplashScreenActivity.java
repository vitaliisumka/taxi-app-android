package com.android.uraall.taxiapp.splashScreens;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.android.uraall.taxiapp.ChooseModeActivity;
import com.android.uraall.taxiapp.R;


public class SecondSplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_splash_screen);

        Thread thread = new Thread() {
            @Override
            public void run() {
                try {
                    sleep(4000);

                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    startActivity(new Intent(
                            SecondSplashScreenActivity.this,
                            ChooseModeActivity.class));
                }
            }
        };

        thread.start();
    }


    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }

}
