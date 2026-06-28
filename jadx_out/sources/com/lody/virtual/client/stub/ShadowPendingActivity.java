package com.lody.virtual.client.stub;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import com.huawei.agconnect.apms.instrument.AppInstrumentation;
import com.huawei.agconnect.apms.instrument.Instrumented;
import com.huawei.agconnect.apms.instrument.TraceManager;
import com.lody.virtual.client.core.VirtualCore;
import com.lody.virtual.client.ipc.VActivityManager;
import com.lody.virtual.helper.utils.ComponentUtils;
import com.lody.virtual.helper.utils.VLog;

@Instrumented
/* loaded from: classes3.dex */
public class ShadowPendingActivity extends Activity {
    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        ComponentUtils.IntentSenderInfo intentSenderInfo;
        TraceManager.startActivityTrace(getClass().getName());
        super.onCreate(bundle);
        finish();
        Intent intent = getIntent();
        try {
            intentSenderInfo = ComponentUtils.parseIntentSenderInfo(intent, true);
        } catch (Throwable th) {
            th.printStackTrace();
            intentSenderInfo = null;
        }
        if (intentSenderInfo != null && intentSenderInfo.userId != -1) {
            ActivityInfo resolveActivityInfo = VirtualCore.get().resolveActivityInfo(intentSenderInfo.intent, intentSenderInfo.userId);
            if (resolveActivityInfo == null) {
                VLog.e(ShadowPendingActivity.class.getSimpleName(), "failed to resolve intent: " + intent);
                AppInstrumentation.onActivityCreateEnd();
                return;
            }
            if (intentSenderInfo.callerActivity != null && !isTaskRoot()) {
                intentSenderInfo.intent.addFlags(33554432);
                VActivityManager.get().startActivity(intentSenderInfo.intent, resolveActivityInfo, intentSenderInfo.callerActivity, intentSenderInfo.options, null, -1, intentSenderInfo.targetPkg, intentSenderInfo.userId);
            } else {
                intentSenderInfo.intent.addFlags(268435456);
                VActivityManager.get().startActivity(intentSenderInfo.intent, resolveActivityInfo, null, intentSenderInfo.options, null, -1, intentSenderInfo.targetPkg, intentSenderInfo.userId);
            }
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
