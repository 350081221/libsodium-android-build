package com.ss.android.socialbase.downloader.downloader;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.huawei.agconnect.apms.instrument.Instrumented;
import com.huawei.agconnect.apms.instrument.okhttp3.OkHttp3Instrumentation;
import com.ss.android.socialbase.downloader.depend.aa;
import com.ss.android.socialbase.downloader.depend.ab;
import com.ss.android.socialbase.downloader.depend.af;
import com.ss.android.socialbase.downloader.depend.ak;
import com.ss.android.socialbase.downloader.downloader.u;
import com.ss.android.socialbase.downloader.impls.DownloadHandleService;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.DownloadTask;
import com.ss.android.socialbase.downloader.network.IDownloadHttpService;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import okhttp3.Dispatcher;
import okhttp3.Dns;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import org.json.JSONObject;

@Instrumented
/* loaded from: classes3.dex */
public class c {
    private static volatile q A;
    private static volatile com.ss.android.socialbase.downloader.d.b B;
    private static volatile aa C;
    private static volatile com.ss.android.socialbase.downloader.network.f G;
    private static volatile com.ss.android.socialbase.downloader.network.f H;
    private static volatile u I;
    private static int L;
    private static final int M;
    private static final int N;
    private static final int O;
    private static final int P;
    private static int Q;
    private static boolean R;
    private static final List<com.ss.android.socialbase.downloader.depend.k> S;
    private static final List<ab> T;
    private static int U;
    private static boolean V;
    private static boolean W;
    private static r X;
    private static com.ss.android.socialbase.downloader.d.c Y;
    private static volatile boolean Z;

    /* renamed from: a, reason: collision with root package name */
    private static volatile Context f10594a;

    /* renamed from: b, reason: collision with root package name */
    private static volatile j f10595b;

    /* renamed from: c, reason: collision with root package name */
    private static volatile k f10596c;

    /* renamed from: d, reason: collision with root package name */
    private static volatile h f10597d;

    /* renamed from: e, reason: collision with root package name */
    private static volatile af f10598e;

    /* renamed from: f, reason: collision with root package name */
    private static volatile com.ss.android.socialbase.downloader.impls.a f10599f;

    /* renamed from: g, reason: collision with root package name */
    private static volatile o f10600g;

    /* renamed from: h, reason: collision with root package name */
    private static volatile o f10601h;

    /* renamed from: i, reason: collision with root package name */
    private static volatile a f10602i;

    /* renamed from: j, reason: collision with root package name */
    private static volatile IDownloadHttpService f10603j;

    /* renamed from: k, reason: collision with root package name */
    private static volatile com.ss.android.socialbase.downloader.network.h f10604k;

    /* renamed from: l, reason: collision with root package name */
    private static volatile IDownloadHttpService f10605l;

    /* renamed from: m, reason: collision with root package name */
    private static volatile com.ss.android.socialbase.downloader.network.h f10606m;

    /* renamed from: n, reason: collision with root package name */
    private static volatile l f10607n;

    /* renamed from: o, reason: collision with root package name */
    private static volatile ExecutorService f10608o;

    /* renamed from: p, reason: collision with root package name */
    private static volatile ExecutorService f10609p;

    /* renamed from: q, reason: collision with root package name */
    private static volatile ExecutorService f10610q;

    /* renamed from: r, reason: collision with root package name */
    private static volatile ExecutorService f10611r;

    /* renamed from: s, reason: collision with root package name */
    private static volatile ExecutorService f10612s;

    /* renamed from: t, reason: collision with root package name */
    private static volatile ExecutorService f10613t;

    /* renamed from: u, reason: collision with root package name */
    private static volatile ExecutorService f10614u;

    /* renamed from: v, reason: collision with root package name */
    private static volatile ExecutorService f10615v;

    /* renamed from: w, reason: collision with root package name */
    private static volatile ScheduledExecutorService f10616w;

    /* renamed from: x, reason: collision with root package name */
    private static volatile g f10617x;

    /* renamed from: y, reason: collision with root package name */
    private static volatile DownloadReceiver f10618y;

    /* renamed from: z, reason: collision with root package name */
    private static volatile s f10619z;
    private static volatile List<ak> D = new ArrayList();
    private static volatile boolean E = false;
    private static volatile OkHttpClient F = null;
    private static final List<com.ss.android.socialbase.downloader.depend.m> J = new ArrayList();
    private static boolean K = false;

    /* loaded from: classes3.dex */
    public interface a {

