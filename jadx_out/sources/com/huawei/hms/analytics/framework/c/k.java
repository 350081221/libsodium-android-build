package com.huawei.hms.analytics.framework.c;

import android.text.TextUtils;
import com.huawei.hms.analytics.core.log.HiLog;
import com.huawei.hms.analytics.core.storage.Event;
import com.huawei.hms.analytics.framework.config.ICallback;
import java.util.List;

/* loaded from: classes3.dex */
public final class k implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    String f8265a;

    /* renamed from: b, reason: collision with root package name */
    String f8266b;

    /* renamed from: c, reason: collision with root package name */
    List<Event> f8267c;

    /* renamed from: d, reason: collision with root package name */
    ICallback f8268d;

    public k(String str, String str2, List<Event> list, ICallback iCallback) {
        this.f8265a = str;
        this.f8266b = str2;
        this.f8267c = list;
        this.f8268d = iCallback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List<Event> a5;
        com.huawei.hms.analytics.framework.c.a.a aVar = new com.huawei.hms.analytics.framework.c.a.a();
        aVar.f8228e = true;
        aVar.f8224a = this.f8265a;
        aVar.f8225b = this.f8266b;
        aVar.f8226c = com.huawei.hms.analytics.framework.b.b.a().a(this.f8265a).getRegion();
        if (!this.f8268d.isStopEvent() && (a5 = c.a(this.f8265a, this.f8266b, true)) != null) {
            if (this.f8267c.size() <= 1) {
                String pushEvtFlag = this.f8267c.get(0).getPushEvtFlag();
                if (!TextUtils.isEmpty(pushEvtFlag)) {
                    for (Event event : a5) {
                        if (!pushEvtFlag.equals(event.getPushEvtFlag())) {
                            this.f8267c.add(event);
                        }
                    }
                }
            }
            this.f8267c.addAll(a5);
        }
        j jVar = new j(this.f8267c, aVar, this.f8268d);
        if (jVar.b()) {
            jVar.a(false, "");
            try {
                jVar.c();
                return;
            } catch (IllegalArgumentException e5) {
                HiLog.e("ReportAssignment", e5.getMessage());
            }
        }
        jVar.a(System.currentTimeMillis());
    }
}
