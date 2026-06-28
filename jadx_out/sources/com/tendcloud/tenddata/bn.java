package com.tendcloud.tenddata;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.tendcloud.tenddata.zz;
import com.umeng.analytics.AnalyticsConfig;
import java.util.HashMap;
import java.util.TreeMap;

/* loaded from: classes3.dex */
public class bn {

    /* renamed from: a, reason: collision with root package name */
    private static volatile bn f11529a;

    /* renamed from: b, reason: collision with root package name */
    private HashMap<String, Object> f11530b = new HashMap<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public final class a {
        private String pageName;
        private String refer;
        private long startTime;

        private String getPageName() {
            return this.pageName;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String getRefer() {
            return this.refer;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long getStartTime() {
            return this.startTime;
        }

        public String toString() {
            return "pageName: " + this.pageName + "\nfrom: " + this.refer + "\nstartTime: " + this.startTime;
        }

        private a(long j5, String str, String str2) {
            this.startTime = j5;
            this.refer = str;
            this.pageName = str2;
        }
    }

    static {
        try {
            z.a().register(a());
        } catch (Throwable unused) {
        }
    }

    private bn() {
    }

    public static bn a() {
        if (f11529a == null) {
            synchronized (bp.class) {
                if (f11529a == null) {
                    f11529a = new bn();
                }
            }
        }
        return f11529a;
    }

    public final void onTDEBEventPage(zz.a aVar) {
        if (aVar != null) {
            try {
                HashMap<String, Object> hashMap = aVar.paraMap;
                if (hashMap != null) {
                    int parseInt = Integer.parseInt(String.valueOf(hashMap.get("apiType")));
                    if ((parseInt == 4 || parseInt == 5) && !String.valueOf(aVar.paraMap.get("occurTime")).trim().isEmpty()) {
                        a(aVar.paraMap);
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    private void a(HashMap<String, Object> hashMap) {
        try {
            int parseInt = Integer.parseInt(String.valueOf(hashMap.get("apiType")));
            com.tendcloud.tenddata.a aVar = (com.tendcloud.tenddata.a) hashMap.get("service");
            if (parseInt != 4) {
                if (parseInt != 5) {
                    return;
                }
                a(String.valueOf(hashMap.get("pageName")), aVar);
            } else {
                String str = ab.I;
                if (str == null) {
                    str = i.d();
                }
                a(Long.parseLong(String.valueOf(hashMap.get("occurTime"))), String.valueOf(hashMap.get("pageName")), str, aVar);
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0045 A[Catch: all -> 0x009b, TRY_LEAVE, TryCatch #0 {all -> 0x009b, blocks: (B:16:0x0010, B:18:0x0016, B:9:0x0045, B:7:0x0031), top: B:15:0x0010 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void a(long r9, java.lang.String r11, java.lang.String r12, com.tendcloud.tenddata.a r13) {
        /*
            r8 = this;
            r0 = 1
            com.tendcloud.tenddata.zz.f11853c = r0
            java.util.HashMap<java.lang.String, java.lang.Object> r0 = r8.f11530b
            boolean r0 = r0.containsKey(r11)
            if (r0 == 0) goto Lc
            return
        Lc:
            java.lang.String r0 = "onPageBegin being called!  pagename: "
            if (r12 == 0) goto L31
            boolean r1 = r12.isEmpty()     // Catch: java.lang.Throwable -> L9b
            if (r1 != 0) goto L31
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9b
            r1.<init>()     // Catch: java.lang.Throwable -> L9b
            r1.append(r0)     // Catch: java.lang.Throwable -> L9b
            r1.append(r11)     // Catch: java.lang.Throwable -> L9b
            java.lang.String r0 = ", refer: "
            r1.append(r0)     // Catch: java.lang.Throwable -> L9b
            r1.append(r12)     // Catch: java.lang.Throwable -> L9b
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L9b
            com.tendcloud.tenddata.h.iForDeveloper(r0)     // Catch: java.lang.Throwable -> L9b
            goto L43
        L31:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9b
            r1.<init>()     // Catch: java.lang.Throwable -> L9b
            r1.append(r0)     // Catch: java.lang.Throwable -> L9b
            r1.append(r11)     // Catch: java.lang.Throwable -> L9b
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L9b
            com.tendcloud.tenddata.h.iForDeveloper(r0)     // Catch: java.lang.Throwable -> L9b
        L43:
            if (r11 == 0) goto L9b
            com.tendcloud.tenddata.bn$a r0 = new com.tendcloud.tenddata.bn$a     // Catch: java.lang.Throwable -> L9b
            r7 = 0
            r1 = r0
            r2 = r8
            r3 = r9
            r5 = r12
            r6 = r11
            r1.<init>(r3, r5, r6)     // Catch: java.lang.Throwable -> L9b
            java.util.HashMap<java.lang.String, java.lang.Object> r9 = r8.f11530b     // Catch: java.lang.Throwable -> L9b
            r9.put(r11, r0)     // Catch: java.lang.Throwable -> L9b
            com.tendcloud.tenddata.bv r9 = new com.tendcloud.tenddata.bv     // Catch: java.lang.Throwable -> L9b
            r9.<init>()     // Catch: java.lang.Throwable -> L9b
            java.lang.String r10 = "page"
            r9.f11569b = r10     // Catch: java.lang.Throwable -> L9b
            java.lang.String r10 = "enter"
            r9.f11570c = r10     // Catch: java.lang.Throwable -> L9b
            java.util.TreeMap r10 = new java.util.TreeMap     // Catch: java.lang.Throwable -> L9b
            r10.<init>()     // Catch: java.lang.Throwable -> L9b
            java.lang.String r11 = "startTime"
            long r1 = com.tendcloud.tenddata.bn.a.access$100(r0)     // Catch: java.lang.Throwable -> L9b
            java.lang.Long r12 = java.lang.Long.valueOf(r1)     // Catch: java.lang.Throwable -> L9b
            r10.put(r11, r12)     // Catch: java.lang.Throwable -> L9b
            java.lang.String r11 = "duration"
            r12 = 0
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch: java.lang.Throwable -> L9b
            r10.put(r11, r12)     // Catch: java.lang.Throwable -> L9b
            java.lang.String r11 = "name"
            java.lang.String r12 = com.tendcloud.tenddata.bn.a.access$200(r0)     // Catch: java.lang.Throwable -> L9b
            r10.put(r11, r12)     // Catch: java.lang.Throwable -> L9b
            java.lang.String r11 = "from"
            java.lang.String r12 = com.tendcloud.tenddata.bn.a.access$300(r0)     // Catch: java.lang.Throwable -> L9b
            r10.put(r11, r12)     // Catch: java.lang.Throwable -> L9b
            r9.f11571d = r10     // Catch: java.lang.Throwable -> L9b
            r9.f11568a = r13     // Catch: java.lang.Throwable -> L9b
            com.tendcloud.tenddata.z r10 = com.tendcloud.tenddata.z.a()     // Catch: java.lang.Throwable -> L9b
            r10.post(r9)     // Catch: java.lang.Throwable -> L9b
        L9b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tendcloud.tenddata.bn.a(long, java.lang.String, java.lang.String, com.tendcloud.tenddata.a):void");
    }

    private final void a(String str, com.tendcloud.tenddata.a aVar) {
        if (this.f11530b.containsKey(str)) {
            try {
                h.iForDeveloper("onPageEnd being called! pageName: " + str);
                a aVar2 = (a) this.f11530b.remove(str);
                if (aVar2 != null) {
                    bv bvVar = new bv();
                    bvVar.f11569b = "page";
                    bvVar.f11570c = "leave";
                    long round = Math.round((System.currentTimeMillis() - aVar2.getStartTime()) / 1000.0d);
                    TreeMap treeMap = new TreeMap();
                    treeMap.put(AnalyticsConfig.RTD_START_TIME, Long.valueOf(aVar2.getStartTime()));
                    treeMap.put("name", str);
                    treeMap.put(TypedValues.TransitionType.S_FROM, aVar2.getRefer());
                    treeMap.put("duration", Long.valueOf(round));
                    bvVar.f11571d = treeMap;
                    bvVar.f11568a = aVar;
                    z.a().post(bvVar);
                }
                if (ab.H) {
                    i.setLastActivity(str);
                }
                ab.I = str;
            } catch (Throwable unused) {
            }
        }
    }
}
