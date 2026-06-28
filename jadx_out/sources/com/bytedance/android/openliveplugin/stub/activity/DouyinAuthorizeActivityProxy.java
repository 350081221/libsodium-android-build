package com.bytedance.android.openliveplugin.stub.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;
import com.bytedance.android.dy.sdk.pangle.ZeusPlatformUtils;
import com.bytedance.android.live.base.api.JavaCallsUtils;
import com.huawei.agconnect.apms.instrument.AppInstrumentation;
import com.huawei.agconnect.apms.instrument.Instrumented;
import com.huawei.agconnect.apms.instrument.TraceManager;

@Instrumented
/* loaded from: classes2.dex */
public class DouyinAuthorizeActivityProxy extends Activity {
    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        TraceManager.startActivityTrace(getClass().getName());
        super.onCreate(bundle);
        try {
            JavaCallsUtils.callStaticMethodWithClassLoader("com.bytedance.android.openlive.auth.impl.auth.LiveAuthCallStub", "onAuthActivityBack", ZeusPlatformUtils.getPluginClassloader("com.byted.live.lite"), getIntent(), this);
        } catch (Throwable th) {
            th.printStackTrace();
            Toast.makeText(this, "抖音授权失败-界面启动失败", 1).show();
        }
        AppInstrumentation.onActivityCreateEnd();
    }

    @Override // android.app.Activity
    protected void onRestart() {
        AppInstrumentation.onActivityRestartBegin(getClass().getName());
        super.onRestart();
        AppInstrumentation.onActivityRestartEnd();
    }

    @Override // android.app.Activity
    protected void onResume() {
        AppInstrumentation.onActivityResumeBegin(getClass().getName());
        super.onResume();
        AppInstrumentation.onActivityResumeEnd();
    }

    @Override // android.app.Activity
    protected void onStart() {
        AppInstrumentation.onActivityStartBegin(getClass().getName());
        super.onStart();
        AppInstrumentation.onActivityStartEnd();
    }
}
