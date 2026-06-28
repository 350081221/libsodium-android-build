package com.lody.virtual.client.stub;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import com.huawei.agconnect.apms.instrument.AppInstrumentation;
import com.huawei.agconnect.apms.instrument.Instrumented;
import com.huawei.agconnect.apms.instrument.TraceManager;

@Instrumented
/* loaded from: classes3.dex */
public class RequestExternalStorageManagerActivity extends Activity {
    public static void request(Context context, boolean z4) {
        Intent intent = new Intent();
        if (z4) {
            intent.setClassName(StubManifest.EXT_PACKAGE_NAME, RequestExternalStorageManagerActivity.class.getName());
        } else {
            intent.setClassName(StubManifest.PACKAGE_NAME, RequestExternalStorageManagerActivity.class.getName());
        }
        intent.setFlags(268435456);
        context.startActivity(intent);
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        boolean isExternalStorageManager;
        TraceManager.startActivityTrace(getClass().getName());
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 30) {
            isExternalStorageManager = Environment.isExternalStorageManager();
            if (!isExternalStorageManager) {
                Intent intent = new Intent("android.settings.MANAGE_ALL_FILES_ACCESS_PERMISSION");
                intent.addFlags(268435456);
                startActivity(intent);
            }
        }
        finish();
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
