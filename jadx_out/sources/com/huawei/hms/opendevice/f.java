package com.huawei.hms.opendevice;

import android.content.Context;

/* loaded from: classes3.dex */
public class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public Context f8721a;

    public f(Context context) {
        this.f8721a = context;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:34:0x008c
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
        */
    @Override // java.lang.Runnable
    public void run() {
        /*
            r9 = this;
            java.lang.String r0 = "push kit sdk not exists"
            java.lang.String r1 = "Push init failed"
            java.lang.String r2 = "AutoInit"
            com.huawei.hms.aaid.constant.ErrorEnum r3 = com.huawei.hms.aaid.constant.ErrorEnum.SUCCESS     // Catch: java.lang.Exception -> L90
            int r3 = r3.getInternalCode()     // Catch: java.lang.Exception -> L90
            r4 = 0
            android.content.Context r5 = r9.f8721a     // Catch: com.huawei.hms.common.ApiException -> L29 java.lang.Exception -> L90
            com.huawei.hms.aaid.HmsInstanceId r5 = com.huawei.hms.aaid.HmsInstanceId.getInstance(r5)     // Catch: com.huawei.hms.common.ApiException -> L29 java.lang.Exception -> L90
            android.content.Context r6 = r9.f8721a     // Catch: com.huawei.hms.common.ApiException -> L29 java.lang.Exception -> L90
            java.lang.String r6 = com.huawei.hms.utils.Util.getAppId(r6)     // Catch: com.huawei.hms.common.ApiException -> L29 java.lang.Exception -> L90
            java.lang.String r4 = r5.getToken(r6, r4)     // Catch: com.huawei.hms.common.ApiException -> L29 java.lang.Exception -> L90
            java.lang.String r5 = "Push init succeed"
            com.huawei.hms.support.log.HMSLog.i(r2, r5)     // Catch: com.huawei.hms.common.ApiException -> L29 java.lang.Exception -> L90
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch: com.huawei.hms.common.ApiException -> L29 java.lang.Exception -> L90
            if (r5 == 0) goto L31
            return
        L29:
            r3 = move-exception
            int r3 = r3.getStatusCode()     // Catch: java.lang.Exception -> L90
            com.huawei.hms.support.log.HMSLog.e(r2, r1)     // Catch: java.lang.Exception -> L90
        L31:
            android.content.Context r5 = r9.f8721a     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8c java.lang.Exception -> L90
            android.content.pm.PackageManager r5 = r5.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8c java.lang.Exception -> L90
            android.content.Context r6 = r9.f8721a     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8c java.lang.Exception -> L90
            java.lang.String r6 = r6.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8c java.lang.Exception -> L90
            r7 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r5 = r5.getApplicationInfo(r6, r7)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8c java.lang.Exception -> L90
            android.os.Bundle r5 = r5.metaData     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8c java.lang.Exception -> L90
            if (r5 == 0) goto L88
            java.lang.String r6 = "com.huawei.hms.client.service.name:push"
            java.lang.String r5 = r5.getString(r6)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8c java.lang.Exception -> L90
            if (r5 == 0) goto L88
            android.content.Intent r5 = new android.content.Intent     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8c java.lang.Exception -> L90
            java.lang.String r6 = "com.huawei.push.action.MESSAGING_EVENT"
            r5.<init>(r6)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8c java.lang.Exception -> L90
            android.content.Context r6 = r9.f8721a     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8c java.lang.Exception -> L90
            java.lang.String r6 = r6.getPackageName()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8c java.lang.Exception -> L90
            r5.setPackage(r6)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8c java.lang.Exception -> L90
            android.os.Bundle r6 = new android.os.Bundle     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8c java.lang.Exception -> L90
            r6.<init>()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8c java.lang.Exception -> L90
            java.lang.String r7 = "message_type"
            java.lang.String r8 = "new_token"
            r6.putString(r7, r8)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8c java.lang.Exception -> L90
            java.lang.String r7 = "device_token"
            r6.putString(r7, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8c java.lang.Exception -> L90
            java.lang.String r4 = "error"
            r6.putInt(r4, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8c java.lang.Exception -> L90
            com.huawei.hms.opendevice.h r3 = new com.huawei.hms.opendevice.h     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8c java.lang.Exception -> L90
            r3.<init>()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8c java.lang.Exception -> L90
            android.content.Context r4 = r9.f8721a     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8c java.lang.Exception -> L90
            boolean r3 = r3.a(r4, r6, r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8c java.lang.Exception -> L90
            if (r3 != 0) goto L94
            java.lang.String r3 = "start service failed"
            com.huawei.hms.support.log.HMSLog.e(r2, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8c java.lang.Exception -> L90
            goto L94
        L88:
            com.huawei.hms.support.log.HMSLog.i(r2, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L8c java.lang.Exception -> L90
            goto L94
        L8c:
            com.huawei.hms.support.log.HMSLog.i(r2, r0)     // Catch: java.lang.Exception -> L90
            goto L94
        L90:
            r0 = move-exception
            com.huawei.hms.support.log.HMSLog.e(r2, r1, r0)
        L94:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.opendevice.f.run():void");
    }
}
