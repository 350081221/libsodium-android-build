package com.ss.android.downloadlib;

import com.ss.android.downloadlib.addownload.k;
import com.ss.android.downloadlib.g.l;
import com.ss.android.downloadlib.g.m;
import com.ss.android.socialbase.appdownloader.c.o;
import com.tendcloud.tenddata.ab;

/* loaded from: classes3.dex */
public class h {

    /* renamed from: a, reason: collision with root package name */
    private static final String f10120a = "h";

    /* renamed from: b, reason: collision with root package name */
    private static boolean f10121b = false;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private static h f10126a = new h();
    }

    public static h a() {
        return a.f10126a;
    }

    private h() {
    }

    public void a(com.ss.android.downloadlib.addownload.b.e eVar, final com.ss.android.downloadad.api.a.b bVar) {
        if (!com.ss.android.downloadlib.g.e.c(bVar)) {
            l.a().a(f10120a, "checkMarketInstallFinishEvent", "开关未开启, 不使用动态广播监听能力");
            return;
        }
        if (bVar == null) {
            l.a().b(f10120a, "checkMarketInstallFinishEvent", "nativeDownloadModel为空,不符合预期");
            return;
        }
        if (bVar.Y()) {
            l.a().b(f10120a, "checkMarketInstallFinishEvent", "正在监听中,不重复监听");
            return;
        }
        try {
            l a5 = l.a();
            String str = f10120a;
            a5.a(str, "checkMarketInstallFinishEvent", "针对商店直投广告,开始检测安装完成事件");
            if (com.ss.android.downloadlib.g.e.d(bVar)) {
                l.a().a(str, "checkMarketInstallFinishEvent", "开始进行动态广播监听");
                int optInt = k.j().optInt("market_install_finish_check_time", 600);
                if (bVar.ag() != 0 && System.currentTimeMillis() - bVar.ag() <= optInt * 1000) {
                    l.a().a(str, "checkMarketInstallFinishEvent", "目前仍在广播监听的生效期内,不进行重复注册");
                }
                bVar.j(System.currentTimeMillis());
                a(optInt, new o() { // from class: com.ss.android.downloadlib.h.1
                    @Override // com.ss.android.socialbase.appdownloader.c.o
                    public void a() {
                        l.a().a(h.f10120a, "checkMarketInstallFinishEvent", "注册广播监听成功,注册耗时" + (System.currentTimeMillis() - bVar.ag()));
                        bVar.j(true);
                        com.ss.android.downloadlib.addownload.b.f.a().a(bVar);
                    }

                    @Override // com.ss.android.socialbase.appdownloader.c.o
                    public void b() {
                        l.a().a(h.f10120a, "checkMarketInstallFinishEvent", "广播监听时间结束,主动解除了广播监听");
                        if (!m.b(bVar)) {
                            l.a().a(h.f10120a, "checkMarketInstallFinishEvent", "监听结束依然没有完成安装");
                        }
                        bVar.j(false);
                        com.ss.android.downloadlib.addownload.b.f.a().a(bVar);
                    }
                });
            }
            if (com.ss.android.downloadlib.g.e.e(bVar)) {
                l.a().a(str, "checkMarketInstallFinishEvent", "开启轮询线程能力,作为容灾手段");
                com.ss.android.downloadlib.addownload.l.a().a(bVar);
            }
            com.ss.android.downloadlib.addownload.b.i.a().a(bVar);
        } catch (Exception unused) {
            com.ss.android.downloadlib.e.c.a().a(false, "监听商店场景安装完成事件发生异常");
        }
    }

    public void a(final com.ss.android.downloadad.api.a.b bVar) {
        if (!com.ss.android.downloadlib.g.e.c(bVar)) {
            l.a().a(f10120a, "checkMarketInstallFinishEventForReboot", "线程轮询总开关未开启,因此不执行兜底逻辑");
            return;
        }
        if (bVar == null) {
            l.a().b(f10120a, "checkMarketInstallFinishEventForReboot", "nativeDownloadModel为空,不符合预期");
            return;
        }
        if (bVar.f9502e.get() && System.currentTimeMillis() - bVar.ag() > ab.aa) {
            l.a().a(f10120a, "checkMarketInstallFinishEventForReboot", "兜底过一次了,不进行重复兜底");
            return;
        }
        if (com.ss.android.downloadlib.g.e.d(bVar)) {
            long optInt = k.j().optInt("market_install_finish_check_time", 600) * 1000;
            if (System.currentTimeMillis() - bVar.ag() >= optInt) {
                l.a().a(f10120a, "checkMarketInstallFinishEventForReboot", "当前时间距离首次检测时间超出了广播生效期,不再执行兜底策略");
            } else {
                a((int) (((bVar.ag() + optInt) - System.currentTimeMillis()) / 1000), new o() { // from class: com.ss.android.downloadlib.h.2
                    @Override // com.ss.android.socialbase.appdownloader.c.o
                    public void a() {
                        l.a().a(h.f10120a, "checkMarketInstallFinishEventForReboot", "进程被杀,重新注册广播监听成功,正式执行冷启兜底逻辑");
                        bVar.f9502e.compareAndSet(false, true);
                        com.ss.android.downloadlib.addownload.b.i.a().a(bVar);
                    }

                    @Override // com.ss.android.socialbase.appdownloader.c.o
                    public void b() {
                        l.a().a(h.f10120a, "checkMarketInstallFinishEventForReboot", "兜底监听执行完毕,解除广播监听");
                        if (!m.b(bVar)) {
                            l.a().a(h.f10120a, "checkMarketInstallFinishEventForReboot", "监听结束依然没有完成安装");
                        }
                        bVar.f9502e.compareAndSet(true, false);
                        bVar.j(false);
                        com.ss.android.downloadlib.addownload.b.i.a().a(bVar);
                    }
                });
            }
        }
    }

    public void a(int i5, o oVar) {
        l.a().a(f10120a, "registerMarketInstallFinishBroadcast", "动态广播监听的持续时间为:" + i5);
        if (!f10121b) {
            com.ss.android.socialbase.appdownloader.d.j().a(oVar);
            f10121b = true;
        }
        com.ss.android.socialbase.appdownloader.d.j().a(i5);
    }
}
