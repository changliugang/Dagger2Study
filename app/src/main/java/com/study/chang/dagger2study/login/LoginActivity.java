package com.study.chang.dagger2study.login;

import android.os.Bundle;
import android.widget.TextView;

import com.libs.chang.loglib.Loglg;
import com.study.chang.dagger2study.AppBean;
import com.study.chang.dagger2study.R;
import com.study.chang.dagger2study.main.MainBean;

import javax.inject.Inject;

import dagger.android.AndroidInjection;
import dagger.android.support.DaggerAppCompatActivity;

public class LoginActivity extends DaggerAppCompatActivity {

    @Inject
    MainBean mMainBean;

    @Inject
    AppBean mAppBean;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        TextView textView = findViewById(R.id.login_desc);
        if (mMainBean != null)
            textView.setText(mMainBean.toString());


        Loglg.d(mAppBean);
    }
}
