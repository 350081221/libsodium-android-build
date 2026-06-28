package com.lody.virtual.client.stub;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ImageView;
import com.huawei.agconnect.apms.instrument.AppInstrumentation;
import com.huawei.agconnect.apms.instrument.Instrumented;
import com.huawei.agconnect.apms.instrument.TraceManager;
import com.lody.virtual.R;
import com.lody.virtual.client.core.VirtualCore;
import com.lody.virtual.helper.utils.VLog;
import com.lody.virtual.server.pm.VPackageManagerService;
import mirror.RefMethod;
import mirror.android.graphics.drawable.LayerDrawable;

@Instrumented
/* loaded from: classes3.dex */
public class WindowPreviewActivity extends Activity {
    private long startTime;

    private boolean isDrawableBroken(Drawable drawable) {
        RefMethod<Boolean> refMethod;
        if (!LayerDrawable.TYPE.isInstance(drawable) || (refMethod = LayerDrawable.isProjected) == null) {
            return false;
        }
        try {
            refMethod.callWithException(drawable, new Object[0]);
            return false;
        } catch (Throwable th) {
            VLog.e("WindowPreviewActivity", "Bad preview background!", th);
            return true;
        }
    }

    public static void previewActivity(int i5, ActivityInfo activityInfo) {
        Context context = VirtualCore.get().getContext();
        Intent intent = new Intent(context, (Class<?>) WindowPreviewActivity.class);
        try {
            boolean isFixedOrientationLandscape = StubManifest.isFixedOrientationLandscape(activityInfo);
            VLog.d(VLog.TAG_DEFAULT, "previewActivity isFixedOrientationLandscape:" + isFixedOrientationLandscape + ",info:" + activityInfo, new Object[0]);
            if (isFixedOrientationLandscape) {
                intent = new Intent(context, (Class<?>) WindowPreviewActivity_Land.class);
            }
        } catch (Exception e5) {
            e5.printStackTrace();
        }
        intent.putExtra("_VA_|user_id", i5);
        intent.putExtra("_VA_|activity_info", activityInfo);
        intent.addFlags(268435456);
        intent.addFlags(65536);
        context.startActivity(intent);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0075 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean showAppPreview1(android.content.pm.ActivityInfo r6) {
        /*
            r5 = this;
            int r0 = r6.theme
            if (r0 != 0) goto L8
            android.content.pm.ApplicationInfo r0 = r6.applicationInfo
            int r0 = r0.theme
        L8:
            com.lody.virtual.server.am.AttributeCache r1 = com.lody.virtual.server.am.AttributeCache.instance()
            java.lang.String r2 = r6.packageName
            mirror.RefStaticObject<int[]> r3 = mirror.com.android.internal.R_Hide.styleable.Window
            java.lang.Object r3 = r3.get()
            int[] r3 = (int[]) r3
            com.lody.virtual.server.am.AttributeCache$Entry r0 = r1.get(r2, r0, r3)
            r1 = 0
            if (r0 != 0) goto L1e
            return r1
        L1e:
            android.content.res.TypedArray r2 = r0.array
            mirror.RefStaticInt r3 = mirror.com.android.internal.R_Hide.styleable.Window_windowFullscreen
            int r3 = r3.get()
            boolean r2 = r2.getBoolean(r3, r1)
            android.content.res.TypedArray r3 = r0.array
            mirror.RefStaticInt r4 = mirror.com.android.internal.R_Hide.styleable.Window_windowIsTranslucent
            int r4 = r4.get()
            r3.getBoolean(r4, r1)
            android.content.res.TypedArray r3 = r0.array
            mirror.RefStaticInt r4 = mirror.com.android.internal.R_Hide.styleable.Window_windowDisablePreview
            int r4 = r4.get()
            boolean r3 = r3.getBoolean(r4, r1)
            if (r3 == 0) goto L44
            return r1
        L44:
            if (r2 == 0) goto L4f
            android.view.Window r2 = r5.getWindow()
            r3 = 1024(0x400, float:1.435E-42)
            r2.addFlags(r3)
        L4f:
            com.lody.virtual.server.am.AttributeCache r2 = com.lody.virtual.server.am.AttributeCache.instance()
            java.lang.String r3 = r6.packageName
            int r6 = r6.theme
            mirror.RefStaticObject<int[]> r4 = mirror.com.android.internal.R_Hide.styleable.View
            java.lang.Object r4 = r4.get()
            int[] r4 = (int[]) r4
            com.lody.virtual.server.am.AttributeCache$Entry r6 = r2.get(r3, r6, r4)
            if (r6 == 0) goto L72
            android.content.res.TypedArray r6 = r6.array     // Catch: java.lang.Throwable -> L72
            mirror.RefStaticInt r2 = mirror.com.android.internal.R_Hide.styleable.View_background     // Catch: java.lang.Throwable -> L72
            int r2 = r2.get()     // Catch: java.lang.Throwable -> L72
            android.graphics.drawable.Drawable r6 = r6.getDrawable(r2)     // Catch: java.lang.Throwable -> L72
            goto L73
        L72:
            r6 = 0
        L73:
            if (r6 != 0) goto L81
            android.content.res.TypedArray r0 = r0.array     // Catch: java.lang.Throwable -> L81
            mirror.RefStaticInt r2 = mirror.com.android.internal.R_Hide.styleable.Window_windowBackground     // Catch: java.lang.Throwable -> L81
            int r2 = r2.get()     // Catch: java.lang.Throwable -> L81
            android.graphics.drawable.Drawable r6 = r0.getDrawable(r2)     // Catch: java.lang.Throwable -> L81
        L81:
            if (r6 == 0) goto L92
            boolean r0 = r5.isDrawableBroken(r6)
            if (r0 != 0) goto L92
            android.view.Window r0 = r5.getWindow()
            r0.setBackgroundDrawable(r6)
            r6 = 1
            return r6
        L92:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.lody.virtual.client.stub.WindowPreviewActivity.showAppPreview1(android.content.pm.ActivityInfo):boolean");
    }

    private boolean showAppPreview2(ActivityInfo activityInfo, int i5) {
        try {
            Drawable loadIcon = VPackageManagerService.get().getPackageInfo(activityInfo.packageName, 0, i5).applicationInfo.loadIcon(VirtualCore.getPM());
            if (loadIcon == null) {
                return false;
            }
            getWindow().setContentView(R.layout.va_window_preview);
            ((ImageView) findViewById(R.id.app_icon)).setImageDrawable(loadIcon);
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.dimAmount = 0.4f;
            getWindow().setAttributes(attributes);
            getWindow().addFlags(2);
            return true;
        } catch (Throwable th) {
            th.printStackTrace();
            return false;
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        if (System.currentTimeMillis() - this.startTime > 5000) {
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        TraceManager.startActivityTrace(getClass().getName());
        this.startTime = System.currentTimeMillis();
        overridePendingTransition(0, 0);
        super.onCreate(bundle);
        Intent intent = getIntent();
        if (intent == null) {
            finish();
            AppInstrumentation.onActivityCreateEnd();
            return;
        }
        ActivityInfo activityInfo = (ActivityInfo) intent.getParcelableExtra("_VA_|activity_info");
        int intExtra = intent.getIntExtra("_VA_|user_id", -1);
        if (activityInfo != null && intExtra != -1) {
            if (!showAppPreview1(activityInfo)) {
                showAppPreview2(activityInfo, intExtra);
            }
            AppInstrumentation.onActivityCreateEnd();
        } else {
            finish();
            AppInstrumentation.onActivityCreateEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onRestart() {
        AppInstrumentation.onActivityRestartBegin(getClass().getName());
        super.onRestart();
        AppInstrumentation.onActivityRestartEnd();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onResume() {
        AppInstrumentation.onActivityResumeBegin(getClass().getName());
        super.onResume();
        AppInstrumentation.onActivityResumeEnd();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onStart() {
        AppInstrumentation.onActivityStartBegin(getClass().getName());
        super.onStart();
        AppInstrumentation.onActivityStartEnd();
    }

    @Override // android.app.Activity
    protected void onStop() {
        super.onStop();
        finish();
    }
}
