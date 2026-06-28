package com.huawei.hms.framework.network.grs.g;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.framework.network.grs.h.d;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;

/* loaded from: classes3.dex */
public class c {

    /* renamed from: n, reason: collision with root package name */
    private static final String f8445n = "c";

    /* renamed from: a, reason: collision with root package name */
    private final GrsBaseInfo f8446a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f8447b;

    /* renamed from: c, reason: collision with root package name */
    private final com.huawei.hms.framework.network.grs.e.a f8448c;

    /* renamed from: d, reason: collision with root package name */
    private d f8449d;

    /* renamed from: j, reason: collision with root package name */
    private final com.huawei.hms.framework.network.grs.g.k.c f8455j;

    /* renamed from: k, reason: collision with root package name */
    private com.huawei.hms.framework.network.grs.g.k.d f8456k;

    /* renamed from: e, reason: collision with root package name */
    private final Map<String, Future<d>> f8450e = new ConcurrentHashMap(16);

    /* renamed from: f, reason: collision with root package name */
    private final List<d> f8451f = new CopyOnWriteArrayList();

    /* renamed from: g, reason: collision with root package name */
    private final JSONArray f8452g = new JSONArray();

    /* renamed from: h, reason: collision with root package name */
    private final List<String> f8453h = new CopyOnWriteArrayList();

    /* renamed from: i, reason: collision with root package name */
    private final List<String> f8454i = new CopyOnWriteArrayList();

    /* renamed from: l, reason: collision with root package name */
    private String f8457l = "";

    /* renamed from: m, reason: collision with root package name */
    private long f8458m = 1;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class a implements Callable<d> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ExecutorService f8459a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f8460b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.huawei.hms.framework.network.grs.e.c f8461c;

        a(ExecutorService executorService, String str, com.huawei.hms.framework.network.grs.e.c cVar) {
            this.f8459a = executorService;
            this.f8460b = str;
            this.f8461c = cVar;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        public d call() {
            return c.this.b(this.f8459a, this.f8460b, this.f8461c);
        }
    }

