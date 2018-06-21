package com.study.chang.dagger2study.main;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.libs.chang.loglib.Loglg;
import com.study.chang.dagger2study.AppBean;
import com.study.chang.dagger2study.R;
import com.study.chang.dagger2study.login.LoginActivity;

import javax.inject.Inject;

import dagger.android.AndroidInjection;
import dagger.android.support.DaggerAppCompatActivity;

/**
 * 使用Dagger.Android注入Android核心类（Activity为例）和Fragment演示
 *
 */
public class MainActivity extends DaggerAppCompatActivity {

    @Inject
    MainBean mMainBean;

    @Inject
    AppBean mAppBean;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        TextView textView = findViewById(R.id.main_desc);
        if (mMainBean != null)
            textView.setText(mMainBean.getDesc());

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, LoginActivity.class));
            }
        });

        Loglg.d(mAppBean);

    }
}
