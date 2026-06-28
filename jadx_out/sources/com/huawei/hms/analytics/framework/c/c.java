package com.huawei.hms.analytics.framework.c;

import com.huawei.hms.analytics.core.storage.Event;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class c {
    public static List<Event> a(String str, String str2, boolean z4) {
        long currentTimeMillis = System.currentTimeMillis();
        List<JSONObject> customEventJson = com.huawei.hms.analytics.framework.b.b.a().a(str).getCustomEventJson(currentTimeMillis);
        if (customEventJson == null || customEventJson.size() <= 0) {
            return null;
        }
        d dVar = new d(str, str2, customEventJson, currentTimeMillis);
        dVar.f8245a = z4;
        ArrayList arrayList = new ArrayList();
        Iterator<JSONObject> it = customEventJson.iterator();
        while (it.hasNext()) {
            dVar.a(arrayList, it.next());
        }
        if (arrayList.size() > 0) {
            return arrayList;
        }
        return null;
    }
}
