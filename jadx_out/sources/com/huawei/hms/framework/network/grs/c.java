package com.huawei.hms.framework.network.grs;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.common.ExecutorsUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import com.huawei.hms.framework.network.grs.g.h;
import com.huawei.hms.framework.network.grs.g.i;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public class c {

    /* renamed from: i, reason: collision with root package name */
    private static final String f8392i = "c";

    /* renamed from: j, reason: collision with root package name */
    private static final ExecutorService f8393j = ExecutorsUtils.newSingleThreadExecutor("GRS_GrsClient-Init");

    /* renamed from: k, reason: collision with root package name */
    private static AtomicInteger f8394k = new AtomicInteger(0);

    /* renamed from: a, reason: collision with root package name */
    private GrsBaseInfo f8395a;

    /* renamed from: b, reason: collision with root package name */
    private Context f8396b;

    /* renamed from: c, reason: collision with root package name */
    private h f8397c;

    /* renamed from: d, reason: collision with root package name */
    private com.huawei.hms.framework.network.grs.e.a f8398d;

    /* renamed from: e, reason: collision with root package name */
    private com.huawei.hms.framework.network.grs.e.c f8399e;

    /* renamed from: f, reason: collision with root package name */
    private com.huawei.hms.framework.network.grs.e.c f8400f;

    /* renamed from: g, reason: collision with root package name */
    private com.huawei.hms.framework.network.grs.a f8401g;

    /* renamed from: h, reason: collision with root package name */
    private FutureTask<Boolean> f8402h;

    /* loaded from: classes3.dex */
    class a implements Callable<Boolean> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f8403a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ GrsBaseInfo f8404b;

        a(Context context, GrsBaseInfo grsBaseInfo) {
            this.f8403a = context;
            this.f8404b = grsBaseInfo;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        public Boolean call() {
            c.this.f8397c = new h();
            c.this.f8399e = new com.huawei.hms.framework.network.grs.e.c(this.f8403a, GrsApp.getInstance().getBrand("_") + "share_pre_grs_conf_");
            c.this.f8400f = new com.huawei.hms.framework.network.grs.e.c(this.f8403a, GrsApp.getInstance().getBrand("_") + "share_pre_grs_services_");
            c cVar = c.this;
            cVar.f8398d = new com.huawei.hms.framework.network.grs.e.a(cVar.f8399e, c.this.f8400f, c.this.f8397c);
            c cVar2 = c.this;
            cVar2.f8401g = new com.huawei.hms.framework.network.grs.a(cVar2.f8395a, c.this.f8398d, c.this.f8397c, c.this.f8400f);
            if (c.f8394k.incrementAndGet() <= 2 || com.huawei.hms.framework.network.grs.f.b.a(this.f8403a.getPackageName(), c.this.f8395a) == null) {
                new com.huawei.hms.framework.network.grs.f.b(this.f8403a, this.f8404b, true).a(this.f8404b);
            }
            String c5 = new com.huawei.hms.framework.network.grs.g.k.c(this.f8404b, this.f8403a).c();
            Logger.v(c.f8392i, "scan serviceSet is:" + c5);
            String a5 = c.this.f8400f.a("services", "");
            String a6 = i.a(a5, c5);
            if (!TextUtils.isEmpty(a6)) {
                c.this.f8400f.b("services", a6);
                Logger.i(c.f8392i, "postList is:" + StringUtils.anonymizeMessage(a6));
                Logger.i(c.f8392i, "currentServices:" + StringUtils.anonymizeMessage(a5));
                if (!a6.equals(a5)) {
                    c.this.f8397c.a(c.this.f8395a.getGrsParasKey(true, true, this.f8403a));
                    c.this.f8397c.a(new com.huawei.hms.framework.network.grs.g.k.c(this.f8404b, this.f8403a), (String) null, c.this.f8400f);
                }
            }
            c cVar3 = c.this;
            cVar3.a(cVar3.f8399e.a());
            c.this.f8398d.b(this.f8404b, this.f8403a);
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(Context context, GrsBaseInfo grsBaseInfo) {
        this.f8402h = null;
        this.f8396b = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        a(grsBaseInfo);
        GrsBaseInfo grsBaseInfo2 = this.f8395a;
        FutureTask<Boolean> futureTask = new FutureTask<>(new a(this.f8396b, grsBaseInfo2));
        this.f8402h = futureTask;
        f8393j.execute(futureTask);
        Logger.i(f8392i, "GrsClient Instance is init, GRS SDK version: %s, GrsBaseInfoParam: app_name=%s, reg_country=%s, ser_country=%s, issue_country=%s", com.huawei.hms.framework.network.grs.h.a.a(), grsBaseInfo2.getAppName(), grsBaseInfo.getRegCountry(), grsBaseInfo.getSerCountry(), grsBaseInfo.getIssueCountry());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(GrsBaseInfo grsBaseInfo) {
        this.f8402h = null;
        a(grsBaseInfo);
    }

    private void a(GrsBaseInfo grsBaseInfo) {
        try {
            this.f8395a = grsBaseInfo.m6433clone();
        } catch (CloneNotSupportedException e5) {
            Logger.w(f8392i, "GrsClient catch CloneNotSupportedException", e5);
            this.f8395a = grsBaseInfo.copy();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Map<String, ?> map) {
        if (map == null || map.isEmpty()) {
            Logger.v(f8392i, "sp's content is empty.");
            return;
        }
        for (String str : map.keySet()) {
            if (str.endsWith(CrashHianalyticsData.TIME)) {
                String a5 = this.f8399e.a(str, "");
                long j5 = 0;
                if (!TextUtils.isEmpty(a5) && a5.matches("\\d+")) {
                    try {
                        j5 = Long.parseLong(a5);
                    } catch (NumberFormatException e5) {
                        Logger.w(f8392i, "convert expire time from String to Long catch NumberFormatException.", e5);
                    }
                }
                if (!a(j5)) {
                    Logger.i(f8392i, "init interface auto clear some invalid sp's data.");
                    String substring = str.substring(0, str.length() - 4);
                    this.f8399e.a(substring);
                    this.f8399e.a(str);
                    this.f8399e.a(substring + "ETag");
                }
            }
        }
    }

    private boolean a(long j5) {
        return System.currentTimeMillis() - j5 <= 604800000;
    }

    private boolean e() {
        String str;
        String str2;
        FutureTask<Boolean> futureTask = this.f8402h;
        if (futureTask == null) {
            return false;
        }
        try {
            return futureTask.get(8L, TimeUnit.SECONDS).booleanValue();
        } catch (InterruptedException e5) {
            e = e5;
            str = f8392i;
            str2 = "init compute task interrupted.";
            Logger.w(str, str2, e);
            return false;
        } catch (CancellationException unused) {
            Logger.i(f8392i, "init compute task canceled.");
            return false;
        } catch (ExecutionException e6) {
            e = e6;
            str = f8392i;
            str2 = "init compute task failed.";
            Logger.w(str, str2, e);
            return false;
        } catch (TimeoutException unused2) {
            Logger.w(f8392i, "init compute task timed out");
            return false;
        } catch (Exception e7) {
            e = e7;
            str = f8392i;
            str2 = "init compute task occur unknown Exception";
            Logger.w(str, str2, e);
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String a(String str, String str2) {
        if (this.f8395a == null || str == null || str2 == null) {
            Logger.w(f8392i, "invalid para!");
            return null;
        }
        if (e()) {
            return this.f8401g.a(str, str2, this.f8396b);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Map<String, String> a(String str) {
        if (this.f8395a != null && str != null) {
            return e() ? this.f8401g.a(str, this.f8396b) : new HashMap();
        }
        Logger.w(f8392i, "invalid para!");
        return new HashMap();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        if (e()) {
            String grsParasKey = this.f8395a.getGrsParasKey(true, true, this.f8396b);
            this.f8399e.a(grsParasKey);
            this.f8399e.a(grsParasKey + CrashHianalyticsData.TIME);
            this.f8399e.a(grsParasKey + "ETag");
            this.f8397c.a(grsParasKey);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(String str, IQueryUrlsCallBack iQueryUrlsCallBack) {
        if (iQueryUrlsCallBack == null) {
            Logger.w(f8392i, "IQueryUrlsCallBack is must not null for process continue.");
            return;
        }
        if (this.f8395a == null || str == null) {
            iQueryUrlsCallBack.onCallBackFail(-6);
        } else if (e()) {
            this.f8401g.a(str, iQueryUrlsCallBack, this.f8396b);
        } else {
            Logger.i(f8392i, "grs init task has not completed.");
            iQueryUrlsCallBack.onCallBackFail(-7);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(String str, String str2, IQueryUrlCallBack iQueryUrlCallBack) {
        if (iQueryUrlCallBack == null) {
            Logger.w(f8392i, "IQueryUrlCallBack is must not null for process continue.");
            return;
        }
        if (this.f8395a == null || str == null || str2 == null) {
            iQueryUrlCallBack.onCallBackFail(-6);
        } else if (e()) {
            this.f8401g.a(str, str2, iQueryUrlCallBack, this.f8396b);
        } else {
            Logger.i(f8392i, "grs init task has not completed.");
            iQueryUrlCallBack.onCallBackFail(-7);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass() && (obj instanceof c)) {
            return this.f8395a.compare(((c) obj).f8395a);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean b() {
        GrsBaseInfo grsBaseInfo;
        Context context;
        if (!e() || (grsBaseInfo = this.f8395a) == null || (context = this.f8396b) == null) {
            return false;
        }
        this.f8398d.a(grsBaseInfo, context);
        return true;
    }
}
