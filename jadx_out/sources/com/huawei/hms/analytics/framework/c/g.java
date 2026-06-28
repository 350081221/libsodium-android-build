package com.huawei.hms.analytics.framework.c;

import com.huawei.hms.analytics.core.log.HiLog;
import com.huawei.hms.analytics.core.storage.Event;
import com.huawei.hms.analytics.core.storage.IStorageHandler;
import com.huawei.hms.analytics.framework.config.ICallback;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class g extends a {
    public g(com.huawei.hms.analytics.framework.c.a.a aVar, ICallback iCallback) {
        super(null, aVar, iCallback);
    }

    private void e() {
        this.f8221d.f8228e = false;
        this.f8219b.setStopEventReport(false);
        long b5 = a.b(this.f8220c.count(this.f8221d.f8224a));
        for (int i5 = 0; i5 < b5; i5++) {
            IStorageHandler iStorageHandler = this.f8220c;
            com.huawei.hms.analytics.framework.c.a.a aVar = this.f8221d;
            List<Event> readEvents = iStorageHandler.readEvents(aVar.f8224a, aVar.f8225b, 300);
            a(readEvents, true);
            a(readEvents);
        }
    }

    public final void d() {
        if (b()) {
            a(false, "");
            try {
                Event a5 = a();
                if (a5 != null) {
                    ArrayList arrayList = new ArrayList(1);
                    arrayList.add(a5);
                    this.f8221d.f8228e = true;
                    this.f8219b.setStopEventReport(true);
                    a(arrayList);
                }
            } catch (IllegalArgumentException e5) {
                HiLog.e("ReportAssignment", e5.getMessage());
                a(System.currentTimeMillis());
            }
            try {
                if (this.f8220c == null) {
                    return;
                }
                e();
            } catch (Exception unused) {
                HiLog.e("ReportAssignment", "upload data failed.");
            }
        }
    }
}
