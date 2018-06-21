package com.study.chang.dagger2study.student;

import dagger.Module;
import dagger.Provides;

/**
 * @author 2018/6/21 12:03 / changliugang
 */
@Module
public class StudentModule {

    @Provides
    Student provideStudent(){
        return new Student("Dexter");
    }

}
