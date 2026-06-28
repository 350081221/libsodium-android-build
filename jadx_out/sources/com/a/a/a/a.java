package com.a.a.a;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.text.TextUtils;
import androidx.profileinstaller.ProfileVerifier;
import com.a.a.a.b;
import com.bytedance.android.alog.Alog;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import java.io.File;
import java.io.FilenameFilter;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static int f750a = 3;

    /* renamed from: b, reason: collision with root package name */
    public static com.a.a.a.b f751b = null;

    /* renamed from: c, reason: collision with root package name */
    private static volatile boolean f752c = false;

    /* renamed from: d, reason: collision with root package name */
    private static volatile Set<String> f753d = null;

    /* renamed from: e, reason: collision with root package name */
    private static volatile boolean f754e = false;

    /* renamed from: f, reason: collision with root package name */
    private static volatile com.a.a.a.c f755f;

    /* renamed from: k, reason: collision with root package name */
    private static HandlerThread f760k;

    /* renamed from: l, reason: collision with root package name */
    private static Handler f761l;

    /* renamed from: g, reason: collision with root package name */
    private static volatile List<com.a.a.a.d> f756g = new ArrayList();

    /* renamed from: h, reason: collision with root package name */
    private static ScheduledExecutorService f757h = null;

    /* renamed from: i, reason: collision with root package name */
    private static Alog f758i = null;

    /* renamed from: j, reason: collision with root package name */
    private static ArrayList<WeakReference<Alog>> f759j = new ArrayList<>();

    /* renamed from: m, reason: collision with root package name */
    private static long f762m = -1;

    /* renamed from: n, reason: collision with root package name */
    private static boolean f763n = false;

    /* renamed from: o, reason: collision with root package name */
    private static Object f764o = new Object();

    /* renamed from: com.a.a.a.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    static class HandlerC0082a extends Handler {
        HandlerC0082a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i5 = message.what;
            if (i5 != 1) {
                if (i5 == 2) {
                    com.bytedance.android.alog.b.a();
                }
            } else {
                Object obj = message.obj;
                if (obj != null && (obj instanceof h)) {
                    a.m((h) obj);
                }
            }
        }
    }

    /* loaded from: classes2.dex */
    static class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Queue f765a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f766b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f767c;

        b(Queue queue, String str, String str2) {
            this.f765a = queue;
            this.f766b = str;
            this.f767c = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            Queue queue = this.f765a;
            if (queue != null) {
                a.p(queue);
                a.f755f.b();
            }
            for (com.a.a.a.d dVar : a.b()) {
                if (dVar != null) {
                    dVar.a(com.bytedance.android.alog.b.b());
                }
            }
            try {
                Thread.sleep(15000L);
            } catch (Exception unused) {
            }
            a.x(this.f766b, this.f767c);
        }
    }

    /* loaded from: classes2.dex */
    static class c extends TimerTask {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f768a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f769b;

        c(String str, String str2) {
            this.f768a = str;
            this.f769b = str2;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            a.x(this.f768a, this.f769b);
        }
    }

    /* loaded from: classes2.dex */
    static class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f770a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f771b;

        d(String str, String str2) {
            this.f770a = str;
            this.f771b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            a.x(this.f770a, this.f771b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class e implements FilenameFilter {
        e() {
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            return str.startsWith(".logCache_");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static class f implements FilenameFilter {
        f() {
        }

        @Override // java.io.FilenameFilter
        public boolean accept(File file, String str) {
            if (str.endsWith(".hoting")) {
                return true;
            }
            if (str.endsWith(".hot") && !str.endsWith(".alog.hot")) {
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class g {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f772a;

        static {
            int[] iArr = new int[b.d.a.values().length];
            f772a = iArr;
            try {
                iArr[b.d.a.MSG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f772a[b.d.a.STACKTRACE_STR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f772a[b.d.a.BORDER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f772a[b.d.a.JSON.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f772a[b.d.a.BUNDLE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f772a[b.d.a.INTENT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f772a[b.d.a.THROWABLE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f772a[b.d.a.THREAD.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f772a[b.d.a.STACKTRACE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes2.dex */
    public static class h {

        /* renamed from: j, reason: collision with root package name */
        private static final Object f773j = new Object();

        /* renamed from: k, reason: collision with root package name */
        private static h f774k;

        /* renamed from: l, reason: collision with root package name */
        private static int f775l;

        /* renamed from: a, reason: collision with root package name */
        public int f776a;

        /* renamed from: b, reason: collision with root package name */
        public String f777b;

        /* renamed from: c, reason: collision with root package name */
        public String f778c;

        /* renamed from: d, reason: collision with root package name */
        public Throwable f779d;

        /* renamed from: e, reason: collision with root package name */
        public b.d.a f780e = null;

        /* renamed from: f, reason: collision with root package name */
        public Object f781f;

        /* renamed from: g, reason: collision with root package name */
        public long f782g;

        /* renamed from: h, reason: collision with root package name */
        public long f783h;

        /* renamed from: i, reason: collision with root package name */
        public h f784i;

        private h() {
        }

        public static h a() {
            synchronized (f773j) {
                h hVar = f774k;
                if (hVar != null) {
                    f774k = hVar.f784i;
                    hVar.f784i = null;
                    f775l--;
                    return hVar;
                }
                return new h();
            }
        }

        public void b() {
            this.f777b = null;
            this.f778c = null;
            this.f779d = null;
            this.f780e = null;
            this.f781f = null;
            this.f782g = -1L;
            this.f783h = 0L;
            this.f784i = null;
            synchronized (f773j) {
                int i5 = f775l;
                if (i5 < 50) {
                    this.f784i = f774k;
                    f774k = this;
                    f775l = i5 + 1;
                }
            }
        }
    }

    private static int a(int i5) {
        return i5 - 2;
    }

    public static List<com.a.a.a.d> b() {
        return f756g;
    }

    private static void c(int i5, String str, String str2) {
        d(i5, str, str2, null, null, null);
    }

    private static void d(int i5, String str, String str2, Throwable th, b.d.a aVar, Object obj) {
        u();
        h a5 = h.a();
        a5.f776a = i5;
        a5.f777b = str;
        a5.f778c = str2;
        a5.f779d = th;
        a5.f780e = aVar;
        a5.f781f = obj;
        a5.f782g = f762m;
        a5.f783h = System.currentTimeMillis();
        Message obtain = Message.obtain();
        obtain.what = 1;
        obtain.obj = a5;
        f761l.sendMessage(obtain);
    }

    private static void f(com.a.a.a.f fVar) {
        String str;
        switch (g.f772a[fVar.f828e.ordinal()]) {
            case 1:
                str = (String) fVar.f829f;
                break;
            case 2:
                if (fVar.f830g == null) {
                    str = b.f.a((Throwable) fVar.f829f);
                    break;
                } else {
                    str = fVar.f830g + b.f.a((Throwable) fVar.f829f);
                    break;
                }
            case 3:
            case 4:
                str = b.d.c(fVar.f828e, (String) fVar.f829f);
                break;
            case 5:
                str = b.d.b(fVar.f828e, (Bundle) fVar.f829f);
                break;
            case 6:
                str = b.d.a(fVar.f828e, (Intent) fVar.f829f);
                break;
            case 7:
                str = b.d.e(fVar.f828e, (Throwable) fVar.f829f);
                break;
            case 8:
                str = b.d.d(fVar.f828e, (Thread) fVar.f829f);
                break;
            case 9:
                str = b.d.f(fVar.f828e, (StackTraceElement[]) fVar.f829f);
                break;
            default:
                str = "";
                break;
        }
        fVar.f827d = str;
    }

    public static void g(String str, String str2) {
        if (j(2, str)) {
            boolean a5 = com.a.a.a.h.a();
            if (a5 && f761l != null) {
                c(2, str, str2);
                return;
            }
            Alog alog = f758i;
            if (alog != null && a5) {
                alog.a(str, str2);
            } else {
                com.bytedance.android.alog.b.a(str, str2);
            }
        }
    }

    public static void h(String str, String str2, Throwable th) {
        if (j(5, str)) {
            boolean a5 = com.a.a.a.h.a();
            if (a5 && f761l != null) {
                d(5, str, str2, th, null, null);
                return;
            }
            String str3 = str2 + "\n" + b.f.a(th);
            Alog alog = f758i;
            if (alog != null && a5) {
                alog.d(str, str3);
            } else {
                com.bytedance.android.alog.b.d(str, str3);
            }
        }
    }

    private static boolean j(int i5, String str) {
        if (i5 < f750a) {
            return false;
        }
        if (f753d != null && !TextUtils.isEmpty(str) && f753d.contains(str)) {
            return false;
        }
        return true;
    }

    public static boolean k(com.a.a.a.b bVar) {
        boolean z4;
        int j5;
        int i5;
        Alog.c cVar;
        Alog.f fVar;
        Alog.a aVar;
        Queue<com.a.a.a.f> a5;
        Alog.c cVar2;
        Alog.f fVar2;
        Alog.a aVar2;
        boolean z5 = false;
        if (bVar == null) {
            return false;
        }
        f751b = bVar;
        try {
            Alog.a(new com.a.a.a.e());
            synchronized (f764o) {
                if (f763n) {
                    return false;
                }
                f763n = true;
                f750a = bVar.v();
                boolean b5 = com.a.a.a.h.b(bVar.a());
                boolean y4 = bVar.y();
                if (!y4 && bVar.x() && b5) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                boolean z6 = bVar.z();
                Alog.b b6 = new Alog.b(bVar.a()).a("default").a(a(bVar.v())).a(f752c).b(bVar.s()).b(bVar.n());
                if (z4) {
                    j5 = (bVar.j() / 3) * 2;
                } else {
                    j5 = bVar.j();
                }
                Alog.b c5 = b6.c(j5).d(bVar.f()).c(bVar.q());
                int i6 = 65536;
                if (b5) {
                    i5 = 65536;
                } else {
                    i5 = 32768;
                }
                Alog.b e5 = c5.e(i5);
                if (b5) {
                    i6 = ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE;
                }
                Alog.b f5 = e5.f(i6);
                Alog.d dVar = Alog.d.SAFE;
                Alog.b a6 = f5.a(dVar);
                Alog.g gVar = Alog.g.RAW;
                Alog.b a7 = a6.a(gVar);
                Alog.e eVar = Alog.e.LEGACY;
                Alog.b a8 = a7.a(eVar);
                if (bVar.t()) {
                    cVar = Alog.c.ZSTD;
                } else {
                    cVar = Alog.c.NONE;
                }
                Alog.b a9 = a8.a(cVar);
                if (bVar.u()) {
                    fVar = Alog.f.TEA_16;
                } else {
                    fVar = Alog.f.NONE;
                }
                Alog.b a10 = a9.a(fVar);
                if (bVar.u()) {
                    aVar = Alog.a.EC_SECP256K1;
                } else {
                    aVar = Alog.a.NONE;
                }
                com.bytedance.android.alog.b.a(a10.a(aVar).d(bVar.w()).a());
                if (y4 && (z6 || b5)) {
                    HandlerThread handlerThread = new HandlerThread("Alog_main_delegate");
                    f760k = handlerThread;
                    handlerThread.start();
                    f761l = new HandlerC0082a(f760k.getLooper());
                }
                if (z4) {
                    Alog.b a11 = new Alog.b(bVar.a()).a(TTAdSdk.S_C).a(a(bVar.v())).a(f752c).b(bVar.s()).b(bVar.n() / 2).c(bVar.j() / 3).d(bVar.f()).c(bVar.q()).e(32768).f(98304).a(dVar).a(gVar).a(eVar);
                    if (bVar.t()) {
                        cVar2 = Alog.c.ZSTD;
                    } else {
                        cVar2 = Alog.c.NONE;
                    }
                    Alog.b a12 = a11.a(cVar2);
                    if (bVar.u()) {
                        fVar2 = Alog.f.TEA_16;
                    } else {
                        fVar2 = Alog.f.NONE;
                    }
                    Alog.b a13 = a12.a(fVar2);
                    if (bVar.u()) {
                        aVar2 = Alog.a.EC_SECP256K1;
                    } else {
                        aVar2 = Alog.a.NONE;
                    }
                    f758i = a13.a(aVar2).d(bVar.w()).a();
                }
                String q5 = bVar.q();
                String s5 = bVar.s();
                Queue<com.a.a.a.f> queue = null;
                if (f755f != null && ((a5 = f755f.a()) == null || a5.size() != 0)) {
                    queue = a5;
                }
                if (queue != null || b().size() > 0) {
                    b bVar2 = new b(queue, q5, s5);
                    ScheduledExecutorService scheduledExecutorService = f757h;
                    if (scheduledExecutorService == null) {
                        new Thread(bVar2, "_ALOG_OPT_").start();
                    } else {
                        scheduledExecutorService.execute(bVar2);
                    }
                    z5 = true;
                }
                if (!z5) {
                    ScheduledExecutorService scheduledExecutorService2 = f757h;
                    if (scheduledExecutorService2 == null) {
                        new Timer("_ALOG_OPT_").schedule(new c(q5, s5), 15000L);
                    } else {
                        scheduledExecutorService2.schedule(new d(q5, s5), 15L, TimeUnit.SECONDS);
                    }
                }
                f754e = true;
                return true;
            }
        } catch (Throwable unused) {
            return false;
        }
    }

    @Deprecated
    public static void l() {
        Handler handler = f761l;
        if (handler != null) {
            handler.sendEmptyMessage(2);
        }
        com.bytedance.android.alog.b.a();
        Alog alog = f758i;
        if (alog != null) {
            alog.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void m(h hVar) {
        String str;
        String f5;
        int a5 = a(hVar.f776a);
        b.d.a aVar = hVar.f780e;
        String str2 = "";
        if (aVar == null) {
            if (hVar.f779d == null) {
                f5 = hVar.f778c;
            } else {
                if (hVar.f778c != null) {
                    str2 = hVar.f778c + "\n";
                }
                f5 = str2 + b.f.a(hVar.f779d);
            }
        } else {
            b.d.a aVar2 = b.d.a.BORDER;
            if (aVar == aVar2) {
                f5 = b.d.c(aVar2, hVar.f778c);
            } else {
                b.d.a aVar3 = b.d.a.JSON;
                if (aVar == aVar3) {
                    f5 = b.d.c(aVar3, hVar.f778c);
                } else {
                    b.d.a aVar4 = b.d.a.BUNDLE;
                    if (aVar == aVar4) {
                        f5 = b.d.b(aVar4, (Bundle) hVar.f781f);
                    } else {
                        b.d.a aVar5 = b.d.a.INTENT;
                        if (aVar == aVar5) {
                            f5 = b.d.a(aVar5, (Intent) hVar.f781f);
                        } else {
                            b.d.a aVar6 = b.d.a.THROWABLE;
                            if (aVar == aVar6) {
                                f5 = b.d.e(aVar6, (Throwable) hVar.f781f);
                            } else {
                                b.d.a aVar7 = b.d.a.THREAD;
                                if (aVar == aVar7) {
                                    f5 = b.d.d(aVar7, (Thread) hVar.f781f);
                                } else {
                                    b.d.a aVar8 = b.d.a.STACKTRACE;
                                    if (aVar != aVar8) {
                                        str = "";
                                        com.bytedance.android.alog.b.a(a5, hVar.f777b, str, hVar.f782g, hVar.f783h);
                                        hVar.b();
                                    }
                                    f5 = b.d.f(aVar8, (StackTraceElement[]) hVar.f781f);
                                }
                            }
                        }
                    }
                }
            }
        }
        str = f5;
        com.bytedance.android.alog.b.a(a5, hVar.f777b, str, hVar.f782g, hVar.f783h);
        hVar.b();
    }

    public static void n(String str, String str2) {
        if (j(3, str)) {
            boolean a5 = com.a.a.a.h.a();
            if (a5 && f761l != null) {
                c(3, str, str2);
                return;
            }
            Alog alog = f758i;
            if (alog != null && a5) {
                alog.b(str, str2);
            } else {
                com.bytedance.android.alog.b.b(str, str2);
            }
        }
    }

    public static void o(String str, String str2, Throwable th) {
        if (j(6, str)) {
            boolean a5 = com.a.a.a.h.a();
            if (a5 && f761l != null) {
                d(6, str, str2, th, null, null);
                return;
            }
            String str3 = str2 + "\n" + b.f.a(th);
            Alog alog = f758i;
            if (alog != null && a5) {
                alog.e(str, str3);
            } else {
                com.bytedance.android.alog.b.e(str, str3);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void p(Queue<com.a.a.a.f> queue) {
        for (com.a.a.a.f fVar : queue) {
            if (j(fVar.f825b, fVar.f826c)) {
                f(fVar);
                com.bytedance.android.alog.b.a(a(fVar.f825b), fVar.f826c, fVar.f827d);
            }
        }
    }

    @Deprecated
    public static void q() {
    }

    public static void r(String str, String str2) {
        if (j(4, str)) {
            boolean a5 = com.a.a.a.h.a();
            if (a5 && f761l != null) {
                c(4, str, str2);
                return;
            }
            Alog alog = f758i;
            if (alog != null && a5) {
                alog.c(str, str2);
            } else {
                com.bytedance.android.alog.b.c(str, str2);
            }
        }
    }

    public static void t(String str, String str2) {
        if (j(5, str)) {
            boolean a5 = com.a.a.a.h.a();
            if (a5 && f761l != null) {
                c(5, str, str2);
                return;
            }
            Alog alog = f758i;
            if (alog != null && a5) {
                alog.d(str, str2);
            } else {
                com.bytedance.android.alog.b.d(str, str2);
            }
        }
    }

    private static void u() {
        if (f762m == -1) {
            f762m = Process.myTid();
        }
    }

    public static void v(String str, String str2) {
        if (j(6, str)) {
            boolean a5 = com.a.a.a.h.a();
            if (a5 && f761l != null) {
                c(6, str, str2);
                return;
            }
            Alog alog = f758i;
            if (alog != null && a5) {
                alog.e(str, str2);
            } else {
                com.bytedance.android.alog.b.e(str, str2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void x(String str, String str2) {
        File[] listFiles;
        File[] listFiles2;
        File file = new File(str);
        if (file.exists() && (listFiles2 = file.listFiles(new e())) != null) {
            for (File file2 : listFiles2) {
                file2.delete();
            }
        }
        File file3 = new File(str2);
        if (file3.exists() && (listFiles = file3.listFiles(new f())) != null) {
            for (File file4 : listFiles) {
                file4.delete();
            }
        }
    }
}
