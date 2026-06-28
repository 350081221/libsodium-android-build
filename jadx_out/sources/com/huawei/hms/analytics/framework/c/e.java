package com.huawei.hms.analytics.framework.c;

import com.huawei.hms.analytics.core.log.HiLog;
import com.huawei.hms.analytics.core.storage.Event;
import com.huawei.hms.analytics.framework.config.ICallback;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class e extends a {
    public e(List<Event> list, com.huawei.hms.analytics.framework.c.a.a aVar, ICallback iCallback) {
        super(list, aVar, iCallback);
    }

    private void e() {
        long b5 = a.b(this.f8218a.size());
        this.f8221d.f8228e = false;
        this.f8219b.setStopEventReport(false);
        for (int i5 = 0; i5 < b5; i5++) {
            try {
                a(a(i5 * 300));
            } catch (IllegalArgumentException e5) {
                HiLog.w("regionProcess", e5.getMessage());
            }
        }
    }

    public final void d() {
        if (b()) {
            a(true, this.f8221d.f8226c);
            try {
                Event a5 = a();
                if (a5 != null) {
                    ArrayList arrayList = new ArrayList(1);
                    arrayList.add(a5);
                    this.f8221d.f8228e = true;
                    this.f8219b.setStopEventReport(true);
                    a(arrayList);
                }
                e();
            } catch (IllegalArgumentException e5) {
                HiLog.e("regionProcess", e5.getMessage());
            }
        }
    }
}
