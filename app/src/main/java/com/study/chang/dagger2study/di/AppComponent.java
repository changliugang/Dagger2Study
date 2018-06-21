package com.study.chang.dagger2study.di;

import com.study.chang.dagger2study.AppApplication;

import javax.inject.Singleton;

import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

/**
 * 这里需要在应用程序的AppComponent中，注入AndroidInjectionModule，以确保Android的核心
 * 类(Activity、Fragment、Service、BroadcastReceiver及ContentProvider等)可以绑定。 一
 * 般把AndroidInjectionModule放在全局的AppComponent中，其他的Component依赖Application即可。
 *
 * @author 2018/6/20 15:39 / changliugang
 */
@Singleton
@Component(modules = {AppModule.class,BuildersModule.class, AndroidInjectionModule.class, AndroidSupportInjectionModule.class})
public interface AppComponent extends AndroidInjector<AppApplication> {

    @Component.Builder
    abstract class Builder extends AndroidInjector.Builder<AppApplication> {
    }
}
