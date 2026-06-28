package com.lody.virtual.client.stub;

import android.app.Activity;
import com.huawei.agconnect.apms.instrument.AppInstrumentation;
import com.huawei.agconnect.apms.instrument.Instrumented;

@Instrumented
/* loaded from: classes3.dex */
public class ShortcutHandleActivity extends Activity {
    /* JADX WARN: Removed duplicated region for block: B:12:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onCreate(android.os.Bundle r5) {
        /*
            r4 = this;
            java.lang.Class r0 = r4.getClass()
            java.lang.String r0 = r0.getName()
            com.huawei.agconnect.apms.instrument.TraceManager.startActivityTrace(r0)
            super.onCreate(r5)
            r4.finish()
            android.content.Intent r5 = r4.getIntent()
            if (r5 != 0) goto L1b
            com.huawei.agconnect.apms.instrument.AppInstrumentation.onActivityCreateEnd()
            return
        L1b:
            java.lang.String r0 = "_VA_|_user_id_"
            r1 = 0
            int r0 = r5.getIntExtra(r0, r1)
            java.lang.String r2 = "_VA_|_splash_"
            java.lang.String r2 = r5.getStringExtra(r2)
            java.lang.String r3 = "_VA_|_uri_"
            java.lang.String r5 = r5.getStringExtra(r3)
            r3 = 0
            if (r2 == 0) goto L3a
            android.content.Intent r2 = android.content.Intent.parseUri(r2, r1)     // Catch: java.net.URISyntaxException -> L36
            goto L3b
        L36:
            r2 = move-exception
            r2.printStackTrace()
        L3a:
            r2 = r3
        L3b:
            if (r5 == 0) goto L46
            android.content.Intent r5 = android.content.Intent.parseUri(r5, r1)     // Catch: java.net.URISyntaxException -> L42
            goto L47
        L42:
            r5 = move-exception
            r5.printStackTrace()
        L46:
            r5 = r3
        L47:
            if (r5 != 0) goto L4d
            com.huawei.agconnect.apms.instrument.AppInstrumentation.onActivityCreateEnd()
            return
        L4d:
            r5.setSelector(r3)
            if (r2 != 0) goto L5f
            com.lody.virtual.client.ipc.VActivityManager r1 = com.lody.virtual.client.ipc.VActivityManager.get()     // Catch: java.lang.Throwable -> L5a
            r1.startActivity(r5, r0)     // Catch: java.lang.Throwable -> L5a
            goto L6c
        L5a:
            r5 = move-exception
            r5.printStackTrace()
            goto L6c
        L5f:
            java.lang.String r1 = "android.intent.extra.INTENT"
            r2.putExtra(r1, r5)
            java.lang.String r5 = "android.intent.extra.CC"
            r2.putExtra(r5, r0)
            r4.startActivity(r2)
        L6c:
            com.huawei.agconnect.apms.instrument.AppInstrumentation.onActivityCreateEnd()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lody.virtual.client.stub.ShortcutHandleActivity.onCreate(android.os.Bundle):void");
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
