package com.study.chang.dagger2study;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * @author 2018/6/20 15:55 / changliugang
 */
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface ForActivity {
}
