package com.study.chang.dagger2study.login;

import android.os.Bundle;
import android.widget.TextView;

import com.libs.chang.loglib.Loglg;
import com.study.chang.dagger2study.AppBean;
import com.study.chang.dagger2study.BaseActivity;
import com.study.chang.dagger2study.R;
import com.study.chang.dagger2study.main.MainBean;

import javax.inject.Inject;

public class LoginActivity extends BaseActivity {

    @Inject
    MainBean mMainBean;

    @Inject
    AppBean mAppBean;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        TextView textView = findViewById(R.id.login_desc);
        if (mMainBean != null)
            textView.setText(mMainBean.toString());


        Loglg.d(mAppBean);
    }
}
