package com.bartronics.ams.ui.base;

import android.support.annotation.StringRes;

/**
 * Created by anand.chandaliya on 22-02-2017.
 */

public interface MvpView {

    void showLoading();

    void hideLoading();

    void openActivityOnTokenExpire();

    void onError(@StringRes int resId);

    void onError(String message);

    boolean isNetworkConnected();

    void hideKeyboard();
}
