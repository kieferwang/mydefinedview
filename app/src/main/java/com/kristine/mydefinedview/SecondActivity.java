package com.kristine.mydefinedview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Kristine on 2016/1/27.
 */
public class SecondActivity extends AppCompatActivity {
    private TitleLayout titleLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        titleLayout= (TitleLayout) findViewById(R.id.titleLayout);
        titleLayout.setTitleText("返回");
    }
}
