package com.huawei.hms.analytics.framework.c.a;

import androidx.core.app.NotificationCompat;
import com.huawei.hms.analytics.core.crypto.AesCipher;
import com.huawei.hms.analytics.core.log.HiLog;
import com.huawei.hms.analytics.core.storage.Event;
import com.huawei.hms.analytics.core.storage.IStorageHandler;
import com.huawei.hms.analytics.framework.config.DeviceAttributeCollector;
import com.huawei.hms.analytics.framework.config.EvtHeaderAttributeCollector;
import com.huawei.hms.analytics.framework.config.ICollectorConfig;
import com.huawei.hms.analytics.framework.config.RomAttributeCollector;
import com.umeng.analytics.pro.d;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final Charset f8236a = Charset.forName("UTF-8");

    /* renamed from: b, reason: collision with root package name */
    private DeviceAttributeCollector f8237b;

    /* renamed from: c, reason: collision with root package name */
    private EvtHeaderAttributeCollector f8238c;

    /* renamed from: d, reason: collision with root package name */
    private RomAttributeCollector f8239d;

    /* renamed from: e, reason: collision with root package name */
    private String f8240e;

    /* renamed from: f, reason: collision with root package name */
    private String f8241f;

    /* renamed from: g, reason: collision with root package name */
    private List<Event> f8242g;

    /* renamed from: h, reason: collision with root package name */
    private ICollectorConfig f8243h;

    public c(DeviceAttributeCollector deviceAttributeCollector, EvtHeaderAttributeCollector evtHeaderAttributeCollector, RomAttributeCollector romAttributeCollector, String str, String str2) {
        this.f8237b = deviceAttributeCollector;
        this.f8238c = evtHeaderAttributeCollector;
        this.f8239d = romAttributeCollector;
        this.f8241f = str;
        this.f8240e = str2;
        this.f8243h = com.huawei.hms.analytics.framework.b.b.a().a(str2);
    }

    private void a(JSONArray jSONArray, Event event, boolean z4) {
        String content = event.getContent();
        if (!z4) {
            content = com.huawei.hms.analytics.framework.c.b.a(content, com.huawei.hms.analytics.framework.b.b.a().f8206a);
        }
        event.setContent(content);
        JSONObject json = event.toJson();
        if (json != null) {
            jSONArray.put(json);
            return;
        }
        if (this.f8242g == null) {
            this.f8242g = new ArrayList();
        }
        this.f8242g.add(event);
        HiLog.w("UploadEvtBean", "custom event is empty,delete this event");
    }

    public final JSONObject a(List<Event> list, boolean z4) {
        IStorageHandler a5;
        if (list == null || list.size() == 0) {
            HiLog.w("UploadEvtBean", "Not have actionEvent to send");
            return null;
        }
        if (this.f8238c == null || this.f8237b == null || this.f8239d == null) {
            HiLog.w("UploadEvtBean", "one attributeModel is null");
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject doCollector = this.f8238c.doCollector();
        if (doCollector == null) {
            HiLog.w("UploadEvtBean", "headerJson is null");
            return null;
        }
        jSONObject.put("header", doCollector);
        JSONObject jSONObject2 = new JSONObject();
        JSONObject doCollector2 = this.f8237b.doCollector();
        doCollector2.put("properties", this.f8239d.doCollector());
        jSONObject2.put("events_common", doCollector2);
        JSONArray jSONArray = new JSONArray();
        for (Event event : list) {
            if (!"$AppPushToken".equals(event.getEvtId()) || !this.f8243h.isDebugModel()) {
                try {
                    a(jSONArray, event.m6432clone(), z4);
                } catch (CloneNotSupportedException unused) {
                    HiLog.w("UploadEvtBean", "CloneNotSupportedException");
                    a(jSONArray, event, z4);
                }
            }
        }
        List<Event> list2 = this.f8242g;
        if (list2 != null && list2.size() > 0 && (a5 = com.huawei.hms.analytics.framework.a.a.a(this.f8240e)) != null) {
            a5.deleteEvents(this.f8242g);
        }
        if (jSONArray.length() == 0) {
            HiLog.i("UploadEvtBean", "send data is empty");
            return null;
        }
        jSONObject2.put(d.ax, jSONArray);
        jSONObject.put(NotificationCompat.CATEGORY_EVENT, AesCipher.encryptCbc(com.huawei.hms.analytics.framework.g.a.a(jSONObject2.toString().getBytes(f8236a)), this.f8241f));
        return jSONObject;
    }
}
