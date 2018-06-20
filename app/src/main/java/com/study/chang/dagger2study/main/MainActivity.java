package com.study.chang.dagger2study.main;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.libs.chang.loglib.Loglg;
import com.study.chang.dagger2study.AppApplication;
import com.study.chang.dagger2study.AppBean;
import com.study.chang.dagger2study.AppComponent;
import com.study.chang.dagger2study.R;
import com.study.chang.dagger2study.login.LoginActivity;

import javax.inject.Inject;

/**
 * 一般的Dagger注入演示
 *
 */
public class MainActivity extends AppCompatActivity {

    @Inject
    MainBean mMainBean;

    @Inject
    AppBean mAppBean;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 随着越来越多的这样代码块(每个需要依赖注入的Activity或Fragment都要这样写)的复制粘贴，使得以后很难重构。
        // 更重要的是，它要求注入类型（ MainActivity ）知道其注入器。 即使这是通过接口而不是具体类型完成的，它打破了依赖注入的核心原则：一个类不应该知道如何注入它。
        AppApplication application = (AppApplication) getApplication();
        AppComponent appComponent = application.getAppComponent();
        appComponent.mainComponent().inject(this);

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
