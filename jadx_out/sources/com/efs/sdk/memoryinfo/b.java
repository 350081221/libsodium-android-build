package com.efs.sdk.memoryinfo;

import android.content.Context;
import com.efs.sdk.base.EfsReporter;
import com.efs.sdk.base.protocol.record.EfsJSONLog;

/* loaded from: classes2.dex */
final class b {

    /* renamed from: a, reason: collision with root package name */
    final EfsReporter f6709a;

    /* renamed from: b, reason: collision with root package name */
    boolean f6710b = false;
    final Context mContext;

    public b(Context context, EfsReporter efsReporter) {
        this.mContext = context.getApplicationContext();
        this.f6709a = efsReporter;
    }

    static /* synthetic */ void a(b bVar, e eVar, String str) {
        c cVar = new c(bVar.mContext);
        EfsJSONLog efsJSONLog = new EfsJSONLog("memperf");
        efsJSONLog.put("w_pgid", str);
        efsJSONLog.put("crver", "0.0.4.umeng");
        efsJSONLog.put("k_st", cVar.bg);
        efsJSONLog.put("w_url", cVar.activity);
        efsJSONLog.put("wl_tpss", Long.valueOf(cVar.f6725n));
        efsJSONLog.put("wl_jpss", Long.valueOf(cVar.f6726o));
        efsJSONLog.put("wl_npss", Long.valueOf(cVar.f6727p));
        efsJSONLog.put("wl_heap", Long.valueOf(cVar.f6728q));
        efsJSONLog.put("wf_heap_used_rate", Float.valueOf(cVar.f6729r));
        efsJSONLog.put("wl_graphics", Long.valueOf(cVar.f6730s));
        efsJSONLog.put("wl_vmsize", Long.valueOf(cVar.f6731t));
        synchronized (e.class) {
            if (eVar.C) {
                eVar.a(efsJSONLog);
            } else {
                eVar.B.add(efsJSONLog);
            }
        }
    }
}
