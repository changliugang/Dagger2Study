package com.study.chang.dagger2study;

import com.libs.chang.loglib.Loglg;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DaggerApplication;

/**
 * @author 2018/6/20 11:59 / changliugang
 */
public class AppApplication extends DaggerApplication {


    @Inject
    AppBean mAppBean;

    @Override
    public void onCreate() {
        super.onCreate();


        Loglg.d(mAppBean);
    }

    @Override
    protected AndroidInjector<? extends DaggerApplication> applicationInjector() {
        return com.study.chang.dagger2study.di.DaggerAppComponent.builder().create(this);
    }


}
