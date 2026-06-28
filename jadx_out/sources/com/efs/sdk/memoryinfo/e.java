package com.efs.sdk.memoryinfo;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.efs.sdk.base.EfsReporter;
import com.efs.sdk.base.protocol.record.EfsJSONLog;
import com.umeng.analytics.pro.bi;
import com.umeng.commonsdk.statistics.idtracking.ImprintHandler;
import com.umeng.commonsdk.statistics.internal.UMImprintChangeCallback;
import com.umeng.commonsdk.utils.UMUtils;
import com.umeng.umcrash.UMCrash;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class e {
    final List<EfsJSONLog> B = new ArrayList();
    volatile boolean C;

    /* renamed from: a, reason: collision with root package name */
    private final EfsReporter f6738a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(final Context context, EfsReporter efsReporter) {
        this.f6738a = efsReporter;
        String uMId = UMUtils.getUMId(context);
        this.C = !TextUtils.isEmpty(uMId);
        if (!this.C) {
            ImprintHandler.getImprintService(context).registImprintCallback(bi.f12261g, new UMImprintChangeCallback() { // from class: com.efs.sdk.memoryinfo.e.1
                @Override // com.umeng.commonsdk.statistics.internal.UMImprintChangeCallback
                public final void onImprintValueChanged(String str, String str2) {
                    try {
                        if (bi.f12261g.equals(str)) {
                            HashMap hashMap = new HashMap(1);
                            hashMap.put(UMCrash.KEY_HEADER_UMID, str2);
                            e.this.f6738a.addPublicParams(hashMap);
                            synchronized (e.class) {
                                e.b(e.this);
                            }
                            Iterator it = e.this.B.iterator();
                            while (it.hasNext()) {
                                e.this.a((EfsJSONLog) it.next());
                            }
                            String str3 = "send cache:" + e.this.B.size();
                            if (a.DEBUG) {
                                Log.d("MemoryCollect", str3);
                            }
                            e.this.B.clear();
                            ImprintHandler.getImprintService(context).unregistImprintCallback(bi.f12261g, this);
                        }
                    } catch (Throwable th) {
                        f.a("umid ", th);
                    }
                }
            });
            return;
        }
        HashMap hashMap = new HashMap(1);
        hashMap.put(UMCrash.KEY_HEADER_UMID, uMId);
        efsReporter.addPublicParams(hashMap);
    }

    static /* synthetic */ boolean b(e eVar) {
        eVar.C = true;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(EfsJSONLog efsJSONLog) {
        try {
            this.f6738a.send(efsJSONLog);
        } catch (Throwable th) {
            f.a("send", th);
        }
    }
}
