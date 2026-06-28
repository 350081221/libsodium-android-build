package com.ss.android.downloadlib.addownload;

import android.os.SystemClock;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    private static final String f9931a = "l";

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private final com.ss.android.downloadad.api.a.b f9933b;

        a(com.ss.android.downloadad.api.a.b bVar) {
            this.f9933b = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                try {
                    this.f9933b.j(true);
                    l.this.b(this.f9933b);
                } catch (Exception e5) {
                    e5.printStackTrace();
                }
            } finally {
                this.f9933b.j(false);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private static l f9934a = new l();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(com.ss.android.downloadad.api.a.b bVar) {
        JSONObject jSONObject = new JSONObject();
        int a5 = com.ss.android.downloadlib.g.e.a(bVar);
        int b5 = com.ss.android.downloadlib.g.e.b(bVar);
        if (com.ss.android.downloadlib.g.e.e(bVar) && com.ss.android.downloadlib.g.e.d(bVar)) {
            com.ss.android.downloadlib.g.l.a().a(f9931a, "tryListenInstallFinishEvent", "上层库开启二级线程轮询检测策略");
            a(bVar, a5, b5, jSONObject);
        } else {
            com.ss.android.downloadlib.g.l.a().a(f9931a, "tryListenInstallFinishEvent", "采用原有默认轮询策略");
            b(bVar, 15, 20000, jSONObject);
        }
    }

    private l() {
    }

    public static l a() {
        return b.f9934a;
    }

    public void a(com.ss.android.downloadad.api.a.b bVar) {
        com.ss.android.downloadlib.g.l.a().a(f9931a, "tryListenInstallFinish", "开始通过轮询线程监听安装完成事件");
        com.ss.android.downloadlib.d.a().c(new a(bVar));
    }

    private void a(com.ss.android.downloadad.api.a.b bVar, int i5, int i6, JSONObject jSONObject) {
        int f5;
        if (bVar.K() == 4) {
            f5 = k.j().optInt("market_install_finish_check_time", 600);
        } else {
            f5 = com.ss.android.downloadlib.g.e.f(bVar);
        }
        int i7 = ((f5 * 1000) / 20000) + 1;
        com.ss.android.downloadlib.g.l a5 = com.ss.android.downloadlib.g.l.a();
        String str = f9931a;
        a5.a(str, "realListenInstallFinishEventOpt", "一级轮询次数，即广播生效期内的轮询次数为:" + i7);
        if (b(bVar, i7, 20000, jSONObject)) {
            return;
        }
        if (f5 * 1000 < com.ss.android.downloadlib.g.e.g(bVar)) {
            com.ss.android.downloadlib.g.l.a().a(str, "tryListenInstallFinishEventOpt", "广播生效时间外，一级轮询完成且没有检测到安装完成事件，开始二级检测");
            if (b(bVar, i5, i6, jSONObject)) {
                return;
            }
            com.ss.android.downloadlib.g.l.a().a(str, "tryListenInstallFinishEventOpt", "监听时间结束,依然没有监听到安装完成事件");
            return;
        }
        com.ss.android.downloadlib.g.l.a().a(str, "tryListenInstallFinishEventOpt", "一级轮询时间小于广播监听时间,且未监听到安装完成事件");
    }

    private boolean b(com.ss.android.downloadad.api.a.b bVar, int i5, int i6, JSONObject jSONObject) {
        com.ss.android.downloadlib.g.l.a().a(f9931a, "realListenInstallFinishEvent", "开始轮询检测,轮询时间间隔为" + i6 + ",轮询次数为" + i5);
        long j5 = (long) i6;
        SystemClock.sleep(j5);
        while (i5 > 0) {
            if (com.ss.android.downloadlib.g.m.b(bVar)) {
                com.ss.android.downloadlib.a.a().a(bVar.e());
                com.ss.android.downloadlib.g.l.a().a(f9931a, "realListenInstallFinishEvent", "检测到安装成功，当前剩余的轮询次数为" + i5);
                return true;
            }
            i5--;
            if (i5 == 0) {
                return false;
            }
            SystemClock.sleep(j5);
        }
        return false;
    }
}
