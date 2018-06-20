package com.study.chang.dagger2study;

import com.study.chang.dagger2study.login.LoginComponent;
import com.study.chang.dagger2study.main.MainComponent;

import javax.inject.Singleton;

import dagger.Component;

/**
 * @author 2018/6/20 15:39 / changliugang
 */
@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {

    void inject(AppApplication appApplication);

    //全局单例的AppBean开放给其他Component使用
    AppBean provideAppBean();

    MainComponent mainComponent();

    LoginComponent loginComponent();
}
