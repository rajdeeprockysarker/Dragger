package com.example.dragger;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    Car car;

    //field Injection
    @Inject Car mcar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CarComponent carComponent=DaggerCarComponent.create();
        car=carComponent.getCar();

        car.drive();


        //Field Injection
        carComponent.inject(this);
        mcar.drive();;
    }
}
