package com.study.chang.dagger2study.main;

import com.study.chang.dagger2study.ForActivity;

import dagger.Subcomponent;

/**
 * @author 2018/6/20 12:02 / changliugang
 */
@ForActivity
@Subcomponent(modules = MainModule.class)
public interface MainComponent {

    void inject(MainActivity mainActivity);

}
