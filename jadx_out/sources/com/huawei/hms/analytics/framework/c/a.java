package com.huawei.hms.analytics.framework.c;

import android.text.TextUtils;
import com.huawei.hms.analytics.core.crypto.RandomUtil;
import com.huawei.hms.analytics.core.crypto.RsaCipher;
import com.huawei.hms.analytics.core.log.HiLog;
import com.huawei.hms.analytics.core.storage.Event;
import com.huawei.hms.analytics.core.storage.IStorageHandler;
import com.huawei.hms.analytics.framework.config.DeviceAttributeCollector;
import com.huawei.hms.analytics.framework.config.ICallback;
import com.huawei.hms.analytics.framework.config.ICollectorConfig;
import com.huawei.hms.analytics.framework.policy.IStoragePolicy;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;

/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    protected List<Event> f8218a;

    /* renamed from: b, reason: collision with root package name */
    protected ICallback f8219b;

    /* renamed from: c, reason: collision with root package name */
    protected IStorageHandler f8220c;

    /* renamed from: d, reason: collision with root package name */
    protected com.huawei.hms.analytics.framework.c.a.a f8221d;

    /* renamed from: e, reason: collision with root package name */
    private ICollectorConfig f8222e;

    /* renamed from: f, reason: collision with root package name */
    private IStoragePolicy f8223f;

    public a(List<Event> list, com.huawei.hms.analytics.framework.c.a.a aVar, ICallback iCallback) {
        this.f8218a = list;
        this.f8219b = iCallback;
        this.f8221d = aVar;
        ICollectorConfig a5 = com.huawei.hms.analytics.framework.b.b.a().a(aVar.f8224a);
        this.f8222e = a5;
        a5.setRegion(aVar.f8226c);
        this.f8223f = com.huawei.hms.analytics.framework.a.a.b(aVar.f8224a);
        this.f8220c = com.huawei.hms.analytics.framework.a.a.a(aVar.f8224a);
    }

    private com.huawei.hms.analytics.framework.c.a.c a(String str) {
        com.huawei.hms.analytics.framework.b.e a5 = com.huawei.hms.analytics.framework.b.e.a();
        String str2 = this.f8221d.f8226c;
        com.huawei.hms.analytics.framework.b.d dVar = a5.f8217a.get(str2);
        if (dVar == null) {
            dVar = new com.huawei.hms.analytics.framework.b.d();
            com.huawei.hms.analytics.framework.b.e.a(dVar, str2);
            a5.f8217a.put(str2, dVar);
        } else {
            if (!dVar.f8214d.equals(com.huawei.hms.analytics.framework.b.e.a(str2))) {
                com.huawei.hms.analytics.framework.b.e.a(dVar, str2);
            }
            if (System.currentTimeMillis() - dVar.f8213c > 43200000) {
                String generateSecureRandomStr = RandomUtil.getInstance().generateSecureRandomStr(16);
                String encrypt = RsaCipher.encrypt(dVar.a(), generateSecureRandomStr);
                dVar.f8211a = generateSecureRandomStr;
                dVar.f8212b = encrypt;
                dVar.f8213c = System.currentTimeMillis();
            }
        }
        if (TextUtils.isEmpty(dVar.f8212b)) {
            return null;
        }
        this.f8222e.syncOaid();
        String appId = this.f8222e.getAppId();
        DeviceAttributeCollector deviceAttribute = this.f8222e.getDeviceAttribute(this.f8221d.f8225b);
        String str3 = dVar.f8212b;
        com.huawei.hms.analytics.framework.c.a.b bVar = new com.huawei.hms.analytics.framework.c.a.b();
        bVar.f8231b = appId;
        bVar.f8230a = str3;
        bVar.f8234e = str;
        bVar.f8232c = this.f8221d.f8224a;
        StringBuffer stringBuffer = new StringBuffer("hmshi");
        stringBuffer.append(this.f8221d.f8225b);
        stringBuffer.append("qrt");
        bVar.f8235f = stringBuffer.toString();
        StringBuilder sb = new StringBuilder();
        sb.append(System.currentTimeMillis());
        bVar.f8233d = sb.toString();
        return new com.huawei.hms.analytics.framework.c.a.c(deviceAttribute, this.f8222e.getEvtCustomHeader(this.f8221d.f8225b, bVar.a()), this.f8222e.getRomAttribute(this.f8221d.f8225b), dVar.f8211a, this.f8221d.f8224a);
    }

    private void a(byte[] bArr, String str, List<Event> list) {
        com.huawei.hms.analytics.framework.c.a.a aVar = this.f8221d;
        aVar.f8227d = str;
        i iVar = new i(bArr, aVar, list);
        iVar.f8261a = this.f8219b;
        iVar.run();
    }

    private static byte[] a(List<Event> list, com.huawei.hms.analytics.framework.c.a.c cVar, boolean z4) {
        String str;
        try {
            return com.huawei.hms.analytics.framework.g.a.a(cVar.a(list, z4).toString().getBytes("UTF-8"));
        } catch (UnsupportedEncodingException unused) {
            str = "sendData(): getBytes - Unsupported coding format!!";
            HiLog.w("ReportAssignment", str);
            return new byte[0];
        } catch (JSONException unused2) {
            str = "json exception";
            HiLog.w("ReportAssignment", str);
            return new byte[0];
        }
    }

    public static long b(long j5) {
        long j6 = j5 / 300;
        return j5 % 300 > 0 ? j6 + 1 : j6;
    }

    public final Event a() {
        return this.f8222e.getSpecialEvent(this.f8221d.f8225b);
    }

    public final List<Event> a(int i5) {
        List<Event> list = this.f8218a;
        List<Event> subList = list.subList(i5, Math.min(list.size(), i5 + 300));
        a(subList, false);
        return subList;
    }

    public final void a(long j5) {
        ICallback iCallback = this.f8219b;
        if (iCallback != null) {
            iCallback.onResult(-1, j5, -1, this.f8218a);
        }
    }

    public final void a(List<Event> list) {
        String generateSecureRandomStr = RandomUtil.getInstance().generateSecureRandomStr(16);
        com.huawei.hms.analytics.framework.c.a.c a5 = a(generateSecureRandomStr);
        if (a5 == null) {
            throw new IllegalArgumentException("uploadEvtModel is null");
        }
        byte[] a6 = a(list, a5, this.f8221d.f8228e);
        if (a6.length != 0) {
            a(a6, generateSecureRandomStr, list);
        } else {
            HiLog.w("ReportAssignment", "request body is empty");
            throw new IllegalArgumentException("body length is empty");
        }
    }

    public final void a(List<Event> list, boolean z4) {
        ArrayList arrayList = new ArrayList();
        Iterator<Event> it = list.iterator();
        while (it.hasNext()) {
            Event next = it.next();
            if (this.f8223f.decide(IStoragePolicy.PolicyType.STORAGECYCLY, Long.parseLong(next.getEvtTime()))) {
                arrayList.add(next);
                it.remove();
            }
        }
        if (arrayList.size() <= 0 || !z4 || this.f8220c == null) {
            return;
        }
        HiLog.d("ReportAssignment", "delete events: " + arrayList.size());
        this.f8220c.deleteEvents(arrayList);
    }

    public final void a(boolean z4, String str) {
        this.f8222e.serviceListener(z4, str);
    }

    public final boolean b() {
        return this.f8223f.decide(IStoragePolicy.PolicyType.PARAMS, this.f8221d.f8226c);
    }

    public final void c() {
        a(this.f8218a);
    }
}
