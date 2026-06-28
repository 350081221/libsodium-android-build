package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.analytics.pro.au;
import com.umeng.analytics.pro.bu;
import com.umeng.analytics.pro.ca;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.statistics.AnalyticsConstants;
import com.umeng.commonsdk.statistics.common.HelperUtils;
import com.umeng.commonsdk.statistics.common.MLog;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public static final long f13316a = 86400000;

    /* renamed from: b, reason: collision with root package name */
    public static e f13317b;

    /* renamed from: c, reason: collision with root package name */
    private static final String f13318c = au.b().b("id");

    /* renamed from: j, reason: collision with root package name */
    private static Object f13319j = new Object();

    /* renamed from: d, reason: collision with root package name */
    private File f13320d;

    /* renamed from: f, reason: collision with root package name */
    private long f13322f;

    /* renamed from: i, reason: collision with root package name */
    private a f13325i;

    /* renamed from: e, reason: collision with root package name */
    private com.umeng.commonsdk.statistics.proto.c f13321e = null;

    /* renamed from: h, reason: collision with root package name */
    private Set<com.umeng.commonsdk.statistics.idtracking.a> f13324h = new HashSet();

    /* renamed from: g, reason: collision with root package name */
    private long f13323g = 86400000;

    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private Context f13326a;

        /* renamed from: b, reason: collision with root package name */
        private Set<String> f13327b = new HashSet();

        public a(Context context) {
            this.f13326a = context;
        }

        public synchronized boolean a(String str) {
            return !this.f13327b.contains(str);
        }

        public synchronized void b(String str) {
            this.f13327b.add(str);
        }

        public void c(String str) {
            this.f13327b.remove(str);
        }

        public synchronized void a() {
            if (!this.f13327b.isEmpty()) {
                StringBuilder sb = new StringBuilder();
                Iterator<String> it = this.f13327b.iterator();
                while (it.hasNext()) {
                    sb.append(it.next());
                    sb.append(',');
                }
                sb.deleteCharAt(sb.length() - 1);
                PreferenceWrapper.getDefault(this.f13326a).edit().putString("invld_id", sb.toString()).commit();
            }
        }

        public synchronized void b() {
            String[] split;
            String string = PreferenceWrapper.getDefault(this.f13326a).getString("invld_id", null);
            if (!TextUtils.isEmpty(string) && (split = string.split(",")) != null) {
                for (String str : split) {
                    if (!TextUtils.isEmpty(str)) {
                        this.f13327b.add(str);
                    }
                }
            }
        }
    }

    e(Context context) {
        this.f13325i = null;
        this.f13320d = new File(context.getFilesDir(), f13318c);
        a aVar = new a(context);
        this.f13325i = aVar;
        aVar.b();
    }

    public static synchronized void a() {
        synchronized (e.class) {
            e eVar = f13317b;
            if (eVar != null) {
                eVar.e();
                f13317b = null;
            }
        }
    }

    private synchronized void h() {
        com.umeng.commonsdk.statistics.proto.c cVar = new com.umeng.commonsdk.statistics.proto.c();
        HashMap hashMap = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (com.umeng.commonsdk.statistics.idtracking.a aVar : this.f13324h) {
            if (aVar.c()) {
                if (aVar.d() != null) {
                    hashMap.put(aVar.b(), aVar.d());
                }
                if (aVar.e() != null && !aVar.e().isEmpty()) {
                    arrayList.addAll(aVar.e());
                }
            }
        }
        cVar.a(arrayList);
        cVar.a(hashMap);
        synchronized (this) {
            this.f13321e = cVar;
        }
    }

    private com.umeng.commonsdk.statistics.proto.c i() {
        Throwable th;
        FileInputStream fileInputStream;
        synchronized (f13319j) {
            if (!this.f13320d.exists()) {
                return null;
            }
            try {
                fileInputStream = new FileInputStream(this.f13320d);
                try {
                    try {
                        byte[] readStreamToByteArray = HelperUtils.readStreamToByteArray(fileInputStream);
                        com.umeng.commonsdk.statistics.proto.c cVar = new com.umeng.commonsdk.statistics.proto.c();
                        new bu().a(cVar, readStreamToByteArray);
                        HelperUtils.safeClose(fileInputStream);
                        return cVar;
                    } catch (Exception e5) {
                        e = e5;
                        e.printStackTrace();
                        HelperUtils.safeClose(fileInputStream);
                        return null;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    HelperUtils.safeClose(fileInputStream);
                    throw th;
                }
            } catch (Exception e6) {
                e = e6;
                fileInputStream = null;
            } catch (Throwable th3) {
                th = th3;
                fileInputStream = null;
                HelperUtils.safeClose(fileInputStream);
                throw th;
            }
        }
    }

    public synchronized void b() {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.f13322f >= this.f13323g) {
            boolean z4 = false;
            for (com.umeng.commonsdk.statistics.idtracking.a aVar : this.f13324h) {
                if (aVar.c() && aVar.a()) {
                    if (!aVar.c()) {
                        this.f13325i.b(aVar.b());
                    }
                    z4 = true;
                }
            }
            if (z4) {
                h();
                this.f13325i.a();
                g();
            }
            this.f13322f = currentTimeMillis;
        }
    }

    public synchronized com.umeng.commonsdk.statistics.proto.c c() {
        return this.f13321e;
    }

    public String d() {
        return null;
    }

    public synchronized void e() {
        if (f13317b == null) {
            return;
        }
        boolean z4 = false;
        for (com.umeng.commonsdk.statistics.idtracking.a aVar : this.f13324h) {
            if (aVar.c() && aVar.e() != null && !aVar.e().isEmpty()) {
                aVar.a((List<com.umeng.commonsdk.statistics.proto.a>) null);
                z4 = true;
            }
        }
        if (z4) {
            this.f13321e.b(false);
            g();
        }
    }

    public synchronized void f() {
        com.umeng.commonsdk.statistics.proto.c i5 = i();
        if (i5 == null) {
            return;
        }
        a(i5);
        ArrayList arrayList = new ArrayList(this.f13324h.size());
        synchronized (this) {
            this.f13321e = i5;
            for (com.umeng.commonsdk.statistics.idtracking.a aVar : this.f13324h) {
                aVar.a(this.f13321e);
                if (!aVar.c()) {
                    arrayList.add(aVar);
                }
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                this.f13324h.remove((com.umeng.commonsdk.statistics.idtracking.a) it.next());
            }
            h();
        }
    }

    public synchronized void g() {
        com.umeng.commonsdk.statistics.proto.c cVar = this.f13321e;
        if (cVar != null) {
            b(cVar);
        }
    }

    public static synchronized e a(Context context) {
        e eVar;
        synchronized (e.class) {
            if (f13317b == null) {
                e eVar2 = new e(context);
                f13317b = eVar2;
                eVar2.a(new f(context));
                f13317b.a(new b(context));
                f13317b.a(new j(context));
                f13317b.a(new d(context));
                f13317b.a(new c(context));
                f13317b.a(new g(context));
                f13317b.a(new i());
                if (FieldManager.allow(com.umeng.commonsdk.utils.d.G)) {
                    f13317b.a(new h(context));
                }
                f13317b.f();
            }
            eVar = f13317b;
        }
        return eVar;
    }

    private void b(com.umeng.commonsdk.statistics.proto.c cVar) {
        byte[] a5;
        synchronized (f13319j) {
            if (cVar != null) {
                try {
                    synchronized (this) {
                        a(cVar);
                        a5 = new ca().a(cVar);
                    }
                    if (a5 != null) {
                        HelperUtils.writeFile(this.f13320d, a5);
                    }
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            }
        }
    }

    private boolean a(com.umeng.commonsdk.statistics.idtracking.a aVar) {
        if (this.f13325i.a(aVar.b())) {
            return this.f13324h.add(aVar);
        }
        if (!AnalyticsConstants.UM_DEBUG) {
            return false;
        }
        MLog.w("invalid domain: " + aVar.b());
        return false;
    }

    public void a(long j5) {
        this.f13323g = j5;
    }

    private void a(com.umeng.commonsdk.statistics.proto.c cVar) {
        Map<String, com.umeng.commonsdk.statistics.proto.b> map;
        if (cVar == null || (map = cVar.f13412a) == null) {
            return;
        }
        if (map.containsKey("mac") && !FieldManager.allow(com.umeng.commonsdk.utils.d.f13492h)) {
            cVar.f13412a.remove("mac");
        }
        if (cVar.f13412a.containsKey("imei") && !FieldManager.allow(com.umeng.commonsdk.utils.d.f13491g)) {
            cVar.f13412a.remove("imei");
        }
        if (cVar.f13412a.containsKey("android_id") && !FieldManager.allow(com.umeng.commonsdk.utils.d.f13493i)) {
            cVar.f13412a.remove("android_id");
        }
        if (cVar.f13412a.containsKey("serial") && !FieldManager.allow(com.umeng.commonsdk.utils.d.f13494j)) {
            cVar.f13412a.remove("serial");
        }
        if (cVar.f13412a.containsKey("idfa") && !FieldManager.allow(com.umeng.commonsdk.utils.d.f13507w)) {
            cVar.f13412a.remove("idfa");
        }
        if (!cVar.f13412a.containsKey("oaid") || FieldManager.allow(com.umeng.commonsdk.utils.d.G)) {
            return;
        }
        cVar.f13412a.remove("oaid");
    }
}
