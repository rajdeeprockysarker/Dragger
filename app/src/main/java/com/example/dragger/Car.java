package com.example.dragger;

import android.util.Log;

import javax.inject.Inject;

public class Car {

    private Engin engin;
    private Wheels wheels;

    @Inject
    public Car(Engin engin, Wheels wheels) {
        this.engin = engin;
        this.wheels = wheels;
    }

    public void drive(){
        Log.v("Car","Drive ......");
    }
}
