package com.huawei.hms.analytics;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import com.huawei.hmf.tasks.Task;
import com.huawei.hms.analytics.cc;
import com.huawei.hms.analytics.core.log.HiLog;
import com.huawei.hms.analytics.def;
import java.util.concurrent.CountDownLatch;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class h implements ServiceConnection {
    j hij;
    cc.lmn ijk;
    o ikl;
    Context klm;
    CountDownLatch lmn;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class klm implements com.huawei.hmf.tasks.i<s> {
        private final CountDownLatch hij;
        private final cc.lmn ijk;
        private final ServiceConnection ikl;
        private final Context klm;
        private final Task<s> lmn;

        public klm(Task<s> task, Context context, ServiceConnection serviceConnection, cc.lmn lmnVar, CountDownLatch countDownLatch) {
            this.lmn = task;
            this.klm = context;
            this.ikl = serviceConnection;
            this.ijk = lmnVar;
            this.hij = countDownLatch;
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
        
            if (r1 == false) goto L10;
         */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0050 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:18:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
        @Override // com.huawei.hmf.tasks.i
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final /* synthetic */ void onSuccess(com.huawei.hms.analytics.s r6) {
            /*
                r5 = this;
                java.lang.String r6 = "Task bindApkService onSuccess enter."
                java.lang.String r0 = "HAServiceCommander"
                com.huawei.hms.analytics.core.log.HiLog.i(r0, r6)
                com.huawei.hmf.tasks.Task<com.huawei.hms.analytics.s> r6 = r5.lmn
                java.lang.Object r6 = r6.r()
                com.huawei.hms.analytics.s r6 = (com.huawei.hms.analytics.s) r6
                android.content.Intent r6 = r6.lmn
                r1 = 0
                if (r6 == 0) goto L35
                java.lang.String r2 = "Task bindApkService success."
                com.huawei.hms.analytics.core.log.HiLog.i(r0, r2)
                android.content.Context r2 = r5.klm     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3d java.lang.IllegalArgumentException -> L43
                java.lang.String r2 = r2.getPackageName()     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3d java.lang.IllegalArgumentException -> L43
                r6.setPackage(r2)     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3d java.lang.IllegalArgumentException -> L43
                android.content.Context r2 = r5.klm     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3d java.lang.IllegalArgumentException -> L43
                android.content.ServiceConnection r3 = r5.ikl     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3d java.lang.IllegalArgumentException -> L43
                r4 = 1
                boolean r6 = r2.bindService(r6, r3, r4)     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3d java.lang.IllegalArgumentException -> L43
                if (r6 == 0) goto L33
                java.lang.String r6 = "bind service success"
                com.huawei.hms.analytics.core.log.HiLog.i(r0, r6)     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3d java.lang.IllegalArgumentException -> L43
                r1 = r4
            L33:
                if (r1 != 0) goto L4c
            L35:
                java.util.concurrent.CountDownLatch r6 = r5.hij
                r6.countDown()
                goto L4c
            L3b:
                r6 = move-exception
                goto L46
            L3d:
                java.lang.String r6 = "bindService exception"
            L3f:
                com.huawei.hms.analytics.core.log.HiLog.w(r0, r6)     // Catch: java.lang.Throwable -> L3b
                goto L35
            L43:
                java.lang.String r6 = "setPackage IllegalArgumentException"
                goto L3f
            L46:
                java.util.concurrent.CountDownLatch r0 = r5.hij
                r0.countDown()
                throw r6
            L4c:
                com.huawei.hms.analytics.cc$lmn r6 = r5.ijk
                if (r6 == 0) goto L57
                if (r1 != 0) goto L57
                java.lang.String r0 = "1"
                r6.lmn(r0)
            L57:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.analytics.h.klm.onSuccess(java.lang.Object):void");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class lmn implements com.huawei.hmf.tasks.h {
        CountDownLatch klm;
        cc.lmn lmn;

        public lmn(cc.lmn lmnVar, CountDownLatch countDownLatch) {
            this.lmn = lmnVar;
            this.klm = countDownLatch;
        }

        @Override // com.huawei.hmf.tasks.h
        public final void onFailure(Exception exc) {
            HiLog.e("HAServiceCommander", "Task bindApkService fail." + exc.getMessage());
            cc.lmn lmnVar = this.lmn;
            if (lmnVar != null) {
                lmnVar.lmn("1");
            }
            this.klm.countDown();
        }
    }

    public h(Context context, bh bhVar, cc.lmn lmnVar) {
        this.klm = context;
        this.hij = new j(bhVar);
        this.ikl = new o(context);
        this.ijk = lmnVar;
    }

    private static String lmn(at atVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("_restriction_enabled", atVar.efg);
            jSONObject.put("_restriction_shared", atVar.def);
            jSONObject.put("_region", atVar.f8152n.lmn("_openness_config_tag"));
            return jSONObject.toString();
        } catch (JSONException unused) {
            return "";
        }
    }

    public final void lmn() {
        HiLog.i("HAServiceCommander", "unBindService is running");
        if (ar.lmn().lmn.abc) {
            this.klm.unbindService(this);
            ar.lmn().lmn.abc = false;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        HiLog.e("HAServiceCommander", "onBindingDied");
        ar.lmn().lmn.abc = false;
    }

    @Override // android.content.ServiceConnection
    public final void onNullBinding(ComponentName componentName) {
        cc.lmn lmnVar = this.ijk;
        if (lmnVar != null) {
            lmnVar.lmn("1");
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        HiLog.i("HAServiceCommander", "onServiceConnected");
        cc.lmn lmnVar = this.ijk;
        if (lmnVar != null) {
            lmnVar.lmn();
        }
        at atVar = ar.lmn().lmn;
        atVar.abc = true;
        try {
            try {
                def lmn2 = def.lmn.lmn(iBinder);
                atVar.f8140b = lmn2;
                UploadInfo uploadInfo = new UploadInfo();
                uploadInfo.lmn = atVar.ghi.getPackageName();
                uploadInfo.klm = cy.lmn().klm();
                uploadInfo.ikl = atVar.f8152n.klm;
                uploadInfo.ijk = lmn(atVar);
                ay ayVar = atVar.f8152n;
                uploadInfo.lmn(ayVar.lmn.get(ayVar.lmn("_openness_config_tag")));
                if (TextUtils.isEmpty(uploadInfo.klm) || TextUtils.isEmpty(uploadInfo.lmn)) {
                    HiLog.w("HAServiceCommander", "Upload info is not correct");
                } else {
                    HiLog.i("HAServiceCommander", "Upload info is correct");
                    lmn2.lmn(this.hij, uploadInfo);
                }
            } finally {
                this.lmn.countDown();
            }
        } catch (RemoteException unused) {
            HiLog.e("HAServiceCommander", "registerCallback RemoteException");
        } catch (Throwable th) {
            HiLog.e("HAServiceCommander", "registerCallback error");
            di.lmn(th);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        HiLog.e("HAServiceCommander", "onServiceDisconnected");
        ar.lmn().lmn.abc = false;
        cc.lmn lmnVar = this.ijk;
        if (lmnVar != null) {
            lmnVar.lmn("2");
        }
    }
}
