package com.study.chang.dagger2study.main;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.TextView;

import com.libs.chang.loglib.Loglg;
import com.study.chang.dagger2study.AppBean;
import com.study.chang.dagger2study.BaseActivity;
import com.study.chang.dagger2study.R;
import com.study.chang.dagger2study.login.LoginActivity;
import com.study.chang.dagger2study.student.StudentFragment;

import javax.inject.Inject;

/**
 * 使用Dagger.Android注入Android核心类（Activity为例）和Fragment演示
 * 并使用@ContributesAndroidInjector简化代码
 */
public class MainActivity extends BaseActivity {

    @Inject
    MainBean mMainBean;

    @Inject
    AppBean mAppBean;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setFragment();

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

    private void setFragment(){
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = supportFragmentManager.beginTransaction();
        StudentFragment studentFragment = new StudentFragment();
        fragmentTransaction.add(R.id.fragment_container, studentFragment);
        fragmentTransaction.commit();
    }
}
