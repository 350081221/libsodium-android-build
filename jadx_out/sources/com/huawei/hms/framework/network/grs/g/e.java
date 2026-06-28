package com.huawei.hms.framework.network.grs.g;

import android.content.Context;
import com.huawei.hms.framework.common.ExceptionCode;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.huawei.hms.framework.common.hianalytics.HianalyticsHelper;
import com.huawei.hms.framework.common.hianalytics.LinkedHashMapPack;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import org.apache.http.cookie.ClientCookie;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class e {

    /* loaded from: classes3.dex */
    static class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f8478a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ArrayList f8479b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ JSONArray f8480c;

        a(long j5, ArrayList arrayList, JSONArray jSONArray) {
            this.f8478a = j5;
            this.f8479b = arrayList;
            this.f8480c = jSONArray;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z4;
            com.huawei.hms.framework.network.grs.g.k.a aVar = new com.huawei.hms.framework.network.grs.g.k.a();
            aVar.put("total_time", this.f8478a);
            Iterator it = this.f8479b.iterator();
            while (it.hasNext()) {
                d dVar = (d) it.next();
                if (dVar.o() || dVar.m()) {
                    aVar.put(e.b(dVar));
                    it.remove();
                    z4 = true;
                    break;
                }
            }
            z4 = false;
            if (!z4 && this.f8479b.size() > 0) {
                ArrayList arrayList = this.f8479b;
                d dVar2 = (d) arrayList.get(arrayList.size() - 1);
                aVar.put(e.b(dVar2));
                this.f8479b.remove(dVar2);
            }
            if (this.f8479b.size() > 0) {
                Iterator it2 = this.f8479b.iterator();
                while (it2.hasNext()) {
                    this.f8480c.put(new JSONObject(e.b((d) it2.next())));
                }
            }
            if (this.f8480c.length() > 0) {
                aVar.put("failed_info", this.f8480c.toString());
            }
            Logger.d("HaReportHelper", "grssdk report data to aiops is: %s", new JSONObject(aVar.get()));
            HianalyticsHelper.getInstance().onEvent(aVar.get(), "grs_request");
        }
    }

    public static void a(ArrayList<d> arrayList, long j5, JSONArray jSONArray, Context context) {
        if (context == null || arrayList == null || arrayList.size() <= 0 || !HianalyticsHelper.getInstance().isEnableReportNoSeed(context)) {
            return;
        }
        HianalyticsHelper.getInstance().getReportExecutor().submit(new a(j5, arrayList, jSONArray));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static LinkedHashMap<String, String> b(d dVar) {
        LinkedHashMapPack linkedHashMapPack = new LinkedHashMapPack();
        Exception d5 = dVar.d();
        if (d5 != null) {
            linkedHashMapPack.put("error_code", ExceptionCode.getErrorCodeFromException(d5));
            linkedHashMapPack.put(CrashHianalyticsData.EXCEPTION_NAME, d5.getClass().getSimpleName());
            linkedHashMapPack.put(CrashHianalyticsData.MESSAGE, StringUtils.anonymizeMessage(d5.getMessage()));
        } else {
            linkedHashMapPack.put("error_code", dVar.b());
            linkedHashMapPack.put(CrashHianalyticsData.EXCEPTION_NAME, dVar.c());
        }
        try {
            linkedHashMapPack.put(ClientCookie.DOMAIN_ATTR, new URL(dVar.l()).getHost());
        } catch (MalformedURLException e5) {
            Logger.w("HaReportHelper", "report host MalformedURLException", e5);
        }
        linkedHashMapPack.put("req_start_time", dVar.h());
        linkedHashMapPack.put("req_end_time", dVar.g());
        linkedHashMapPack.put("req_total_time", dVar.i());
        return linkedHashMapPack.getAll();
    }
}
