package com.huawei.hms.analytics.framework;

import com.huawei.hms.analytics.core.storage.Event;
import com.huawei.hms.analytics.core.storage.IStorageHandler;
import com.huawei.hms.analytics.framework.SyncManager;
import com.huawei.hms.analytics.framework.b.c;
import com.huawei.hms.analytics.framework.c.f;
import com.huawei.hms.analytics.framework.c.h;
import com.huawei.hms.analytics.framework.config.ICallback;
import com.huawei.hms.analytics.framework.e.b;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class a implements HAFrameworkInstance {

    /* renamed from: a, reason: collision with root package name */
    private String f8201a;

    public a(String str) {
        this.f8201a = str;
    }

    private com.huawei.hms.analytics.framework.c.a.a a(String str, String str2) {
        com.huawei.hms.analytics.framework.c.a.a aVar = new com.huawei.hms.analytics.framework.c.a.a();
        aVar.f8225b = str2;
        aVar.f8224a = this.f8201a;
        aVar.f8226c = str;
        aVar.f8229f = true;
        return aVar;
    }

    @Override // com.huawei.hms.analytics.framework.HAFrameworkInstance
    public final void clearCacheData(String str) {
        com.huawei.hms.analytics.framework.d.a.a().b(this.f8201a);
    }

    @Override // com.huawei.hms.analytics.framework.HAFrameworkInstance
    public final void onBackground(long j5) {
        b a5 = com.huawei.hms.analytics.framework.e.a.a().a(this.f8201a);
        a5.f8274c = true;
        a5.f8275d = j5;
    }

    @Override // com.huawei.hms.analytics.framework.HAFrameworkInstance
    public final void onEvent(String str, List<JSONObject> list, ICallback iCallback) {
        com.huawei.hms.analytics.framework.d.a.a().a(this.f8201a, str, list, iCallback);
    }

    @Override // com.huawei.hms.analytics.framework.HAFrameworkInstance
    public final void onEvent(String str, List<JSONObject> list, ICallback iCallback, long j5) {
        com.huawei.hms.analytics.framework.d.a.a().a(this.f8201a, str, list, iCallback, j5);
    }

    @Override // com.huawei.hms.analytics.framework.HAFrameworkInstance
    public final void onEvent(List<Event> list, ICallback iCallback) {
        com.huawei.hms.analytics.framework.d.a.a().a(list, iCallback);
    }

    @Override // com.huawei.hms.analytics.framework.HAFrameworkInstance
    public final void onEventRecord(String str, List<JSONObject> list, long j5) {
        com.huawei.hms.analytics.framework.d.a.a();
        com.huawei.hms.analytics.framework.d.a.a(this.f8201a, str, list, j5);
    }

    @Override // com.huawei.hms.analytics.framework.HAFrameworkInstance
    public final void onForeground(long j5) {
        b a5 = com.huawei.hms.analytics.framework.e.a.a().a(this.f8201a);
        if (a5.f8275d != 0) {
            a5.f8274c = j5 - a5.f8275d > a5.f8273b;
            a5.f8275d = 0L;
        }
    }

    @Override // com.huawei.hms.analytics.framework.HAFrameworkInstance
    public final void onReport(String str, ICallback iCallback) {
        com.huawei.hms.analytics.framework.d.a.a();
        String str2 = this.f8201a;
        if (com.huawei.hms.analytics.framework.d.a.a(str2)) {
            com.huawei.hms.analytics.framework.f.a.b().a(new h(str2, str, iCallback));
        }
    }

    @Override // com.huawei.hms.analytics.framework.HAFrameworkInstance
    public final void onReport(String str, String str2, ICallback iCallback) {
        com.huawei.hms.analytics.framework.d.a.a();
        com.huawei.hms.analytics.framework.c.a.a a5 = a(str, str2);
        if (com.huawei.hms.analytics.framework.d.a.a(a5.f8224a)) {
            SyncManager.getInstance().start(SyncManager.TaskNames.REGION_CHANGE);
            new f(a5, iCallback).run();
            return;
        }
        IStorageHandler a6 = com.huawei.hms.analytics.framework.a.a.a(a5.f8224a);
        if (a6 != null) {
            a6.deleteByTag(a5.f8224a);
            com.huawei.hms.analytics.framework.b.b.a().a(a5.f8224a).serviceListener(true, a5.f8226c);
        }
    }

    @Override // com.huawei.hms.analytics.framework.HAFrameworkInstance
    public final void onReport(String str, String str2, List<JSONObject> list, ICallback iCallback) {
        com.huawei.hms.analytics.framework.d.a.a();
        com.huawei.hms.analytics.framework.c.a.a a5 = a(str, str2);
        if (com.huawei.hms.analytics.framework.d.a.a(a5.f8224a)) {
            com.huawei.hms.analytics.framework.f.a.b().a(new f(a5, list, iCallback));
        }
    }

    @Override // com.huawei.hms.analytics.framework.HAFrameworkInstance
    public final void onStreamEvent(String str, List<JSONObject> list, ICallback iCallback) {
        com.huawei.hms.analytics.framework.d.a.a();
        com.huawei.hms.analytics.framework.d.a.b(this.f8201a, str, list, iCallback);
    }

    @Override // com.huawei.hms.analytics.framework.HAFrameworkInstance
    public final void onStreamEvent(String str, List<JSONObject> list, ICallback iCallback, long j5) {
        com.huawei.hms.analytics.framework.d.a.a();
        com.huawei.hms.analytics.framework.d.a.b(this.f8201a, str, list, iCallback, j5);
    }

    @Override // com.huawei.hms.analytics.framework.HAFrameworkInstance
    public final void setMinSessionDuration(long j5) {
        com.huawei.hms.analytics.framework.e.a.a().a(this.f8201a).f8273b = j5;
    }

    @Override // com.huawei.hms.analytics.framework.HAFrameworkInstance
    public final void setNeedRefreshSession(boolean z4) {
        c b5 = com.huawei.hms.analytics.framework.b.b.a().b(this.f8201a);
        if (b5 != null) {
            b5.f8208a = z4;
        }
    }

    @Override // com.huawei.hms.analytics.framework.HAFrameworkInstance
    public final void setSessionTimeoutDuration(long j5) {
        com.huawei.hms.analytics.framework.e.a.a().a(this.f8201a).f8272a = j5;
    }
}
