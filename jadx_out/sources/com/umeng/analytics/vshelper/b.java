package com.umeng.analytics.vshelper;

import android.app.Activity;
import android.os.Bundle;
import com.umeng.analytics.pro.bn;

/* loaded from: classes3.dex */
public class b implements bn {

    /* renamed from: a, reason: collision with root package name */
    private static final String f12820a = "RealTimeDebugSwitch";

    /* renamed from: b, reason: collision with root package name */
    private static volatile int f12821b;

    @Override // com.umeng.analytics.pro.bn
    public void a() {
    }

    @Override // com.umeng.analytics.pro.bn
    public void a(Activity activity) {
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0075  */
    @Override // com.umeng.analytics.pro.bn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(android.app.Activity r9, android.os.Bundle r10) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.vshelper.b.a(android.app.Activity, android.os.Bundle):void");
    }

    @Override // com.umeng.analytics.pro.bn
    public void b() {
    }

    @Override // com.umeng.analytics.pro.bn
    public void b(Activity activity) {
    }

    @Override // com.umeng.analytics.pro.bn
    public void b(Activity activity, Bundle bundle) {
    }

    @Override // com.umeng.analytics.pro.bn
    public void c() {
    }

    @Override // com.umeng.analytics.pro.bn
    public void c(Activity activity) {
        f12821b++;
    }

    @Override // com.umeng.analytics.pro.bn
    public void d(Activity activity) {
        f12821b--;
    }

    @Override // com.umeng.analytics.pro.bn
    public void e(Activity activity) {
    }

    public static boolean d() {
        return f12821b > 0;
    }
}
