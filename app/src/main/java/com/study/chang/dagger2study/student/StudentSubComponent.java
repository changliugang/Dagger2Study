package com.study.chang.dagger2study.student;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

/**
 * @author 2018/6/21 11:58 / changliugang
 */
@Subcomponent(modules = StudentModule.class)
public interface StudentSubComponent extends AndroidInjector<StudentFragment> {

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<StudentFragment> {
    }

}
