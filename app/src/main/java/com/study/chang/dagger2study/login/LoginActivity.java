package com.study.chang.dagger2study.login;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.libs.chang.loglib.Loglg;
import com.study.chang.dagger2study.AppApplication;
import com.study.chang.dagger2study.AppBean;
import com.study.chang.dagger2study.AppComponent;
import com.study.chang.dagger2study.R;
import com.study.chang.dagger2study.main.MainBean;

import javax.inject.Inject;

public class LoginActivity extends AppCompatActivity {

    @Inject
    MainBean mMainBean;

    @Inject
    AppBean mAppBean;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
//        DaggerLoginComponent.create().inject(this);

        AppApplication application = (AppApplication) getApplication();
        AppComponent appComponent = application.getAppComponent();
        appComponent.loginComponent().inject(this);

        TextView textView = findViewById(R.id.login_desc);
        if (mMainBean != null)
            textView.setText(mMainBean.toString());


        Loglg.d(mAppBean);
    }
}
