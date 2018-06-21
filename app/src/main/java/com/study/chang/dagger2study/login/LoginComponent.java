package com.study.chang.dagger2study.login;

import com.study.chang.dagger2study.di.ForActivity;
import com.study.chang.dagger2study.main.MainModule;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

/**
 * @author 2018/6/20 13:57 / changliugang
 */
@ForActivity
@Subcomponent(modules = MainModule.class)
public interface LoginComponent extends AndroidInjector<LoginActivity>{

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<LoginActivity>{}

}
