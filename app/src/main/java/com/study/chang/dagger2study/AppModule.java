package com.study.chang.dagger2study;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * @author 2018/6/20 15:28 / changliugang
 */
@Module
public class AppModule {

    @Singleton
    @Provides
    AppBean provideAppBean() {
        AppBean appBean = new AppBean();
        appBean.setDesc("application");
        return appBean;
    }

}
