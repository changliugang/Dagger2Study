package com.study.chang.dagger2study;

import android.annotation.SuppressLint;
import android.os.Bundle;

import dagger.android.AndroidInjection;
import dagger.android.support.DaggerAppCompatActivity;

/**
 * @author 2018/6/21 11:09 / changliugang
 */
@SuppressLint("Registered")
public class BaseActivity extends DaggerAppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
    }
}
