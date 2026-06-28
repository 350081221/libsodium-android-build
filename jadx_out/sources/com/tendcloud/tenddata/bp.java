package com.tendcloud.tenddata;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.tendcloud.tenddata.bu;
import com.tendcloud.tenddata.zz;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.UUID;

/* loaded from: classes3.dex */
public class bp {

    /* renamed from: a, reason: collision with root package name */
    private static volatile bp f11534a;

    static {
        try {
            z.a().register(a());
        } catch (Throwable unused) {
        }
    }

    private bp() {
    }

    private final void b(HashMap<String, Object> hashMap) {
        try {
            a aVar = (a) hashMap.get("service");
            long parseLong = Long.parseLong(String.valueOf(hashMap.get("occurTime")));
            if (hashMap.containsKey("sessionEnd")) {
                a(aVar);
                return;
            }
            if (hashMap.containsKey("pageName")) {
                i.setLastActivity(String.valueOf(hashMap.get("pageName")));
            }
            b(aVar);
            i.c(parseLong, aVar);
            ab.I = null;
        } catch (Throwable unused) {
        }
    }

    public final void onTDEBEventSession(zz.a aVar) {
        HashMap<String, Object> hashMap;
        if (aVar != null && (hashMap = aVar.paraMap) != null) {
            try {
                int parseInt = Integer.parseInt(String.valueOf(hashMap.get("apiType")));
                if (parseInt == 10) {
                    a(aVar.paraMap);
                } else if (parseInt == 11) {
                    b(aVar.paraMap);
                }
            } catch (Throwable unused) {
            }
        }
    }

    private final void a(HashMap<String, Object> hashMap) {
        try {
            a aVar = (a) hashMap.get("service");
            long parseLong = Long.parseLong(String.valueOf(hashMap.get("occurTime")));
            long c5 = i.c(aVar);
            long f5 = i.f(aVar);
            if (f5 <= c5) {
                f5 = c5;
            }
            if (parseLong - f5 > ab.aa) {
                a(aVar);
                a(parseLong, aVar);
                i.setLastActivity("");
            } else {
                String a5 = i.a(aVar);
                if (a5 == null) {
                    a(parseLong, aVar);
                    i.setLastActivity("");
                } else {
                    h.iForDeveloper("[" + aVar.name() + "][Session] - Same session as before! Session id is " + a5);
                    ct.a().setSessionId(a5);
                    ct.a().setSessionStartTime(c5);
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(a aVar) {
        bu buVar = new bu();
        buVar.f11566a = aVar;
        buVar.f11567b = bu.a.IMMEDIATELY;
        z.a().post(buVar);
    }

    private void a(final a aVar) {
        try {
            String a5 = i.a(aVar);
            if (a5 == null || a5.trim().isEmpty()) {
                return;
            }
            long c5 = i.c(aVar);
            long f5 = i.f(aVar) - c5;
            if ((aVar.name().equals(GrsBaseInfo.CountryCodeSource.APP) || aVar.name().equals("APP_SQL") || aVar.name().equals("TRACKING") || aVar.name().equals("SDK")) && f5 < 500) {
                f5 = -1000;
            }
            bv bvVar = new bv();
            bvVar.f11569b = com.umeng.analytics.pro.d.aC;
            bvVar.f11570c = "end";
            TreeMap treeMap = new TreeMap();
            treeMap.put("sessionId", a5);
            treeMap.put("start", Long.valueOf(c5));
            treeMap.put("duration", Long.valueOf(f5 / 1000));
            bvVar.f11571d = treeMap;
            bvVar.f11568a = aVar;
            bvVar.f11573f = new cs() { // from class: com.tendcloud.tenddata.bp.1
                @Override // com.tendcloud.tenddata.cs
                public void onStoreFailed() {
                }

                @Override // com.tendcloud.tenddata.cs
                public void onStoreSuccess() {
                    try {
                        bp.this.b(aVar);
                    } catch (Throwable unused) {
                    }
                }
            };
            z.a().post(bvVar);
            i.a((String) null, aVar);
        } catch (Throwable unused) {
        }
    }

    private void a(long j5, final a aVar) {
        try {
            h.iForDeveloper("[" + aVar.name() + "][Session] - New session!");
            String uuid = UUID.randomUUID().toString();
            h.iForDeveloper("[" + aVar.name() + "][Session] - Id: " + uuid);
            long f5 = i.f(aVar);
            long j6 = j5 - f5;
            if (0 == f5) {
                j6 = 0;
            }
            i.a(uuid, aVar);
            i.a(j5, aVar);
            i.b(uuid, aVar);
            ct.a().setSessionId(uuid);
            ct.a().setSessionStartTime(j5);
            bv bvVar = new bv();
            bvVar.f11569b = com.umeng.analytics.pro.d.aC;
            bvVar.f11570c = "begin";
            TreeMap treeMap = new TreeMap();
            treeMap.put("sessionId", uuid);
            treeMap.put(com.umeng.analytics.pro.bi.aX, Long.valueOf(j6 / 1000));
            bvVar.f11571d = treeMap;
            bvVar.f11568a = aVar;
            bvVar.f11573f = new cs() { // from class: com.tendcloud.tenddata.bp.2
                @Override // com.tendcloud.tenddata.cs
                public void onStoreFailed() {
                }

                @Override // com.tendcloud.tenddata.cs
                public void onStoreSuccess() {
                    try {
                        bp.this.b(aVar);
                    } catch (Throwable unused) {
                    }
                }
            };
            z.a().post(bvVar);
            ab.Z.set(false);
        } catch (Throwable unused) {
        }
    }

    public static bp a() {
        if (f11534a == null) {
            synchronized (bp.class) {
                if (f11534a == null) {
                    f11534a = new bp();
                }
            }
        }
        return f11534a;
    }
}
