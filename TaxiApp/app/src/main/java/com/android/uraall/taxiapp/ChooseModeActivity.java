package com.android.uraall.taxiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.android.uraall.taxiapp.driver.DriverSignInActivity;

public class ChooseModeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_layout);
    }


    public void goToPassengerSignIn(View view) {
        startActivity(new Intent(
                ChooseModeActivity.this,
                com.android.uraall.taxiapp.passenger.PassengerSignInActivity.class
        ));
    }


    public void goToDriverSignIn(View view) {
        startActivity(new Intent(
                ChooseModeActivity.this,
                com.android.uraall.taxiapp.driver.DriverSignInActivity.class
        ));
    }

}







