package com.lody.virtual.client.stub;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.huawei.agconnect.apms.instrument.AppInstrumentation;
import com.huawei.agconnect.apms.instrument.Instrumented;
import com.huawei.agconnect.apms.instrument.TraceManager;

@Instrumented
/* loaded from: classes3.dex */
public class BridgeActivity extends Activity {
    @Override // android.app.Activity
    public void onCreate(@Nullable Bundle bundle) {
        TraceManager.startActivityTrace(getClass().getName());
        super.onCreate(bundle);
        finish();
        Intent intent = getIntent();
        if (intent == null) {
            AppInstrumentation.onActivityCreateEnd();
        } else {
            startActivity((Intent) intent.getParcelableExtra("_VA_|_intent_"), (Bundle) intent.getParcelableExtra("_VA_|_bundle_"));
            AppInstrumentation.onActivityCreateEnd();
        }
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