        /* renamed from: com.ss.android.socialbase.downloader.downloader.c$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        public interface InterfaceC0215a {
            void a();
        }

        o a();

        t a(InterfaceC0215a interfaceC0215a);

        m b();
    }

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors() + 1;
        M = availableProcessors;
        N = (Runtime.getRuntime().availableProcessors() * 2) + 1;
        O = availableProcessors;
        P = availableProcessors;
        Q = 8192;
        S = new ArrayList();
        T = new ArrayList();
        V = true;
        W = false;
        Z = false;
    }

    private c() {
    }

    public static o A() {
        if (f10601h == null) {
            synchronized (c.class) {
                if (f10601h == null) {
                    f10601h = f10602i.a();
                }
            }
        }
        return f10601h;
    }

    public static List<com.ss.android.socialbase.downloader.depend.m> B() {
        return J;
    }

    public static k C() {
        if (f10596c == null) {
            synchronized (c.class) {
                if (f10596c == null) {
                    f10596c = new com.ss.android.socialbase.downloader.impls.i();
                }
            }
        }
        return f10596c;
    }

    public static com.ss.android.socialbase.downloader.impls.a D() {
        if (f10599f == null) {
            synchronized (c.class) {
                if (f10599f == null) {
                    f10599f = new com.ss.android.socialbase.downloader.impls.e();
                }
            }
        }
        return f10599f;
    }

    public static int E() {
        return U;
    }

    @NonNull
    public static JSONObject F() {
        if (C != null && C.a() != null) {
            return C.a();
        }
        return com.ss.android.socialbase.downloader.constants.e.f10519i;
    }

    public static void G() {
        if (TextUtils.isEmpty(com.ss.android.socialbase.downloader.constants.e.f10513c)) {
            com.ss.android.socialbase.downloader.constants.e.f10513c = "oppo";
            com.ss.android.socialbase.downloader.constants.e.f10512b = com.ss.android.socialbase.downloader.constants.e.f10513c.toUpperCase();
        }
    }

    public static boolean H() {
        return V;
    }

    public static synchronized int I() {
        int i5;
        synchronized (c.class) {
            i5 = Q;
        }
        return i5;
    }

    public static h J() {
        if (f10597d == null) {
            synchronized (c.class) {
                if (f10597d == null) {
                    f10597d = new com.ss.android.socialbase.downloader.impls.c();
                }
            }
        }
        return f10597d;
    }

    public static af K() {
        return f10598e;
    }

    public static g L() {
        if (f10617x == null) {
            synchronized (c.class) {
                if (f10617x == null) {
                    f10617x = new com.ss.android.socialbase.downloader.impls.b();
                }
            }
        }
        return f10617x;
    }

    public static s M() {
        if (f10619z == null) {
            synchronized (c.class) {
                if (f10619z == null) {
                    f10619z = new com.ss.android.socialbase.downloader.impls.j();
                }
            }
        }
        return f10619z;
    }

    public static u N() {
        if (I == null) {
            synchronized (c.class) {
                if (I == null) {
                    I = new u.a();
                }
            }
        }
        return I;
    }

    public static synchronized Context O() {
        Context context;
        synchronized (c.class) {
            context = f10594a;
        }
        return context;
    }

    public static synchronized boolean P() {
        boolean z4;
        synchronized (c.class) {
            z4 = R;
        }
        return z4;
    }

    @NonNull
    public static com.ss.android.socialbase.downloader.d.c Q() {
        if (Y == null) {
            Y = new com.ss.android.socialbase.downloader.d.c() { // from class: com.ss.android.socialbase.downloader.downloader.c.3
                @Override // com.ss.android.socialbase.downloader.d.c
                public void a(int i5, String str, JSONObject jSONObject) {
                }

                @Override // com.ss.android.socialbase.downloader.d.c
                public void b(int i5, String str, JSONObject jSONObject) {
                }
            };
        }
        return Y;
    }

    public static r R() {
        return X;
    }

    public static boolean S() {
        return Z;
    }

    public static boolean T() {
        boolean z4;
        StringBuilder sb = new StringBuilder();
        sb.append("supportMultiProc::=");
        if (f10602i != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        sb.append(z4);
        com.ss.android.socialbase.downloader.c.a.a("wjd", sb.toString());
        if (f10602i != null) {
            return true;
        }
        return false;
    }

    public static a U() {
        return f10602i;
    }

    private static void V() {
        if (f10618y == null) {
            f10618y = new DownloadReceiver();
        }
        if (K) {
            return;
        }
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            f10594a.registerReceiver(f10618y, intentFilter);
            K = true;
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void a(DownloaderBuilder downloaderBuilder) {
        synchronized (c.class) {
            if (Z) {
                com.ss.android.socialbase.downloader.c.a.e("DownloadComponentManager", "component has init");
                return;
            }
            boolean z4 = E;
            c(downloaderBuilder);
            if (f10595b == null) {
                f10595b = new com.ss.android.socialbase.downloader.impls.d();
            }
            if (f10600g == null) {
                f10600g = new com.ss.android.socialbase.downloader.impls.h();
            }
            if (f10601h == null && f10602i != null) {
                f10601h = f10602i.a();
            }
            if (f10596c == null) {
                f10596c = new com.ss.android.socialbase.downloader.impls.i();
            }
            if (f10599f == null) {
                f10599f = new com.ss.android.socialbase.downloader.impls.e();
            }
            if (f10597d == null) {
                f10597d = new com.ss.android.socialbase.downloader.impls.c();
            }
            if (f10617x == null) {
                f10617x = new com.ss.android.socialbase.downloader.impls.b();
            }
            if (f10619z == null) {
                f10619z = new com.ss.android.socialbase.downloader.impls.j();
            }
            int i5 = L;
            if (i5 <= 0 || i5 > M) {
                L = M;
            }
            V();
            if (E && !z4 && !com.ss.android.socialbase.downloader.i.f.c()) {
                com.ss.android.socialbase.downloader.impls.l.a(true).e();
            } else if (com.ss.android.socialbase.downloader.i.f.d()) {
                ExecutorService m5 = m();
                if (m5 != null) {
                    m5.execute(new Runnable() { // from class: com.ss.android.socialbase.downloader.downloader.c.1
                        @Override // java.lang.Runnable
                        public void run() {
                            Context O2 = c.O();
                            if (O2 != null) {
                                com.ss.android.socialbase.downloader.i.f.d(O2);
                            }
                        }
                    });
                }
            } else {
                Context O2 = O();
                if (O2 != null) {
                    com.ss.android.socialbase.downloader.i.f.d(O2);
                }
            }
            G();
            Z = true;
        }
    }

    public static void a(r rVar) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void b(DownloaderBuilder downloaderBuilder) {
        synchronized (c.class) {
            c(downloaderBuilder);
        }
    }

    private static void c(DownloaderBuilder downloaderBuilder) {
        if (downloaderBuilder != null) {
            if (downloaderBuilder.getContext() != null) {
                a(downloaderBuilder.getContext());
            }
            if (downloaderBuilder.getDownloadCache() != null) {
                a(downloaderBuilder.getDownloadCache());
            }
            if (downloaderBuilder.getIdGenerator() != null) {
                a(downloaderBuilder.getIdGenerator());
            }
            if (downloaderBuilder.getChunkCntCalculator() != null) {
                a(downloaderBuilder.getChunkCntCalculator());
            }
            if (downloaderBuilder.getNotificationClickCallback() != null) {
                a(downloaderBuilder.getNotificationClickCallback());
            }
            if (downloaderBuilder.getMaxDownloadPoolSize() != 0) {
                b(downloaderBuilder.getMaxDownloadPoolSize());
            }
            if (downloaderBuilder.getHttpService() != null) {
                a(downloaderBuilder.getHttpService());
            }
            if (downloaderBuilder.getHeadHttpService() != null) {
                a(downloaderBuilder.getHeadHttpService());
            }
            if (downloaderBuilder.getDownloadLaunchHandler() != null) {
                a(downloaderBuilder.getDownloadLaunchHandler());
            }
            if (downloaderBuilder.getCPUThreadExecutor() != null) {
                c(downloaderBuilder.getCPUThreadExecutor());
            }
            if (downloaderBuilder.getIOThreadExecutor() != null) {
                d(downloaderBuilder.getIOThreadExecutor());
            }
            if (downloaderBuilder.getMixDefaultDownloadExecutor() != null) {
                e(downloaderBuilder.getMixDefaultDownloadExecutor());
            }
            if (downloaderBuilder.getMixFrequentDownloadExecutor() != null) {
                f(downloaderBuilder.getMixFrequentDownloadExecutor());
            }
            if (downloaderBuilder.getMixApkDownloadExecutor() != null) {
                g(downloaderBuilder.getMixApkDownloadExecutor());
            }
            if (downloaderBuilder.getDBThreadExecutor() != null) {
                h(downloaderBuilder.getDBThreadExecutor());
            }
            if (downloaderBuilder.getChunkThreadExecutor() != null) {
                a(downloaderBuilder.getChunkThreadExecutor());
            }
            if (downloaderBuilder.getOkHttpDispatcherExecutor() != null) {
                b(downloaderBuilder.getOkHttpDispatcherExecutor());
            }
            if (!downloaderBuilder.getDownloadCompleteHandlers().isEmpty()) {
                a(downloaderBuilder.getDownloadCompleteHandlers());
            }
            if (downloaderBuilder.getMonitorConfig() != null) {
                A = downloaderBuilder.getMonitorConfig();
            }
            if (downloaderBuilder.getWriteBufferSize() > 1024) {
                Q = downloaderBuilder.getWriteBufferSize();
            }
            if (downloaderBuilder.getChunkAdjustCalculator() != null) {
                a(downloaderBuilder.getChunkAdjustCalculator());
            }
            if (downloaderBuilder.isDownloadInMultiProcess()) {
                E = true;
            }
            if (downloaderBuilder.getDownloadExpSwitch() != 0) {
                U = downloaderBuilder.getDownloadExpSwitch();
            }
            if (downloaderBuilder.getDownloadSetting() != null) {
                a(downloaderBuilder.getDownloadSetting());
            }
            if (downloaderBuilder.getDownloadDns() != null) {
                G = downloaderBuilder.getDownloadDns();
            }
            if (downloaderBuilder.getTTNetHandler() != null) {
                I = downloaderBuilder.getTTNetHandler();
                if (I.a()) {
                    a(I.b());
                    a(I.c());
                } else {
                    a(h());
                    a(i());
                }
            }
            b(downloaderBuilder.needAutoRefreshUnSuccessTask());
            if (downloaderBuilder.getDownloadMonitorListener() != null) {
                a(downloaderBuilder.getDownloadMonitorListener());
            }
        }
    }

    public static IDownloadHttpService d() {
        return f10603j;
    }

    public static List<ak> e() {
        List<ak> list;
        synchronized (D) {
            list = D;
        }
        return list;
    }

    public static com.ss.android.socialbase.downloader.network.h f() {
        return f10604k;
    }

    public static com.ss.android.socialbase.downloader.d.b g() {
        return B;
    }

    public static IDownloadHttpService h() {
        if (f10605l == null) {
            synchronized (c.class) {
                if (f10605l == null) {
                    f10605l = new com.ss.android.socialbase.downloader.impls.g();
                }
            }
        }
        return f10605l;
    }

    public static com.ss.android.socialbase.downloader.network.h i() {
        if (f10606m == null) {
            synchronized (c.class) {
                if (f10606m == null) {
                    f10606m = new com.ss.android.socialbase.downloader.impls.f();
                }
            }
        }
        return f10606m;
    }

    public static boolean j() {
        return com.ss.android.socialbase.downloader.g.a.c().a("switch_not_auto_boot_service", W ? 1 : 0) > 0;
    }

    public static synchronized q k() {
        q qVar;
        synchronized (c.class) {
            qVar = A;
        }
        return qVar;
    }

    public static ExecutorService l() {
        if (f10608o == null) {
            synchronized (c.class) {
                if (f10608o == null) {
                    int i5 = M;
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i5, i5, 15L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new com.ss.android.socialbase.downloader.h.a("DownloadThreadPool-cpu-fixed", true));
                    try {
                        threadPoolExecutor.allowCoreThreadTimeOut(true);
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                    f10608o = threadPoolExecutor;
                }
            }
        }
        return f10608o;
    }

    public static ExecutorService m() {
        return f10609p != null ? f10609p : l();
    }

    public static ExecutorService n() {
        return f10611r != null ? f10611r : p();
    }

    public static ExecutorService o() {
        return f10612s != null ? f10612s : p();
    }

    public static ExecutorService p() {
        if (f10610q == null) {
            synchronized (c.class) {
                if (f10610q == null) {
                    int i5 = O;
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i5, i5, 15L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new com.ss.android.socialbase.downloader.h.a("DownloadThreadPool-mix-fixed", true));
                    try {
                        threadPoolExecutor.allowCoreThreadTimeOut(true);
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                    f10610q = threadPoolExecutor;
                }
            }
        }
        return f10610q;
    }

    public static ExecutorService q() {
        if (f10614u == null) {
            synchronized (c.class) {
                if (f10614u == null) {
                    int i5 = N;
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i5, i5, 15L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new com.ss.android.socialbase.downloader.h.a("DownloadThreadPool-chunk-fixed", true));
                    try {
                        threadPoolExecutor.allowCoreThreadTimeOut(true);
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                    f10614u = threadPoolExecutor;
                }
            }
        }
        return f10614u;
    }

    public static ExecutorService r() {
        if (f10613t == null) {
            synchronized (c.class) {
                if (f10613t == null) {
                    int i5 = P;
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i5, i5, 15L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new com.ss.android.socialbase.downloader.h.a("DownloadThreadPool-db-fixed", true));
                    try {
                        threadPoolExecutor.allowCoreThreadTimeOut(true);
                    } catch (Throwable th) {
                        th.printStackTrace();
                    }
                    f10613t = threadPoolExecutor;
                }
            }
        }
        return f10613t;
    }

    public static OkHttpClient s() {
        OkHttpClient build;
        if (F == null) {
            synchronized (c.class) {
                if (F == null) {
                    OkHttpClient.Builder u4 = u();
                    if (!(u4 instanceof OkHttpClient.Builder)) {
                        build = u4.build();
                    } else {
                        build = OkHttp3Instrumentation.build(u4);
                    }
                    F = build;
                }
            }
        }
        return F;
    }

    public static ScheduledExecutorService t() {
        if (f10616w == null) {
            synchronized (c.class) {
                if (f10616w == null) {
                    f10616w = new ScheduledThreadPoolExecutor(1, new com.ss.android.socialbase.downloader.h.a("DownloadThreadPool-Schedule", true));
                }
            }
        }
        return f10616w;
    }

    public static OkHttpClient.Builder u() {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        builder.connectTimeout(com.tendcloud.tenddata.ab.aa, timeUnit).readTimeout(com.tendcloud.tenddata.ab.aa, timeUnit).writeTimeout(com.tendcloud.tenddata.ab.aa, timeUnit).retryOnConnectionFailure(true).followRedirects(true).protocols(Collections.singletonList(Protocol.HTTP_1_1));
        if (f10615v != null) {
            builder.dispatcher(new Dispatcher(f10615v));
        }
        return builder;
    }

    public static com.ss.android.socialbase.downloader.network.f v() {
        return G;
    }

    public static com.ss.android.socialbase.downloader.network.f w() {
        if (H == null) {
            synchronized (c.class) {
                if (H == null) {
                    H = new com.ss.android.socialbase.downloader.network.f() { // from class: com.ss.android.socialbase.downloader.downloader.c.2
                        @Override // com.ss.android.socialbase.downloader.network.f
                        public List<InetAddress> a(String str) throws UnknownHostException {
                            return Dns.SYSTEM.lookup(str);
                        }
                    };
                }
            }
        }
        return H;
    }

    public static synchronized l x() {
        l lVar;
        synchronized (c.class) {
            lVar = f10607n;
        }
        return lVar;
    }

    public static j y() {
        if (f10595b == null) {
            synchronized (c.class) {
                if (f10595b == null) {
                    f10595b = new com.ss.android.socialbase.downloader.impls.d();
                }
            }
        }
        return f10595b;
    }

    public static o z() {
        if (f10600g == null) {
            synchronized (c.class) {
                if (f10600g == null) {
                    f10600g = new com.ss.android.socialbase.downloader.impls.h();
                }
            }
        }
        return f10600g;
    }

    private static void d(ExecutorService executorService) {
        if (executorService != null) {
            f10609p = executorService;
        }
    }

    private static void f(ExecutorService executorService) {
        if (executorService != null) {
            f10611r = executorService;
        }
    }

    private static void g(ExecutorService executorService) {
        if (executorService != null) {
            f10612s = executorService;
        }
    }

    public static synchronized void b() {
        synchronized (c.class) {
            if (E) {
                return;
            }
            E = true;
            try {
                Intent intent = new Intent(O(), (Class<?>) DownloadHandleService.class);
                intent.setAction("com.ss.android.downloader.action.MULTI_PROCESS_NOTIFY");
                O().startService(intent);
                if (!com.ss.android.socialbase.downloader.i.f.c()) {
                    com.ss.android.socialbase.downloader.impls.l.a(true).e();
                }
            } catch (Throwable th) {
                E = false;
                th.printStackTrace();
            }
        }
    }

    private static void e(ExecutorService executorService) {
        if (executorService != null) {
            f10610q = executorService;
        }
    }

    private static void h(ExecutorService executorService) {
        if (executorService != null) {
            f10613t = executorService;
        }
    }

    public static void b(com.ss.android.socialbase.downloader.depend.k kVar) {
        List<com.ss.android.socialbase.downloader.depend.k> list = S;
        synchronized (list) {
            if (kVar != null) {
                if (list.contains(kVar)) {
                    list.remove(kVar);
                }
            }
        }
    }

    public static void b(DownloadTask downloadTask, int i5) {
        List<ab> list = T;
        synchronized (list) {
            for (ab abVar : list) {
                if (abVar != null) {
                    abVar.b(downloadTask, i5);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.ss.android.socialbase.downloader.network.g b(java.lang.String r11, java.util.List<com.ss.android.socialbase.downloader.model.c> r12, int r13, boolean r14, com.ss.android.socialbase.downloader.model.DownloadInfo r15) throws com.ss.android.socialbase.downloader.exception.BaseException, java.io.IOException {
        /*
            r0 = 1
            if (r13 != r0) goto L8
            com.ss.android.socialbase.downloader.network.h r0 = f()
            goto Lc
        L8:
            com.ss.android.socialbase.downloader.network.h r0 = i()
        Lc:
            if (r0 == 0) goto L49
            r1 = 0
            r9 = 0
            r2 = 0
            if (r14 == 0) goto L18
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L32
        L18:
            com.ss.android.socialbase.downloader.network.g r12 = r0.a(r11, r12)     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L32
            if (r14 == 0) goto L2e
            r4 = 0
            long r0 = java.lang.System.currentTimeMillis()
            long r5 = r0 - r2
            java.lang.String r7 = "head"
            r2 = r12
            r3 = r11
            r8 = r13
            r10 = r15
            com.ss.android.socialbase.downloader.d.a.a(r2, r3, r4, r5, r7, r8, r9, r10)
        L2e:
            return r12
        L2f:
            r12 = move-exception
            r8 = r9
            goto L37
        L32:
            r12 = move-exception
            throw r12     // Catch: java.lang.Throwable -> L34
        L34:
            r0 = move-exception
            r8 = r12
            r12 = r0
        L37:
            if (r14 == 0) goto L48
            r14 = 0
            long r4 = java.lang.System.currentTimeMillis()
            long r4 = r4 - r2
            java.lang.String r6 = "head"
            r2 = r11
            r3 = r14
            r7 = r13
            r9 = r15
            com.ss.android.socialbase.downloader.d.a.a(r1, r2, r3, r4, r6, r7, r8, r9)
        L48:
            throw r12
        L49:
            com.ss.android.socialbase.downloader.exception.BaseException r11 = new com.ss.android.socialbase.downloader.exception.BaseException
            java.io.IOException r12 = new java.io.IOException
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "httpService not exist, netLib = "
            r14.append(r15)
            r14.append(r13)
            java.lang.String r13 = r14.toString()
            r12.<init>(r13)
            r13 = 1022(0x3fe, float:1.432E-42)
            r11.<init>(r13, r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.downloader.c.b(java.lang.String, java.util.List, int, boolean, com.ss.android.socialbase.downloader.model.DownloadInfo):com.ss.android.socialbase.downloader.network.g");
    }

    public static void b(ExecutorService executorService) {
        if (executorService != null) {
            f10615v = executorService;
        }
    }

    public static void b(Runnable runnable) {
        b(runnable, false);
    }

    public static void b(Runnable runnable, boolean z4) {
        if (runnable == null) {
            return;
        }
        if (z4 && !com.ss.android.socialbase.downloader.i.f.d()) {
            runnable.run();
        } else {
            m().execute(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void a() {
        synchronized (c.class) {
            try {
                if (K && f10618y != null && f10594a != null) {
                    f10594a.unregisterReceiver(f10618y);
                    K = false;
                }
            } catch (Exception e5) {
                e5.printStackTrace();
            }
        }
    }

    private static void b(int i5) {
        if (i5 > 0) {
            L = i5;
        }
    }

    private static void b(boolean z4) {
        V = z4;
    }

    public static void a(ak akVar) {
        if (akVar == null) {
            return;
        }
        synchronized (D) {
            D.add(akVar);
        }
    }

    public static void a(com.ss.android.socialbase.downloader.depend.k kVar) {
        List<com.ss.android.socialbase.downloader.depend.k> list = S;
        synchronized (list) {
            if (kVar != null) {
                if (!list.contains(kVar)) {
                    list.add(kVar);
                }
            }
        }
    }

    public static void a(com.ss.android.socialbase.downloader.constants.d dVar) {
        List<com.ss.android.socialbase.downloader.depend.k> list = S;
        synchronized (list) {
            for (com.ss.android.socialbase.downloader.depend.k kVar : list) {
                if (kVar != null) {
                    if (dVar == com.ss.android.socialbase.downloader.constants.d.SYNC_START) {
                        kVar.a();
                    } else if (dVar == com.ss.android.socialbase.downloader.constants.d.SYNC_SUCCESS) {
                        kVar.b();
                    }
                }
            }
            if (dVar == com.ss.android.socialbase.downloader.constants.d.SYNC_SUCCESS) {
                S.clear();
            }
        }
    }

    public static void a(DownloadTask downloadTask, int i5) {
        List<ab> list = T;
        synchronized (list) {
            for (ab abVar : list) {
                if (abVar != null) {
                    abVar.a(downloadTask, i5);
                }
            }
        }
    }

    public static synchronized boolean c() {
        boolean z4;
        synchronized (c.class) {
            z4 = E;
        }
        return z4;
    }

    private static void c(ExecutorService executorService) {
        if (executorService != null) {
            f10608o = executorService;
        }
    }

    public static void c(Runnable runnable) {
        if (runnable == null) {
            return;
        }
        if (!com.ss.android.socialbase.downloader.i.f.d()) {
            runnable.run();
        } else {
            r().execute(runnable);
        }
    }

    public static com.ss.android.socialbase.downloader.network.i a(boolean z4, int i5, String str, List<com.ss.android.socialbase.downloader.model.c> list) throws Exception {
        return a(z4, i5, str, null, list, 0, false, null);
    }

    public static com.ss.android.socialbase.downloader.network.i a(boolean z4, int i5, String str, String str2, List<com.ss.android.socialbase.downloader.model.c> list, int i6, boolean z5, DownloadInfo downloadInfo) throws Exception {
        List<com.ss.android.socialbase.downloader.model.c> list2;
        int i7;
        com.ss.android.socialbase.downloader.network.i a5;
        if (!TextUtils.isEmpty(str2)) {
            List<com.ss.android.socialbase.downloader.model.c> arrayList = list == null ? new ArrayList<>() : list;
            arrayList.add(new com.ss.android.socialbase.downloader.model.c("ss_d_request_host_ip_114", str2));
            list2 = arrayList;
            i7 = 1;
        } else if (z4) {
            list2 = list;
            i7 = i6;
        } else {
            i7 = 2;
            list2 = list;
        }
        int[] a6 = a(i7);
        Exception exc = null;
        for (int i8 : a6) {
            try {
                a5 = a(i5, str, str2, list2, i8, z5, downloadInfo);
            } catch (Exception e5) {
                if (downloadInfo.isExpiredRedownload() && com.ss.android.socialbase.downloader.i.f.g(e5) && com.ss.android.socialbase.downloader.i.f.c(list2)) {
                    com.ss.android.socialbase.downloader.c.a.a("dcach::http exception 304, throw excepiton, not retry " + e5);
                    throw e5;
                }
                exc = e5;
            }
            if (a5 != null) {
                return a5;
            }
        }
        if (exc == null) {
            return null;
        }
        throw exc;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static com.ss.android.socialbase.downloader.network.i a(int r11, java.lang.String r12, java.lang.String r13, java.util.List<com.ss.android.socialbase.downloader.model.c> r14, int r15, boolean r16, com.ss.android.socialbase.downloader.model.DownloadInfo r17) throws com.ss.android.socialbase.downloader.exception.BaseException, java.io.IOException {
        /*
            r7 = r15
            r0 = 1
            if (r7 != r0) goto L9
            com.ss.android.socialbase.downloader.network.IDownloadHttpService r0 = d()
            goto Ld
        L9:
            com.ss.android.socialbase.downloader.network.IDownloadHttpService r0 = h()
        Ld:
            if (r0 == 0) goto L55
            r1 = 0
            r8 = 0
            r2 = 0
            if (r16 == 0) goto L20
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L1a java.io.IOException -> L1d
            goto L20
        L1a:
            r0 = move-exception
            r5 = r12
            goto L42
        L1d:
            r0 = move-exception
            r5 = r12
            goto L3e
        L20:
            r4 = r11
            r5 = r12
            r6 = r14
            com.ss.android.socialbase.downloader.network.i r0 = r0.downloadWithConnection(r11, r12, r14)     // Catch: java.lang.Throwable -> L3b java.io.IOException -> L3d
            if (r16 == 0) goto L3a
            long r9 = java.lang.System.currentTimeMillis()
            long r9 = r9 - r2
            java.lang.String r6 = "get"
            r1 = r0
            r2 = r12
            r3 = r13
            r4 = r9
            r7 = r15
            r9 = r17
            com.ss.android.socialbase.downloader.d.a.a(r1, r2, r3, r4, r6, r7, r8, r9)
        L3a:
            return r0
        L3b:
            r0 = move-exception
            goto L42
        L3d:
            r0 = move-exception
        L3e:
            r4 = r0
            throw r4     // Catch: java.lang.Throwable -> L40
        L40:
            r0 = move-exception
            r8 = r4
        L42:
            if (r16 == 0) goto L54
            long r9 = java.lang.System.currentTimeMillis()
            long r9 = r9 - r2
            java.lang.String r6 = "get"
            r2 = r12
            r3 = r13
            r4 = r9
            r7 = r15
            r9 = r17
            com.ss.android.socialbase.downloader.d.a.a(r1, r2, r3, r4, r6, r7, r8, r9)
        L54:
            throw r0
        L55:
            com.ss.android.socialbase.downloader.exception.BaseException r0 = new com.ss.android.socialbase.downloader.exception.BaseException
            java.io.IOException r1 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "httpService not exist, netLib = "
            r2.append(r3)
            r2.append(r15)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            r2 = 1022(0x3fe, float:1.432E-42)
            r0.<init>(r2, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.downloader.c.a(int, java.lang.String, java.lang.String, java.util.List, int, boolean, com.ss.android.socialbase.downloader.model.DownloadInfo):com.ss.android.socialbase.downloader.network.i");
    }

    public static com.ss.android.socialbase.downloader.network.g a(String str, List<com.ss.android.socialbase.downloader.model.c> list) throws Exception {
        return a(str, list, 0, false, null);
    }

    public static com.ss.android.socialbase.downloader.network.g a(String str, List<com.ss.android.socialbase.downloader.model.c> list, int i5, boolean z4, DownloadInfo downloadInfo) throws Exception {
        com.ss.android.socialbase.downloader.network.g b5;
        Exception e5 = null;
        for (int i6 : a(i5)) {
            try {
                b5 = b(str, list, i6, z4, downloadInfo);
            } catch (Exception e6) {
                e5 = e6;
            }
            if (b5 != null) {
                return b5;
            }
        }
        if (e5 == null) {
            return null;
        }
        throw e5;
    }

    private static int[] a(int i5) {
        return i5 != 1 ? i5 != 2 ? i5 != 3 ? new int[]{1, 0} : new int[]{0, 1} : new int[]{1} : new int[]{0};
    }

    public static synchronized void a(l lVar) {
        synchronized (c.class) {
            if (lVar != null) {
                f10607n = lVar;
                if (f10595b instanceof com.ss.android.socialbase.downloader.impls.d) {
                    ((com.ss.android.socialbase.downloader.impls.d) f10595b).h();
                }
            }
        }
    }

    public static void a(ExecutorService executorService) {
        if (executorService != null) {
            f10614u = executorService;
        }
    }

    private static void a(List<com.ss.android.socialbase.downloader.depend.m> list) {
        List<com.ss.android.socialbase.downloader.depend.m> list2 = J;
        if (list2.isEmpty()) {
            synchronized (list2) {
                list2.addAll(list);
            }
        }
    }

    public static void a(boolean z4) {
        W = z4;
    }

    public static void a(Runnable runnable) {
        a(runnable, false);
    }

    public static void a(Runnable runnable, boolean z4) {
        if (runnable == null) {
            return;
        }
        if (z4 && !com.ss.android.socialbase.downloader.i.f.d()) {
            runnable.run();
        } else {
            l().execute(runnable);
        }
    }

    public static Future a(Runnable runnable, long j5, TimeUnit timeUnit) {
        if (runnable == null) {
            return null;
        }
        return t().schedule(runnable, j5, timeUnit);
    }

    public static void a(IDownloadHttpService iDownloadHttpService) {
        if (iDownloadHttpService != null) {
            f10603j = iDownloadHttpService;
        }
        R = f10603j != null;
    }

    public static void a(com.ss.android.socialbase.downloader.network.h hVar) {
        if (hVar != null) {
            f10604k = hVar;
        }
    }

    private static void a(j jVar) {
        if (jVar != null) {
            f10595b = jVar;
        }
    }

    private static void a(k kVar) {
        if (kVar != null) {
            f10596c = kVar;
        }
    }

    private static void a(com.ss.android.socialbase.downloader.d.b bVar) {
        if (bVar != null) {
            B = bVar;
        }
    }

    public static void a(aa aaVar) {
        C = aaVar;
        com.ss.android.socialbase.downloader.g.a.a();
    }

    private static void a(h hVar) {
        if (hVar != null) {
            f10597d = hVar;
        }
    }

    public static void a(af afVar) {
        if (afVar != null) {
            f10598e = afVar;
        }
    }

    private static void a(g gVar) {
        if (gVar != null) {
            f10617x = gVar;
        }
    }

    public static synchronized void a(Context context) {
        synchronized (c.class) {
            if (context != null) {
                if (f10594a == null) {
                    f10594a = context.getApplicationContext();
                    com.ss.android.socialbase.downloader.a.a.a().a(f10594a);
                }
            }
        }
    }

    public static int a(DownloadInfo downloadInfo) {
        if (downloadInfo == null) {
            return 0;
        }
        String taskKey = downloadInfo.getTaskKey();
        if (TextUtils.isEmpty(taskKey)) {
            taskKey = downloadInfo.getUrl();
        }
        return a(taskKey, downloadInfo.getSavePath());
    }

    public static int a(String str, String str2) {
        k C2 = C();
        if (C2 == null) {
            return 0;
        }
        return C2.a(str, str2);
    }

    public static void a(com.ss.android.socialbase.downloader.d.c cVar) {
        Y = cVar;
    }

    public static void a(a aVar) {
        com.ss.android.socialbase.downloader.c.a.a("wjd", "setIndependentServiceCreator::creator=" + aVar);
        f10602i = aVar;
    }
}
