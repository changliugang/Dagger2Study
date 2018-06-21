package com.study.chang.dagger2study.di;

import android.app.Activity;
import android.support.v4.app.Fragment;

import com.study.chang.dagger2study.login.LoginActivity;
import com.study.chang.dagger2study.login.LoginComponent;
import com.study.chang.dagger2study.main.MainActivity;
import com.study.chang.dagger2study.main.MainComponent;
import com.study.chang.dagger2study.student.StudentFragment;
import com.study.chang.dagger2study.student.StudentSubComponent;

import dagger.Binds;
import dagger.Module;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.android.support.FragmentKey;
import dagger.multibindings.IntoMap;

/**
 * @author 2018/6/20 17:20 / changliugang
 */
@Module(subcomponents = {MainComponent.class, LoginComponent.class, StudentSubComponent.class})
public abstract class BuildersModule {

    @Binds
    @IntoMap
    @ActivityKey(MainActivity.class)
    abstract AndroidInjector.Factory<? extends Activity> bindMain(MainComponent.Builder builder);

    @Binds
    @IntoMap
    @ActivityKey(LoginActivity.class)
    abstract AndroidInjector.Factory<? extends Activity> bindLogin(LoginComponent.Builder builder);

    @Binds
    @IntoMap
    @FragmentKey(StudentFragment.class)
    abstract AndroidInjector.Factory<? extends Fragment> bindStudent(StudentSubComponent.Builder builder);
}
