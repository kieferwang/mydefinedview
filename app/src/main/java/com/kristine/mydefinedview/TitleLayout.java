package com.kristine.mydefinedview;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by Kristine on 2016/1/27.
 */
public class TitleLayout extends LinearLayout {

    private Button mTitleButton;
    private TextView mTitleTv;
    public TitleLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        //加载布局文件
        LayoutInflater.from(context).inflate(R.layout.title_view, this);
        mTitleButton= (Button) findViewById(R.id.title_back);
        mTitleTv= (TextView) findViewById(R.id.tv_title);
        //绑定返回键监听
        mTitleButton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                ((Activity)getContext()).finish();
            }
        });
    }

    //创建一个改变title中text的方法
    public void setTitleText(String text){
        mTitleTv.setText(text);
    }
}
