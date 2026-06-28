package com.byted.live.lite;

import android.os.Bundle;
import com.bytedance.pangle.activity.GenerateProxyActivity;
import com.huawei.agconnect.apms.instrument.AppInstrumentation;
import com.huawei.agconnect.apms.instrument.Instrumented;
import com.huawei.agconnect.apms.instrument.TraceManager;

@Instrumented
/* loaded from: classes2.dex */
public class Activity_main_singleInstance1 extends GenerateProxyActivity {
    @Override // com.bytedance.pangle.activity.GenerateProxyActivity, com.bytedance.pangle.activity.b
    public String getPluginPkgName() {
        return "com.byted.live.lite";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.pangle.activity.GenerateProxyActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        TraceManager.startActivityTrace(getClass().getName());
        super.onCreate(bundle);
        AppInstrumentation.onActivityCreateEnd();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.pangle.activity.GenerateProxyActivity, android.app.Activity
    public void onRestart() {
        AppInstrumentation.onActivityRestartBegin(getClass().getName());
        super.onRestart();
        AppInstrumentation.onActivityRestartEnd();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.pangle.activity.GenerateProxyActivity, android.app.Activity
    public void onResume() {
        AppInstrumentation.onActivityResumeBegin(getClass().getName());
        super.onResume();
        AppInstrumentation.onActivityResumeEnd();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.pangle.activity.GenerateProxyActivity, android.app.Activity
    public void onStart() {
        AppInstrumentation.onActivityStartBegin(getClass().getName());
        super.onStart();
        AppInstrumentation.onActivityStartEnd();
    }
}