    public c(com.huawei.hms.framework.network.grs.g.k.c cVar, com.huawei.hms.framework.network.grs.e.a aVar) {
        this.f8455j = cVar;
        this.f8446a = cVar.b();
        this.f8447b = cVar.a();
        this.f8448c = aVar;
        c();
        d();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0097 A[LOOP:0: B:2:0x0005->B:13:0x0097, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x008f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.huawei.hms.framework.network.grs.g.d a(java.util.concurrent.ExecutorService r16, java.util.List<java.lang.String> r17, java.lang.String r18, com.huawei.hms.framework.network.grs.e.c r19) {
        /*
            r15 = this;
            r9 = r15
            r0 = 0
            r10 = 0
            r11 = r0
            r12 = r10
        L5:
            int r0 = r17.size()
            if (r12 >= r0) goto L9b
            r13 = r17
            java.lang.Object r0 = r13.get(r12)
            java.lang.String r0 = (java.lang.String) r0
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L8a
            com.huawei.hms.framework.network.grs.g.a r14 = new com.huawei.hms.framework.network.grs.g.a
            android.content.Context r5 = r9.f8447b
            com.huawei.hms.framework.network.grs.GrsBaseInfo r7 = r9.f8446a
            r1 = r14
            r2 = r0
            r3 = r12
            r4 = r15
            r6 = r18
            r8 = r19
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            java.util.concurrent.Callable r1 = r14.g()
            r2 = r16
            java.util.concurrent.Future r1 = r2.submit(r1)
            java.util.Map<java.lang.String, java.util.concurrent.Future<com.huawei.hms.framework.network.grs.g.d>> r3 = r9.f8450e
            r3.put(r0, r1)
            r3 = 1
            long r4 = r9.f8458m     // Catch: java.util.concurrent.TimeoutException -> L68 java.lang.InterruptedException -> L70 java.util.concurrent.ExecutionException -> L79 java.util.concurrent.CancellationException -> L82
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.util.concurrent.TimeoutException -> L68 java.lang.InterruptedException -> L70 java.util.concurrent.ExecutionException -> L79 java.util.concurrent.CancellationException -> L82
            java.lang.Object r0 = r1.get(r4, r0)     // Catch: java.util.concurrent.TimeoutException -> L68 java.lang.InterruptedException -> L70 java.util.concurrent.ExecutionException -> L79 java.util.concurrent.CancellationException -> L82
            r1 = r0
            com.huawei.hms.framework.network.grs.g.d r1 = (com.huawei.hms.framework.network.grs.g.d) r1     // Catch: java.util.concurrent.TimeoutException -> L68 java.lang.InterruptedException -> L70 java.util.concurrent.ExecutionException -> L79 java.util.concurrent.CancellationException -> L82
            if (r1 == 0) goto L66
            boolean r0 = r1.o()     // Catch: java.util.concurrent.TimeoutException -> L5c java.lang.InterruptedException -> L5e java.util.concurrent.ExecutionException -> L61 java.util.concurrent.CancellationException -> L64
            if (r0 != 0) goto L53
            boolean r0 = r1.m()     // Catch: java.util.concurrent.TimeoutException -> L5c java.lang.InterruptedException -> L5e java.util.concurrent.ExecutionException -> L61 java.util.concurrent.CancellationException -> L64
            if (r0 == 0) goto L66
        L53:
            java.lang.String r0 = com.huawei.hms.framework.network.grs.g.c.f8445n     // Catch: java.util.concurrent.TimeoutException -> L5c java.lang.InterruptedException -> L5e java.util.concurrent.ExecutionException -> L61 java.util.concurrent.CancellationException -> L64
            java.lang.String r4 = "grs request return body is not null and is OK."
            com.huawei.hms.framework.common.Logger.i(r0, r4)     // Catch: java.util.concurrent.TimeoutException -> L5c java.lang.InterruptedException -> L5e java.util.concurrent.ExecutionException -> L61 java.util.concurrent.CancellationException -> L64
            r11 = r1
            goto L8d
        L5c:
            r11 = r1
            goto L68
        L5e:
            r0 = move-exception
            r11 = r1
            goto L71
        L61:
            r0 = move-exception
            r11 = r1
            goto L7a
        L64:
            r11 = r1
            goto L82
        L66:
            r11 = r1
            goto L8c
        L68:
            java.lang.String r0 = com.huawei.hms.framework.network.grs.g.c.f8445n
            java.lang.String r1 = "the wait timed out"
            com.huawei.hms.framework.common.Logger.w(r0, r1)
            goto L8c
        L70:
            r0 = move-exception
        L71:
            java.lang.String r1 = com.huawei.hms.framework.network.grs.g.c.f8445n
            java.lang.String r4 = "the current thread was interrupted while waiting"
            com.huawei.hms.framework.common.Logger.w(r1, r4, r0)
            goto L8d
        L79:
            r0 = move-exception
        L7a:
            java.lang.String r1 = com.huawei.hms.framework.network.grs.g.c.f8445n
            java.lang.String r3 = "the computation threw an ExecutionException"
            com.huawei.hms.framework.common.Logger.w(r1, r3, r0)
            goto L8c
        L82:
            java.lang.String r0 = com.huawei.hms.framework.network.grs.g.c.f8445n
            java.lang.String r1 = "{requestServer} the computation was cancelled"
            com.huawei.hms.framework.common.Logger.i(r0, r1)
            goto L8d
        L8a:
            r2 = r16
        L8c:
            r3 = r10
        L8d:
            if (r3 == 0) goto L97
            java.lang.String r0 = com.huawei.hms.framework.network.grs.g.c.f8445n
            java.lang.String r1 = "needBreak is true so need break current circulation"
            com.huawei.hms.framework.common.Logger.v(r0, r1)
            goto L9b
        L97:
            int r12 = r12 + 1
            goto L5
        L9b:
            com.huawei.hms.framework.network.grs.g.d r0 = r15.b(r11)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.hms.framework.network.grs.g.c.a(java.util.concurrent.ExecutorService, java.util.List, java.lang.String, com.huawei.hms.framework.network.grs.e.c):com.huawei.hms.framework.network.grs.g.d");
    }

    private void a(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append(str);
        String grsReqParamJoint = this.f8446a.getGrsReqParamJoint(false, false, e(), this.f8447b);
        if (!TextUtils.isEmpty(grsReqParamJoint)) {
            sb.append("?");
            sb.append(grsReqParamJoint);
        }
        this.f8454i.add(sb.toString());
    }

    private d b(d dVar) {
        String str;
        String str2;
        for (Map.Entry<String, Future<d>> entry : this.f8450e.entrySet()) {
            if (dVar != null && (dVar.o() || dVar.m())) {
                break;
            }
            try {
                dVar = entry.getValue().get(40000L, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e5) {
                e = e5;
                str = f8445n;
                str2 = "{checkResponse} when check result, find InterruptedException, check others";
                Logger.w(str, str2, e);
            } catch (CancellationException unused) {
                Logger.i(f8445n, "{checkResponse} when check result, find CancellationException, check others");
            } catch (ExecutionException e6) {
                e = e6;
                str = f8445n;
                str2 = "{checkResponse} when check result, find ExecutionException, check others";
                Logger.w(str, str2, e);
            } catch (TimeoutException unused2) {
                Logger.w(f8445n, "{checkResponse} when check result, find TimeoutException, cancel current request task");
                if (!entry.getValue().isCancelled()) {
                    entry.getValue().cancel(true);
                }
            }
        }
        return dVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public d b(ExecutorService executorService, String str, com.huawei.hms.framework.network.grs.e.c cVar) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        d a5 = a(executorService, this.f8454i, str, cVar);
        int b5 = a5 == null ? 0 : a5.b();
        String str2 = f8445n;
        Logger.v(str2, "use 2.0 interface return http's code is：{%s}", Integer.valueOf(b5));
        if (b5 == 404 || b5 == 401) {
            if (TextUtils.isEmpty(e()) && TextUtils.isEmpty(this.f8446a.getAppName())) {
                Logger.i(str2, "request grs server use 1.0 API must set appName,please check.");
                return null;
            }
            this.f8450e.clear();
            Logger.i(str2, "this env has not deploy new interface,so use old interface.");
            a5 = a(executorService, this.f8453h, str, cVar);
        }
        e.a(new ArrayList(this.f8451f), SystemClock.elapsedRealtime() - elapsedRealtime, this.f8452g, this.f8447b);
        this.f8451f.clear();
        return a5;
    }

    private void b(String str, String str2) {
        if (TextUtils.isEmpty(this.f8446a.getAppName()) && TextUtils.isEmpty(e())) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[1];
        objArr[0] = TextUtils.isEmpty(e()) ? this.f8446a.getAppName() : e();
        sb.append(String.format(locale, str, objArr));
        String grsReqParamJoint = this.f8446a.getGrsReqParamJoint(false, false, "1.0", this.f8447b);
        if (!TextUtils.isEmpty(grsReqParamJoint)) {
            sb.append("?");
            sb.append(grsReqParamJoint);
        }
        this.f8453h.add(sb.toString());
    }

    private void c() {
        com.huawei.hms.framework.network.grs.g.k.d a5 = com.huawei.hms.framework.network.grs.g.j.a.a(this.f8447b);
        if (a5 == null) {
            Logger.w(f8445n, "g*s***_se****er_conf*** maybe has a big error");
            return;
        }
        a(a5);
        List<String> a6 = a5.a();
        if (a6 == null || a6.size() <= 0) {
            Logger.v(f8445n, "maybe grs_base_url config with [],please check.");
            return;
        }
        if (a6.size() > 10) {
            throw new IllegalArgumentException("grs_base_url's count is larger than MAX value 10");
        }
        String c5 = a5.c();
        String b5 = a5.b();
        if (a6.size() > 0) {
            for (String str : a6) {
                if (str.startsWith("https://")) {
                    b(c5, str);
                    a(b5, str);
                } else {
                    Logger.w(f8445n, "grs server just support https scheme url,please check.");
                }
            }
        }
        Logger.v(f8445n, "request to GRS server url is{%s} and {%s}", this.f8453h, this.f8454i);
    }

    private void d() {
        String grsParasKey = this.f8446a.getGrsParasKey(true, true, this.f8447b);
        this.f8457l = this.f8448c.a().a(grsParasKey + "ETag", "");
    }

    private String e() {
        com.huawei.hms.framework.network.grs.f.b a5 = com.huawei.hms.framework.network.grs.f.b.a(this.f8447b.getPackageName(), this.f8446a);
        com.huawei.hms.framework.network.grs.local.model.a a6 = a5 != null ? a5.a() : null;
        if (a6 == null) {
            return "";
        }
        String b5 = a6.b();
        Logger.v(f8445n, "get appName from local assets is{%s}", b5);
        return b5;
    }

    public d a(ExecutorService executorService, String str, com.huawei.hms.framework.network.grs.e.c cVar) {
        String str2;
        String str3;
        if (this.f8453h.isEmpty() && this.f8454i.isEmpty()) {
            return null;
        }
        try {
            return (d) executorService.submit(new a(executorService, str, cVar)).get(b() != null ? r0.d() : 10, TimeUnit.SECONDS);
        } catch (InterruptedException e5) {
            e = e5;
            str2 = f8445n;
            str3 = "{submitExcutorTaskWithTimeout} the current thread was interrupted while waiting";
            Logger.w(str2, str3, e);
            return null;
        } catch (CancellationException unused) {
            Logger.i(f8445n, "{submitExcutorTaskWithTimeout} the computation was cancelled");
            return null;
        } catch (ExecutionException e6) {
            e = e6;
            str2 = f8445n;
            str3 = "{submitExcutorTaskWithTimeout} the computation threw an ExecutionException";
            Logger.w(str2, str3, e);
            return null;
        } catch (TimeoutException unused2) {
            Logger.w(f8445n, "{submitExcutorTaskWithTimeout} the wait timed out");
            return null;
        } catch (Exception e7) {
            e = e7;
            str2 = f8445n;
            str3 = "{submitExcutorTaskWithTimeout} catch Exception";
            Logger.w(str2, str3, e);
            return null;
        }
    }

    public String a() {
        return this.f8457l;
    }

    public synchronized void a(d dVar) {
        this.f8451f.add(dVar);
        d dVar2 = this.f8449d;
        if (dVar2 != null && (dVar2.o() || this.f8449d.m())) {
            Logger.v(f8445n, "grsResponseResult is ok");
            return;
        }
        if (dVar.n()) {
            Logger.i(f8445n, "GRS server open 503 limiting strategy.");
            com.huawei.hms.framework.network.grs.h.d.a(this.f8446a.getGrsParasKey(true, true, this.f8447b), new d.a(dVar.k(), SystemClock.elapsedRealtime()));
            return;
        }
        if (dVar.m()) {
            Logger.i(f8445n, "GRS server open 304 Not Modified.");
        }
        if (!dVar.o() && !dVar.m()) {
            Logger.v(f8445n, "grsResponseResult has exception so need return");
            return;
        }
        this.f8449d = dVar;
        this.f8448c.a(this.f8446a, dVar, this.f8447b, this.f8455j);
        for (Map.Entry<String, Future<d>> entry : this.f8450e.entrySet()) {
            if (!entry.getKey().equals(dVar.l()) && !entry.getValue().isCancelled()) {
                Logger.i(f8445n, "future cancel");
                entry.getValue().cancel(true);
            }
        }
    }

    public void a(com.huawei.hms.framework.network.grs.g.k.d dVar) {
        this.f8456k = dVar;
    }

    public com.huawei.hms.framework.network.grs.g.k.d b() {
        return this.f8456k;
    }
}
