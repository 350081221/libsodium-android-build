package com.huawei.hms.analytics.framework.c;

import com.huawei.hms.analytics.core.log.HiLog;
import com.huawei.hms.analytics.core.storage.Event;
import com.huawei.hms.analytics.core.storage.IStorageHandler;
import com.huawei.hms.analytics.framework.SyncManager;
import com.huawei.hms.analytics.framework.config.ICallback;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final com.huawei.hms.analytics.framework.c.a.a f8254a;

    /* renamed from: b, reason: collision with root package name */
    private final ICallback f8255b;

    /* renamed from: c, reason: collision with root package name */
    private List<JSONObject> f8256c;

    public f(com.huawei.hms.analytics.framework.c.a.a aVar, ICallback iCallback) {
        this.f8254a = aVar;
        this.f8255b = iCallback;
    }

    public f(com.huawei.hms.analytics.framework.c.a.a aVar, List<JSONObject> list, ICallback iCallback) {
        this.f8254a = aVar;
        this.f8256c = list;
        this.f8255b = iCallback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List<Event> list;
        List<JSONObject> list2 = this.f8256c;
        if (list2 == null || list2.size() <= 0) {
            String str = this.f8254a.f8224a;
            IStorageHandler a5 = com.huawei.hms.analytics.framework.a.a.a(str);
            if (a5 != null) {
                list = a5.readEvents(str);
                if (list == null || list.size() == 0) {
                    HiLog.i("regionReport", "no have last region data. tag: " + this.f8254a.f8224a);
                } else {
                    a5.deleteByTag(str);
                }
            }
            list = null;
        } else {
            long currentTimeMillis = System.currentTimeMillis();
            com.huawei.hms.analytics.framework.e.b a6 = com.huawei.hms.analytics.framework.e.a.a().a(this.f8254a.f8224a, currentTimeMillis);
            String a7 = a6.a();
            boolean b5 = a6.b();
            list = new ArrayList<>();
            for (JSONObject jSONObject : this.f8256c) {
                String str2 = (String) jSONObject.remove("^eventId");
                String str3 = (String) jSONObject.remove("^id");
                String str4 = (String) jSONObject.remove("^pid");
                Event event = new Event();
                event.setServiceTag(this.f8254a.f8224a);
                event.setEvtType(this.f8254a.f8225b);
                event.setEvtId(str2);
                event.setEvtTime(String.valueOf(currentTimeMillis));
                event.setSessionid(String.valueOf(b5));
                event.setSessionName(a7);
                event.setAssociationid(str3);
                event.setPid(str4);
                event.setContent(jSONObject.toString());
                list.add(event);
            }
        }
        SyncManager.getInstance().countDown(SyncManager.TaskNames.REGION_CHANGE);
        if (list != null) {
            new e(list, this.f8254a, this.f8255b).d();
            return;
        }
        com.huawei.hms.analytics.framework.c.a.a aVar = this.f8254a;
        com.huawei.hms.analytics.framework.b.b.a().a(aVar.f8224a).serviceListener(true, aVar.f8226c);
    }
}
