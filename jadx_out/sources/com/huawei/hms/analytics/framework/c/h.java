package com.huawei.hms.analytics.framework.c;

import com.huawei.hms.analytics.core.log.HiLog;
import com.huawei.hms.analytics.core.storage.Event;
import com.huawei.hms.analytics.core.storage.IStorageHandler;
import com.huawei.hms.analytics.framework.config.ICallback;
import java.util.List;

/* loaded from: classes3.dex */
public final class h implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private String f8257a;

    /* renamed from: b, reason: collision with root package name */
    private String f8258b;

    /* renamed from: c, reason: collision with root package name */
    private ICallback f8259c;

    /* renamed from: d, reason: collision with root package name */
    private IStorageHandler f8260d;

    public h(String str, String str2, ICallback iCallback) {
        this.f8257a = str;
        this.f8258b = str2;
        this.f8259c = iCallback;
        this.f8260d = com.huawei.hms.analytics.framework.a.a.a(str);
    }

    @Override // java.lang.Runnable
    public final void run() {
        HiLog.d("ReportMission", "report running, serviceTag: " + this.f8257a);
        ICallback iCallback = this.f8259c;
        if (iCallback != null && iCallback.isAAIDChanged(this.f8257a, true)) {
            HiLog.i("ReportMission", "aaid changed");
            return;
        }
        if (this.f8260d == null) {
            return;
        }
        List<Event> a5 = c.a(this.f8257a, this.f8258b, false);
        if (a5 != null && a5.size() > 0) {
            this.f8260d.insertEx(a5);
        }
        com.huawei.hms.analytics.framework.c.a.a aVar = new com.huawei.hms.analytics.framework.c.a.a();
        aVar.f8224a = this.f8257a;
        aVar.f8225b = this.f8258b;
        aVar.f8226c = com.huawei.hms.analytics.framework.b.b.a().a(this.f8257a).getRegion();
        new g(aVar, this.f8259c).d();
    }
}
