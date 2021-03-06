package com.bartronics.ams;


import android.app.Application;

import com.bartronics.ams.di.component.ApplicationComponent;
import com.bartronics.ams.di.component.DaggerApplicationComponent;
import com.bartronics.ams.di.module.ApplicationModule;
import com.bartronics.ams.utils.MvpLogger;

public class AMSApp extends Application {

   /* @Inject
    DataManager mDataManager;*/

    private ApplicationComponent mApplicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        mApplicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this)).build();

        mApplicationComponent.inject(this);

        MvpLogger.init();

        /*AndroidNetworking.initialize(getApplicationContext());
        if (BuildConfig.DEBUG) {
            AndroidNetworking.enableLogging(Level.BODY);
        }*/

    }

    public ApplicationComponent getComponent() {
        return mApplicationComponent;
    }


    // Needed to replace the component with a test specific one
    public void setComponent(ApplicationComponent applicationComponent) {
        mApplicationComponent = applicationComponent;
    }
}
