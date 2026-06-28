package com.huawei.hms.analytics.framework.c;

import com.huawei.hms.analytics.core.log.HiLog;
import com.huawei.hms.analytics.core.storage.Event;
import com.huawei.hms.analytics.core.storage.IStorageHandler;
import com.huawei.hms.analytics.framework.SyncManager;
import com.huawei.hms.analytics.framework.config.ICallback;
import com.huawei.hms.analytics.framework.policy.IStoragePolicy;
import com.tendcloud.tenddata.ab;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class d implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public boolean f8245a;

    /* renamed from: b, reason: collision with root package name */
    public ICallback f8246b;

    /* renamed from: c, reason: collision with root package name */
    private String f8247c;

    /* renamed from: d, reason: collision with root package name */
    private String f8248d;

    /* renamed from: e, reason: collision with root package name */
    private long f8249e;

    /* renamed from: f, reason: collision with root package name */
    private List<JSONObject> f8250f;

    /* renamed from: g, reason: collision with root package name */
    private String f8251g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f8252h;

    /* renamed from: i, reason: collision with root package name */
    private List<Event> f8253i;

    public d(String str, String str2, List<JSONObject> list) {
        this(str, str2, list, 0L);
    }

    public d(String str, String str2, List<JSONObject> list, long j5) {
        this.f8247c = str;
        this.f8249e = j5 == 0 ? System.currentTimeMillis() : j5;
        if (list != null) {
            this.f8250f = new ArrayList(list);
        }
        this.f8248d = str2;
        if ("oper".equals(str2) && com.huawei.hms.analytics.framework.b.b.a().a(str).isEnableSession("oper")) {
            com.huawei.hms.analytics.framework.e.b a5 = com.huawei.hms.analytics.framework.e.a.a().a(str, this.f8249e);
            this.f8251g = a5.a();
            this.f8252h = a5.b();
        }
    }

    public d(List<Event> list) {
        if (list == null || list.size() <= 0) {
            return;
        }
        ArrayList arrayList = new ArrayList(list);
        this.f8253i = arrayList;
        this.f8247c = ((Event) arrayList.get(0)).getServiceTag();
        this.f8248d = this.f8253i.get(0).getEvtType();
    }

    private void a() {
        com.huawei.hms.analytics.framework.b.c b5 = com.huawei.hms.analytics.framework.b.b.a().b(this.f8247c);
        if (b5 == null) {
            HiLog.w("RecordMission", "get framework config info error");
            return;
        }
        long a5 = b5.a(this.f8248d);
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - a5 <= ab.aa) {
            HiLog.w("RecordMission", "autoReport timeout. interval < 30s ");
            return;
        }
        HiLog.d("RecordMission", "begin to auto report!");
        b5.a(this.f8248d, currentTimeMillis);
        com.huawei.hms.analytics.framework.f.a.b().a(new h(this.f8247c, this.f8248d, this.f8246b));
    }

    private void a(List<Event> list) {
        IStorageHandler a5 = com.huawei.hms.analytics.framework.a.a.a(this.f8247c);
        IStoragePolicy b5 = com.huawei.hms.analytics.framework.a.a.b(this.f8247c);
        if (a5 == null || b5 == null) {
            HiLog.e("RecordMission", "storageHandler is null!");
            return;
        }
        if (b5.decide(IStoragePolicy.PolicyType.STORAGELENGTH, "userEvent.db")) {
            HiLog.e("RecordMission", "db file reach max limited length,clear db file");
            a5.deleteAll();
            a5.insertEx(list);
            return;
        }
        long count = a5.count(this.f8247c);
        if (count == 0) {
            a5.insertEx(list);
            HiLog.d("RecordMission", "record event size: 1");
            return;
        }
        if (count > 5000) {
            HiLog.e("RecordMission", "db file reach max limited size,clear db file");
            a5.deleteByTag(this.f8247c);
            a5.insertEx(list);
            return;
        }
        a5.insertEx(list);
        long count2 = a5.count(this.f8247c);
        HiLog.i("RecordMission", "record evt size : ".concat(String.valueOf(count2)));
        if (b5.decide(IStoragePolicy.PolicyType.STORAGESIZE, count2) && b5.decide(IStoragePolicy.PolicyType.NETWORK, "")) {
            HiLog.i("RecordMission", "ready to auto report!");
            a();
        }
    }

    public final void a(List<Event> list, JSONObject jSONObject) {
        String str = (String) jSONObject.remove("^eventId");
        String str2 = (String) jSONObject.remove("^id");
        String str3 = (String) jSONObject.remove("^pid");
        Object remove = jSONObject.remove("f");
        Event event = new Event();
        event.setServiceTag(this.f8247c);
        event.setEvtType(this.f8248d);
        event.setEvtId(str);
        event.setEvtTime(String.valueOf(this.f8249e));
        event.setSessionid(String.valueOf(this.f8252h));
        event.setSessionName(this.f8251g);
        event.setAssociationid(str2);
        event.setPid(str3);
        if (remove != null) {
            event.setPushEvtFlag((String) remove);
        }
        String jSONObject2 = jSONObject.toString();
        if (!this.f8245a) {
            jSONObject2 = b.a(jSONObject2);
        }
        event.setContent(jSONObject2);
        list.add(event);
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            SyncManager.getInstance().await(SyncManager.TaskNames.REGION_CHANGE, 2000L);
            SyncManager.getInstance().await(SyncManager.TaskNames.AAID_TASK, 2000L);
        } catch (InterruptedException unused) {
            HiLog.e("RecordMission", "wait sync error");
        }
        ICallback iCallback = this.f8246b;
        if (iCallback != null) {
            String str = this.f8247c;
            List<Event> list = this.f8253i;
            boolean z4 = false;
            if (list != null) {
                for (Event event : list) {
                    if (event.getEvtId().equals("$AppFirstOpen") || event.getEvtId().equals("$LaunchApp")) {
                        break;
                    }
                }
            }
            List<JSONObject> list2 = this.f8250f;
            if (list2 != null) {
                for (JSONObject jSONObject : list2) {
                    if ("$AppFirstOpen".equals(jSONObject.optString("^eventId")) || "$LaunchApp".equals(jSONObject.optString("^eventId"))) {
                        break;
                    }
                }
            }
            z4 = true;
            if (iCallback.isAAIDChanged(str, z4)) {
                HiLog.i("RecordMission", "aaid changed");
            }
        }
        List<Event> list3 = this.f8253i;
        if (list3 != null) {
            for (Event event2 : list3) {
                event2.setContent(b.a(event2.getContent()));
            }
            a(list3);
            return;
        }
        if (this.f8250f == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<JSONObject> it = this.f8250f.iterator();
        while (it.hasNext()) {
            a(arrayList, it.next());
        }
        if (arrayList.size() == 0) {
            return;
        }
        if (this.f8245a) {
            com.huawei.hms.analytics.framework.f.a.b().a(new k(this.f8247c, this.f8248d, arrayList, this.f8246b));
        } else {
            a(arrayList);
        }
    }
}
