package com.bartronics.ams.ui.splash;

import android.os.Bundle;

import com.bartronics.ams.R;
import com.bartronics.ams.ui.base.BaseActivity;

import butterknife.ButterKnife;

public class SplashScreen extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        getActivityComponent().inject(this);

        setUnBinder(ButterKnife.bind(this));
    }

    @Override
    protected void setUp() {

    }
}
