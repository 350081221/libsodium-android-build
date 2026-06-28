package com.ss.android.downloadlib.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.agconnect.apms.instrument.AppInstrumentation;
import com.huawei.agconnect.apms.instrument.Instrumented;
import com.huawei.agconnect.apms.instrument.TraceManager;
import com.ss.android.downloadlib.addownload.k;
import com.ss.android.downloadlib.e.c;
import com.ss.android.downloadlib.g.h;
import com.umeng.analytics.pro.bi;

@Instrumented
/* loaded from: classes3.dex */
public class JumpKllkActivity extends TTDelegateActivity {
    @Override // com.ss.android.downloadlib.activity.TTDelegateActivity
    protected void a() {
        Intent intent = getIntent();
        if (getIntent() == null) {
            c.a().a("handleIntent is null");
            com.ss.android.socialbase.appdownloader.c.a((Activity) this);
            return;
        }
        String stringExtra = intent.getStringExtra(bi.aA);
        long longExtra = intent.getLongExtra("id", 0L);
        if (TextUtils.isEmpty(stringExtra) || longExtra == 0) {
            c.a().a("getPackage or id is null");
            com.ss.android.socialbase.appdownloader.c.a((Activity) this);
        }
        boolean z4 = false;
        boolean booleanExtra = intent.getBooleanExtra("dl", false);
        String stringExtra2 = intent.getStringExtra("bk");
        if (booleanExtra & (!TextUtils.isEmpty(stringExtra2))) {
            h.a((Context) this, stringExtra, longExtra, stringExtra2, true);
            com.ss.android.socialbase.appdownloader.c.a((Activity) this);
            return;
        }
        int optInt = k.j().optInt("ab", 0);
        if (optInt == 1) {
            z4 = true;
        }
        h.a(this, stringExtra, longExtra, z4);
        if (optInt != 1) {
            com.ss.android.socialbase.appdownloader.c.a((Activity) this);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.ss.android.downloadlib.activity.TTDelegateActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        TraceManager.startActivityTrace(getClass().getName());
        super.onCreate(bundle);
        AppInstrumentation.onActivityCreateEnd();
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        com.ss.android.socialbase.appdownloader.c.a((Activity) this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.ss.android.downloadlib.activity.TTDelegateActivity, android.app.Activity
    public void onRestart() {
        AppInstrumentation.onActivityRestartBegin(getClass().getName());
        super.onRestart();
        AppInstrumentation.onActivityRestartEnd();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.ss.android.downloadlib.activity.TTDelegateActivity, android.app.Activity
    public void onResume() {
        AppInstrumentation.onActivityResumeBegin(getClass().getName());
        super.onResume();
        AppInstrumentation.onActivityResumeEnd();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.ss.android.downloadlib.activity.TTDelegateActivity, android.app.Activity
    public void onStart() {
        AppInstrumentation.onActivityStartBegin(getClass().getName());
        super.onStart();
        AppInstrumentation.onActivityStartEnd();
    }
}
