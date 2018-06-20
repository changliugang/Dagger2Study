package com.study.chang.dagger2study;

import android.app.Application;

import com.libs.chang.loglib.Loglg;

import javax.inject.Inject;

/**
 * @author 2018/6/20 11:59 / changliugang
 */
public class AppApplication extends Application {

    private AppComponent mAppComponent;

    @Inject
    AppBean mAppBean;

    @Override
    public void onCreate() {
        super.onCreate();
        if (mAppComponent == null) {
            mAppComponent = DaggerAppComponent.create();
        }
        mAppComponent.inject(this);

        Loglg.d(mAppBean);
    }

    public AppComponent getAppComponent() {
        return mAppComponent;
    }
}
