package com.example.chendong.moduletest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.alibaba.android.arouter.launcher.ARouter;
import com.example.base.RouteerUtil;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.app_activity_main);
        ButterKnife.bind(this);
    }
    @OnClick(R.id.button)
    public void onClick(View v) {
        ARouter.getInstance()
                .build(RouteerUtil.APP1)
                .navigation();
//        startActivity(new Intent(this, LoginActivity.class));
    }
}
