package com.example.dragger;

import javax.inject.Inject;

public class Wheels {

    private WheelRim wheelRim;

    @Inject
    public Wheels(WheelRim wheelRim) {
        this.wheelRim=wheelRim;
    }
}
