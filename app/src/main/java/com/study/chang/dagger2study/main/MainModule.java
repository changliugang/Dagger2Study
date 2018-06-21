package com.study.chang.dagger2study.main;

import dagger.Module;
import dagger.Provides;

/**
 * @author 2018/6/20 12:00 / changliugang
 */
@Module
public class MainModule {

    @Provides
    MainBean provideMainBean(){
        MainBean mainBean = new MainBean();
        mainBean.setDesc("Smith Wang");
        return mainBean;
    }

}
