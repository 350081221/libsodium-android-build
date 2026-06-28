package com.huawei.hms.opendevice;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.agconnect.config.AGConnectServicesConfig;
import com.huawei.hms.support.log.HMSLog;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class m extends Thread {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Context f8732a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f8733b;

    public m(Context context, String str) {
        this.f8732a = context;
        this.f8733b = str;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        boolean b5;
        boolean d5;
        String c5;
        if (p.a()) {
            b5 = n.b(this.f8732a);
            if (b5) {
                return;
            }
            String a5 = o.a(this.f8732a);
            if (!TextUtils.isEmpty(a5)) {
                d5 = n.d(this.f8732a, a5, this.f8733b);
                if (!d5) {
                    HMSLog.d("ReportAaidToken", "This time need not report.");
                    return;
                }
                String string = AGConnectServicesConfig.fromContext(this.f8732a).getString("region");
                if (TextUtils.isEmpty(string)) {
                    HMSLog.i("ReportAaidToken", "The data storage region is empty.");
                    return;
                }
                String a6 = e.a(this.f8732a, "com.huawei.hms.opendevicesdk", org.slf4j.a.f22214f0, null, string);
                if (!TextUtils.isEmpty(a6)) {
                    c5 = n.c(this.f8732a, a5, this.f8733b);
                    n.b(this.f8732a, d.a(this.f8732a, a6 + "/rest/appdata/v1/aaid/report", c5, (Map<String, String>) null), a5, this.f8733b);
                    return;
                }
                return;
            }
            HMSLog.w("ReportAaidToken", "AAID is empty.");
            return;
        }
        HMSLog.d("ReportAaidToken", "Not HW Phone.");
    }
}
