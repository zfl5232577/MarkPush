package com.mark.markpush;

import android.app.Application;
import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import com.mark.pushlib.PushHelper;
import com.umeng.message.UmengMessageHandler;
import com.umeng.message.UmengNotificationClickHandler;
import com.umeng.message.entity.UMessage;

/**
 * <pre>
 *     author : Mark
 *     e-mail : makun.cai@aorise.org
 *     time   : 2019/01/17
 *     desc   : TODO
 *     version: 1.0
 * </pre>
 */
public class APP extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        initPushLib();
    }

    private void initPushLib() {
        PushHelper.getInstance().init(this,"5af2608cf29d981850000208","mark","8bbf20db1bc770d5df570163e941084d");
        PushHelper.getInstance().register(this);
        PushHelper.getInstance().registerMeizuPush(this,"118261","b4492fd61afc4ff8a9d41150c9096529");
        PushHelper.getInstance().setAlias(this,"test","user");
        PushHelper.getInstance().setLogEnabled(BuildConfig.DEBUG);
        PushHelper.getInstance().setNotificationClickHandler(this,new UmengNotificationClickHandler(){
            @Override
            public void dealWithCustomAction(Context context, UMessage uMessage) {
                Log.e("mark", "dealWithCustomAction: "+ uMessage.extra);
                Toast.makeText(context, uMessage.custom, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
