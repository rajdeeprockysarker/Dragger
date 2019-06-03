package com.example.dragger;

import dagger.Module;
import dagger.Provides;

//// Provide used when ThiredParty Code, not able to use Inject in Constractor

@Module
public class WheelModule {

    @Provides
    WheelRim provideWheelRim(){
        return new WheelRim();
    }

    @Provides
    Wheels provideWheels(WheelRim wheelRim){
        return new Wheels(wheelRim);
    }
}
