package com.zrh.android.myapplication2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import cn.sharesdk.framework.ShareSDK;
import cn.sharesdk.onekeyshare.OnekeyShare;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public  void share(View v){
        ShareSDK.initSDK(this);
        OnekeyShare oks =new OnekeyShare();
        oks.setTitle("我爱糖醋鱼");
        oks.show(this);
    }
}
