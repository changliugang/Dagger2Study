package com.study.chang.dagger2study.main;

import com.study.chang.dagger2study.di.ForActivity;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

/**
 * @author 2018/6/20 12:02 / changliugang
 */
@ForActivity
@Subcomponent(modules = MainModule.class)
public interface MainComponent extends AndroidInjector<MainActivity> {

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MainActivity> {
    }

}
