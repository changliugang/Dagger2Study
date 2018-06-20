package com.study.chang.dagger2study.login;

import com.study.chang.dagger2study.ForActivity;
import com.study.chang.dagger2study.main.MainModule;

import dagger.Subcomponent;

/**
 * @author 2018/6/20 13:57 / changliugang
 */
@ForActivity
@Subcomponent(modules = MainModule.class)
public interface LoginComponent {
    void inject(LoginActivity loginActivity);

}
