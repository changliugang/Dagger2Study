package com.study.chang.dagger2study.di;

import com.study.chang.dagger2study.login.LoginActivity;
import com.study.chang.dagger2study.main.MainActivity;
import com.study.chang.dagger2study.main.MainModule;
import com.study.chang.dagger2study.student.StudentFragment;
import com.study.chang.dagger2study.student.StudentModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * @author 2018/6/20 17:20 / changliugang
 */
@Module
public abstract class BuildersModule {

    @ContributesAndroidInjector(modules = MainModule.class)
    abstract MainActivity mainActivityInjector();

    @ContributesAndroidInjector(modules = MainModule.class)
    abstract LoginActivity loginActivityInjector();

    @ContributesAndroidInjector(modules = StudentModule.class)
    abstract StudentFragment studentFragmentInjector();

}
