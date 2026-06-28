package com.lody.virtual.client.stub;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import com.huawei.agconnect.apms.instrument.AppInstrumentation;
import com.huawei.agconnect.apms.instrument.Instrumented;
import com.huawei.agconnect.apms.instrument.TraceManager;
import com.lody.virtual.client.core.InvocationStubManager;
import com.lody.virtual.client.hook.proxies.am.HCallbackStub;
import com.lody.virtual.client.ipc.VActivityManager;
import com.lody.virtual.remote.ShadowActivityInfo;
import mirror.android.os.BaseBundle;
import mirror.android.os.BundleICS;

/* loaded from: classes3.dex */
public abstract class ShadowActivity extends Activity {

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P0 extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P0_Land extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P1 extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P10 extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P10_Land extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P11 extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P11_Land extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P12 extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P12_Land extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P13 extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P13_Land extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P14 extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P14_Land extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P15 extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P15_Land extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P16 extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P16_Land extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P17 extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P17_Land extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P18 extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P18_Land extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P19 extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P19_Land extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P1_Land extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P2 extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P20 extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P20_Land extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P21 extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P21_Land extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P22 extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P22_Land extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P23 extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P23_Land extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P24 extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P24_Land extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P25 extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P25_Land extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P26 extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P26_Land extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P27 extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P27_Land extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P28 extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P28_Land extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P29 extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P29_Land extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P2_Land extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P3 extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P30 extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P30_Land extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P31 extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P31_Land extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P32 extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P32_Land extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P33 extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P33_Land extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P34 extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P34_Land extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P35 extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P35_Land extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P36 extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P36_Land extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P37 extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P37_Land extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P38 extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P38_Land extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P39 extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P39_Land extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P3_Land extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P4 extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P40 extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P40_Land extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P41 extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P41_Land extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P42 extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P42_Land extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P43 extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P43_Land extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P44 extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P44_Land extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P45 extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P45_Land extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P46 extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P46_Land extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P47 extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P47_Land extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P48 extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P48_Land extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P49 extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P49_Land extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P4_Land extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P5 extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P50 extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P50_Land extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P51 extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P51_Land extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P52 extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P52_Land extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P53 extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P53_Land extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P54 extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P54_Land extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P55 extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P55_Land extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P56 extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P56_Land extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P57 extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P57_Land extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P58 extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P58_Land extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P59 extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P59_Land extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P5_Land extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P6 extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P60 extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P60_Land extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P61 extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P61_Land extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P62 extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P62_Land extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P63 extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P63_Land extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P64 extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P64_Land extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P65 extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P65_Land extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P66 extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P66_Land extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P67 extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P67_Land extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P68 extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P68_Land extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P69 extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P69_Land extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P6_Land extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P7 extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P70 extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P70_Land extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P71 extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P71_Land extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P72 extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P72_Land extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P73 extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P73_Land extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P74 extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P74_Land extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P75 extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P75_Land extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P76 extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P76_Land extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P77 extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P77_Land extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P78 extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P78_Land extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P79 extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P79_Land extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P7_Land extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P8 extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P80 extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P80_Land extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P81 extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P81_Land extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P82 extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P82_Land extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P83 extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P83_Land extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P84 extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P84_Land extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P85 extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P85_Land extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P86 extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P86_Land extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P87 extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P87_Land extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P88 extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P88_Land extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P89 extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P89_Land extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P8_Land extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P9 extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P90 extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P90_Land extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P91 extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P91_Land extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P92 extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P92_Land extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P93 extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P93_Land extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P94 extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P94_Land extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P95 extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P95_Land extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P96 extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P96_Land extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P97 extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P97_Land extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P98 extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P98_Land extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P99 extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P99_Land extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    @Instrumented
    /* loaded from: classes3.dex */
    public static class P9_Land extends ShadowActivity {
        @Override // com.lody.virtual.client.stub.ShadowActivity, android.app.Activity
        protected void onCreate(Bundle bundle) {
            TraceManager.startActivityTrace(getClass().getName());
            super.onCreate(bundle);
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

    private static void clearParcelledData(Bundle bundle) {
        Parcel parcel;
        Parcel obtain = Parcel.obtain();
        obtain.writeInt(0);
        obtain.setDataPosition(0);
        if (BaseBundle.TYPE != null) {
            parcel = BaseBundle.mParcelledData.get(bundle);
            BaseBundle.mParcelledData.set(bundle, obtain);
        } else if (BundleICS.TYPE != null) {
            parcel = BundleICS.mParcelledData.get(bundle);
            BundleICS.mParcelledData.set(bundle, obtain);
        } else {
            parcel = null;
        }
        if (parcel != null) {
            parcel.recycle();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(null);
        if (bundle != null) {
            clearParcelledData(bundle);
        }
        finish();
        Intent intent = getIntent();
        ShadowActivityInfo shadowActivityInfo = new ShadowActivityInfo(intent);
        InvocationStubManager.getInstance().checkEnv(HCallbackStub.class);
        if (shadowActivityInfo.virtualToken != null) {
            VActivityManager.get().startActivityFromHistory(intent);
        }
    }
}
